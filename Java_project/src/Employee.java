public class Employee extends Staff
{
    public static final double MINIMUM_RATE = 13.5;

    public Employee()
    {
        super();
    }
    public Employee( int newID, String newLastName, String newFirstName, String newPassward)
    {
        super(newID, newLastName, newFirstName, newPassward);
        wageRate = MINIMUM_RATE;
    }

    public void setWageRate(double newRate)
    {
        if( newRate < MINIMUM_RATE)
            wageRate = MINIMUM_RATE;
        else
            wageRate = newRate;
    }

    public double computeWages()
    {
        return wageRate * computeWorkTime();
    }
}
