import java.util.List;

public class Food {
    private String name;
    private boolean isVegan;
    private List<Category> categories;

    public Food(String name, boolean vegan, List<Category> categories) {
        this.name = name;
        this.isVegan = vegan;
        this.categories = categories;
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
}
