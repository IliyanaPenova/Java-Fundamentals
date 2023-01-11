package ListsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int sumOfRemovedElements = 0;

        while (numbers.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());
            if (index >= 0 && index <= numbers.size() - 1) {
                int removedElement = numbers.get(index);
                sumOfRemovedElements += removedElement;
                numbers.remove(index);

                modifyList(numbers, removedElement);

            } else if (index < 0) {

                int firstElement = numbers.get(0);
                sumOfRemovedElements += firstElement;
                numbers.remove(0);

                int lastElement = numbers.get(numbers.size() - 1);
                numbers.add(0, lastElement);
                modifyList(numbers, firstElement);


            } else if (index > numbers.size() - 1) {
                int lastElement = numbers.get(numbers.size() - 1);
                sumOfRemovedElements += lastElement;
                numbers.remove(numbers.size() - 1);

                int firstElement = numbers.get(0);
                numbers.add(firstElement);
                modifyList(numbers, lastElement);

            }
        }
            System.out.println(sumOfRemovedElements);
        }


    private static void modifyList(List<Integer> numbers, int removedElement) {
        for (int indexList = 0; indexList <= numbers.size()-1; indexList++) {
            int currentNumber= numbers.get(indexList);
            if(currentNumber<= removedElement){
                currentNumber+= removedElement;
            }else {
                currentNumber-= removedElement;
            }
            numbers.set(indexList,currentNumber);

        }
    }
}
