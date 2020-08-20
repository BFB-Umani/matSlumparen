import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FoodDatabase {
    private List<Food> normalFoodList = new ArrayList<>();
    private List<Food> veganFoodList = new ArrayList<>();


    public void initVegDB(){
        veganFoodList.add(new Food(1,"Sallad", true, Arrays.asList(Category.LUNCH, Category.DINNER), ""));
        veganFoodList.add(new Food(2,"Tofu",true,Arrays.asList(Category.DINNER),""));
        veganFoodList.add(new Food(3, "FruktSallad", true, Arrays.asList(Category.LUNCH, Category.DINNER, Category.DESSERT), ""));
        veganFoodList.add(new Food(4,"Vegan Burger", true, Arrays.asList(Category.LUNCH, Category.DINNER), ""));

    }

    public void initMeatDb(){
        normalFoodList.add(new Food(5,"Hot dog", false, Arrays.asList(Category.LUNCH, Category.DINNER), ""));
        normalFoodList.add(new Food(6,"Lasagne", false, Arrays.asList(Category.DINNER), ""));
        normalFoodList.add(new Food(7,"Köttlimpa", false, Arrays.asList(Category.DINNER), ""));
        normalFoodList.add(new Food(8, "Apple pie", false, Arrays.asList(Category.DESSERT), ""));
        normalFoodList.add(new Food(9, "Tiramisu", false, Arrays.asList(Category.DESSERT), ""));

    }

    public Food getRandomFoodFromCategory(Category category, FoodDatabase foodDatabase, Boolean isVegan) {
        List<Food> foodList;

        if(isVegan){
            initVegDB();
            foodList = getVeganFoodList();
        } else{
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
