package ListsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class exercisesssssss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+")).
                map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] commandArray = command.split("\\s+");

            getManipulatedList(numbersList, command, commandArray);

            command = scanner.nextLine();
        }
        for (int number : numbersList) {
            System.out.print(number + " ");
        }
    }

    private static void getManipulatedList(List<Integer> numbersList, String command, String[] commandArray) {
        if (command.contains("Add")) {
            numbersList.add(Integer.parseInt(commandArray[1]));
        } else if (command.contains("Remove")) {
            int index = Integer.parseInt(commandArray[1]);
            if (index > numbersList.size() - 1) {
                System.out.println("Invalid index");
            } else {
                numbersList.remove(Integer.parseInt(command.split("\\s+")[1]));
            }
        } else if (command.contains("Shift left")) {
            int numRotations = Integer.parseInt(command.split("\\s+")[2]);
            for (int i = 0; i < numRotations; i++) {
                int number = numbersList.get(0);
                numbersList.add(number);
                numbersList.remove(0);
            }
        } else if (command.contains("Shift right")) {
            int numRotations = Integer.parseInt(commandArray[2]);
            for (int i = 0; i < numRotations; i++) {
                int number = numbersList.get(numbersList.size() - 1);
                numbersList.remove(numbersList.size() - 1);
                numbersList.add(0, number);
            }
        } else if (command.contains("Insert")) {
            int number = Integer.parseInt(commandArray[1]);
            int index = Integer.parseInt(commandArray[2]);
            if (index > numbersList.size() - 1) {
                System.out.println("Invalid index");
            } else {
                numbersList.add(index, number);
            }
        }
    }
}
