import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapIntro {
    public static void tinyPhoneBook() {
        Scanner sc = new Scanner(System.in);
        Map<String, String> phoneBook = new HashMap<>();
        while (true) {
            String input = sc.nextLine();
            if (input.equals("quit")) break;

            String[] parts = input.split(" ");
            switch (parts[0]) {
                case "add" -> phoneBook.put(parts[1], parts[2]);
                case "get" -> System.out.println(phoneBook.getOrDefault(parts[1], "Not found"));
                default -> System.out.println("Unknown command.");
            }
        }
    }

}
