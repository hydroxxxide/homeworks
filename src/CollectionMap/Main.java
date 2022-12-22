package CollectionMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            System.out.println("Пожалуйста, введите день недели:");
            Map<String, String> map = new HashMap<>();
            map.put("Monday", "Понедельник");
            map.put("Tuesday", "Вторник");
            map.put("Wednesday", "Среда");
            map.put("Thursday", "Четверг");
            map.put("Friday", "Пятница");
            map.put("Saturday", "Суббота");
            map.put("Sunday", "Воскресенье");
            Scanner scanner = new Scanner(System.in);
            String day = scanner.nextLine();
            if (map.get(day) != null) {
                System.out.println(map.get(day));

            }else {
                System.out.println("Ошибка!");
            }

        }
    }

