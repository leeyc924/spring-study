package com.leeyc.study.board.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.leeyc.study.board.service.BoardService;
import com.leeyc.study.board.vo.BoardVO;

@Controller
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Autowired
	BoardService service;

	@RequestMapping("/board/write")
	public String write() throws Exception {
		logger.info("write");
		return "/board/write";
	}

	// 게시판 글 작성 화면
	@RequestMapping("/board/writeView")
	public ModelAndView writeView(HttpServletRequest request) throws Exception {
		BoardVO boardVO = new BoardVO();
		logger.info("writeView");
		ModelAndView view = new ModelAndView();
		service.write(boardVO);
		view.setViewName("/board/write");
		return view;
	}
}
