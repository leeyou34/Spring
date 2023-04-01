package com.springbook.biz.board.impl;

import com.springbook.biz.board.BoardVO;

@Service("boardService")
public class BoardServiceImpl BoardService {
	@Autrowired
	private BoardDAOJPA boardDAO;
	
	public void insertBoard(BoardVO vo) {
		boardDAO.insertBoard(vo);
	}
}
