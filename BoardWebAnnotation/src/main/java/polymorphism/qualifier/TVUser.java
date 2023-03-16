package polymorphism.qualifier;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
	//TODO 3-2-4.<bean> 엘리먼트 속성
		// 1. 스프링 컨테이너를 구동한다.
	AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		// 2. Spring 컨테이너로부터 필요한 객체를 요청(Lookup)한다. 
	TV tv = (TV)factory.getBean("tvQualifier");
	tv.powerOn();
	tv.volumeUp();
	tv.volumeDown();
	tv.powerOff();
		// 3. 스프링 컨테이너를 종료한다.
	factory.close();
		
	}

}
