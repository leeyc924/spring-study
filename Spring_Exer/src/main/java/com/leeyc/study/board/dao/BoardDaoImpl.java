package com.leeyc.study.board.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.leeyc.study.board.vo.BoardVO;

public class BoardDaoImpl implements BoardDao {
	@Autowired
	private SqlSession sqlSession;
	 
	// 게시글 작성
	@Override
	public void write(BoardVO boardVO) throws Exception {
		sqlSession.insert("boardMapper.insert", boardVO);
	}
}
