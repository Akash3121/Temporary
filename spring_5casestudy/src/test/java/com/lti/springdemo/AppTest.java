package com.lti.springdemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.beans.Employee;
import com.lti.excep.EmpExcep;
import com.lti.services.EmpService;

public class AppTest {

	ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
	EmpService service = (EmpService) context.getBean("empService");

	/*
	 * @Test public void testAddEmployee() { // TODO Auto-generated method stub
	 * Employee e = new Employee(); e.setEmpName("Ajay"); e.setEmpSal(40000); int
	 * empNo = service.addEmployee(e); System.out.println("record inserted"+e);
	 * assertNotNull(empNo); assertEquals(124, empNo);
	 * 
	 * }
	 */
	
	/*
	 * public void testSearchById() { Employee e = service.findEmpById(103);
	 * Employee empExp= new Employee(103,"Vijay",80000); assertNotNull(empExp);
	 * assertEquals(empExp.getEmpName(),e.getEmpName());
	 * 
	 * }
	 */
	
	/*
	 * @Test public void testEmpList() { List<Employee> empList =
	 * service.findEmpList(); System.out.println(empList); assertEquals(5,
	 * empList.size()); }
	 */
	
	@Test
	public void testUpdate() {
		boolean recUpdated;
		try {
			recUpdated = service.updateEmpName(103, "Raju");
			assertEquals(true, recUpdated);

		} catch (EmpExcep e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
	}

	
	  @Test public void shouldAnswerWithTrue() { assertTrue( true ); }
	 
}
