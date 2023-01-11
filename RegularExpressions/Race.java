package RegularExpressionsExercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String namesParticipants= scanner.nextLine();

        List<String> names= Arrays.stream(namesParticipants.split(", ")).collect(Collectors.toList());



        Map<String,Integer> racersDistance=new LinkedHashMap<>();
        names.forEach(name->racersDistance.put(name,0));

        String letterRegex="[A-Za-z]+";
        Pattern letter=Pattern.compile(letterRegex);

        String digitRegex="[0-9]";
        Pattern digit=Pattern.compile(digitRegex);


        String input= scanner.nextLine();
        while(!input.equals("end of race")){

            StringBuilder racerName=new StringBuilder();
            Matcher matcherLetters=letter.matcher(input);

            while(matcherLetters.find()){
                racerName.append(matcherLetters.group());
            }

            int distance=0;

            Matcher matcherDigits=digit.matcher(input);
            while(matcherDigits.find()){
                distance+=Integer.parseInt(matcherDigits.group());
                
            }
            if(names.contains(racerName.toString())){
                int currentDistance= racersDistance.get(racerName.toString());
                racersDistance.put(racerName.toString(),currentDistance+distance);
            }

            input= scanner.nextLine();

        }
           List<String> top3Names=racersDistance.entrySet().stream().sorted(Map.Entry.
                   comparingByValue(Comparator.reverseOrder()))
                   .limit(3).map(entry->entry.getKey())
                   .collect(Collectors.toList());
        System.out.println("1st place: "+top3Names.get(0));
        System.out.println("2nd place: "+top3Names.get(1));
        System.out.println("3rd place: "+top3Names.get(2));

     //   int count=1;

     //   for (Map.Entry<String,Integer> pair:racersDistance.entrySet()){
          //  if(count==1){
          //      System.out.println("1st place: "+pair.getKey());
      //          count++;
            }
         //   else if(count==2){
           //     System.out.println("2nd place: "+pair.getKey());
           //     count++;
          //  }
           // else if(count==3){
          //      System.out.println("3rd place: "+pair.getKey());
           //     break;
         //   }

        }
