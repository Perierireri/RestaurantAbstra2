package pl.gornik.Dish;

public class MeatDish extends Dish {
    private String typeOfMeat;

    public MeatDish(String name, double price, String component, String typeOfMeat) {
        super(name, price, component);
        this.typeOfMeat = typeOfMeat;
    }

    @Override
    public void prepare() {
        // Implement preparation logic
    }

    @Override
    public void giveDish() {
        // Implement dish serving logic
    }
}