package di.board;

import java.util.List;

public class BoardDao implements Dao{
	
	public BoardDao() {
		System.out.println("BoardDao 생성자...");
	}
	
	@Override
	public int insert(Object o) {
		System.out.println("게시물이 입력되었습니다.");
		return 0;
	}

	@Override
	public List<Object> select(Object o) {
		System.out.println("게시물이 조회 되었습니다.");
		return null;
	}

	@Override
	public int update(Object o) {
		System.out.println("게시물 정보를 수정하였습니다.");
		return 0;
	}

	@Override
	public int delete(Object o) {
		System.out.println("게시물이 삭제되었습니다.");
		return 0;
	}

	
	
	
}
