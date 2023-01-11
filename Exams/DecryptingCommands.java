package SoftUniExam;

import java.util.Scanner;

public class DecryptingCommands {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String oldMessage = scanner.nextLine();
        String commandLine = scanner.nextLine();

        while (!commandLine.equals("Finish")){
            String[] commandArr = commandLine.split(" ");
            String instruction = commandArr[0];

            switch (instruction) {
                case "Replace":
                    String oldChar = commandArr[1];
                    String newChar = commandArr[2];
                    if (oldMessage.contains(oldChar)) {
                        oldMessage = oldMessage.replace(oldChar, newChar);
                        System.out.println(oldMessage);
                    }
                    break;


                case "Cut":
                    int startIndex = Integer.parseInt(commandArr[1]);
                    int endIndex = Integer.parseInt(commandArr[2]);
                    if (startIndex >= 0 && startIndex <= oldMessage.length()  &&
                            endIndex >= 0 && endIndex <= oldMessage.length() ) {
                        String substring = oldMessage.substring(startIndex, endIndex + 1);
                        oldMessage = oldMessage.replace(substring, "");
                        System.out.println(oldMessage);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;


                case "Make" :
                    String upperLower = commandArr[1];
                    if (upperLower.contains("Upper")){
                        oldMessage = oldMessage.toUpperCase();
                        System.out.println(oldMessage);
                    } else if (upperLower.contains("Lower")){
                        oldMessage = oldMessage.toLowerCase();
                        System.out.println(oldMessage);
                    }
                    break;


                case "Check" :
                    if (oldMessage.contains(commandArr[1])){
                        System.out.println("Message contains " + commandArr[1]);
                    } else {
                        System.out.println("Message doesn't contain " + commandArr[1]);
                    }
                    break;


                case "Sum" :
                    int start = Integer.parseInt(commandArr[1]);
                    int end = Integer.parseInt(commandArr[2]);
                    if (start >= 0 && end >= 0 && start <= oldMessage.length()
                            && end <= oldMessage.length()) {
                        String text = oldMessage.substring(start, end + 1);
                        int sum = 0;
                        for (int i = 0 ; i < text.length() ; i++){
                            int currentValue = text.charAt(i);
                            sum += currentValue ;
                        }
                        System.out.println(sum);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
            }


            commandLine = scanner.nextLine();
        }

    }
}
