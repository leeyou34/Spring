package com.springbook.biz.board.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.springbook.biz.board.BoardVO;

public class BoardDAOJPA {
	@PersistenceContext
	private EntityManager em;
	
	public void insertBOard(BoardVO vo) {
		System.out.println("===> JPA로 insertBoard() 기능  처리");
		em.persist(vo);
	}
	
	public void updateBoard(BoardVO vo) {
		System.out.println("===> JPA로 updateBoard() 기능 처리");
		em.merge(vo);
	}
	
	public void deleteBoard(BoardVO vo) {
		System.out.println("===> JPA로 deleteBoard() 기능 처리");
		em.merge(vo);
	}
	
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("====> JPA로 getBoard() 기능 처리");
		return (BoardVO) em.find(BoardVO.class, vo.getSeq());
	}
	
	public List<BoardVO> getBoardLIst(BoardVO vo) {
		System.out.println("===> JPA로 getBoardList() 기능 처리");
		return em.createQuery("from BOardVO b order by b.seq desc").getResultList();
	}
	
}
