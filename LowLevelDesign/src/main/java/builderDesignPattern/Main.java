package builderDesignPattern;

/**
 * @author niranjanjoglekar on 28/02/24
 */
public class Main {
    public static void main(String[] args) {

        EmployeeBuilder employeeBuilder = new ITEmployee();
        Employee employee = employeeBuilder
                .name("John")
                .employeeNumber(312)
                .department("IT")
                .city("Bangalore")
                .build();

        System.out.println(employee.toString());
    }
}
