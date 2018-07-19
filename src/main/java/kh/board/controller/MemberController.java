package kh.board.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kh.board.dto.MemberDTO;
import kh.board.interfaces.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	@RequestMapping("/join.mem")
	public String signUp() {		
		return "sign.jsp";
	}
	
	@RequestMapping("/member.mem")
	public ModelAndView memberSign(MemberDTO dto) {
		ModelAndView mav = new ModelAndView();
		int result = service.insertMem(dto);
		mav.addObject("result",result);
		mav.setViewName("login.jsp");
		return mav;
	}
	
	@RequestMapping("/login.mem")
	public ModelAndView memberLogin(MemberDTO dto, HttpSession session) {
		ModelAndView mav = new ModelAndView();
		List<MemberDTO> result = this.service.loginMem(dto);
		String sessionId = result.get(0).getId();		
		mav.addObject("result", result);
		session.setAttribute("loginId",sessionId);
		mav.setViewName("login.jsp");
		return mav;
	}
	

	@Autowired
	private MemberService service;
	
	@RequestMapping("/mypage.mem")
	public ModelAndView toMypage(MemberDTO dto, String id) throws Exception {
		
		List<MemberDTO> result = service.getAllData(id);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", result);
		mav.setViewName("mypage.jsp");
		return mav;
	}
}
