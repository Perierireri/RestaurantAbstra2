package pl.gornik.Dish;

public abstract class dish {
    public String name;
    public String price;
    public String componets;

    public dish (String name, double price, String componets) {
        this.name = name;
        this.price = String.valueOf(price);
        this.componets = componets;
    }

    public static void add(MeatDish meatDish) {
    }

    public abstract void prepare();
    public abstract void giveDish();
    public void displayInfo(){
        System.out.println("danie: " + name + " kosztuje " + price + " składa się z " + componets);
    }

    public void changeComponents(String componets) {
        this.componets = componets;
    }

    public String getName() {
        return name;
    }
    public String getPrice() {
        return price;
    }
    public String getComponets() {
        return componets;
    }
}
