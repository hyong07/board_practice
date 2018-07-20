package kh.board.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kh.board.dto.MemberDTO;
import kh.board.interfaces.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	
	@RequestMapping("/memberout.mem")
	public String toPwCheck() {
		return "redirect:pwcheck.jsp";
	}
	
//	@RequestMapping("/pwcheck.mem")
//	public ModelAndView pwcheck(HttpServletRequest request, String pw) {
//		ModelAndView mav = new ModelAndView();
//		int outresult = service.pwcheck(request.getSession().getAttribute("loginId"),pw);
//		
//		mav.addObject("outresult", outresult)
//		mav.setViewName("login.jsp");
//		return mav;
//	}
	
	@RequestMapping("/main.mem")
	public String toMain() {
		return "redirect:login.jsp";
	}


	@RequestMapping("/join.mem")
	public String signUp() {		
		return "redirect:sign.jsp";
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
	


	@RequestMapping("/mypage.mem")
	public ModelAndView getAllData(MemberDTO dto, HttpServletRequest req) throws Exception {
		String id = (String) req.getSession().getAttribute("loginId");
		List<MemberDTO> result = service.getAllData(dto, id);
		
		ModelAndView mav = new ModelAndView();
		System.out.println(result.size());
		mav.addObject("result", result);
		mav.setViewName("mypage.jsp");
		return mav;
	}
	
	@RequestMapping("/logout.mem")
	public String memberOut(HttpSession session) {
		session.invalidate();
		return "redirect:login.jsp";
	}
}
