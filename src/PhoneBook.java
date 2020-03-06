import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook extends HashMap {

    public static PhoneBook createPhoneBook () { //Метод для создания объекта класса
        HashMap<String, ArrayList<String>> pb = new PhoneBook();
        return (PhoneBook) pb;
    }

    public void add(String name, String num) { //Метод добавления пары ключ - значение
        if (!this.containsKey(name)) {
            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(num);
            this.put(name,numbers);
        } else {
            this.get(name).add(num);
        }
    }

    public ArrayList<String> get(String name) { //Метод получения значения по ключу
        ArrayList<String> arr = (ArrayList<String>) super.get(name);
        return arr;
    }
}
