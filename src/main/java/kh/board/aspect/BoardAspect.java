package kh.board.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import kh.board.dto.MemberDTO;
import kh.board.security.EncryptUtils;

@Aspect
@Component
public class BoardAspect {
	
	@Pointcut("execution(* kh.board.impl.IMemberService.insertMem(..))")
	public void insertPointCut() {}
	
	@Before("insertPointCut()")
	public void insertLogging(JoinPoint jp) {		
		MemberDTO dto = (MemberDTO)jp.getArgs()[0];
		String password = EncryptUtils.getSha512(dto.getPw());
		dto.setPw(password);
	}
	
	@Pointcut("execution(* kh.board.impl.IMemberService.loginMem(..))")
	public void loginPointCut() {}
	
	@Before("loginPointCut()")
	public void loginLogging(JoinPoint jp) {
		MemberDTO dto = (MemberDTO)jp.getArgs()[0];
		String password = EncryptUtils.getSha512(dto.getPw());
		dto.setPw(password);
	}
	
	
}
