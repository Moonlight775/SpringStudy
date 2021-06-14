package di.exam2;

import java.util.List;

public class RegisterMember implements Member {


	
	
	
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
