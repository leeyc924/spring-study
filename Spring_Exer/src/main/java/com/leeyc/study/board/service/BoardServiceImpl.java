package com.leeyc.study.board.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.leeyc.study.board.dao.BoardDao;
import com.leeyc.study.board.vo.BoardVO;

public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDao dao;

	// 게시글 작성
	@Override
	public void write(BoardVO boardVO) throws Exception {
		dao.write(boardVO);
	}

}
