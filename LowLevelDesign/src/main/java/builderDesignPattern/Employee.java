package builderDesignPattern;

/**
 * @author This is base class
 */
public class Employee {

    int employeeNumber;
    String name;
    String department;
    String city;

    Employee(EmployeeBuilder employeeBuilder){
        this.employeeNumber = employeeBuilder.employeeNumber;
        this.name = employeeBuilder.name;
        this.department = employeeBuilder.department;
        this.city = employeeBuilder.city;
    }

    public String toString(){
        return "Employee Number : "+this.employeeNumber +
                " Name : "+ this.name +
                " Department : "+this.department+
                " City : "+this.city;
    }

}
