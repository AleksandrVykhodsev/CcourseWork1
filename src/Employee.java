public class Employee {
    private String fullName;
    private double wage;
    private int department;
    private int id;
    private static int counter = 0;
    public Employee(String fullName, double wage, int department){
        this.fullName = fullName;
        this.wage = wage;
        this.department = department;
        counter++;
        id = counter;

    }

    public String getFullName() {
        return fullName;
    }

    public double getWage() {
        return wage;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
    @Override
    public String toString(){
        return String.format("%d. %s; Номер отдела: %d; Заработная плата: %.2f", id, fullName, department, wage);

    }

}
