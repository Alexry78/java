package laba9;

import java.util.Scanner;

public class Group {
    private Students[] students;
    private int count;
    private static final int MAX_STUDENTS = 15;

    public Group() {
        students = new Students[MAX_STUDENTS];
        count = 0;
    }

    public void addStudent() {
        if (count >= MAX_STUDENTS) {
            throw new RuntimeException("Группа переполнена. Нельзя добавить больше студентов.");
        }

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите возраст студента: ");
            int age = scanner.nextInt();
            System.out.print("Введите пол студента: ");
            String gender = scanner.next();
            System.out.print("Введите имя: ");
            String firstName = scanner.next();
            System.out.print("Введите фамилию: ");
            String lastName = scanner.next();
            System.out.print("Введите отчество: ");
            String middleName = scanner.next();
            System.out.print("Введите курс: ");
            int course = scanner.nextInt();
            System.out.print("Введите средний балл: ");
            double averageScore = scanner.nextDouble();

            Students student = new Students(age, gender, firstName, lastName, middleName, course, averageScore);
            students[count++] = student;

        } catch (NotCorrectAgeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ошибка ввода: " + e.getMessage());
        }
    }

    public void addStudent(Students student) {
        if (count >= MAX_STUDENTS) {
            throw new RuntimeException("Группа переполнена. Нельзя добавить больше студентов.");
        }

        students[count++] = student;
    }

    public void removeStudent(int index) {
        if (count <= 3) {
            throw new RuntimeException("Нельзя удалить студента, так как останется менее 3 студентов.");
        }
        if (index < 0 || index >= count) {
            throw new ArrayIndexOutOfBoundsException("Нет студента с таким номером.");
        }

        // Удаляем студента, сдвигаем массив
        for (int i = index; i < count - 1; i++) {
            students[i] = students[i + 1];
        }
        students[--count] = null; // Обнуляем последний элемент
    }

    public Students getStudent(int index) {
        if (index < 0 || index >= count) {
            throw new ArrayIndexOutOfBoundsException("Нет студента с таким номером.");
        }
        return students[index];
    }
}