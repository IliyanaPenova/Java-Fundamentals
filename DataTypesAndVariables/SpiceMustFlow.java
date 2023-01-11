package DataTypesAndVariablesExercises;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int startYield=Integer.parseInt(scanner.nextLine());
        int totalAmountSpices=0;
        int countDays=0;
        while (startYield>=100){
            int spices=startYield-26;
            totalAmountSpices+=spices;
            countDays++;
            startYield-=10;

        }
        System.out.println(countDays);
        if(totalAmountSpices>=26){
            totalAmountSpices-=26;
        }
        System.out.println(totalAmountSpices);
    }
}
