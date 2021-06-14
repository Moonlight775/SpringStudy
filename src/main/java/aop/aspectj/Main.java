package aop.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	
	public Main() {	
	ApplicationContext ac = new FileSystemXmlApplicationContext("src/main/java/aop/aspectj/assembler.xml");
	
	Dao dao = ac.getBean("bd", Dao.class); //<bean id='bd' class='aop.aspectj.BoardDao' />의 id
	System.out.println("------------------------");
	dao.insert();
	System.out.println("------------------------");
	dao.select();
	System.out.println("------------------------");
	dao.update();
	System.out.println("------------------------");
	dao.delete();
}

	public static void main(String[] args) {
		new Main();
	}
}


