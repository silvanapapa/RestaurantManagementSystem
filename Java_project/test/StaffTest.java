import org.junit.Test;

public class StaffTest {
    @Test
    public void testClockIn() {
        Staff staff = new Staff();
        staff.clockIn();
        assert staff.getWorkState() == Staff.WORKSTATE_ACTIVE;
        assert staff.getStartTime() != "getStartTime Error";
    }

    @Test
    public void testClockOut() {
        Staff staff = new Staff();
        staff.clockIn();
        assert staff.clockOut() == true;
        assert staff.getWorkState() == Staff.WORKSTATE_FINISH;
        assert staff.getFinishTime() != "getFinishTime Error";
    }

    @Test
    public void testClockOutInvalidState() {
        Staff staff = new Staff();
        assert staff.clockOut() == false;
    }
}
