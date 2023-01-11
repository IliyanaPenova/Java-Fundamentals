package ConditionalStatment.Lab;

import java.util.Scanner;

public class CookingMasterclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double packageOfFlour = Double.parseDouble(scanner.nextLine());
        double singleEgg = Double.parseDouble(scanner.nextLine());
        double singleApron = Double.parseDouble(scanner.nextLine());
        double finalApronPrice = (singleApron *Math.ceil(students*1.2));



        //double allItemPrice=students * packageOfFlour+ finalApronPrice * students + singleEgg * 10;
        //student consist=1 flour,10 eggs,apron+0.20


        int freeFlour = 0;

        if (students >= 5) {
            freeFlour = students / 5;
        }
        double allItemPrice = (students * (packageOfFlour + (singleEgg*10))) - (packageOfFlour*freeFlour) +finalApronPrice;


        if(allItemPrice <= budget){
            System.out.printf("Items purchased for %.2f$",allItemPrice);
        }else  {
            System.out.printf("%.2f$ more needed",allItemPrice-budget);
        }
    }
}
