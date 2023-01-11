package SoftUniExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> items = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        String input= scanner.nextLine();
        while(!input.equals("Craft!")){
            String []commandsLine= input.split(" - ");
            String command=commandsLine[0];
            switch (command){
                case"Collect":
                    String addItem=commandsLine[1];
                    if(!items.contains(addItem)){
                        items.add(addItem);
                    }
                    break;
                case"Drop":
                    String itemToRemove=commandsLine[1];
                        items.remove(itemToRemove);
                    break;
                case"Combine Items":
                    String[] twoItems=commandsLine[1].split(":");
                    String oldItem=twoItems[0];
                    String newItem=twoItems[1];
                    if(items.contains(oldItem)){
                        int oldIndex=items.indexOf(oldItem);
                        items.add(oldIndex+1,newItem);
                    }

                    break;
                case"Renew":
                    String itemToRenew=input.split(" - ")[1];
                    if(items.contains(itemToRenew)){
                        items.remove(itemToRenew);
                        items.add(itemToRenew);
                    }
                    break;

            }
            input= scanner.nextLine();
        }
        System.out.println(String.join(", ",items));

    }
}
