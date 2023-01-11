package BasicSyntaxExercises;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String username= scanner.nextLine();
        String password="";
        for (int position = username.length()-1; position >=0 ; position--) {
            char currentSymbol=username.charAt(position);
            password+=currentSymbol;
        }
        System.out.println(password);
    }
}
