package pl.gornik;

import pl.gornik.Dish.Dish;
import pl.gornik.Dish.MeatDish;
import pl.gornik.Dish.VegetarianDish;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Dish> cart = new ArrayList<>();
        List<Dish> menu = createMenu();
        int option;
        do {
            displayMenu(menu);

            System.out.println("wybierz opjce (1-4):");
            System.out.println("1. " + "Zamów danie");
            System.out.println("2. " + "Pokaż koszyk");
            System.out.println("3. " + "Usuń danie z zamówienia");
            System.out.println("4. " + "Pokaż sume mojego zamówienia");
            System.out.println("0. " + "Wyjście");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    orderDishes(menu, cart, scanner);
                    break;
                case 2:
                    displayCart(cart);
                    break;
                case 3:
                    removeFromCart(cart, scanner);
                    break;
                case 4:
                    displayOrderTotal(cart);
                    break;
                case 0:
                    System.out.println("Dziękujemy za zamówienie");
                    break;
                default:
                    System.out.println("Nieprawidoła opcja, spróbuj ponownie");
            }

        } while (option != 0);

        scanner.close();
    }

    private static void orderDishes(List<Dish> menu, List<Dish> cart, Scanner scanner) {

        while (true) {
            displayMenu(menu);

            System.out.println("Wybierz numer dania aby kontynuować(0 aby zakończyć):");
            int dishNumber = scanner.nextInt();

            if (dishNumber == 0) {
                break;
            }

            if (dishNumber > 0 && dishNumber <= menu.size()) {
                Dish chosenDish = menu.get(dishNumber - 1);
                cart.add(chosenDish);
                System.out.println("Zamówiono: " + chosenDish.getName());
            } else {
                System.out.println("Nie prawidłowy numer dania. Spróbuj ponownie");
            }
        }
    }

    private static void removeFromCart(List<Dish> cart, Scanner scanner) {
        displayCart(cart);

        System.out.println("Czy chcesz usunąć danie z koszyka (Tak/Nie)");
        String removeOption = scanner.next().toUpperCase();
        if (removeOption.equals("Tak")) {
            System.out.println("Wprowadź numer dania które chcesz usunąć z zamówienia:");
            int numberToRemove = scanner.nextInt();

            if (numberToRemove > 0 && numberToRemove <= cart.size()) {
                Dish dishToRemove = cart.get(numberToRemove - 1);
                cart.remove(dishToRemove);
                System.out.println("Usunięto: " + dishToRemove.getName() + " z karty.");
            } else {
                System.out.println("Nieprawidłowy numer dania");
            }
        }
    }


    private static void displayOrderTotal(List<Dish> cart) {
        double totalOrderAmount = calculateOrderTotal(cart);
        System.out.println("Łączna cena zmówienia: " + totalOrderAmount + " ZŁ");
    }


    private static List<Dish> createMenu() {
        List<Dish> menu = new ArrayList<>();
        menu.add(new MeatDish("Spaghetti", 12, "Makaron, Sos pomidorowy, Mięso", "Wołowina"));
        menu.add(new MeatDish("Cheeseburger", 15, "Bułka, ser , sałata, pikle", "Wołowina"));
        menu.add(new MeatDish("Falki", 10, "Falki, Wywar", "Trzwia"));
        menu.add(new VegetarianDish("Sałatka", 8, "Sałata lodowa, Pomidory, Brokuły", ""));
        return menu;
    }


    private static void displayMenu(List<Dish> menu) {
        System.out.println("Menu:");
        for (int i = 0; i < menu.size(); i++) {
            Dish dish = menu.get(i);
            System.out.println((i + 1) + ". " + dish.getName() + " - " + dish.getPrice() + " PLN");
        }
        System.out.println("0. Zakończ zamówienie");
    }


    private static void displayCart(List<Dish> cart) {
        System.out.println("Moje zamówienie:");
        for (int i = 0; i < cart.size(); i++) {
            Dish dish = cart.get(i);
            System.out.println((i + 1) + ". " + dish.getName() + " - " + dish.getPrice() + " ZŁ");
        }
    }


    private static double calculateOrderTotal(List<Dish> cart) {
        double total = 0;
        for (Dish dish : cart) {
            total += Double.parseDouble(dish.getPrice());
        }
        return total;
    }
}