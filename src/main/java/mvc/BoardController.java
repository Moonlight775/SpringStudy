package mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController { //서블렛과 다르게 상속받지 않아도 된다. (simple해짐)
	
	@Autowired
	BoardDao dao;
	
	@RequestMapping(value="/board/input.board", method= {RequestMethod.GET, RequestMethod.POST}) //get 또는 post 쓸 때
	public ModelAndView input(BoardVo vo) { //hello 매개변수로 HttpServletRequest, HttpServletResponse 를 쓸 수 있다. 필요에 따라 쓴다.
		ModelAndView mv = new ModelAndView();
		
		System.out.println("BoardController............");
		System.out.println("mid : " + vo.getMid());
		System.out.println("phone : " + vo.getPhone());
		
		String msg = dao.input(vo);
		
		//Model : model.addAttribute("msg", "Hi...spring !!")
		mv.addObject("msg", msg);
		mv.addObject("vo", vo);
		mv.setViewName("input_result"); //request.setAttribute()와 같다.
		
		return mv;
	}
	
	@RequestMapping(value="/board/search.board", method={RequestMethod.GET, RequestMethod.POST})
	public ModelAndView select(String findStr) {
		ModelAndView mv = new ModelAndView();
		
		System.out.println("BoardContrloller.search..........");
		
		List<BoardVo> list = dao.search(findStr);
		
		mv.addObject("list", list);
		mv.setViewName("search");
		
		return mv;
	}
}
//   