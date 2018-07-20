



package kh.board.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kh.board.dto.MemberDTO;
import kh.board.interfaces.MemberDAO;
import kh.board.interfaces.MemberService;



@Service
public class IMemberService implements MemberService{
	
	@Autowired
	private MemberDAO dao;
	
	@Override
	public int insertMem(MemberDTO dto) {
		return this.dao.insertMem(dto);
	}
	
	@Override
	public List<MemberDTO> loginMem(MemberDTO dto) {
		return this.dao.loginMem(dto);}

	
	public boolean pwcheck(String id,String pw) throws Exception{
		return dao.pwcheck(id, pw);

	}


	
	@Override
	public List<MemberDTO> getAllData(MemberDTO dto, String id) throws Exception {
		
		return dao.getAllData(dto,id);
	}




}
