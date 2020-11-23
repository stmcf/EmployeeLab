import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.techstaff.Developer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class EmployeeTest {

    Employee employee;

    @Before
    public void setUp(){
        employee = new Developer("Graham Grahamson", "GG696969", 69699.69);
    }

    @Test
    public void employeeCanHaveName(){
        assertEquals("Graham Grahamson", employee.getName());
    }

    @Test
    public void employeeCanHaveNiNumber(){
        assertEquals("GG696969", employee.getNumber());
    }

    @Test
    public void employeeHasSalary(){
        assertEquals(69699.69, employee.getSalary(), 0.01);
    }

    @Test
    public void employeCanGetPayRise(){
        employee.payRise(100.00);
        assertEquals(69799.69, employee.getSalary(),0.01);
    }

    @Test
    public void employeeGetsABonus(){
        assertEquals(696.9969, employee.payBonus(), 0.00);
    }

    @Test
    public void employeeCannotGetAPayCut(){
        employee.payRise(-100.00);
        assertEquals(69699.69, employee.getSalary(), 0.00);
    }

    @Test
    public void employerCanChangeEmployeeName(){
        employee.setName("Spanky Spankson");
        assertEquals("Spanky Spankson", employee.getName());
    }

    @Test
    public void employerCantInputNoName(){
        employee.setName("    ");
        assertEquals("Graham Grahamson", employee.getName());

    }
}
