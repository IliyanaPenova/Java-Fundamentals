package BasicSyntaxExercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double price=0;

        if(dayOfWeek.equals("Friday")) {
            if(typeOfGroup.equals("Students")) {
                price = 8.45;
                if (numberOfPeople >= 30) {
                    price = price * 0.85;
                }
            } else if (typeOfGroup.equals("Business")) {
                price = 10.90;
                if (numberOfPeople >= 100) {
                    numberOfPeople -= 10;
                }
            } else if (typeOfGroup.equals("Regular")) {
                price = 15;
                if (numberOfPeople >= 10 && numberOfPeople <= 20) {
                    price = price * 0.95;
                }
            }
        } else if (dayOfWeek.equals("Saturday")) {
            if (typeOfGroup.equals("Students")) {
                price = 9.80;
                if (numberOfPeople >= 30) {
                    price = price * 0.85;
                }
            } else if (typeOfGroup.equals("Business")) {
                price = 15.60;
                if (numberOfPeople >= 100) {
                    numberOfPeople -= 10;
                }
            } else if (typeOfGroup.equals("Regular")) {
                price = 20;
                if (numberOfPeople >= 10 && numberOfPeople <= 20) {
                    price = price * 0.95;
                }
            }
        }
            else if(dayOfWeek.equals("Sunday")){
                if(typeOfGroup.equals("Students")){
                    price=10.46;
                    if(numberOfPeople>=30){
                        price=price*0.85;
                    }
                } else if (typeOfGroup.equals("Business")) {
                    price=16;
                    if(numberOfPeople>=100){
                        numberOfPeople-=10;
                    }

                }else if(typeOfGroup.equals("Regular")){
                    price=22.50;
                    if(numberOfPeople>=10 &&numberOfPeople<=20){
                        price=price*0.95;
                    }
                }
            }
            double totalPrice=price*numberOfPeople;
            System.out.printf("Total price: %.2f",totalPrice);
    }
}