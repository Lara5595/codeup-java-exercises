public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        employee1.name = "Pablo";
        employee2.name = "Escobar";
        employee3.name = "Checo";

        System.out.println(employee1.displayEmployeeInfo());
        System.out.println(employee2.displayEmployeeInfo());
        System.out.println(employee3.displayEmployeeInfo());
    }
}




//    Create an Employee class. The employee class should have a name instance variable, a static company variable set to Veridian Dynamics, and a non-static method displayEmployeeInfo(). displayEmployeeInfo() should generate a string, name + " works at " + company. Create a test class that instantiates three employee objects with different names. Run displayEmployeeInfo on all of them to show that each has access to the employee static variable. Bonus: write a method that has the employee emit a random quote and test it.