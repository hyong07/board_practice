package kh.board.interfaces;

import java.util.List;

import kh.board.dto.MemberDTO;

public interface MemberService {
	public int insertMem(MemberDTO dto);
	public List<MemberDTO> loginMem(MemberDTO dto);
}
