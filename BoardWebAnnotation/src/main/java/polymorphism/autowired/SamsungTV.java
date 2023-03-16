package polymorphism.autowired;


public class SamsungTV implements TV{

	public SamsungTV() {
		System.out.println("===> 삼성 티비 객체 생성");
	}

	//init-method 속성으로 지정된 initMethod() 메소드 호출
	public void initMethod() {
		System.out.println("객체 초기화 작업 처리.");
	}
	
	//destory-method 속성으로 지정된 destoryMethod() 메소드 호출
	public void destoryMethod() {
		System.out.println("객체 삭제전에 처리할 로직 처리");
	}
	
	
	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다.");
	}
	
	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다.");
	}
	
	public void volumeUp() {
		System.out.println("SamsungTV---소리 올린다.");
	}
	
	public void volumeDown() {
		System.out.println("SamsungTV---소리 낮춘다.");
	}
	
}
