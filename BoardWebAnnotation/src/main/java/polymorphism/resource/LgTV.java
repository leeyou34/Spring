package polymorphism.resource;



import javax.annotation.Resource;
import org.springframework.stereotype.Component;


@Component("tvResource")
public class LgTV implements TV {
	@Resource(name="appleResource")
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("===> LgTV 객체 생성");
	}
	
	public void powerOn() {
		System.out.println("LgTV---전원 켠다.");
	}
	
	public void powerOff() {
		System.out.println("LgTV---전원 끈다.");
	}
	
	public void volumeUp() {
		//System.out.println("LgTV---소리 올린다.");
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		//System.out.println("LgTV---소리 낮춘다.");
		speaker.volumeDown();
	}
	
}
