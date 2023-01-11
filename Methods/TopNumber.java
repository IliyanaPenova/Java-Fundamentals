package MethodsExercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        for (int number = 1; number <=n ; number++) {
            if(isSumOfDigitsDivisibleBy8(number) && isContainsOddDigits(number)){
                System.out.println(number);
            }
        }
    }
    public static boolean isSumOfDigitsDivisibleBy8(int number){
        int sumOfDigits=0;
        while(number>0){
            int lastDigit=number%10;
            sumOfDigits+=lastDigit;
            number=number/10;
        }
        return sumOfDigits%8==0;
    }
    public static boolean isContainsOddDigits(int number){
       while(number>0){
           int lastDigit=number%10;
           if(lastDigit%2 !=0){
               return true;
           }else{
               number=number/10;
           }
       }
       return false;
    }
}
