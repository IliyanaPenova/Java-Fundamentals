package MethodsExercise;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text= scanner.nextLine();
        printMiddleCharacter(text);
    }
    public static void printMiddleCharacter(String text){
        if(text.length()%2==1){
            int indexOfMiddleCharacter=text.length()/2;
            System.out.println(text.charAt(indexOfMiddleCharacter));
        }else{
            int firstMiddleCharacter=text.length()/2-1;
            int secondMiddleCharacter=text.length()/2;
            System.out.println(""+text.charAt(firstMiddleCharacter)+text.charAt(secondMiddleCharacter));
        }
    }
}
