package com.leeyc.study.board.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

	// 게시판 목록 조회
	@RequestMapping("/board/list")
	public ModelAndView list(HttpServletRequest request) throws Exception {
		logger.info("list");
		ModelAndView view = new ModelAndView();
		view.addObject("list", service.list());
		view.setViewName("board/list");
		return view;
	}

	@RequestMapping(value = "/board/writeView", method = RequestMethod.GET)
	public void writeView() throws Exception {
		logger.info("writeView");
	}

	// 게시판 글 작성
	@RequestMapping(value = "/board/write", method = RequestMethod.POST)
	public String write(BoardVO boardVO) throws Exception {
		logger.info("write");
		service.write(boardVO);
		return "redirect:/";
	}
}
