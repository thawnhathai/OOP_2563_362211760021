package LAB8;

public class Employee extends Person {
    //Class Attributes
    private String  emID; //รหัสพนักงาน
    private String position;
    private double salary;
    //constructors

    public Employee() {
    }
    public Employee(String pid, String name, int age, String gender, String tel, String emID, String position, double salary) {
        //calling constructor of super-class
        super(pid, name, age, gender, tel);
        this.emID = emID;
        this.position = position;
        this.salary = salary;

    }
    //getter and setter

    public String getEmID() {
        return emID;
    }

    public void setEmID(String emID) {
        this.emID = emID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //toString()


    @Override
    public String toString() {
        return "Employee{" +
                "emID='" + emID + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                "} " + super.toString();
    }
}
