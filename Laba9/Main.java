package laba9;

public class Main {
    public static void main(String[] args) {
        Group group = new Group();

        // Добавление студентов
        for (int i = 0; i < 5; i++) {
            group.addStudent(); // Может быть вызван метод для добавления с параметром
        }

        // Попробуем удалить студента
        try {
            group.removeStudent(0);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        // Получение студента
        try {
            Students student = group.getStudent(0);
            System.out.println("Имя студента: " + student.getFirstName());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
