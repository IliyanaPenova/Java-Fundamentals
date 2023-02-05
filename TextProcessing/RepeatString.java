package TextProcessingLab;

import java.util.Scanner;


public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        String[] repeatedWords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            repeatedWords[i] = repeat(words[i], words[i].length());
        }
        System.out.println(String.join("",repeatedWords));
    }

     static String repeat(String s, int repeatCount) {
         String [] copies = new String[repeatCount];
         for (int i = 0; i < copies. length; i++) {
             copies[i] = s;
         }
         return String.join("",copies);

    }
}
