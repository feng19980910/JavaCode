public class EmployeeTest {
    public static void main(String args[]) {
        Employee empOne = new Employee("RUNOOB1");
        Employee empTwo = new Employee("RUNOOB2");

        empOne.empAge(26);
        empOne.empDesignation("Advance Programmer");
        empOne.empSalary(1000);

        empTwo.empAge(21);
        empTwo.empDesignation("Primer Programmer");
        empTwo.empSalary(500);

        empOne.printEmployee();
        empOne.printEmployee();
    }
}