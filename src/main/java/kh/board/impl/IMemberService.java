package kh.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kh.board.dto.MemberDTO;
import kh.board.interfaces.MemberDAO;
import kh.board.interfaces.MemberService;

@Component
public class IMemberService implements MemberService{
	
	@Autowired
	private MemberDAO dao;
		
	@Override
	public int insertMem(MemberDTO dto) {
		return this.dao.insertMem(dto);
	}
	
	@Override
	public List<MemberDTO> loginMem(MemberDTO dto) {
		return this.dao.loginMem(dto);
	}


	
	@Override
	public List<MemberDTO> getAllData(MemberDTO dto, String id) throws Exception {
		
		return dao.getAllData(dto,id);
	}




}
