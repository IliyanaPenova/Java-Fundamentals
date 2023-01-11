package DataTypesAndVariablesExercises;

import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input= scanner.nextLine();
        //•	Integer
        //•	Floating point
        //•	Characters
        //•	Boolean
        //•	Strings
        while(!input.equals("END")){
           String type="";
           //проверка за boolean;
           if(input.equalsIgnoreCase("true")||input.equalsIgnoreCase("false")){
               type="boolean";
           }else if
           //проверка за character;
            (input.length()==1) {
               char symbol = input.charAt(0);
               //проверка за символ
               if(symbol<47||symbol>58){
                   type="character";
               }else //проверка за едноцифрено цяло число
                {
                   type="integer";
               }

           }else //проверка за string,floating point,integer
           {
               boolean isString=false;
               boolean isFloat=false;
               for (int i = 0; i < input.length(); i++) {
                   char currentSymbol=input.charAt(i);
                   //проверка дали е символ
                   if(currentSymbol<45 ||currentSymbol>57){
                       isString=true;
                   }
                   if(currentSymbol==46){
                       isFloat=true;
                   }
               }
               if(isString){
                   type="string";
               }else{
                   //проверка за число
                   if(isFloat){
                       type="floating point";
                   }else{
                       type="integer";
                   }
               }

           }
            System.out.printf("%s is %s type%n",input,type);
           input= scanner.nextLine();
        }
    }
}
