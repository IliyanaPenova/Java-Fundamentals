package BasicSyntaxExercises;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double money= Double.parseDouble(scanner.nextLine());
        String game= scanner.nextLine();
        double price=0;
        double currentMoney=money;

        while(!game.equals("Game Time")){
       switch (game) {

           case "OutFall 4":
               price = 39.99;
               if (price > currentMoney) {
                   System.out.println("Too Expensive");
                   break;
               }
               currentMoney -= price;
               System.out.println("Bought OutFall 4");
               price = 0;
               break;
           case "CS: OG":
               price = 15.99;
               if (price > currentMoney) {
                   System.out.println("Too Expensive");
                   break;
               }
               currentMoney -= price;
               System.out.println("Bought CS: OG");
               price = 0;
               break;

           case "Zplinter Zell":
               price = 19.99;
               if (price > currentMoney) {
                   System.out.println("Too Expensive");
                   break;
               }
               currentMoney -= price;
               System.out.println("Bought Zplinter Zell");
               price = 0;
               break;
           case "Honored 2":
               price = 59.99;
               if (price > currentMoney) {
                   System.out.println("Too Expensive");
                   break;
               }
               currentMoney -= price;
               System.out.println("Bought Honored 2");
               price = 0;
               break;
           case "RoverWatch":
               price = 29.99;
               if (price > currentMoney) {
                   System.out.println("Too Expensive");
                   break;
               }
               currentMoney -= price;
               System.out.println("Bought RoverWatch");
               price = 0;
               break;
           case "RoverWatch Origins Edition":
               price = 39.99;
               if (price > currentMoney) {
                   System.out.println("Too Expensive");
                   break;
               }
               currentMoney -= price;
               System.out.println("Bought RoverWatch Origins Edition");
               price = 0;
               break;
           default:
               System.out.println("Not Found");
       }

        if(currentMoney<=0) {
            System.out.println("Out of money!");
            break;
        }
            game = scanner.nextLine();
        }
       if (currentMoney>0){
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f",money-currentMoney,currentMoney);
        }

    }
}
