package ObjectsandClasses.Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        List<Student> studentsList=new ArrayList<>();
        for (int i = 1; i <=n; i++) {
            String data= scanner.nextLine();
            String[] dataParts=data.split(" ");
            String name=dataParts[0];
            String lastName=dataParts[1];
            double grade=Double.parseDouble(dataParts[2]);
        Student student=new Student(name,lastName,grade);
        studentsList.add(student);
        }
        studentsList.sort(Comparator.comparing(Student::getGrade).reversed());
        for (Student student:studentsList) {
            System.out.println(student);

        }
    }
}
