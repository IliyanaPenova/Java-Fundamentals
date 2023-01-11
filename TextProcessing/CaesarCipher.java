package TextProcessingExercises;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
      String text= scanner.nextLine();

        for (char symbol:text.toCharArray()) {
            System.out.print((char)(symbol+3));

        }

    }
}
