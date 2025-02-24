package laba9;

import java.util.Scanner;

public class Students {
    private int age;
    private String gender;
    private String firstName;
    private String lastName;
    private String middleName;
    private int course;
    private double averageGrade;

    // Конструктор без параметров
    public Students() {
    }

    // Конструктор с параметрами
    public Students(int age, String gender, String firstName, String lastName, String middleName, int course, double averageGrade) throws NotCorrectAgeException {
        setAge(age);
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.course = course;
        this.averageGrade = averageGrade;
    }

    // Геттеры и сеттеры
    public int getAge() {
        return age;
    }

    public void setAge(int age) throws NotCorrectAgeException {
        if (age < 16 || age > 60) {
            throw new NotCorrectAgeException("Возраст должен быть в диапазоне от 16 до 60 лет.");
        }
        this.age = age;
    }

	public String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

    // ... другие геттеры и сеттеры для остальных полей
}
