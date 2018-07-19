package kh.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kh.board.dto.BoardDTO;
import kh.board.interfaces.BoardService;

@Controller
public class BoardController {
	@Autowired
	private BoardService service;
	
	@RequestMapping("/board.bo")
	public ModelAndView getBoard(BoardDTO dto){
		ModelAndView mav = new ModelAndView();
		List<BoardDTO> result = service.getBoard(dto);
		mav.addObject("result", result);
		mav.setViewName("board.jsp");
		return mav;
	}
	
	@RequestMapping("/write.bo")
	public String boardWrite() {
		return "write.jsp";
	}
	
	
	@RequestMapping("/boardWrite.bo")
	public ModelAndView writeProc(BoardDTO dto) {
		ModelAndView mav = new ModelAndView();
		int result = service.insertBoard(dto);	
		mav.setViewName("board.bo");
		return mav;
	}
}
