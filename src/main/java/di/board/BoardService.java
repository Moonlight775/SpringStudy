package di.board;

import org.springframework.beans.factory.annotation.Autowired;

public class BoardService {
	@Autowired
	BoardDao bdao;
	@Autowired
	FileDao fdao;
	
	// 업무 처리 내용
	/*
	public void setbdao(BoardDao bdao) {
		this.bdao = bdao;
	}
	
	public void setFdao(FileDao fdao) {
		this.fdao = fdao;
	}
	*/

	public void output() {
		bdao.insert(null);
	}
	
}
