package di.exam1;

import java.util.List;

public class RegisterMember implements Member {

	public RegisterMember() {
		System.out.println("생성됨");
		
	}
	
	@Override
	public int insert(Object o) {
		System.out.println("회원 정보를 추가함");
		return 0;
	}

	@Override
	public List<Object> select(Object o) {
		System.out.println("회원 정보를 조회함.");
		return null;
	}

	@Override
	public int update(Object o) {
		System.out.println("회원 정보를 수정함.");
		return 0;
	}

	@Override
	public int delete(Object o) {
		System.out.println("회원 정보를 삭제함.");
		return 0;
	}

}
