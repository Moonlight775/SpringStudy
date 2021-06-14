package aop.exam1;

import java.util.List;

public class BoardDao implements Dao{
	
	
	
	@Override
	public String insert() {
		System.out.println("게시물이 입력되었습니다.");
		return null;
	}

	@Override
	public List<Object> select() {
		System.out.println("게시물이 조회 되었습니다.");
		return null;
	}

	@Override
	public String update() {
		System.out.println("게시물 정보를 수정하였습니다.");
		return null;
	}

	@Override
	public String delete() {
		System.out.println("게시물이 삭제되었습니다.");
		return null;
	}
}
