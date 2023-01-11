package DataTypesAndVariablesExercises;

import java.util.Scanner;

public class RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i <= n; i++) {
            String isPrime = "true";
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = "false";
                    break;
                }

            }


            System.out.printf("%d -> %s%n", i, isPrime);
        }


    }
}
