package aop.step1;

import org.springframework.beans.factory.annotation.Autowired;

// 동일한 이름을 갖고 있는 빈을 주입
// 업무용으로 실행되는 코드
public class AutowireByAnno {
	@Autowired
	Mysql sql;
	
	public void output() {
		sql.run();
	}
	
}
