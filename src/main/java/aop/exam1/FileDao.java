package aop.exam1;

import java.util.List;

public class FileDao implements Dao{
	
	public FileDao() {
		System.out.println("FileDao 생성자");
	}
	
	@Override
	public String insert() {
		System.out.println("파일이 추가 되었습니다.");
		return null;
	}

	@Override
	public List<Object> select() {
		System.out.println("파일이 조회 되었습니다.");
		return null;
	}

	@Override
	public String update() {
		System.out.println("파일이 수정 되었습니다.");
		return null;
	}

	@Override
	public String delete() {
		System.out.println("파일이 삭제 되었습니다.");
		return null;
	}
}
