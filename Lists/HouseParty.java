package ListsExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int countOfCommands=Integer.parseInt(scanner.nextLine());
        List<String> guestsNames=new ArrayList<>();
        for (int count = 1; count <=countOfCommands ; count++) {
            String command=scanner.nextLine();
            List<String> commandParts=Arrays.stream(command.split(" ")).
                    collect(Collectors.toList());
            String name=commandParts.get(0);
            if(commandParts.size()==3){
                if(guestsNames.contains(name)){
                    System.out.printf("%s is already in the list!%n",name);
                }else{
                   guestsNames.add(name);
                }
            }else if(commandParts.size()==4){
                if(guestsNames.contains(name)){
                    guestsNames.remove(name);

                }else{
                    System.out.printf("%s is not in the list!%n",name);
                }
            }
        }
        for (String name:guestsNames) {
            System.out.println(name);

        }

    }
}
