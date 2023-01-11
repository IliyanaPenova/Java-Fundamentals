package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         List<Integer> numbers = Arrays.stream(scanner.nextLine().split(""))
                         .map(Integer::parseInt).collect(Collectors.toList());
         String command=scanner.nextLine();
         while(!command.equals("end")){

             command=scanner.nextLine();

         }
    }
}
