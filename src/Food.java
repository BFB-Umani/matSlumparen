import java.util.List;

public class Food {
    private int id;
    private String name;
    private boolean isVegan;
    private List<Category> categories;
    private String linkToRecipe;

    public Food(int id, String name, boolean isVegan, List<Category> categories, String linkToRecipe) {
        this.id = id;
        this.name = name;
        this.isVegan = isVegan;
        this.categories = categories;
        this.linkToRecipe = linkToRecipe;
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

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public String getLinkToRecipe() {
        return linkToRecipe;
    }

    public void setLinkToRecipe(String linkToRecipe) {
        this.linkToRecipe = linkToRecipe;
    }
}
