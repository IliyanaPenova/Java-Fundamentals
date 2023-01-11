package TextProcessingExercises;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        String[] words=scanner.nextLine().split(" ");
        int sum=0;
        char[] firstWord=words[0].toCharArray();
        char[] secondWord=words[1].toCharArray();
        int tempSum=0;
        int shorterWord=Math.min(firstWord.length,secondWord.length);
        int longerWord=Math.max(firstWord.length,secondWord.length );
        for (int i = 0; i < shorterWord; i++) {
            tempSum=(int) firstWord[i]*(int) secondWord[i];
            sum+=tempSum;
            
        }
        if(firstWord.length > secondWord.length){
            for (int i=shorterWord; i <= longerWord-1; i++) {
                sum+=firstWord[i];
            }
        }else if(firstWord.length < secondWord.length){
            for (int i = shorterWord; i <=longerWord-1 ; i++) {
                sum+=secondWord[i];

            }
        }

        System.out.println(sum);

    }
}
