package sapientweek8;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class AddEmployeeTest {

    AddEmployee obj;
	@Mock
	EmployeePOJO e;
	
	
	@Before
	public void setup()
	{
		obj= new AddEmployee();
		e=mock(EmployeePOJO.class);
	}
    @Test
    public void testgetEmp()
    {
    	obj.addEmployee(e);
    	when(e.getId()).thenReturn(new Integer(1));
    	assertEquals(e, obj.getEmployee(1));
    }
}
