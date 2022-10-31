import java.util.*;


public class Program {
    public static void main(String[] args) {
        Task2();
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

    public static void Task2() {
        String[] personnel = new String[] {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова",
                "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников",
                "Петр Петин", "Иван Ежов"};
        Map<Integer, ArrayList<String>> freq = new TreeMap<>(Collections.reverseOrder());
        for (String person : personnel) {
            String name = getFirstName(person);
            int frequency = 0;
            for (String n : personnel) {
                String sn = getFirstName(n);
                if (Objects.equals(sn, name)) {
                    frequency += 1;
                }
            }
            if (freq.containsKey(frequency)){
                ArrayList<String> list = freq.get(frequency);
                if (! list.contains(name)) {
                    list.add(name);
                }
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(name);
                freq.put(frequency, list);
            }
        }
        System.out.println(freq);
    }

    private static String getFirstName(String fullName) {
        String[] names = fullName.split(" ");
        if (names.length > 1) {
            return names[0];
        }
        return fullName;
    }
}
