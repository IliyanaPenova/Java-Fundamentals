package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrivingInKathmandu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        String regex = "^(?<nameofpeak>[A-Za-z0-9!@#$?]+)=(?<length>\\d+)<<(?<code>(.*?)+)$";
        Pattern pattern = Pattern.compile(regex);
        while (!input.equals("Last note")){
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String name = matcher.group(1);
                int length = Integer.parseInt(matcher.group(2));
                String code = matcher.group(3);
                if(length!=code.length()){
                    System.out.println("Nothing found!");
                }else {
                    String nameOfMountain =  "";
                    for (int i = 0; i <name.length(); i++)
                    {
                        char currentCh = name.charAt(i);

                        if (Character.isLetterOrDigit(currentCh))
                        {
                            nameOfMountain += currentCh;
                        }
                    }
                    System.out.printf("Coordinates found! %s -> %s%n", nameOfMountain, code);
                }
            }else{
                System.out.println("Nothing found!");
            }
            input = scanner.nextLine();
        }
    }
}