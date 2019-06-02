package com.tirmizee.spring.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubDistrict", propOrder = {
    "subdistrictId",
    "subdistrictCode",
    "subdistrictNameEn",
    "subdistrictNameTh",
    "districtCode"
}, namespace = "http://tirmizee.com/spring/ws")
public class SubDistrict {
	
	private Integer subdistrictId;
	private String subdistrictCode;
	private String subdistrictNameEn;
	private String subdistrictNameTh;
	private String districtCode;
	public Integer getSubdistrictId() {
		return subdistrictId;
	}
	public void setSubdistrictId(Integer subdistrictId) {
		this.subdistrictId = subdistrictId;
	}
	public String getSubdistrictCode() {
		return subdistrictCode;
	}
	public void setSubdistrictCode(String subdistrictCode) {
		this.subdistrictCode = subdistrictCode;
	}
	public String getSubdistrictNameEn() {
		return subdistrictNameEn;
	}
	public void setSubdistrictNameEn(String subdistrictNameEn) {
		this.subdistrictNameEn = subdistrictNameEn;
	}
	public String getSubdistrictNameTh() {
		return subdistrictNameTh;
	}
	public void setSubdistrictNameTh(String subdistrictNameTh) {
		this.subdistrictNameTh = subdistrictNameTh;
	}
	public String getDistrictCode() {
		return districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

}
