import java.security.cert.CollectionCertStoreParameters;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Food food1 = new Food("Hot dog", false, Arrays.asList(Category.LUNCH, Category.DINNER));
        Food food2 = new Food("Vegan burger", true, Arrays.asList(Category.LUNCH, Category.DINNER));
        Food food3 = new Food("Apple pie", false, Arrays.asList(Category.DESSERT));
        Food food4 = new Food("Tofu", true, Arrays.asList(Category.LUNCH, Category.DINNER));
        Food food5 = new Food("FruktSallad", true, Arrays.asList(Category.LUNCH, Category.DINNER,Category.DESSERT));

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

                List<Food> veganFoodList = foodDatabase.getVeganFoodList();
                Collections.shuffle(veganFoodList);
                for (Food veganFood : veganFoodList) {
                    if (veganFood.getCategories().contains(Category.LUNCH)) {
                        System.out.println(veganFood.getName());
                        break;
                    }
                }
            }


        }
    }
}
