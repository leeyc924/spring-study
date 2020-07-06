package com.leeyc.study.board.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.leeyc.study.board.service.BoardService;
import com.leeyc.study.board.vo.BoardVO;

public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Autowired
	BoardService service;

	@Autowired
	BoardVO boardVO;

	// 게시판 글 작성 화면
	@RequestMapping("/board/write")
	public ModelAndView write() throws Exception {
		logger.info("write");
		ModelAndView view = new ModelAndView();
		service.write(boardVO);
		view.setViewName("/board/write");
		return view;
	}

}
