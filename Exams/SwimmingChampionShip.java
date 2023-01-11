package SoftUniExam;

import java.util.Scanner;

public class SwimmingChampionShip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysOfChampion = Integer.parseInt(scanner.nextLine());
        int pointsNeedToCover = Integer.parseInt(scanner.nextLine());
        int countSwimmers = Integer.parseInt(scanner.nextLine());
        double hotelPrice = Double.parseDouble(scanner.nextLine());
        double participationFee = Double.parseDouble(scanner.nextLine());


        double pointsWin = 0 ;
        double sumPoints = 0;
        for (int i = 1; i <= daysOfChampion; i++) {
            double pointsOfTheDay = Double.parseDouble(scanner.nextLine());
            if(i==1){
                pointsWin=pointsOfTheDay;
                sumPoints+=pointsWin;
            }
            if (i>1){
                pointsWin += pointsOfTheDay*0.05;}
                sumPoints += pointsWin;
        }

        double teamPriceHotel = daysOfChampion * countSwimmers * hotelPrice;
        double fee = participationFee * countSwimmers;
        double money = fee + teamPriceHotel;
        double moneyNeedToPay = 0;

        double allSum = pointsWin + sumPoints;
        if ( allSum >= pointsNeedToCover){
            moneyNeedToPay = money - money*0.25;
            System.out.printf("Money left to pay: %.2f BGN.\n",moneyNeedToPay);
            System.out.println("The championship was successful!");

        }
        else {
            moneyNeedToPay = money - money*0.10;
            System.out.printf("Money left to pay: %.2f BGN.\n",moneyNeedToPay);
            System.out.println("The championship was not successful.");
        }
    }

}
