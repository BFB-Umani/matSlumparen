import java.util.ArrayList;
import java.util.List;

public class FoodDB {

    List<Food> foodListVeg= new ArrayList<>();
    List<Food> foodListNonVeg= new ArrayList<>();

    public void initVegDB(){
        foodListVeg.add(new Food(1, "Vegansk lasagne", "https://www.mathem.se/recept/vegansk-lasagne", "Dinner"));
        foodListVeg.add(new Food(2, "Vegansk tomat- och purjolökspaj", "https://www.ica.se/recept/vegansk-tomat-och-purjolokspaj-723198/", "Lunch"));
        foodListVeg.add(new Food(3, "Vegansk kladdkaka", "https://www.tasteline.com/recept/vegansk-kladdkaka/", "Dessert"));
    }

    public void initNonVegDB(){
        foodListNonVeg.add(new Food(4, "Lasagne", "https://www.arla.se/recept/lasagne/", "Lunch"));
        foodListNonVeg.add(new Food(5, "Penne vodka", "https://www.aftonbladet.se/matdryck/a/qLe41E/penne-vodka--pastaratten-med-sting", "Dinner"));
        foodListNonVeg.add(new Food(6, "Chokladmousse", "https://www.arla.se/recept/chokladmousse/", "Dessert"));
    }

}
