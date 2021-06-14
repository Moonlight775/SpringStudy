package di.board;

import java.util.List;

public class FileDao implements Dao{

	@Override
	public int insert(Object o) {
		System.out.println("파일이 추가 되었습니다.");
		return 0;
	}

	@Override
	public List<Object> select(Object o) {
		System.out.println("파일이 조회 되었습니다.");
		return null;
	}

	@Override
	public int update(Object o) {
		System.out.println("파일이 수정 되었습니다.");
		return 0;
	}

	@Override
	public int delete(Object o) {
		System.out.println("파일이 삭제 되었습니다.");
		return 0;
	}
	
	

}
