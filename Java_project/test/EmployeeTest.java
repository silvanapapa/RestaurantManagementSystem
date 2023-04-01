import org.junit.Test;

public class EmployeeTest
{
    @Test
    public void testMinimumWageRate()
    {
        Employee employee = new Employee();
        employee.setWageRate(10);
        assert employee.getWageRate() == Employee.MINIMUM_RATE;
    }

    @Test
    public void testConstructor()
    {
        Employee employee = new Employee(1, "Ionescu", "Marian", "password123");
        assert employee.getID() == 1;
        assert employee.getLastName().equals("Ionescu");
        assert employee.getFirstName().equals("Marian");
        assert employee.getPassword().equals("password123");
        assert employee.getWageRate() == Employee.MINIMUM_RATE;
    }
}
