
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FoodDatabase foodDatabase = new FoodDatabase();
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

        Food choice = null;
        String input;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Do you want to make lunch, dinner or dessert?");
            input = sc.nextLine();
            if (input.trim().equalsIgnoreCase("lunch")) {
                choice = foodDatabase.getRandomFoodFromCategory(Category.LUNCH, foodDatabase, isVegan);
                break;
            } else if (input.trim().equalsIgnoreCase("dinner")) {
                choice = foodDatabase.getRandomFoodFromCategory(Category.DINNER, foodDatabase, isVegan);
                break;
            } else if (input.trim().equalsIgnoreCase("dessert")) {
                choice = foodDatabase.getRandomFoodFromCategory(Category.DESSERT, foodDatabase, isVegan);
                break;
            } else {
                System.out.println("Please write lunch, dinner or dessert only.");
            }
        }

        if(choice!=null){
            System.out.println("We recommend you trying " + choice.getName() + " today for " + input.toLowerCase() + "!\nLink to recipe: " + choice.getLinkToRecipe());
        }else{
            System.out.println("Something went wrong, please restart the program.");
        }
    }

}
