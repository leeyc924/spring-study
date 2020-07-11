package com.leeyc.study.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leeyc.study.board.dao.BoardDao;
import com.leeyc.study.board.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDao dao;

	// 게시글 작성
	@Override
	public void write(BoardVO boardVO) throws Exception {
		dao.write(boardVO);
	}

	@Override
	public List<BoardVO> list() throws Exception {
		return dao.list();
	}

}
