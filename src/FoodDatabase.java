import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FoodDatabase {
    private List<Food> normalFoodList = new ArrayList<>();
    private List<Food> veganFoodList = new ArrayList<>();


    public void initVegDB() {
        veganFoodList.add(new Food(1, "Salad", true, Arrays.asList(Category.LUNCH, Category.DINNER), "https://www.mat.se/recept/grekisk-sallad-vegan"));
        veganFoodList.add(new Food(2, "Tofu", true, Arrays.asList(Category.DINNER), "https://www.ica.se/recept/sojastekt-tofu-med-broccoli-och-chili-721917/"));
        veganFoodList.add(new Food(3, "Fruitsalad", true, Arrays.asList(Category.LUNCH, Category.DINNER, Category.DESSERT), "https://www.koket.se/farsk-fruktsallad"));
        veganFoodList.add(new Food(4, "Vegan Burger", true, Arrays.asList(Category.LUNCH, Category.DINNER), "https://tasty.co/recipe/the-best-ever-vegan-burger"));
        veganFoodList.add(new Food(6, "Bibimbap", true, Arrays.asList(Category.LUNCH, Category.DINNER), "https://www.lazycatkitchen.com/vegan-bibimbap/"));
        veganFoodList.add(new Food(9, "Vegan kebab", true, Arrays.asList(Category.LUNCH, Category.DINNER), "https://www.veganfoodandliving.com/features/13-vegan-kebab-and-skewer-recipes-for-your-next-bbq-party/"));
        veganFoodList.add(new Food(10, "Vegan Cheesecake", true, Arrays.asList(Category.DESSERT), "https://minimalistbaker.com/7-ingredient-vegan-cheesecakes/"));
        veganFoodList.add(new Food(18, "Vegan lasagna", true, Arrays.asList(Category.DINNER), "https://www.mathem.se/recept/vegansk-lasagne"));
        veganFoodList.add(new Food(19, "Vegan tomato- och leekpie", true, Arrays.asList(Category.DINNER, Category.LUNCH), "https://www.ica.se/recept/vegansk-tomat-och-purjolokspaj-723198/"));
        veganFoodList.add(new Food(20, "Vegan chocholate cake", true, Arrays.asList(Category.DESSERT), "https://www.tasteline.com/recept/vegansk-kladdkaka/"));

    }

    public void initMeatDb() {
        normalFoodList.add(new Food(5, "Bloody Mary Hot dog", false, Arrays.asList(Category.LUNCH, Category.DINNER), "https://nathansfamous.com/recipes/bloody-mary-dog/"));
        normalFoodList.add(new Food(12, "Lasagna", false, Arrays.asList(Category.DINNER), "https://www.arla.se/recept/lasagne/"));
        normalFoodList.add(new Food(7, "Meatloaf", false, Arrays.asList(Category.DINNER), "https://www.allrecipes.com/recipe/16354/easy-meatloaf/"));
        normalFoodList.add(new Food(13, "Apple pie", false, Arrays.asList(Category.DESSERT), "https://www.allrecipes.com/recipe/12682/apple-pie-by-grandma-ople/"));
        normalFoodList.add(new Food(14, "Tiramisu", false, Arrays.asList(Category.DESSERT), "https://www.recepten.se/recept/tiramisu.html"));
        normalFoodList.add(new Food(15, "Pork Dumplings", false, Arrays.asList(Category.LUNCH, Category.DINNER), "https://www.thekitchn.com/how-to-make-pork-dumplings-cooking-lessons-from-the-kitchn-216163"));
        normalFoodList.add(new Food(16, "Penne vodka", false, Arrays.asList(Category.DINNER), "https://www.aftonbladet.se/matdryck/a/qLe41E/penne-vodka--pastaratten-med-sting"));
        normalFoodList.add(new Food(17, "Chocolate mousse", false, Arrays.asList(Category.DESSERT), "https://www.arla.se/recept/chokladmousse/"));
        normalFoodList.add(new Food(21, "Pricki Sausage", false, Arrays.asList(Category.LUNCH), "https://korvrecept.se/"));

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
