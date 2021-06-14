package di.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	
	public Main() {
		ApplicationContext ac = new FileSystemXmlApplicationContext("src/main/java/di/anno/assembler.xml");
		
		AutowireByName abn = ac.getBean("byName", AutowireByName.class);
		abn.output();
		
		AutowireByType abt = ac.getBean("byType", AutowireByType.class);
		abt.output();
		
		AutowireByAnno aba = ac.getBean("byAnno", AutowireByAnno.class);
		aba.output();
		
		
	}
	
	
	
	public static void main(String[] args) {
		new Main();
	}
}
