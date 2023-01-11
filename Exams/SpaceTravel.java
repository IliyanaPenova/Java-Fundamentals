package SoftUniExam;

import java.util.Arrays;
import java.util.Scanner;

public class SpaceTravel {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String [] travelRoute= scanner.nextLine().split("\\|\\|");
        int startingAmountOfFuel=Integer.parseInt(scanner.nextLine());
        int startingAmountOfAmmunition=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <travelRoute.length ; i++) {
            String[] money=travelRoute[i].split(" ");
            if(travelRoute[i].contains("Travel")){
                int distance=Integer.parseInt(money[1]);
                if(startingAmountOfFuel>=distance){
                    startingAmountOfFuel-=distance;
                    System.out.printf("The spaceship travelled %d light-years.%n",distance);
                }else{
                    System.out.println("Mission failed");
                    break;
                }

        }else if(travelRoute[i].contains("Enemy")){
                int amountOfEnemy=Integer.parseInt(money[1]);
                boolean fighting=startingAmountOfAmmunition>=amountOfEnemy;
                boolean run=startingAmountOfAmmunition<amountOfEnemy;
                if(fighting){
                    startingAmountOfAmmunition-=amountOfEnemy;
                    System.out.printf("An enemy with %d armour is defeated.%n",amountOfEnemy);
                }else if(run){
                    boolean escapePossible=startingAmountOfFuel>(2*amountOfEnemy);
                    if(escapePossible){
                        startingAmountOfFuel-=amountOfEnemy*2;
                        System.out.printf("An enemy with %d armour is outmaneuvered.%n",amountOfEnemy);
                    }
                }else{
                    System.out.println("Mission failed.");
                    break;
                }
            }else if(travelRoute[i].contains("Repair")){
                int repairPoint=Integer.parseInt(money[1]);
                startingAmountOfFuel+=repairPoint;
                startingAmountOfAmmunition+=repairPoint*2;
                System.out.printf("Ammunitions added: %d.%n",repairPoint*2);
                System.out.printf("Fuel added: %d.%n",repairPoint);
            }else if(travelRoute[i].contains("Titan")){
                System.out.println("You have reached Titan,all passengers are safe.");
            }
        }
    }
    }

