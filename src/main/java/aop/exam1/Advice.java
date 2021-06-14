package aop.exam1;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class Advice implements MethodInterceptor {
	
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E)hh:mm:ss:SS");
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
//		beforeLog();
		
		
		System.out.println("Class name : " + invocation.getThis().getClass().getSimpleName());
		System.out.println("Method name : " + invocation.getMethod().getName());
		System.out.println(sdf.format(new Date()));
		Object o = invocation.proceed(); //사용자가 호출한 메서드를 실행
		return o;
	}
	
//	public void beforeLog() {
//		System.out.println("log : " + sdf.format(new Date()));
//	}
//	
	
	
}
