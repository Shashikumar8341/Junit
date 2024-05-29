package com.src.service;

import com.src.dao.AddressDao;
import com.src.dao.DepartmentDao;
import com.src.dao.EmployeDao;
import com.src.entity.Address;
import com.src.entity.Department;
import com.src.entity.Employe;
import com.src.entity.EmployeResponse;

public class EmpolyeServiceImp implements EmpolyeService {
	private EmployeDao employeDao;
	private DepartmentDao departmentDao;
	private AddressDao addressDao;

	/**
	 * @param employeDao
	 * @param departmentDao
	 * @param addressDao
	 */
	/*
	 * public EmpolyeServiceImp(EmployeDao employeDao, DepartmentDao departmentDao,
	 * AddressDao addressDao) { super(); this.employeDao = employeDao;
	 * this.departmentDao = departmentDao; this.addressDao = addressDao; }
	 */

	@Override
	public EmployeResponse getEmployeResponsebyid(Integer id) {
		EmployeResponse employeResponse = new EmployeResponse();
		Employe employe = employeDao.getEmployebyid(id);
		Address address=addressDao.getAddressbyid( id);
		Department department=departmentDao.getDepartmentbyid(id);
		employeResponse.setEmployee(employe);
		employeResponse.setAddress(address);
		employeResponse.setDepartment(department);
		return employeResponse;
	}

//	@Override
//	public EmployeResponse getAddressResponsebyid(Integer id) {
//		EmployeResponse employeResponse = new EmployeResponse();
//		Address address = addressDao.getAddressbyid(id);
//		employeResponse.setAddress(address);
//		return employeResponse;
//	}
//
//	@Override
//	public EmployeResponse getDepartmentResponsebyid(Integer id) {
//		EmployeResponse employeResponse = new EmployeResponse();
//		Department department = departmentDao.getDepartmentbyid(id);
//		employeResponse.setDepartment(department);
//		return employeResponse;
//	}
}
