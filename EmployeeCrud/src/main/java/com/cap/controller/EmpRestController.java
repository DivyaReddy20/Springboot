package com.cap.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.entity.Employee;
import com.cap.service.EmployeeService;
@RestController
@RequestMapping("/emp")
@CrossOrigin("http://localhost:4200")

public class EmpRestController {
	@Autowired
	EmployeeService service;
	@PostMapping("/create")
	public String createAccount(@RequestBody Employee emp) {
		return service.createAccount(emp);	
	}
	@GetMapping("/findById/{id}")
	public Employee findById(@PathVariable("id") int eid) {
		return service.findById(eid);	
	}
	@DeleteMapping("/deleteById/{id}")
	public String deleteById(@PathVariable int eid) {
		return service.deleteById(eid);
	}
	@GetMapping("/fetchAll")
	public List fetchAll() {
		return service.fetchAll();
		
	}
	@PostMapping("/update")
	public String updateEmp(@RequestBody Employee emp) {
		return service.updateEmp(emp);
		
	}

}