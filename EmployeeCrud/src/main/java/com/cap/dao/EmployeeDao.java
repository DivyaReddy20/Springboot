package com.cap.dao;

import java.util.List;
import java.util.Optional;

import com.cap.entity.Employee;

public interface EmployeeDao {
	public String createAccount(Employee emp) ;

	public Employee findById(int eid);

	public String deleteById(int eid);

	public List fetchAll();

	public String updateEmp(Employee emp);



	

}
