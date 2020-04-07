package com.cap.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import com.cap.entity.Employee;

@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {
	@PersistenceContext
	private EntityManager em;
	
		public String createAccount(Employee emp) {
		em.persist(emp);
		return "added a new employee!!!!"; 
			
		}
	@Override
	
	public Employee findById(int eid) {
		Employee emp= em.find(Employee.class, eid);
		return emp;
	}
	
	
	@Override
	
	public List fetchAll() {
		Query q = em.createQuery("select e from Employee e");
		List<Employee> emplist = q.getResultList();
		return  emplist;
	}
	@Override

	public String updateEmp(Employee emp) {
		Employee e=em.find(Employee.class, emp.getEid());
		e.setEname(emp.getEname());
		e.setEsal(emp.getEsal());
		em.merge(e);
		if(e==null) {
			return "no updates found";
		}
		return "updated succesfully";
	}
	@Override
	public String deleteById(int eid) {
		// TODO Auto-generated method stub
		Employee emp=em.find(Employee.class, eid);
		em.remove(emp);
		if(emp!=null)
		{
			return "deleted successfully";
		}
		return "not found";
	}
}