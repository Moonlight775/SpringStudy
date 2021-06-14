package mvc;


import org.apache.ibatis.session.SqlSession;

import mybatis.MybaFactory;

public class BoardDao {
	SqlSession session;
	
	public BoardDao() {
		session = MybaFactory.getFactory().openSession();
	}
	
	public String input(BoardVo vo) {
		String msg = "OK";
		System.out.println("BoardDao.input");
		System.out.println("mid : " + vo.getMid());
		System.out.println("phone : " + vo.getPhone());
		
		int totSize = session.selectOne("board.totList", "");
		System.out.println("totSize : " + totSize);
		
		return msg;
		
	}
}
