package pl.gornik.Dish;

public class MeatDish extends dish{
    private String typeOfMeat;
    public MeatDish(String name, double price, String component, String typeOfMeat){
        super(name, price, component);
        this.typeOfMeat = typeOfMeat;
    }

    @Override
    public void prepare() {

    }

    @Override
    public void giveDish() {

    }
}
