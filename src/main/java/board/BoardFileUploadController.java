package board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardFileUploadController {
	
	@Autowired
	BoardDao dao;
	
	final static String saveDir = "C:\\eclipse\\workspace\\SpringStudy\\src\\main\\webapp\\upload";
	
	@RequestMapping(value="/board/insert.fup", method= {RequestMethod.POST})
	public ModelAndView upload(HttpServletRequest req) {
		ModelAndView mv = new ModelAndView();
		BoardVo bVo = new BoardVo();
		String flag = ""; //insert, update, repl
		
		try {
			req.setCharacterEncoding("utf-8");
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmssSS");
			
			String contentType = req.getContentType();
			
			if(contentType == null || !contentType.toLowerCase().startsWith("multipart/")) {
				List<BoardAttVo> attList = new ArrayList<BoardAttVo>();
				Collection<Part> parts = req.getParts();
				for(Part p : parts) {
					if( p.getHeader("Content-Disposition").contains("filename=")) { // file tag
						String fileName = p.getSubmittedFileName();
						BoardAttVo attVo = new BoardAttVo();
						
						String date = sdf.format(new Date());
						
						if(p.getSize()>0) {
							p.write(saveDir + date + "-" + fileName);
							p.delete();
	
							attVo.setSysAtt(date + "-" + fileName);
							attVo.setOriAtt(fileName);
							attList.add(attVo);
						}
					}
				}
				bVo.setAttList(attList);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
			
			mv.addObject("vo", bVo);
			return mv;
	}
	
}
