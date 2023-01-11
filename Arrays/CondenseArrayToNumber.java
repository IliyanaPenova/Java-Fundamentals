package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] num = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] condense= new int[num.length-1];
        for (int i = 0; i < num.length ; i++) {
            if (num.length == 1) {
                break;
            }
            if (i == num.length - 1) {

                int[] condensedNew= new int[condense.length-1];
                i=-1;
                num=condense;
                condense=condensedNew;


            } else {
                condense[i] = num[i] + num[i + 1];
            }
        }
        System.out.println(num[0]);
    }
}
