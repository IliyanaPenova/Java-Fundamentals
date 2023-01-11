import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class anotherstudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> books = Arrays.stream(scanner.nextLine().split("&"))
                .collect(Collectors.toList());

        String lineInput = scanner.nextLine();

        while (!lineInput.equals("Done")) {
            String[] commandArr = lineInput.split(" \\| ");
            String command = commandArr[0];

            switch (command) {
                case "Add Book":
                    addCommand(commandArr, books);
                    break;
                case "Take Book":
                    takeCommand(commandArr, books);
                    break;
                case "Swap Books":
                    swapCommand(commandArr, books);
                    break;
                case "Insert Book":
                    insertCommand(commandArr, books);
                    break;
                case "Check Book":
                    checkCommand(commandArr, books);
                    break;
            }

            lineInput = scanner.nextLine();
        }


        System.out.println(books.toString().replaceAll("[\\[\\]]", ""));
    }
    public static List<String> addCommand (String[] arr, List<String> list){
        String book = arr[1];
        boolean thereIsNot = true;
        for (int i = 0; i < list.size(); i++) {
            String currentElement = list.get(i);
            if(currentElement.equals(book)){
                thereIsNot = false;
                break;
            }
        }
        if (thereIsNot) {
            list.add(0, book);
        }
        return list;
    }

    public static List<String> takeCommand (String[] arr, List<String> list){
        String book = arr[1];
        boolean thereIsNot = true;
        for (int i = 0; i < list.size(); i++) {
            String currentElement = list.get(i);
            if(currentElement.equals(book)){
                thereIsNot = false;
                break;
            }
        }
        if (!thereIsNot) {
            list.remove(book);
        }
        return list;
    }

    public static List<String> swapCommand(String[] arr, List<String> list){
        String firstBook = arr[1];
        String secondBook = arr[2];
        int index1 = list.indexOf(firstBook);
        int index2 = list.indexOf(secondBook);

        boolean firstBookIsNotThere = true;
        boolean secondBookIsNotThere = true;

        for (int i = 0; i < list.size(); i++) {
            String currentElement = list.get(i);
            if(currentElement.equals(firstBook)){
                firstBookIsNotThere = false;
                break;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            String currentElement = list.get(i);
            if(currentElement.equals(secondBook)){
                secondBookIsNotThere = false;
                break;
            }
        }

        if (!firstBookIsNotThere && !secondBookIsNotThere) {
            list.set(index1, secondBook);
            list.set(index2, firstBook);
        }

        return list;
    }
    public static List<String> insertCommand (String[] arr, List<String> list){
        String book = arr[1];
        boolean thereIsNot = true;
        for (int i = 0; i < list.size(); i++) {
            String currentElement = list.get(i);
            if(currentElement.equals(book)){
                thereIsNot = false;
                break;
            }
        }
        if (thereIsNot) {
            list.add(book);
        }
        return list;
    }
    public static List<String> checkCommand (String[] arr, List<String> list){
        int index = Integer.parseInt(arr[1]);
        int size = list.size() - 1;
        if(index <= size && index >= 0){
            System.out.println(list.get(index));
        }
        return list;
    }
}
