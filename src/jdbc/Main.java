package jdbc;

import java.sql.*;

public class Main {
    private final String URL = "jdbc:postgresql://localhost:5432/it_academy";
    private final String USER = "postgres";
    private final String PASSWORD = "postgres";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    public int getCountAStudents() {
        String SQL = "SELECT COUNT(*) FROM students WHERE fullname LIKE '%a%'";
        int count = 0;
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            rs.next();
            count = rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }
    public int getMaxAgeStudents() {
        String SQL = "SELECT MAX(age) FROM students";
        int countMax = 0;
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            rs.next();
            countMax = rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return countMax;
    }
    public int getAvgRateStudents() {
        String SQL = "SELECT AVG(average_rating) FROM students";
        int avg = 0;
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            rs.next();
            avg = rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return avg;
    }

    public int getStudentsCount() {
        String SQL = "SELECT count(*) FROM students";
        int count = 0;
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            rs.next();
            count = rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }
    public int getMinAgeStudents() {
        String SQL = "SELECT MIN(age) FROM students";
        int countMin = 0;
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            rs.next();
            countMin = rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return countMin;
    }

    public int getSalaryStudents() {
        String SQL = "SELECT SUM(salary) FROM students";
        int countSalary = 0;
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            rs.next();
            countSalary = rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return countSalary;
    }


    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("1)Студентов с буквой a в имени - " + main.getCountAStudents());
        System.out.println("2)Максимальный возраст среди студентов - " + main.getMaxAgeStudents());
        System.out.println("3)Средняя оценка среди студентов - " + main.getAvgRateStudents());
        System.out.println("4)Количество всех студентов равно - " + main.getStudentsCount());
        System.out.println("5)Минимальный возраст среди студентов - " + main.getMinAgeStudents());
        System.out.println("6)Сумма стипендий всех студентов - " + main.getSalaryStudents());
    }

}
//
//
//Инструкции
//        Подключится к базе (для этого подойдет любая база).
//
//        Добавить таблицу Студенты.
//
//        Добавить туда записи.
//
//        Создать проект на  Java.
//        Получить количество студентов в имени которых содержится буква «а».
//        Получить максимальной возраст среди студентов
//        Получить среднюю оценку среди студентов.
//        Получить кол-во всех студентов
//        Получить возраст самого младшего студента
//        Получить сумму стипендий всех студентов