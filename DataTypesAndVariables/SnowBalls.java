package DataTypesAndVariablesExercises;

import java.util.Scanner;

public class SnowBalls {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         //(snowballSnow / snowballTime) ^ snowballQuality
        int n=Integer.parseInt(scanner.nextLine());
        double maxValue=Double.MIN_VALUE;
        int snowBallSnowBiggest=0;
        int snowBallTimeBiggest=0;
        int snowBallQualityBiggest=0;
        for (int  snowball= 1; snowball <=n ; snowball++) {
            int snowBallSnow = Integer.parseInt(scanner.nextLine());
            int snowBallTime = Integer.parseInt(scanner.nextLine());
            int snowBallQuality = Integer.parseInt(scanner.nextLine());
            double snowBallValue = Math.pow(snowBallSnow / snowBallTime, snowBallQuality);
            if (snowBallValue > maxValue) {
                maxValue = snowBallValue;
                snowBallSnowBiggest = snowBallSnow;
                snowBallTimeBiggest = snowBallTime;
                snowBallQualityBiggest = snowBallQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)",snowBallSnowBiggest,snowBallTimeBiggest,
                maxValue,snowBallQualityBiggest);
    }
}
