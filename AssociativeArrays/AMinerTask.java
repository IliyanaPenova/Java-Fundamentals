package ExerciseAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> map=new LinkedHashMap<>();
        String command= scanner.nextLine();
        while(!command.equals("stop")){
            int quantity=Integer.parseInt(scanner.nextLine());
            if(!map.containsKey(command)){
                map.put(command,quantity);
            }else{
                int currentQuantity=map.get(command);
                map.put(command,currentQuantity+quantity);
            }
            command= scanner.nextLine();
        }
        map.entrySet().forEach(entry-> System.out.println(entry.getKey()+" -> "+entry.getValue()));


    }
}