public class Food {

    int id;
    String name;
    String linkToRecipe;
    String lunchDinnerDessert;

    public Food(int id, String name, String linkToRecipe, String lunchDinnerDessert) {
        this.id = id;
        this.name = name;
        this.linkToRecipe = linkToRecipe;
        this.lunchDinnerDessert = lunchDinnerDessert;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLinkToRecipe() {
        return linkToRecipe;
    }

    public void setLinkToRecipe(String linkToRecipe) {
        this.linkToRecipe = linkToRecipe;
    }

    public String getLunchDinnerDessert() {
        return lunchDinnerDessert;
    }

    public void setLunchDinnerDessert(String lunchDinnerDessert) {
        this.lunchDinnerDessert = lunchDinnerDessert;
    }
}
