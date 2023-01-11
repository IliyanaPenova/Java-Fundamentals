package ExerciseAssociativeArrays;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String command=scanner.nextLine();
        Map<String, List<String> >registeredStudents=new LinkedHashMap<>();

        while(!command.equals("end")){
            String courseName=command.split(" : ")[0];
            String studentName=command.split(" : ")[1];

            if(!registeredStudents.containsKey(courseName)) {
                registeredStudents.put(courseName, new ArrayList<>());
            }
                registeredStudents.get(courseName).add(studentName);


            command=scanner.nextLine();
        }
        registeredStudents.entrySet().forEach(entry->{
            System.out.println(entry.getKey()+": "+entry.getValue().size());
            entry.getValue().forEach(studentName-> System.out.println("-- "+studentName));
        });
    }
}
