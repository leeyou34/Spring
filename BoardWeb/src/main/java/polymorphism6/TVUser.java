package polymorphism6;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO 2-3-1: 결합도가 높은 프로그램
		//SamsungTV tv= new SamsungTV(); // interface 사용하기 전
		
		// TODO 2-3-2: 다형성 이용하기.
		//TV tv=new SamsungTV(); // TV라는 interface 사용하고 난 뒤... 인스턴스를 LgTV로 바꿔주면 콘솔창에 lgTV용 문구가 출력 된다.
		
		// TODO 2-3-3: 디자인 패턴 이용하기
//		BeanFactory factory = new BeanFactory();
//		TV tv = (TV)factory.getBean(args[0]);

		//TODO 4-3-2 스프링 구동 설정
			// 1. spring 컨테이너를 구동한다.
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
			// 2. Spring 컨테이너로부터 필요한 객체를 요청(Lookup)한다. 
		TV tv = (TV)factory.getBean("tv5");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
			// 3. 스프링 컨테이너를 종료한다.
		factory.close();		
	}

}
