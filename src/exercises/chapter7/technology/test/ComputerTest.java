package exercises.chapter7.technology.test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import exercises.chapter7.technology.main.Computer;



public class ComputerTest {

    Computer test_computer;

    @Before
    public void createComputerObject() {
        test_computer = new Computer("Dell", "Windows 10", 2021, 900000000);
    }

    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }


    @Test
    public void testInitialStorageAvailable() {
        assertEquals(900000000, test_computer.getStorageAvailableBytes(), .001);
    }

    @Test
    public void testComputerBrand() {
        assertEquals("Dell", test_computer.getBrand());
    }


    @Test
    public void testStorageNotFull() {
        assertEquals("Storage not yet full!", test_computer.addStorageYet());
    }
}
