
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

        boolean isVegan;

        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Are you a vegan?");

            String input = sc.nextLine();
            if (input.trim().equalsIgnoreCase("yes")) {
                isVegan = true;
                break;
            } else if (input.trim().equalsIgnoreCase("no")) {
                isVegan = false;
                break;
            } else {
                System.out.println("Please write yes or no.");
            }

        }


        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Which meal do you want to cook? " + "\nLunch, dinner or dessert");

            String input = sc.nextLine();
            if (input.trim().equalsIgnoreCase("lunch")) {
                Food todaysLunch;
                if (isVegan) {
                    todaysLunch = getOneRandomVeganFoodfromACategory(Category.LUNCH, foodDatabase);
                } else {
                    todaysLunch = getOneRandomNormalFoodfromACategory(Category.LUNCH, foodDatabase);
                }
                if (todaysLunch != null) {
                    System.out.println(todaysLunch.getName());
                }
                break;

            } else if (input.trim().equalsIgnoreCase("dinner")) {
                Food todaysDinner;
                if (isVegan) {
                    todaysDinner = getOneRandomVeganFoodfromACategory(Category.DINNER, foodDatabase);
                } else {
                    todaysDinner = getOneRandomNormalFoodfromACategory(Category.DINNER, foodDatabase);
                }

                if (todaysDinner != null) {
                    System.out.println(todaysDinner.getName());
                }

                break;
            } else if (input.trim().equalsIgnoreCase("dessert")) {
                Food todaysDessert;
                if (isVegan) {
                    todaysDessert = getOneRandomVeganFoodfromACategory(Category.DESSERT, foodDatabase);
                } else {
                    todaysDessert = getOneRandomNormalFoodfromACategory(Category.DESSERT, foodDatabase);
                }

                if (todaysDessert != null) {
                    System.out.println(todaysDessert.getName());
                }

                break;
            } else {
                System.out.println("Please write lunch, dinner or dessert only.");
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
