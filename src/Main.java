import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // Задание 1: массив строк
        ArrayList <String> words = new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");
        words.add("eleven");
        words.add("eleven");
        words.add("twelve");
        words.add("thirteen");
        words.add("fourteen");
        words.add("fifteen");
        words.add("sixteen");
        words.add("seventeen");
        words.add("eighteen");
        words.add("eighteen");


        Map<String,Integer> map = new HashMap<>(); // таблица для анализа массива

        for (int i=0;i<words.size();i++) {
            Integer count = map.get(words.get(i));
            if (count == null) {
                map.put(words.get(i),1); // ключ - строка из массива, значение - количество таких строк в массиве
            } else {
                map.put(words.get(i), count + 1);
            }
        }
        System.out.println(map.toString()); // Вывод в консоль


        // Проверка класса PhoneBook
        PhoneBook phB1 = PhoneBook.createPhoneBook();

        phB1.add("Lennon","1234567891011");
        phB1.add("Lennon","000000001");
        phB1.add("McCartney","2345678910111");
        phB1.add("Harrison","3456789101112");
        phB1.add("Harrison","000000002");
        phB1.add("Starkey","4567891011121");
        phB1.add("Morrison","5678910111213");
        phB1.add("Morrison","00000000555");
        phB1.add("Dwight","6789101112131");

        System.out.println(phB1.toString());

        var a = phB1.get("Иванов");
        var b = phB1.get("Lennon");
        System.out.println(a);
        System.out.println(b);


    }

}
