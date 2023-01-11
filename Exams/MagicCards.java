package SoftUniExam;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

public class MagicCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> stringList = Arrays.stream(scanner.nextLine().split(":"))
                .collect(Collectors.toList());
        List<String> newDeckList = new ArrayList<>();

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("Ready")) {
            String[] input = inputLine.split("\\s+");
            String command = input[0];


            switch (command) {
                case "Add":
                    String cardName = input[1];

                    if (stringList.contains(cardName)) {
                        newDeckList.add(cardName);
                    } else {
                        System.out.println("Card not found.");
                    }

                    break;

                case "Insert":
                    String cardToInsert = input[1];
                    int indexOfNewDeck = Integer.parseInt(input[2]);

                    boolean isValid = false;
                    if (indexOfNewDeck >= 0 && indexOfNewDeck < newDeckList.size()) {
                        isValid = true;
                    }
                    if (stringList.contains(cardToInsert) && isValid) {
                        newDeckList.add(indexOfNewDeck, cardToInsert);
                    } else {
                        System.out.println("Error!");
                    }

                    break;

                case "Remove":

                    String cardToRemove = input[1];

                    if (stringList.contains(cardToRemove)) {
                        newDeckList.remove(cardToRemove);
                    } else {
                        System.out.println("Card not found.");
                    }

                    break;

                case "Swap":

                    String firstCardName = input[1];
                    String secondCardName = input[2];

                    int index1 = newDeckList.indexOf(firstCardName);
                    int index2 = newDeckList.indexOf(secondCardName);
                    newDeckList.set(index1, secondCardName);
                    newDeckList.set(index2, firstCardName);

                    break;

                case "Shuffle":
                    Collections.reverse(newDeckList);
                    break;
            }
            inputLine = scanner.nextLine();
        }
        System.out.println(String.join(" ", newDeckList));
    }
}
