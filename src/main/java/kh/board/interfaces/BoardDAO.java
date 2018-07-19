package kh.board.interfaces;

import java.util.List;

import kh.board.dto.BoardDTO;

public interface BoardDAO {
	public List<BoardDTO> getBoard(BoardDTO dto);
}
