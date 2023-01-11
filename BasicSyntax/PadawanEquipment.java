package BasicSyntaxExercises;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double amountOfMoney=Double.parseDouble(scanner.nextLine());
        int countOfStudents=Integer.parseInt(scanner.nextLine());
        double lightSabersPrice=Double.parseDouble(scanner.nextLine());
        double robes=Double.parseDouble(scanner.nextLine());
        double belts=Double.parseDouble(scanner.nextLine());

        //sabresPrice * (studentsCount + 10%) +
        // robesPrice * (studentsCount) + beltsPrice * (studentsCount - freeBelts)
        double sumLight = Math.ceil(countOfStudents + 0.10 * countOfStudents) * lightSabersPrice; //1.1 * studentsCount
        double sumRobes = countOfStudents * robes;
        double sumBelts = (countOfStudents - countOfStudents/6) * belts;
        double finalPrice=sumLight+sumBelts+sumRobes;

        if(amountOfMoney>=finalPrice){
            System.out.printf("The money is enough - it would cost %.2flv.",finalPrice);
        }else{
            System.out.printf("George Lucas will need %.2flv more.",Math.abs(amountOfMoney-finalPrice));
        }

    }
}
