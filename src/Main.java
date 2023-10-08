import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cake baseCake = null;

        while (true) {
            System.out.println("Cake Options:");
            System.out.println("1. Chocolate Cake");
            System.out.println("2. Vanilla Cake");
            System.out.println("3. Done (Place the order)");

            int choice = scanner.nextInt();

            if (choice == 1) {
                baseCake = new ChocolateCake();
            } else if (choice == 2) {
                baseCake = new VanillaCake();
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }

        Cake decoratedCake = baseCake;

        while (true) {
            System.out.println("\nDecorations Options:");
            System.out.println("1. Fresh Fruit");
            System.out.println("2. Nutty Crunch");
            System.out.println("3. Done (Place the order)");

            int choice = scanner.nextInt();

            if (choice == 1) {
                decoratedCake = new FreshFruitDecorator(decoratedCake);
            } else if (choice == 2) {
                decoratedCake = new NuttyCrunchDecorator(decoratedCake);
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }

        Main.display(decoratedCake);

        Cake customCake = new VanillaCake();
        customCake = new CustomDecorator(customCake, "Rainbow Sprinkles", 22.50, 30, 5);

        Main.display(customCake);
    }
    public static void display(Cake cake) {
        System.out.println("\nYour Cake Order:");
        System.out.println("Description: " + cake.getDescription());
        System.out.println("Cost: $" + cake.getCost());
        System.out.println("Calories: " + cake.getCalories() + " kcal");
        System.out.println("Weight: " + cake.getWeight() + " kg");
    }
}