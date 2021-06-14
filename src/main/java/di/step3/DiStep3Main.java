package di.step3;
// 외부환경이 변했음에도 내부환경에는 변화가 없다.
public class DiStep3Main {
//	Oracle o;
//	public DiStep3Main(Oracle o) {
//		// Oracle o = new Oracle(); // 이렇게 사용 X
//		this.o = o;
//	}
	
	DB db;
	
	public DiStep3Main(DB db) { // new 연산자 사용X
		this.db = db;
		db.run();
	}
	
	public void abc(DB db) { 
		this.db = db;
	}
	
	public static void main(String[] args) {
		Mysql o = new Mysql();
		DiStep3Main m = new DiStep3Main(o);
	}
}
