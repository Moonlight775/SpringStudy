package board;

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
	
	@RequestMapping(value="/search.brd", method={RequestMethod.GET, RequestMethod.POST})
	public ModelAndView search(Page page) {
		ModelAndView mv = new ModelAndView();
		
		System.out.println("BoardContrloller.search..........");
		
		List<BoardVo> list = dao.select(page);
		
		mv.addObject("list", list);
		mv.addObject("page", page);
		mv.setViewName("search");
		
		return mv;
	}
	
	@RequestMapping(value="/board/view.brd", method= {RequestMethod.POST})
	public ModelAndView view(BoardVo v, Page p) {
		ModelAndView mv = new ModelAndView();
		BoardVo vo = dao.view(v.getSerial());
		
		mv.addObject("vo", vo);
		mv.addObject("page", p);
		mv.setViewName("view");
		
		return mv;
	}
	
	@RequestMapping(value="/modify.brd", method= {RequestMethod.POST})
	public ModelAndView modify(BoardVo v, Page p) {
		ModelAndView mv = new ModelAndView();
		BoardVo vo = dao.view(v.getSerial());
		
		mv.addObject("vo", vo);
		mv.addObject("page", p);
		mv.setViewName("modify");
		
		return mv;
	}
	
	@RequestMapping(value="/delete.brd", method= {RequestMethod.POST})
	public ModelAndView delete(BoardVo v, Page p) {
		ModelAndView mv = new ModelAndView();
		
		dao.delete(v);
		List<BoardVo> list = dao.select(p);
		mv.addObject("vo", list);
		mv.addObject("page", p);
		mv.setViewName("search");
		
		return mv;
	}
}
//   