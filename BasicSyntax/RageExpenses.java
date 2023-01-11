package BasicSyntaxExercises;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         int lostGames=Integer.parseInt(scanner.nextLine());
         double headSetPrice=Double.parseDouble(scanner.nextLine());
        double mouse=Double.parseDouble(scanner.nextLine());
        double keyBoardPrice=Double.parseDouble(scanner.nextLine());
        double displayPrice=Double.parseDouble(scanner.nextLine());

        int countHeadset= lostGames/2;
        int countMouses=lostGames/3;
        int countKeyboards=lostGames/6;
        int countDisplay=lostGames/12;

        double expenses=headSetPrice*countHeadset+mouse*countMouses+countKeyboards*keyBoardPrice+
                displayPrice*countDisplay;
        System.out.printf("Rage expenses: %.2f lv.",expenses);

    }
}
