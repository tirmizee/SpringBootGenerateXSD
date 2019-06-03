package com.tirmizee.spring.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
	name = "detail",
	namespace = "http://tirmizee.com/ws/user")
public class User {

	protected Long userId;
	protected String username;
	protected String citizenId;
	protected String firstName;
	protected String lastName;
	protected String tel;
	protected String email;
	protected String branchCode;
	
}
