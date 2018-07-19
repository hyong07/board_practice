package kh.board.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kh.board.dto.BoardDTO;
import kh.board.interfaces.BoardDAO;


@Component
public class IBoardDAO implements BoardDAO{
	
	@Autowired
	private JdbcTemplate template;
	
	@Override
	public List<BoardDTO> getBoard(BoardDTO dto) {		 
		String sql = "select * from board";
		return template.query(sql, new RowMapper<BoardDTO>() {
			public BoardDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				BoardDTO tmp = new BoardDTO();
				tmp.setSeq(rs.getInt(1));
				tmp.setWriter(rs.getString(2));
				tmp.setTitle(rs.getString(3));
				tmp.setContents(rs.getString(4));
				tmp.setWrite_date(rs.getString(5));
				return tmp;
			}
		});
	}
	
	@Override
	public int insertBoard(BoardDTO dto) {
		String sql = "insert into board values(board_seq.nextval,?,?,?,sysdate)";
		return template.update(sql, dto.getWriter(), dto.getTitle(), dto.getContents());
	}
}
