package com.springbook.ioc.injection3;

import java.util.Properties;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class CollectionBeanClient {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
	
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean3");
		Properties addressList = bean.getAddressList();
		/* Collection 중 List와 Set과 다르게 Map 타입을 매핑하려면 applicationContext.xml 파일에 bean 객체의 <entry> 엘리먼트에서 사용된 <key> 엘리먼트는 Map 객체의 key 값을 설정할 때 사용하며.
		   value 엘리먼트는 Map객체의 value를 설정할 때 사용한다.
		       그래서 객체를 Map<String,String>객체를 생성 후, 데이터를 불러올 때 key로 불러온다. */
		System.out.println(addressList.get("고길동"));
		System.out.println(addressList.get("마이콜"));
		System.out.println(addressList.get("이영호"));
	
		factory.close();
	}
}
