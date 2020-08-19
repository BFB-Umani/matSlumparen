import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FoodDB {

    List<Food> foodListVeg= new ArrayList<>();
    List<Food> foodListNonVeg= new ArrayList<>();

    public void initVegDB(){
        foodListVeg.add(new Food(1, "Vegansk lasagne", "https://www.mathem.se/recept/vegansk-lasagne", 2));
        foodListVeg.add(new Food(2, "Vegansk tomat- och purjolökspaj", "https://www.ica.se/recept/vegansk-tomat-och-purjolokspaj-723198/", 1));
        foodListVeg.add(new Food(3, "Vegansk kladdkaka", "https://www.tasteline.com/recept/vegansk-kladdkaka/", 3));
    }

    public void initNonVegDB(){
        foodListNonVeg.add(new Food(4, "Lasagne", "https://www.arla.se/recept/lasagne/", 1));
        foodListNonVeg.add(new Food(5, "Penne vodka", "https://www.aftonbladet.se/matdryck/a/qLe41E/penne-vodka--pastaratten-med-sting", 2));
        foodListNonVeg.add(new Food(6, "Chokladmousse", "https://www.arla.se/recept/chokladmousse/", 3));
    }

    public Food shuffleListAndPickAVeganDish(int lunchDinnerDessert){
        List<Food> filteredList = new ArrayList<>();
        for (Food food: foodListVeg
        ) {
            if(food.getLunchDinnerDessert()==lunchDinnerDessert){
                filteredList.add(food);
            }
        }
        Collections.shuffle(filteredList);
        return filteredList.get(0);
    }
    public Food shuffleListAndPickANonVeganDish(int lunchDinnerDessert){
        List<Food> filteredList = new ArrayList<>();
        for (Food food: foodListNonVeg
             ) {
            if(food.getLunchDinnerDessert()==lunchDinnerDessert){
                filteredList.add(food);
            }
        }
        Collections.shuffle(filteredList);
        return filteredList.get(0);
    }
}
