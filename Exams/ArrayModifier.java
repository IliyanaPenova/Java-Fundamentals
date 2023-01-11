package SoftUniExam;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] integerArr = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandArr = command.split("\\s+");
            String input = commandArr[0];
            switch (input) {
                case "swap":
                    int swapFirstIndex = Integer.parseInt(commandArr[1]);
                    int swapSecondIndex = Integer.parseInt(commandArr[2]);

                    int valueOfIndexOne = integerArr[swapFirstIndex];
                    int valueOfIndexTwo = integerArr[swapSecondIndex];

                    integerArr[swapFirstIndex] = valueOfIndexTwo;
                    integerArr[swapSecondIndex] = valueOfIndexOne;


                    break;
                case "multiply":
                    int multiplyFirstIndex = Integer.parseInt(commandArr[1]);
                    int multiplySecondIndex = Integer.parseInt(commandArr[2]);

                    int multiply = integerArr[multiplyFirstIndex] * integerArr[multiplySecondIndex];
                    integerArr[multiplyFirstIndex] = multiply;


                    break;
                case "decrease":
                    for (int i = 0; i < integerArr.length; i++) {
                        integerArr[i] = integerArr[i] - 1;

                    }
                    break;
            }

            command = scanner.nextLine();
        }
        for (int i = 0; i < integerArr.length; i++) {
            if (i == integerArr.length - 1) {
                System.out.print(integerArr[i]);
            } else {
                System.out.print(integerArr[i] + ", ");

            }
        }
    }
}
