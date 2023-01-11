package BasicSyntaxExercises;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;
        for (int i = 1; i <= n; i++) {
            double pricePerCaps = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int countCaps = Integer.parseInt(scanner.nextLine());
            double coffeePrice = days * pricePerCaps * countCaps;


            System.out.printf("The price for the coffee is: $%.2f%n", coffeePrice);


            totalPrice += coffeePrice;
        }
                System.out.printf("Total: $%.2f%n", totalPrice);


    }
}
