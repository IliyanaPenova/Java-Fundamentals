package ExerciseAssociativeArrays;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int countStudents=Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentsGrade=new LinkedHashMap<>();

        for (int students = 0; students < countStudents; students++) {
            String name= scanner.nextLine();
            double grade=Double.parseDouble(scanner.nextLine());
            if(!studentsGrade.containsKey(name)){
                studentsGrade.put(name,new ArrayList<>());
            }
            studentsGrade.get(name).add(grade);

        }
        Map<String,Double> averageGrades=new LinkedHashMap<>();
        for (Map.Entry<String,List<Double>> entry:studentsGrade.entrySet()) {
            List<Double> listGrades=entry.getValue();
            String StudentName= entry.getKey();
            double averageGrade=getAverageGrade(listGrades);
            if(averageGrade>=4.50){
               averageGrades.put(StudentName,averageGrade);
            }
        }
        averageGrades.entrySet().forEach(entry-> System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue()));


    }
    public static double getAverageGrade(List<Double> listGrades){
        double sumGrades=0;
        for (double grade:listGrades) {
            sumGrades+=grade;
        }
        return sumGrades/listGrades.size();
    }
}
