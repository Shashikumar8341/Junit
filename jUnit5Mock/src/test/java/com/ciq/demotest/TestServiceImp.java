package com.ciq.demotest;

import static org.mockito.Mockito.when;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.src.dao.AddressDao;
import com.src.dao.DepartmentDao;
import com.src.dao.EmployeDao;
import com.src.entity.Address;
import com.src.entity.Department;
import com.src.entity.Employe;
import com.src.entity.EmployeResponse;
import com.src.service.EmpolyeServiceImp;

public class TestServiceImp {
	@Mock
	private EmployeDao employeDao;
	@Mock
	private AddressDao addressDao;
	@Mock
	private DepartmentDao dao;

	@InjectMocks
	private EmpolyeServiceImp empolyeServiceImp;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
//		MockitoAnnotations.openMocks(addressDao);
//		MockitoAnnotations.openMocks(dao);
//		MockitoAnnotations.openMocks(employeDao);
	}

	@Test
	public void finalgetbyid() {
		when(employeDao.getEmployebyid(1)).thenReturn(getEmpSetUp());
		when(addressDao.getAddressbyid(1)).thenReturn(getAddresSetup());
		when(dao.getDepartmentbyid(1)).thenReturn(getDepartmentbyid());
		EmployeResponse employeeResponse = empolyeServiceImp.getEmployeResponsebyid(1);
		System.out.println(employeeResponse);
	}

	Employe getEmpSetUp() {
		Employe employe = new Employe();
		employe.setId(1);
		employe.setName("shashi");
		return employe;
	}
	Address getAddresSetup() {
		Address address = new Address();
		address.setId(1001);
		address.setName("baby");
		return address;

	}
	Department getDepartmentbyid() {
		Department department = new Department();
		department.setId(10);
		department.setName("hombul");
		return department;
	}
//	@Test
//	public void finalAddressget() {
//		when(addressDao.getAddressbyid(1001)).thenReturn(getAddresSetup());
//		EmployeResponse employeeResponse2 = empolyeServiceImp.getAddressResponsebyid(1001);
//		System.out.println(employeeResponse2);
//	}
//
//	Address getAddresSetup() {
//		Address address = new Address();
//		address.setId(1001);
//		address.setName("baby");
//		return address;
//
//	}
//
//	@Test
//	public void finalyDepartGet() {
//		when(dao.getDepartmentbyid(10)).thenReturn(getDepartmentbyid());
//		EmployeResponse employeeResponse3 = empolyeServiceImp.getDepartmentResponsebyid(10);
//		System.out.println(employeeResponse3);
//
//	}
//
//	Department getDepartmentbyid() {
//		Department department = new Department();
//		department.setId(10);
//		department.setName("hombul");
//		return department;
//
//	}
}
