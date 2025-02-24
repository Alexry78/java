package company;

public class Employee extends Person {
    private String position;
    private double payment;
    private int experience;
    private String department;

    // Конструктор
    public Employee(String name, String surname, String gender, boolean active, String position, double payment, int experience, String department) {
        super(name, surname, gender, active);
        this.position = position;
        this.payment = payment;
        this.experience = experience;
        this.department = department;
    }

    // Гетеры и сетеры
    // (вам следует сгенерировать их, если требуется, но я приведу основные как пример)
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
