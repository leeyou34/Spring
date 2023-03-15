package polymorphism5;


public class SamsungTV implements TV{

	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV(1) 객체 생성");
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() 객체 생성");
		this.speaker= speaker;
	}
	
	public void setPrice(int price) {
		System.out.println("===> setPrice() 객체 생성");
		this.price=price;
	}
	
	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다. (가격 : " + price +")");
	}
	
	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다.");
	}
	
	public void volumeUp() {
/*		speaker = new SonySpeaker();
		System.out.println("SamsungTV---소리 올린다.");
*/
		speaker.volumeUp();
	}
	
	public void volumeDown() {
/*		speaker = new SonySpeaker();
		System.out.println("SamsungTV---소리 낮춘다.");
*/
		speaker.volumeDown();
	}
}
