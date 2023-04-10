package SoftUniSummerExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BakeryShop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

                Map<String, Integer> stockShop = new LinkedHashMap<>();
                int totalSold = 0;

                while (true) {
                    String line = scanner.nextLine();

                    if (line.equals("Complete")) {
                        break;
                    }

                    String[] tokens = line.split("\\s+");

                    String command = tokens[0];
                    String foodName = tokens[2];
                    int quantity = Integer.parseInt(tokens[1]);

                    switch (command) {
                        case "Receive":
                            stockShop.putIfAbsent(foodName, 0);
                            stockShop.put(foodName, stockShop.get(foodName
                            ) + quantity);
                            break;
                        case "Sell":
                            if (!stockShop.containsKey(foodName)) {
                                System.out.printf("You do not have any %s.%n", foodName);
                                continue;
                            }
                            int availableQuantity = stockShop.get(foodName);
                            if (availableQuantity < quantity) {
                                System.out.printf("There aren't enough %s. You sold the last %d of them.%n", foodName, availableQuantity);
                                totalSold += availableQuantity;
                                stockShop.remove(foodName);
                            } else {
                                stockShop.put(foodName, availableQuantity - quantity);
                                System.out.printf("You sold %d %s.%n", quantity, foodName);
                                totalSold += quantity;
                                if (stockShop.get(foodName) == 0) {
                                    stockShop.remove(foodName);
                                }
                            }
                            break;
                        default:
                            break;
                    }
                }

                stockShop.forEach((foodName, quantity) -> System.out.printf("%s: %d%n", foodName, quantity));
                System.out.printf("All sold: %d goods%n", totalSold);
            }
        }