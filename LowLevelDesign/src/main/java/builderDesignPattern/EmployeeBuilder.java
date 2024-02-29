package builderDesignPattern;

/**
 * @author This is builder of employee
 */
public abstract class EmployeeBuilder {
    int employeeNumber;
    String name;
    String department;
    String city;

    public EmployeeBuilder employeeNumber(int employeeNumber){
        this.employeeNumber = employeeNumber;
        return this;
    }

    public EmployeeBuilder name(String name){
        this.name = name;
        return this;
    }

    public abstract EmployeeBuilder department(String department);

    public EmployeeBuilder city(String city){
        this.city = city;
        return this;
    }

    public Employee build(){
        return new Employee(this);
    }

}
