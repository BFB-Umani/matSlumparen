import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you av Vegan? Y/N");
        String input = scan.nextLine();

        if (input.equals("Y")) {
            System.out.println("Vill du ha tips på Lunch,Middag eller Efterätt?");
            s(scan,false);

        } else {
            System.out.println("Köttätare, Vill du ha tips på Lunch,Middag eller Efterätt?");
            s(scan,true);
        }
    }private static String getFood(String string, boolean meat){
        ArrayList<Food> temp = new ArrayList<Food>();
        ArrayList<Food> foods = createFood();
        for (int i=0;i<foods.size();i++){
            if (foods.get(i).isMeat.equals(meat)&&foods.get(i).mealType.equals(string)){
                temp.add(foods.get(i));
            }
        }
        Collections.shuffle(temp);
        return temp.get(0).name;
    }

    private static void s(Scanner scan,boolean meat) {
        switch (scan.nextLine()) {
            case "Lunch":
                System.out.println(getFood("Lunch",meat));
                break;
            case "Middag":
                System.out.println(getFood("Middag",meat));
                break;
            case "Efterätt":
                System.out.println(getFood("Efterätt",meat));
                break;
        }
    } private static ArrayList<Food> createFood(){
        Food food= new Food("Köttbullar med potatismos","Middag",true);
        Food food1= new Food("kött Pizza","Middag",true);
        Food food2= new Food("Veganbullar med potatismos","Middag",false);
        Food food3= new Food("Pannkakor","Middag",false);
        Food food4= new Food("Salami macka","Frukost",true);
        Food food5= new Food("Pricki korv","Lunch",true);
        Food food6= new Food("macka med tartex","Lunch",false);
        Food food7= new Food("Gröt","Lunch",false);
        Food food8= new Food("gåslever","Efterätt",true);
        Food food9= new Food("Tiramisu med biff","Efterätt",true);
        Food food10= new Food("Bär","Efterätt",false);
        Food food11= new Food("Tiramisu","Efterätt",false);

        ArrayList<Food> foods = new ArrayList<Food>();

        foods.add(food);
        foods.add(food1);
        foods.add(food2);
        foods.add(food3);
        foods.add(food4);
        foods.add(food5);
        foods.add(food6);
        foods.add(food7);
        foods.add(food8);
        foods.add(food9);
        foods.add(food10);
        foods.add(food11);
        return foods;
    }
}
