package pl.gornik.Dish;

public abstract class Dish {
    public String name;
    public String price;
    public String components;

    public Dish(String name, double price, String components) {
        this.name = name;
        this.price = String.valueOf(price);
        this.components = components;
    }

    public abstract void prepare();

    public abstract void giveDish();

    public void displayInfo() {
        System.out.println("danie: " + name + " kosztuje " + price + " składa się z " + components);
    }

    public void changeComponents(String components) {
        this.components = components;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getComponents() {
        return components;
    }
}