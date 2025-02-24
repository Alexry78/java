package company;

public class OfficeWorker extends Employee implements Worker {
    private String project;
    private int officeNumber;

    public OfficeWorker(String name, String surname, String gender, boolean active, 
                        String position, double payment, int experience, String department,
                        String project, int officeNumber) {
        super(name, surname, gender, active, position, payment, experience, department);
        this.project = project;
        this.officeNumber = officeNumber;
    }

    @Override
    public void work() {
        System.out.println("Офисный работник " + getName() + " работает над проектом: " + project);
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

	public void organizeMeeting(String string) {
		// TODO Auto-generated method stub
		
	}
}
