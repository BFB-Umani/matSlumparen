public class Food {

    int id;
    String name;
    String linkToRecipe;
//    1 - Lunch, 2 - Dinner, 3 - Dessert
    int lunchDinnerDessert;

    public Food(int id, String name, String linkToRecipe, int lunchDinnerDessert) {
        this.id = id;
        this.name = name;
        this.linkToRecipe = linkToRecipe;
        this.lunchDinnerDessert = lunchDinnerDessert;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLinkToRecipe() {
        return linkToRecipe;
    }

    public void setLinkToRecipe(String linkToRecipe) {
        this.linkToRecipe = linkToRecipe;
    }

    public int getLunchDinnerDessert() {
        return lunchDinnerDessert;
    }

    public void setLunchDinnerDessert(int lunchDinnerDessert) {
        this.lunchDinnerDessert = lunchDinnerDessert;
    }
}
