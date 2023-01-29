package FinalExam;

import java.util.ArrayList;
import java.util.Scanner;

public class WordDeveloping {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            if (command.startsWith("Add")) {
                sb.append(command.substring(4));

            } else if (command.startsWith("Upgrade")) {
                char characterToUpgrade = command.charAt(8);
                String upgradedString = sb.toString().replace(characterToUpgrade, (char) (characterToUpgrade + 1));
                sb = new StringBuilder(upgradedString);
            } else if (command.startsWith("Index")) {
                char characterToFind = command.charAt(6);
                ArrayList<Integer> indexes = new ArrayList<>();
                for (int i = 0; i < sb.length(); i++) {
                    if (sb.charAt(i) == characterToFind) {
                        indexes.add(i);
                    }
                }
                if (indexes.isEmpty()) {
                    System.out.println("None");
                } else {
                    for (Integer i : indexes) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                }
            } else if (command.startsWith("Print")) {
                System.out.println(sb.toString());

            } else if (command.startsWith("Remove")) {
              String substring=command.substring(7);
              sb.replace(0,sb.length(),sb.toString().replace(substring,""));
            }
            command = scanner.nextLine();

        }
    }

}
