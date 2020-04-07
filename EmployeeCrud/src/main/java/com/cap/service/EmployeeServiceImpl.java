package com.cap.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.dao.EmployeeDao;
import com.cap.entity.Employee;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeDao dao;
	@Override
		public String createAccount(Employee emp) {
			return	dao.createAccount(emp);
			 
		}
		@Override
		public Employee findById(int eid) {
			
			return dao.findById(eid);
			
		
		}
		@Override
		public String deleteById(int eid) {
			// TODO Auto-generated method stub
			return dao.deleteById(eid);
		}
		@Override
		public List fetchAll() {
			// TODO Auto-generated method stub
			return dao.fetchAll();
		}
		@Override
		public String updateEmp(Employee emp) {
			// TODO Auto-generated method stub
			return dao.updateEmp(emp);
		}

	}
	
		
