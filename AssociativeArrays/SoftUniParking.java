package ExerciseAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> map = new LinkedHashMap();
        for (int i = 0; i < n; i++) {
            String[] input=scanner.nextLine().split(" ");

            String command=input[0];
            String user =input[1];

           switch (command){
               case"register":
                   String plateNumber=input[2];
                if (!map.containsKey(user)) {
                    map.put(user, plateNumber);
                    System.out.printf("%s registered %s successfully%n", user, plateNumber);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", plateNumber);
                }
            break;
         case"unregister":
                    if (!map.containsKey(user)) {
                        System.out.printf("ERROR: user %s not found%n", user);
                    } else {
                        map.remove(user);
                        System.out.printf("%s unregistered successfully%n", user);

                    }
                    break;
                }
            }
        for(Map.Entry<String,String> entry:map.entrySet()){

            System.out.printf("%s => %s%n",entry.getKey(),entry.getValue());
        }
    }
}
