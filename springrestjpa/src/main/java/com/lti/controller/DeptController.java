package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Department;
import com.lti.services.DeptService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/dept-api")
public class DeptController {
	
	@Autowired
	private DeptService deptserv;
	
	
	//   http://localhost:8090/dept-api/addDept
	@PostMapping("/addDept")
	public Department addDept(@RequestBody Department d)
	{
		return deptserv.addDept(d);
	}
	
	//   http://localhost:8090/dept-api/deptNoList
	@GetMapping("/deptNoList")
	public List<Department> deptNoList()
	{
		List<Department> deptList = deptserv.deptNoList();
		return deptList;
	}

}
