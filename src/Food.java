
public class Food {

    String name;
    String mealType;
    Boolean isMeat;

    public Food(String name, String mealType, Boolean isMeat) {
        this.name = name;
        this.mealType = mealType;
        this.isMeat = isMeat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public Boolean getMeat() {
        return isMeat;
    }

    public void setMeat(Boolean meat) {
        isMeat = meat;
    }
}
