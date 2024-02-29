package builderDesignPattern;

/**
 * @author niranjanjoglekar on 29/02/24
 */
public class ITEmployee extends EmployeeBuilder{

    @Override
    public EmployeeBuilder department(String department) {
        this.department = department;
        return this;
    }
}
