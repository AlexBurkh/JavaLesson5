import java.util.ArrayList;
import java.util.List;

public class Contact {
    String name;
    List<String> numbers;

    public Contact(String name, String number) {
        this.name = name;
        this.numbers = new ArrayList<>();
        this.numbers.add(number);
    }

    public void addNumber(String number) {
        if (! numbers.contains(number)) {
            numbers.add(number);
        }
    }

    @Override
    public String toString() {
        String res = this.name + ":";
        for (int i = 0; i < numbers.size(); i++) {
            res += (" " + numbers.get(i));
        }
        return res;
    }
}
