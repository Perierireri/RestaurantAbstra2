package pl.gornik;

import pl.gornik.Dish.MeatDish;
import pl.gornik.Dish.VegetarianDish;
import pl.gornik.Dish.dish;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<dish> shoppingCart = new ArrayList<>();
        List<dish> dishList = new ArrayList<>();
        dish.add(new MeatDish("Konrad", 12, "091625827", "Pirotechnik"));
        dish.add(new MeatDish("Konrad", 12, "091625827", "Pirotechnik"));
        dish.add(new MeatDish("Konrad", 12, "091625827", "Pirotechnik"));
        dish.add(new MeatDish("Konrad", 12, "091625827", "Pirotechnik"));
        for (dish Dish : dishList)
            Dish.displayInfo();
               }

               String choice;
               boolean isFind = false;
               }
