package aop.step3;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

// 횡단적 관심사가 분리된 코드
public class Advice implements MethodInterceptor{
	
	@Autowired
	@Qualifier("ti") //id값을 지정
	Tizen db;
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E)hh:mm:ss:SS");
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
							// ↑여기서 가로챈 정보를 갖고 있음
		
		beforeLog();
		invocation.proceed(); //반환 타입은 object, DB.run()을 실행하게 됨.
		afterLog();
		return null;
	}
	
	//before advice type
	public void beforeLog() {
		System.out.println("log 1 : " + sdf.format(new Date()));
	}
	
	//after advice type
	public void afterLog() {
		System.out.println("log 2 : " + sdf.format(new Date()));
	}
	
}
