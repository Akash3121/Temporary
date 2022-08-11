package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Department;
import com.lti.beans.EmpDTO;
import com.lti.beans.Employee;
import com.lti.excep.EmpExcep;
import com.lti.services.EmpService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/emp-api")
public class EmpController {
	
	@Autowired
	EmpService service;
	
	//  http://localhost:8090/emp-api/employees
	
	@GetMapping("/employees")
	public Employee getEmpById()
	{
		Employee e = service.findEmpById(103);
		return e;
	}
	
	//   http://localhost:8090/emp-api/empList
	@GetMapping("/empList")
	public List<Employee> getEmpList()
	{
		List<Employee> empList = service.findEmpList();
		return empList;
	}
	
	//   http://localhost:8090/emp-api/addemp
	@PostMapping("/addemp")
	public int addEmp(@RequestBody Employee e)
	{
		int empId = service.addEmployee(e);
		return empId;
	}
	
	//    http://localhost:8090/emp-api/updateEmpName
	@PutMapping("/updateEmpName") //not working properly
	public boolean updateEmpName(@RequestBody Employee e) throws EmpExcep
	{
		//@RequestBody int eId, @RequestBody String eName
		System.out.println("in controller" + e.getEmpNo() +" "+ e.getEmpName());
		return service.updateEmpName(e.getEmpNo(), e.getEmpName());
	}
	
	@PutMapping("/updateEmp")
	public boolean updateEmp(@RequestBody Employee e)
	{
		return service.updateEmp(e);
	}
	
	@PostMapping("/deleteEmp")
	public boolean deleteEmp(@RequestBody int eId)
	{
		return service.delete(eId);
	}
	
	@PostMapping("/addempdept/{did}")
	public int addEmpDept(@PathVariable("did") int did,@RequestBody Employee e)
	{
		Department d = new Department();
		d.setDeptNo(did);
		e.setDepartent(d);
		int empNo = service.addEmployee(e);
		return empNo;
	}
	@PostMapping("/addempdept1")
	public int addEmpDept1(@RequestBody EmpDTO e)
	{
		System.out.println("inside ......."+e);
		Employee tempEmp = new Employee();
		tempEmp.setEmpNo(e.getEmpNo());
		tempEmp.setEmpName(e.getEmpName());
		tempEmp.setEmpSal(e.getEmpSal());
		
		Department d= new Department();
		d.setDeptNo(e.getDeptNo());
		tempEmp.setDepartent(d);
		
		int empId = service.addEmployee(tempEmp) ;
		return empId;
	}
}
