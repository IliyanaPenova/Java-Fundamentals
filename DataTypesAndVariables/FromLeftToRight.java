package DataTypesAndVariablesExercises;

import java.util.Scanner;

public class FromLeftToRight {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=n ; i++) {
            long num1 = Long.parseLong(scanner.next());
            long num2 = Long.parseLong(scanner.next());
            int sum = 0;
            if (num1 > num2) {
                double firstNum = Math.abs(num1);

                while (firstNum != 0) {
                    sum += firstNum % 10;
                    firstNum = firstNum / 10;
                }
            } else {

                double secondNum = Math.abs(num2);

                while (secondNum != 0) {
                    sum += secondNum % 10;
                    secondNum /= 10;
                }


            }
            System.out.println(Math.abs(sum));
        }
    }
}
