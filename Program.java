import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


public class Program {
    public static void main(String[] args) {

    }

    public static void Task1() {
        Map<Integer, Contact> contacts = new HashMap<>();
        String[] names = new String[] {"Алексей", "Дмитрий", "Игорь"};
        String[] numbers = new String[] {"123", "456", "789"};

        for (int i = 0; i < names.length; i++) {
            contacts.put(i, new Contact(names[i], numbers[i]));
        }

        for (int i = 0; i < numbers.length; i++) {
            contacts.get(i).addNumber("111");
        }

        for (int i = 0; i < contacts.size(); i++) {
            System.out.println(contacts.get(i));
        }
    }
}
