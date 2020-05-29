package sapientweek8;

import java.util.ArrayList;
import java.util.List;

public class AddEmployee {
	List<EmployeePOJO> list= new ArrayList();
	public void addEmployee(EmployeePOJO emp)
	{
     list.add(emp);		
	}
	public EmployeePOJO getEmployee(int id)
	{
		EmployeePOJO e=null;
		for(EmployeePOJO emp : list)
		{
			if(emp.getId()==id)
				e=emp;
		}
		return e;
	}

}
