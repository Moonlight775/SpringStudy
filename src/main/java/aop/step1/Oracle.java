package aop.step1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Oracle implements DB{
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E) hh:m:ss:SS");
	
	public Oracle() {
		System.out.println("oracle database가 실행됨.");
	}

	@Override
	public void run() {
		System.out.println("log :" + sdf.format(new Date()));
		System.out.println("오라클에서 회원정보가 검색됨.");
	}
}


