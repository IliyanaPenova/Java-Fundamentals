package SoftUniExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WinningTicket {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        List<String> ticketList= Arrays.stream(scanner.nextLine().split(",\\s+")).collect(Collectors.toList());

        for (String currentTicket:ticketList) {
            if(currentTicket.length()!=20){
                System.out.println("invalid ticket");
                continue;
            }
            String leftTicket=currentTicket.substring(0,10);
            String rightTicket=currentTicket.substring(10,20);
            String leftMatch="a";
            String rightMatch="s";

            Pattern pattern=Pattern.compile("[\\\\\\\\@]{6,}|[\\\\\\\\$]{6,}|[\\\\\\\\#]{6,}|[\\\\\\\\^]{6,}");
            Matcher leftSideTicket= pattern.matcher(leftTicket);
            Matcher rightSideTicket=pattern.matcher(rightTicket);

            if(leftSideTicket.find()){
                leftMatch=leftSideTicket.group();
            }
            if(rightSideTicket.find()){
                rightMatch=rightSideTicket.group();
            }
            if(leftMatch.substring(0,1).equals(rightMatch.substring(0,1))) {
                int matchCount = Math.min(leftMatch.length(), rightMatch.length());
                if (matchCount == 10) {
                    System.out.printf("ticket \"%s\" - %d%s Jackpot!\n", currentTicket, matchCount, leftMatch.charAt(0));
                } else {
                    System.out.printf("ticket \"%s\" - %d%s\n", currentTicket, matchCount, leftMatch.charAt(0));
                }
            }else{
                    System.out.printf("ticket \"%s\" - no match\n", currentTicket);
                }
            }

        }

    }
