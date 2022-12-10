package homeworkStringMethods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("        Регистрация");
        System.out.println("__________________________");
        System.out.println("Введите ваше имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (name.isEmpty()){
            System.out.println("Ошибка! Строка не может быть пустой");
            return;
        }else {
            System.out.println("Добро пожаловать, " + name + "!");
        }
        System.out.println("Введите вашу электронную почту");
        String mail1 = scanner.nextLine();
        if (mail1.isEmpty()){
            System.out.println("Ошибка! Строка не может быть пустой");

        }else {
            System.out.println("Подтвердите вашу электронную почту");
            String mail2 = scanner.nextLine();
            if(mail2.isEmpty()){
                System.out.println("Ошибка! Строка не может быть пустой");
            }else if(mail1.equals(mail2)){
                System.out.println("Вы зарегестрированы!");
            }else{
                System.out.println("Электронная почта введена некорректно");
            }
        }
    }
}
