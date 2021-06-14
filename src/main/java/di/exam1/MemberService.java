package di.exam1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MemberService {
	
	public MemberService() {
		ApplicationContext ac = new FileSystemXmlApplicationContext("src/main/java/di/exam1/member.xml");
		
		Member rM = ac.getBean("rM", RegisterMember.class);			//←
		Member gM = (GuestMember)ac.getBean("gM");					//← 두 가지는 완전히 동일한 방법
		
		rM.insert(null);
		gM.delete(null);
	}
	
	
	public static void main(String[] args) {
		new MemberService();
	}
}
