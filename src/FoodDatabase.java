import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FoodDatabase {
    private List<Food> normalFoodList = new ArrayList<>();
    private List<Food> veganFoodList = new ArrayList<>();


    public void initVegDB() {
        veganFoodList.add(new Food(1, "Salad", true, Arrays.asList(Category.LUNCH, Category.DINNER), ""));
        veganFoodList.add(new Food(2, "Tofu", true, Arrays.asList(Category.DINNER), ""));
        veganFoodList.add(new Food(3, "Fruitsalad", true, Arrays.asList(Category.LUNCH, Category.DINNER, Category.DESSERT), ""));
        veganFoodList.add(new Food(4, "Vegan Burger", true, Arrays.asList(Category.LUNCH, Category.DINNER), ""));
        veganFoodList.add(new Food(6, "Bibimbap", true, Arrays.asList(Category.LUNCH, Category.DINNER), "https://www.lazycatkitchen.com/vegan-bibimbap/"));
        veganFoodList.add(new Food(9, "Vegan kebab", true, Arrays.asList(Category.LUNCH, Category.DINNER), "https://www.veganfoodandliving.com/features/13-vegan-kebab-and-skewer-recipes-for-your-next-bbq-party/"));
        veganFoodList.add(new Food(10, "Vegan Cheesecake", true, Arrays.asList(Category.DESSERT), "https://minimalistbaker.com/7-ingredient-vegan-cheesecakes/"));
    }

    public void initMeatDb() {
        normalFoodList.add(new Food(5, "Hot dog", false, Arrays.asList(Category.LUNCH, Category.DINNER), ""));
        normalFoodList.add(new Food(12, "Lasagne", false, Arrays.asList(Category.DINNER), "https://www.arla.se/recept/lasagne/"));
        normalFoodList.add(new Food(7, "Meatloaf", false, Arrays.asList(Category.DINNER), ""));
        normalFoodList.add(new Food(13, "Apple pie", false, Arrays.asList(Category.DESSERT), ""));
        normalFoodList.add(new Food(14, "Tiramisu", false, Arrays.asList(Category.DESSERT), ""));
        normalFoodList.add(new Food(15, "Pork Dumplings", false, Arrays.asList(Category.LUNCH, Category.DINNER), "https://www.thekitchn.com/how-to-make-pork-dumplings-cooking-lessons-from-the-kitchn-216163"));
        normalFoodList.add(new Food(16, "Penne vodka", false, Arrays.asList(Category.DINNER), "https://www.aftonbladet.se/matdryck/a/qLe41E/penne-vodka--pastaratten-med-sting"));
        normalFoodList.add(new Food(17, "Chokladmousse", false, Arrays.asList(Category.DESSERT), "https://www.arla.se/recept/chokladmousse/"));

    }

    public Food getRandomFoodFromCategory(Category category, FoodDatabase foodDatabase, Boolean isVegan) {
        List<Food> foodList;

        if (isVegan) {
            initVegDB();
            foodList = getVeganFoodList();
        } else {
            initMeatDb();
            foodList = getNormalFoodList();
        }
        Collections.shuffle(foodList);
        for (Food food : foodList) {
            if (food.getCategories().contains(category)) {
                return food;
            }
        }
        return null;
    }


    public List<Food> getNormalFoodList() {
        return normalFoodList;
    }

    public void setNormalFoodList(List<Food> normalFoodList) {
        this.normalFoodList = normalFoodList;
    }

    public List<Food> getVeganFoodList() {
        return veganFoodList;
    }

    public void setVeganFoodList(List<Food> veganFoodList) {
        this.veganFoodList = veganFoodList;
    }


}
