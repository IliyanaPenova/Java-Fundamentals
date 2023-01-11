package SoftUniExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CoffeeLover {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> coffee= Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        int n=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            String[] command=scanner.nextLine().split("\\s+");
            switch (command[0]){
                case"Include":
                    coffee.add(command[1]);
                    break;
                case "Remove":
                    int removedCoffee=Integer.parseInt(command[2]);
                    if(removedCoffee<=coffee.size()){
                        if(command[1].equals("first")){
                            for (int j = 0; j < removedCoffee; j++) {
                                coffee.remove(0);
                            }
                            }else if(command[1].equals("last")){
                                for (int j = 0; j < removedCoffee; j++) {
                                    coffee.remove(coffee.size()-1);
                                }
                            }
                        }
                        break;
                case"Prefer":
                    int firstIndex=Integer.parseInt(command[1]);
                    int secondIndex=Integer.parseInt(command[2]);
                    try{
                        String firstCoffee=coffee.get(firstIndex);
                        coffee.set(firstIndex,coffee.get(secondIndex));
                        coffee.set(secondIndex,firstCoffee);
                    }catch (Exception e){}
                    break;

            }
        }
        System.out.println("Coffees:");
        for (String coffees :coffee) {
            System.out.println(coffees+" ");

        }

    }

}
