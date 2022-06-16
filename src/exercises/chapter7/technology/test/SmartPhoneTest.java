package exercises.chapter7.technology.test;

import exercises.chapter7.technology.main.SmartPhone;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class SmartPhoneTest {

    SmartPhone test_smartphone;

    @Before
    public void createSmartPhoneObject() {
        test_smartphone = new SmartPhone("Apple", "OS", 2017, 1000000, true);
    }

    @Test
    public void testInheritsSuperInConstructor() {
        assertEquals(2017, test_smartphone.getYearMade(), .001);
    }

    @Test
    public void testInheritsReplaceYet() {
        Assert.assertTrue(test_smartphone.replaceYet(2022));
    }

    @Test
    public void testMakeCall() {
        assertEquals("ring ring..... ring ring..... ring ring.....", test_smartphone.makeCall());
    }

}
