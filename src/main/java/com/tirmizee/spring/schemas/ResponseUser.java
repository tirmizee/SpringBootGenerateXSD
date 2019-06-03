package com.tirmizee.spring.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User",
propOrder = {
	"messageCode",
	"messageDesc",
	"detail"
},
namespace = "http://tirmizee.com/ws/user")
public class ResponseUser {

	protected String messageCode;
	protected String messageDesc;
	protected User detail;

}
