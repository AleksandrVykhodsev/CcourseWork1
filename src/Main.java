public class Main {
    private static Employee[] employees;
    public static void main(String[] args) {
        employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 15495.59, 1);
        employees[1] = new Employee("Петров Петр Петрович", 16749.77, 2);
        employees[2] = new Employee("Васильев Василий Васильевич", 14578.98, 3);
        employees[3] = new Employee("Никитин Никита Никитеевич", 17578.61, 4);
        employees[4] = new Employee("Александров Александр Александрович", 13624.43, 5);
        totalEmployee();
        System.out.println("Сумма всех заработных плат работников: " + sumWage());
        System.out.println("Сотрудник с минимальной заработной платой: " + employeeMinWage());
        System.out.println("Сотрудник с максимальной заработной платой: " + employeeMaxWage());
        System.out.println("Средняя заработная плата сотрудников: " + averegeWage());
        printFullName();
    }
    public static void totalEmployee(){
        for (int i = 0; i < employees.length; i++){
            if (employees[i] != null){
                System.out.println(employees[i].toString());
            }
        }
    }
    public static double sumWage(){
        double result = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                result += employees[i].getWage();
            }
        }
        return result;
    }
    public static Employee employeeMinWage(){
        Employee result = employees[0];
        double min = 1_000_000;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getWage() < min) {
                min = employees[i].getWage();
                result = employees[i];
            }
        }
        return result;
    }
    public static Employee employeeMaxWage(){
        Employee result = employees[0];
        double max = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getWage() > max) {
                max = employees[i].getWage();
                result = employees[i];
            }
        }
        return result;
    }
    public static double averegeWage(){
        int notNullElements = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                notNullElements++;
            }
        }
        return sumWage() / notNullElements;
    }
    public static void printFullName(){
        for (int i = 0; i < employees.length; i++){
            if (employees[i] != null){
                System.out.println(employees[i].getFullName());
            }
        }
    }
}