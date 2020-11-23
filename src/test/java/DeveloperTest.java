import org.junit.Before;
import org.junit.Test;
import staff.techstaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp(){
        developer = new Developer("John Johnson", "JJ888888J", 25000.25);
    }

    @Test
    public void developerHasName(){
        assertEquals("John Johnson", developer.getName());
    }

    @Test
    public void employeCanGetPayRise(){
        developer.payRise(100.00);
        assertEquals(25100.25, developer.getSalary(),0.01);
    }

}
