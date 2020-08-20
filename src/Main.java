
import java.util.*;

public class Main {
    public static void main(String[] args) {
    FoodDatabase foodDatabase=new FoodDatabase();


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
                todaysLunch = foodDatabase.getRandomFoodFromCategory(Category.LUNCH, foodDatabase, isVegan);
                if (todaysLunch != null) {
                    System.out.println(todaysLunch.getName());
                }
                break;

            } else if (input.trim().equalsIgnoreCase("dinner")) {
                Food todaysDinner;
                todaysDinner = foodDatabase.getRandomFoodFromCategory(Category.DINNER, foodDatabase, isVegan);

                if (todaysDinner != null) {
                    System.out.println(todaysDinner.getName());
                }

                break;
            } else if (input.trim().equalsIgnoreCase("dessert")) {
                Food todaysDessert;
                todaysDessert = foodDatabase.getRandomFoodFromCategory(Category.DESSERT, foodDatabase, isVegan);

                if (todaysDessert != null) {
                    System.out.println(todaysDessert.getName());
                }

                break;
            } else {
                System.out.println("Please write lunch, dinner or dessert only.");
            }

        }


    }

//    Food food= new Food("Köttbullar med potatismos","Middag",true);
//    Food food1= new Food("kött Pizza","Middag",true);
//    Food food2= new Food("Veganbullar med potatismos","Middag",false);
//    Food food3= new Food("Pannkakor","Middag",false);
//    Food food4= new Food("Salami macka","Frukost",true);
//    Food food5= new Food("Pricki korv","Lunch",true);  VIKTIGT <-----------------------
//    Food food6= new Food("macka med tartex","Lunch",false);
//    Food food7= new Food("Gröt","Lunch",false);
//    Food food8= new Food("gåslever","Efterätt",true);
//    Food food9= new Food("Tiramisu med biff","Efterätt",true);
//    Food food10= new Food("Bär","Efterätt",false);
//    Food food11= new Food("Tiramisu","Efterätt",false);

//            foodListVeg.add(new Food(1, "Vegansk lasagne", "https://www.mathem.se/recept/vegansk-lasagne", 2));
//        foodListVeg.add(new Food(2, "Vegansk tomat- och purjolökspaj", "https://www.ica.se/recept/vegansk-tomat-och-purjolokspaj-723198/", 1));
//        foodListVeg.add(new Food(3, "Vegansk kladdkaka", "https://www.tasteline.com/recept/vegansk-kladdkaka/", 3));

}
