



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

	
	public List<MemberDTO> pwcheck(String id,String pw) throws Exception{
		return dao.pwcheck(id, pw);

	}


	
	@Override
	public List<MemberDTO> getAllData(String id) throws Exception {
		
		return dao.getAllData(id);
	}

	@Override
	public int memleave(String id) throws Exception{
		return dao.memleave(id);
	}
	@Override
	public int modify(MemberDTO dto) throws Exception{
		return dao.modify(dto);
	}
	
	public List<MemberDTO> getSeq(String id) throws Exception{
		return dao.getSeq(id);
	}



}
