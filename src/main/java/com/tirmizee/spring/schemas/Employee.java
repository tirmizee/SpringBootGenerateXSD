package com.tirmizee.spring.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employee", propOrder = {
    "empId",
    "firstName",
    "lastName"
}, namespace = "http://tirmizee.com/spring/ws/employees")
public class Employee {
	
	protected Long empId;
	protected String firstName;
	protected String lastName;
	
}
