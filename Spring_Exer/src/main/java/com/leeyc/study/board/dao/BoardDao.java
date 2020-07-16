package com.leeyc.study.board.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.leeyc.study.board.vo.BoardVO;

@Repository
public interface BoardDao{
	 
	// 게시글 작성
	public void write(BoardVO boardVO) throws Exception; 
	
	// 게시글 목록
	public List<BoardVO> list() throws Exception;
	
}
 