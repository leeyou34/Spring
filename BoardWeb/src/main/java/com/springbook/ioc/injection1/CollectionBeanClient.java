package com.springbook.ioc.injection1;

import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class CollectionBeanClient {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
	
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean1");
		Set<String> addressList = bean.getAddressList();
		for (String address : addressList) {
			System.out.println(address.toString());
		}
		factory.close();
	}
}
