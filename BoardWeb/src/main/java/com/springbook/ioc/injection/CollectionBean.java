package com.springbook.ioc.injection;

import java.util.List;
import java.util.Set;

public class CollectionBean {
	private List<String> addressList;
	
	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}
	
	public List<String> getAddressList() {
		return addressList;
	}
}
