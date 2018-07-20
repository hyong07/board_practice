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

	@RequestMapping("/pwcheck.mem")
	public ModelAndView pwcheck(HttpServletRequest request, String pw, HttpSession session) throws Exception {

		String id= (String)(request.getSession().getAttribute("loginId"));
		ModelAndView mav = new ModelAndView();
		List<MemberDTO> result = service.pwcheck(id,pw);
		boolean outresult = false;
		if(result.size() == 1) {
			service.memleave(id);
			session.invalidate();
			outresult = true;
		}

		mav.addObject("outresult", outresult);
		mav.setViewName("pwcheck.jsp");
		return mav;
	}

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
	public ModelAndView getAllData(HttpServletRequest req) throws Exception {
		String id = (String) req.getSession().getAttribute("loginId");
		List<MemberDTO> result = service.getAllData(id);

		ModelAndView mav = new ModelAndView();
		System.out.println(result.size());
		mav.addObject("result", result);
		mav.setViewName("mypage.jsp");
		return mav;
	}

	@RequestMapping("/logout.mem")
	public String memberOut(HttpSession session) {
		session.invalidate();
		return "login.jsp";
	}
	
	@RequestMapping("/modify.mem")
	public ModelAndView modifyMem(HttpServletRequest req) throws Exception {	
		String id = (String) req.getSession().getAttribute("loginId");
		ModelAndView mav = new ModelAndView();
		
		List<MemberDTO> myinfo = service.getAllData(id);
		
		mav.addObject("myinfo", myinfo.get(0));
		mav.setViewName("modifymem.jsp");
		return mav;
	}

	@RequestMapping("/modifyinfo.mem")
	public ModelAndView modifyInfoMem(MemberDTO dto) throws Exception {
		ModelAndView mav = new ModelAndView();
		int seq = service.getSeq(dto.getId()).get(0).getSeq();
		dto.setSeq(seq);
		int modresult = service.modify(dto);
		mav.addObject("modresult", modresult);
		mav.setViewName("modifymem.jsp");
		
		return mav;
	}
	
	
}
