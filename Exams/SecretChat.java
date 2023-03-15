package SoftUniExam;

import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String concealedMessage= scanner.nextLine();
        String message= scanner.nextLine();
        StringBuilder actualMessage=new StringBuilder(concealedMessage);

        while(!message.equals("Reveal")){
            String command=message.split(":\\|:")[0];
            String textToEdit=actualMessage.toString();
             switch (command){
                 case"InsertSpace":
                     int index=Integer.parseInt(message.split(":\\|:")[1]);
                     actualMessage=new StringBuilder(textToEdit.substring(0,index).concat(" ").concat(textToEdit.substring(index)));
                     System.out.println(actualMessage);
                     break;
                 case"Reverse":
                     String substring=message.split(":\\|:")[1];
                     if(textToEdit.contains(substring)){
                         String reverse=new StringBuilder(substring).reverse().toString();
                         actualMessage.delete(actualMessage.indexOf(substring),actualMessage.indexOf(substring)+substring.length());
                         actualMessage.append(reverse);
                         System.out.println(actualMessage);
                     }else{
                         System.out.println("error");
                     }
                     break;
                 case"ChangeAll":
                     String substringForReplacement=message.split(":\\|:")[1];
                     String replacement=message.split(":\\|:")[2];
                     while(textToEdit.contains(substringForReplacement)){
                         textToEdit=textToEdit.replace(substringForReplacement,replacement);
                     }
                     actualMessage=new StringBuilder(textToEdit);
                     System.out.println(actualMessage);
                     break;
             }
            message= scanner.nextLine();
        }
        System.out.println("You have a new text message: " + actualMessage);
    }
}
