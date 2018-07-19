package kh.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kh.board.dto.BoardDTO;
import kh.board.interfaces.BoardDAO;
import kh.board.interfaces.BoardService;

@Component
public class IBoardService implements BoardService{
	
	@Autowired
	private BoardDAO dao;
	
	public List<BoardDTO> getBoard(BoardDTO dto) {
		return this.dao.getBoard(dto);
	}
}
