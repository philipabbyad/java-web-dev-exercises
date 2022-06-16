package exercises.chapter7.technology.test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import exercises.chapter7.technology.main.Laptop;

public class LaptopTest {

    Laptop test_laptop;

    @Before
    public void createLaptopObject() {
        test_laptop = new Laptop("MacBook", "Mac OS", 2018, 10000000, false, false);
    }

    @Test
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }

    @Test
    public void testInheritsSuperInConstructor() {
        assertEquals("Mac OS", test_laptop.getOperatingSystem());
    }

    @Test
    public void testSleepMode() {
        test_laptop.turnOnSleepMode();
        assertTrue(test_laptop.isAsleep());
    }

    @Test
    public void testStorageNotFullInherited() {
        assertEquals("Storage not yet full!", test_laptop.addStorageYet());
    }


}
