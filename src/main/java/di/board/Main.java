package di.board;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class Main {
	
	public Main() {
		ApplicationContext ac = new FileSystemXmlApplicationContext("src/main/java/di/board/config.xml");
		
//		Object o = ac.getBean("boardService");
//		BoardService s = (BoardService)o;
//		BoardService o = (BoardService)ac.getBean("boardService");
		
		BoardService o = ac.getBean("boardService", BoardService.class);
		
		o.output();
	}
	
	public static void main(String[] args) {
		new Main();
		
	}
	
	
	
}
