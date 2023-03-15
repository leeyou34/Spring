package polymorphism2;


public class SamsungTV implements TV{

	private SonySpeaker speaker;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV(1) 객체 생성");
	}
	
	public SamsungTV(SonySpeaker speaker) {
		System.out.println("===> SamsungTV(2) 객체 생성");
		this.speaker= speaker;
	}
	
	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다.");
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
