package TextProcessingExercises;

import java.util.Locale;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        int multiplier=Integer.parseInt(scanner.nextLine());

        StringBuilder exitNum=new StringBuilder();
        int addNum=0;
        for (int i = 0; i <input.length(); i++) {
            char ch = input.charAt(i);
            if(ch!='0'){
                int index=i;
                input=input.substring(index);
                break;
            }

        }
        if(multiplier==0){
            System.out.println(0);
            return;
        }


        char[] inputNum = input.toCharArray();

        for (int i = inputNum.length - 1; i >= 0; i--) {
            int currentNum = ((inputNum[i] - '0') * multiplier) + addNum;
            addNum = currentNum / 10;
            currentNum %= 10;
            exitNum.append(currentNum);
        }
        if (addNum > 0) {
            exitNum.append(addNum);
        }
        exitNum.reverse();
        System.out.println(exitNum);
    }
}
