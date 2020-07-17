package com.leeyc.study.board.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

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

	// 초기경로
	@RequestMapping("/")
	public String home() {
		return "redirect:/board/list";
	}

	// 게시판 목록 조회
	@RequestMapping("/board/list")
	public ModelAndView list(HttpServletRequest request) throws Exception {
		logger.info("list");
		ModelAndView view = new ModelAndView();
		view.addObject("list", service.list());
		view.setViewName("board/list");
		return view;
	}

	@RequestMapping("/board/writeView")
	public ModelAndView writeView(HttpServletRequest request) throws Exception {
		logger.info("writeView");
		ModelAndView view = new ModelAndView();
		view.setViewName("/writeView");
		return view;
	}

	@RequestMapping("/board/write")
	public ModelAndView write(HttpServletRequest request) throws Exception {
		logger.info("write");
		ModelAndView view = new ModelAndView();
		BoardVO boardVO = new BoardVO();
		service.write(boardVO);
		view.setViewName("board/list");
		return view;
	}
}
