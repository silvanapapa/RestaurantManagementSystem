import org.junit.Test;

public class ManagerTest
{
    @Test
    public void testMinimumWageRate()
    {
        Manager manager = new Manager();
        manager.setWageRate(80);
        assert manager.getWageRate() == Manager.MINIMUM_RATE;
    }

    @Test
    public void testWageCalculationForIncompleteWork()
    {
        Manager manager = new Manager();
        manager.setWageRate(150);
        manager.setWorkState(Manager.WORKSTATE_ACTIVE);
        assert manager.computeWages() == 0;
    }

    @Test
    public void testConstructor() {
        Manager manager = new Manager(1, "Ionescu", "Marian", "password123");
        assert manager.getID() == 1;
        assert manager.getLastName().equals("Ionescu");
        assert manager.getFirstName().equals("Marian");
        assert manager.getPassword().equals("password123");
        assert manager.getWageRate() == Manager.MINIMUM_RATE;
    }
}
