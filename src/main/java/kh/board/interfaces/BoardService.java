package kh.board.interfaces;

import java.util.List;

import kh.board.dto.BoardDTO;

public interface BoardService {
	public List<BoardDTO> getBoard(BoardDTO dto);
	public int insertBoard(BoardDTO dto);
	public List<BoardDTO> getBoardInfo(int seq);
}
