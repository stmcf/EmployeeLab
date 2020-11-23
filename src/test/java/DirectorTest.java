import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp(){
        director = new Director("Json Jsonson", "JS010101J", 1001101.11, "APIS", 100000000000012.10);
    }

    @Test
    public void employeeCanHaveName(){
        assertEquals("Json Jsonson", director.getName());
    }

    @Test
    public void employeeCanHaveNiNumber(){
        assertEquals("JS010101J", director.getNumber());
    }

    @Test
    public void employeeHasSalary(){
        assertEquals(1001101.11, director.getSalary(), 0.01);
    }

    @Test
    public void canManageDepartment(){
        assertEquals("APIS", director.getDept());
    }

    @Test
    public void directorHasBudget(){
        assertEquals(100000000000012.10, director.getBudget(), 0.01);
    }
}
