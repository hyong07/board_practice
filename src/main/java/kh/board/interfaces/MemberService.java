package kh.board.interfaces;


import java.util.List;

import kh.board.dto.MemberDTO;

public interface MemberService {
	
	public List<MemberDTO> pwcheck(String id,String pw) throws Exception;
	public int insertMem(MemberDTO dto);
	public List<MemberDTO> loginMem(MemberDTO dto);
	public List<MemberDTO> getAllData(String id) throws Exception;
	public int memleave(String id) throws Exception;
	public int modify(MemberDTO dto) throws Exception;
	public List<MemberDTO> getSeq(String id) throws Exception;
	

	

}
