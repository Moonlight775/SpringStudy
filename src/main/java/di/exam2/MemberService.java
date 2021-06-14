package di.exam2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MemberService {
	
	public MemberService() {
		/* 기본 member.xml 파일을 사용하여 빈을 갸져오는 방법
		 * ApplicationContext ac = new FileSystemXmlApplicationContext("src/main/java/di/exam1/member.xml");
		
		Member rM = ac.getBean("rM", RegisterMember.class);			//←
		Member gM = (GuestMember)ac.getBean("gM");					//← 두 가지는 완전히 동일한 방법
		*/
		
		// MemberConfig.java를 이용하여 빈을 가져오는 방법
		ApplicationContext ac = new AnnotationConfigApplicationContext(MemberConfig.class);
		Member rM = ac.getBean("rMember", RegisterMember.class);
		Member gM = (GuestMember)ac.getBean("gMember");
		
		rM.insert(null);
		gM.delete(null);
	}
	
	
	public static void main(String[] args) {
		new MemberService();
	}
}
