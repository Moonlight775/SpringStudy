package test;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import mybatis.MybaFactory;

@Controller
public class TestController {

	SqlSession sql = MybaFactory.getFactory().openSession();
	
	@RequestMapping(value="/insert.test", method= {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView insert(TestVo vo) {
		ModelAndView mv = new ModelAndView();
		
		try{
			int r = sql.insert("test.insert",vo);
		
		if(r>0) {
			sql.commit();
		}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		mv.setViewName("insert");
		return mv;
	}
	
	
}
