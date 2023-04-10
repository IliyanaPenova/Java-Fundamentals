package SoftUniSummerExam;

import java.util.Scanner;

public class Easter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String inputLine = scanner.nextLine();
                while (true) {
                    String[] command = scanner.nextLine().split(" ");
                    if (command[0].equals("Replace")) {
                        char currentChar = command[1].charAt(0);
                        char newChar = command[2].charAt(0);
                        inputLine = inputLine.replace(currentChar, newChar);
                        System.out.println(inputLine);
                    } else if (command[0].equals("Remove")) {
                        String substring = command[1];
                        if (inputLine.contains(substring)) {
                            inputLine = inputLine.replace(substring, "");
                            System.out.println(inputLine);
                        }else{
                            System.out.println(inputLine);
                        }
                    } else if (command[0].equals("Includes")) {
                        String string = command[1];
                        if(inputLine.contains(string)){
                            System.out.println("True");
                        }else{
                            System.out.println("False");
                        }
                    } else if (command[0].equals("Change")) {
                        String caseType = command[1];
                        if (caseType.equals("Lower")) {
                            inputLine = inputLine.toLowerCase();
                        } else if (caseType.equals("Upper")) {
                            inputLine = inputLine.toUpperCase();
                        }
                        System.out.println(inputLine);
                    } else if (command[0].equals("Reverse")) {
                        int startIndex = Integer.parseInt(command[1]);
                        int endIndex = Integer.parseInt(command[2]);
                        if (startIndex < -50 || endIndex >= inputLine.length() || startIndex > endIndex ||endIndex>50) {
                            continue;
                        }
                            StringBuilder reversedSubstring = new StringBuilder(inputLine.substring(startIndex, endIndex + 1)).reverse();
                            String newText = reversedSubstring.toString();
                            System.out.println(newText);
                    }
                    else if (command[0].equals("Easter")) {
                        break;
                    }
                }
            }
        }