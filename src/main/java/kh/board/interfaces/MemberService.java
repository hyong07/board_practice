package kh.board.interfaces;


import java.util.List;

import kh.board.dto.MemberDTO;

public interface MemberService {
	
	public boolean pwcheck(String id,String pw) throws Exception;


	public int insertMem(MemberDTO dto);
	public List<MemberDTO> loginMem(MemberDTO dto);

	public List<MemberDTO> getAllData(MemberDTO dto , String id) throws Exception;

	

}
