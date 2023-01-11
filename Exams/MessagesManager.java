package SoftUniExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MessagesManager {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> senderMap = new LinkedHashMap<>();
        Map<String, Integer> receiverMap = new LinkedHashMap<>();

        int capacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Statistics")) {

            String input = command.split("=")[0];

            switch (input) {
                case "Add":
                    String username = command.split("=")[1];
                    int sent = Integer.parseInt(command.split("=")[2]);
                    int received = Integer.parseInt(command.split("=")[3]);
                    if (!senderMap.containsKey(username)) {
                        senderMap.put(username, sent);
                    }
                    if (!receiverMap.containsKey(username)) {
                        receiverMap.put(username, received);
                    }

                    break;
                case "Message":
                    String sendPerson = command.split("=")[1];
                    String receivePerson = command.split("=")[2];

                    if (senderMap.containsKey(sendPerson) && receiverMap.containsKey(receivePerson)) {
                        senderMap.put(sendPerson, senderMap.get(sendPerson) + 1);
                        receiverMap.put(receivePerson, receiverMap.get(receivePerson) + 1);

                        if (senderMap.get(sendPerson) + receiverMap.get(sendPerson) >= capacity) {
                            senderMap.remove(sendPerson);
                            receiverMap.remove(sendPerson);
                            System.out.printf("%s reached the capacity!%n", sendPerson);

                        } else if (receiverMap.get(receivePerson) + senderMap.get(receivePerson) > capacity) {
                            receiverMap.remove(receivePerson);
                            senderMap.remove(receivePerson);
                            System.out.printf("%s reached the capacity!%n", receivePerson);
                        }
                    }

                    break;
                case "Empty":

                    String user = command.split("=")[1];
                    if (senderMap.containsKey(user)) {
                        senderMap.remove(user);
                        receiverMap.remove(user);
                    } else if (user.equals("A11")) {
                        senderMap.clear();
                        receiverMap.clear();

                    }
                    break;
            }

            command = scanner.nextLine();

        }
        System.out.printf("Users count: %d%n", senderMap.size());
        for (Map.Entry<String, Integer> stringEntry : receiverMap.entrySet()) {
            System.out.printf("%s - %d%n", stringEntry.getKey(), stringEntry.getValue()
                    + senderMap.get(stringEntry.getKey()));

        }
    }
}
