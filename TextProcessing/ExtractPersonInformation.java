package TextProcessingExercises;


import java.util.Scanner;

public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < rows; i++) {
            StringBuilder person = new StringBuilder(scanner.nextLine());
            int counter = 0;
            for (int j = 0; j < person.length(); j++) {
                if (person.charAt(j) == '@') {
                    counter++;
                }
            }
                if (counter == 1) {
                    String name = person.substring(person.indexOf("@)") + 1, person.indexOf("|"));
                    String age = person.substring(person.indexOf("#") + 1, person.indexOf("*"));
                    System.out.printf("%s is %s years old.%n", name, age);
                } else {
                    while (counter > 0) {
                        String name = person.substring(person.indexOf("@)") + 1, person.indexOf("|"));
                        String age = person.substring(person.indexOf("#") + 1, person.indexOf("*"));
                        person.delete(person.indexOf("@)"), person.indexOf("*") + 1);
                        System.out.printf("%s is %s years old.%n", name, age);
                        counter--;

                    }

            }
        }
    }
}

