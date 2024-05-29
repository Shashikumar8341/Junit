package com.src.entity;

import lombok.Data;

@Data
public class EmployeResponse {
	private Employe employee;
	private Department department;
	private Address address;

}
