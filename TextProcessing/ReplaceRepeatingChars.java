package TextProcessingExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

      char[] text=scanner.nextLine().toCharArray();
        List<Character> characterList= new ArrayList<>();
        for (int i = 0; i <text.length; i++) {
            characterList.add(text[i]);
        }
        for (int i = 1; i <characterList.size() ; i++) {
            char previous=characterList.get(i-1);
            char current=characterList.get(i);

            if(previous==current){
                characterList.remove(i);
                i--;
            }

        }
        for (Character character:characterList) {
            System.out.print(character);

        }

    }
}
