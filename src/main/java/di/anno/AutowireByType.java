package di.anno;

// 동일한 유형의 빈을 주입
// 업무용으로 실행되는 코드
public class AutowireByType {
	Tizen tizen;


	public void setTizen(Tizen tizen) {
		this.tizen = tizen;
	}


	public void output() {
		tizen.run();
	}
}
