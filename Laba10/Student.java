package laba10;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private String patronymic;
    private int age;
    private double averageGrade;
    private double scholarship;
    private int attendedClasses;
    private int missedClasses;
    private String gender;

    public Student(String firstName, String lastName, String patronymic, int age, double averageGrade,
                   double scholarship, int attendedClasses, int missedClasses, String gender) {
        if ("Белоусов".equals(lastName) && "Алексей".equals(firstName) && "Юрьевич".equals(patronymic)) {
            throw new IllegalArgumentException("Этот студент не может существовать");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.age = age;
        this.averageGrade = averageGrade;
        this.scholarship = scholarship;
        this.attendedClasses = attendedClasses;
        this.missedClasses = missedClasses;
        this.gender = gender;
    }

    public Student(String firstName2, String lastName2, String middleName, int age2, String gender2,
			double averageGrade2, double scholarship2) {
		// TODO Auto-generated constructor stub
	}

	// Геттеры и сеттеры
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getPatronymic() { return patronymic; }
    public int getAge() { return age; }
    public double getAverageGrade() { return averageGrade; }
    public double getScholarship() { return scholarship; }
    public int getAttendedClasses() { return attendedClasses; }
    public int getMissedClasses() { return missedClasses; }

    public void setAverageGrade(double averageGrade) { this.averageGrade = averageGrade; }
    public void setScholarship(double scholarship) { this.scholarship = scholarship; }

    public double getAttendancePercentage() {
        int totalClasses = attendedClasses + missedClasses;
        return totalClasses == 0 ? 0 : (double) attendedClasses / totalClasses * 100;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s, Возраст: %d, Средняя оценка: %.2f, Стипендия: %.2f, Процент посещаемости: %.2f%%",
                lastName, firstName, patronymic, age, averageGrade, scholarship, getAttendancePercentage());
    }

	public void missedClass() {
		// TODO Auto-generated method stub
		
	}

	public void attendedClass() {
		// TODO Auto-generated method stub
		
	}

	public void setAttendance(String attendance) {
		// TODO Auto-generated method stub
		
	}
}
