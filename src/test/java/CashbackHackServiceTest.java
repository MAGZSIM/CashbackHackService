import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test (description = "Buy anything up to the maximum cashback", priority = 0, enabled = true)
    public void BuySomething() {
        assertEquals(service.remain(700), 300);
    }

    @org.testng.annotations.Test(description = "LimitValueBelowBoundary", priority = 2, enabled = true)
    public void LimitValueBelowBoundary() {
        assertEquals(service.remain(999), 1);
    }

    @org.testng.annotations.Test (description = "LimitValueAboveBoundary", priority = 3, enabled = true)
    public void LimitValueAboveBoundary() {
        assertEquals(service.remain(1001), 999);
    }

    @org.testng.annotations.Test (description = "ValueEqualToTheBoundary", priority = 1, enabled = true)
    public void ValueEqualToTheBoundary() {
        assertEquals(service.remain(1000), 0);
    }

}