package SoftUniExam;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BossRush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regex = "\\|(?<name>[A-Z]{4,})\\|:\\#(?<title>[A-Za-z]+ [A-Za-z]+)\\#";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = null;

        for (int i = 0; i <= n; i++) {
            String person = scanner.nextLine();
            matcher = pattern.matcher(person);
        if(matcher.find()) {
            String name = matcher.group("name");
            String title = matcher.group("title");
            //o	"{boss name}, The {title}
            System.out.println(name + ", The " + title);
            System.out.println(">> Strength: "+name.length());
            System.out.println(">> Armor: "+title.length());

        } else {
            System.out.println("Access denied!");
        }
        }
    }
    }
