package di.anno;

public class Tizen implements DB{
	public Tizen() {
		System.out.println("Tizen database가 실행됨.");
	}

	@Override
	public void run() {
		System.out.println("Tizen에서 회원정보가 삭제됨.");
	}
}