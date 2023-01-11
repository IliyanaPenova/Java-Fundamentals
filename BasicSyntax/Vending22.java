package BasicSyntaxExercises;

import java.util.Scanner;

public class Vending22 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input = scanner.nextLine();
        double totalSum = 0;
        while (true) {
            if (input.equals("Start")) {
                break;
            }
            double currentValue = Double.parseDouble(input);
            if (currentValue == 0.1 || currentValue == 0.2 || currentValue == 0.5 || currentValue == 1.00 || currentValue == 2.00) {
                totalSum += currentValue;
            } else {
                System.out.printf("Cannot accept %.02f%n", currentValue);
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        while (true) {
            if (input.equals("End")) {
                break;
            }
            switch (input) {
                case "Nuts":
                    if (totalSum >= 2.0) {
                        System.out.printf("Purchased %s%n", input);
                        totalSum -= 2.0;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (totalSum >= 0.7) {
                        System.out.printf("Purchased %s%n", input);
                        totalSum -= 0.7;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (totalSum >= 1.5) {
                        System.out.printf("Purchased %s%n", input);
                        totalSum -= 1.5;
                    } else {
                        System.out.println("Sorry, not enough money%n");
                    }
                    break;
                case "Soda":
                    if (totalSum >= 0.8) {
                        System.out.printf("Purchased %s%n", input);
                        totalSum -= 0.8;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (totalSum >= 1.0) {
                        System.out.printf("Purchased %s%n", input);
                        totalSum -= 1.0;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Change: %.02f",totalSum);
    }
}
