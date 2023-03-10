import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void BuySomething() {
        assertEquals(300, service.remain(700));
    }

    @org.junit.Test
    public void LimitValueBelowBoundary() {
        assertEquals(1, service.remain(999));
    }

    @org.junit.Test
    public void LimitValueAboveBoundary() {
        assertEquals(999, service.remain(1001));
    }

    @org.junit.Test
    public void ValueEqualToTheBoundary() {
        assertEquals(0, service.remain(1000));
    }
}