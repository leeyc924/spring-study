package com.leeyc.study.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.leeyc.study.board.vo.BoardVO;

@Repository
public class BoardDaoImpl implements BoardDao {
	@Autowired
	private SqlSession sqlSession;
	 
	// 게시글 작성
	@Override
	public void write(BoardVO boardVO) throws Exception {
		sqlSession.insert("boardMapper.insert", boardVO);
	}
 
	@Override
	public List<BoardVO> list() throws Exception {
		return sqlSession.selectList("boardMapper.list");
	}
}
