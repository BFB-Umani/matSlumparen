import java.security.cert.CollectionCertStoreParameters;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Food food1 = new Food("Hot dog", false, Arrays.asList(Category.LUNCH, Category.DINNER));
        Food food2 = new Food("Vegan burger", true, Arrays.asList(Category.LUNCH, Category.DINNER));
        Food food3 = new Food("Apple pie", false, Arrays.asList(Category.DESSERT));
        Food food4 = new Food("Tofu", true, Arrays.asList(Category.LUNCH, Category.DINNER));
        Food food5 = new Food("FruktSallad", true, Arrays.asList(Category.LUNCH, Category.DINNER, Category.DESSERT));

        FoodDatabase foodDatabase = new FoodDatabase();
        foodDatabase.addToFoodList(food1);
        foodDatabase.addToFoodList(food2);
        foodDatabase.addToFoodList(food3);
        foodDatabase.addToFoodList(food4);
        foodDatabase.addToFoodList(food5);

        Scanner sc = new Scanner(System.in);
        System.out.println("Are you a vegan?");

        String input = sc.nextLine();
        if (input.trim().equalsIgnoreCase("yes")) {
            System.out.println("Which meal do you want to cook? ");
            input = sc.nextLine();
            if (input.trim().equalsIgnoreCase("lunch")) {
                Food todaysLunch = getOneRandomVeganFoodfromACategory(Category.LUNCH, foodDatabase);
                if (todaysLunch != null) {
                    System.out.println(todaysLunch.getName());
                }
            }

            if (input.trim().equalsIgnoreCase("dinner")) {
                Food todaysDinner = getOneRandomVeganFoodfromACategory(Category.DINNER, foodDatabase);
                if (todaysDinner != null) {
                    System.out.println(todaysDinner.getName());
                }
            }

            if (input.trim().equalsIgnoreCase("dessert")) {
                Food todaysDessert = getOneRandomVeganFoodfromACategory(Category.DESSERT, foodDatabase);
                if (todaysDessert != null) {
                    System.out.println(todaysDessert.getName());
                }
            }

        } else if (input.trim().equalsIgnoreCase("no")) {
            System.out.println("Which meal do you want to cook? ");
            input = sc.nextLine();
            if (input.trim().equalsIgnoreCase("lunch")) {
                Food todaysLunch = getOneRandomNormalFoodfromACategory(Category.LUNCH, foodDatabase);
                if (todaysLunch != null) {
                    System.out.println(todaysLunch.getName());
                }
            }

            if (input.trim().equalsIgnoreCase("dinner")) {
                Food todaysDinner = getOneRandomNormalFoodfromACategory(Category.DINNER, foodDatabase);
                if (todaysDinner != null) {
                    System.out.println(todaysDinner.getName());
                }
            }

            if (input.trim().equalsIgnoreCase("dessert")) {
                Food todaysDessert = getOneRandomNormalFoodfromACategory(Category.DESSERT, foodDatabase);
                if (todaysDessert != null) {
                    System.out.println(todaysDessert.getName());
                }
            }

        }


    }

    public static Food getOneRandomVeganFoodfromACategory(Category category, FoodDatabase foodDatabase) {

        List<Food> veganFoodList = foodDatabase.getVeganFoodList();
        Collections.shuffle(veganFoodList);
        for (Food veganFood : veganFoodList) {
            if (veganFood.getCategories().contains(category)) {
                return veganFood;
            }
        }
        return null;
    }

    public static Food getOneRandomNormalFoodfromACategory(Category category, FoodDatabase foodDatabase) {

        List<Food> normalFoodList = foodDatabase.getNormalFoodList();
        Collections.shuffle(normalFoodList);
        for (Food normalFood : normalFoodList) {
            if (normalFood.getCategories().contains(category)) {
                return normalFood;
            }
        }
        return null;
    }
}
