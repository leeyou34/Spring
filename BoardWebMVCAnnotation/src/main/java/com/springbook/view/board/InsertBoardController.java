package com.springbook.view.board;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
public class InsertBoardController /*implements Controller */{
	//@Override
	//public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
/*	
	@RequestMapping(value="/insertBoard.do") // 글 등록 기능 구현하기를 위해 주석 처리함.
	public void insertBoard(HttpServletRequest request) {
		
	System.out.println("글 등록 처리");
		
		// 1. 사용자 입력 정보 추출
		// request.setCharacterEncoding("EUC-KR");
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		
		// 2. DB 연동 처리
		BoardVO vo = new BoardVO();
		vo.setTitle(title);
		vo.setWriter(writer);
		vo.setContent(content);
		
		BoardDAO boardDAO = new BoardDAO();
		boardDAO.insertBoard(vo);
		
		// 3. 화면 네비게이션
		//return "getBoardList.do";
		//ModelAndView mav = new ModelAndView();
		//mav.setViewName("getBoardList.do");
		//return mav;
	}
*/
	@RequestMapping(value="/insertBoard.do")
	public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
		boardDAO.insertBoard(vo);
		return "getBoardList.do";
	}
}
