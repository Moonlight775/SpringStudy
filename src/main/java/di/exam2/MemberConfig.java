package di.exam2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// exam1안에 있는 member.xml 파일 대치
@Configuration //환경설정 파일이라는 것을 알려주기 위해, 없다면 일반 클래스
public class MemberConfig {		
	
	
	@Bean //exam1.member.xml의 <bean id='rM' ~~>와 같아짐
	public Member rMember() { // @Bean 어노테이션으로 인해 메서드명이 xml파일의 id 역할을 한다.
		return new RegisterMember();
	}
	
	@Bean
	public Member gMember() {
		return new GuestMember();
	}
	
	
}
