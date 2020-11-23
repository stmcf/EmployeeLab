import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;
import staff.techstaff.Developer;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;


    @Before
    public void setUp(){
        manager = new Manager("Jammy Jameson", "JA67543J", 696999.69, "Lingerie");
    }

    @Test
    public void employeeCanHaveName(){
        assertEquals("Jammy Jameson", manager.getName());
    }

    @Test
    public void employeeCanHaveNiNumber(){
        assertEquals("JA67543J", manager.getNumber());
    }

    @Test
    public void employeeHasSalary(){
        assertEquals(696999.69, manager.getSalary(), 0.01);
    }

    @Test
    public void canManageDepartment(){
        assertEquals("Lingerie", manager.getDept());
    }
    @Test
    public void employeCanGetPayRise(){
        manager.payRise(100.00);
        assertEquals(697099.69, manager.getSalary(),0.01);
    }
}
