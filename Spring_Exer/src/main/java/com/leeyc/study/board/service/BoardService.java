package com.leeyc.study.board.service;

import java.util.List;

import com.leeyc.study.board.vo.BoardVO;

public interface BoardService {

	// 게시글 작성
	public void write(BoardVO boardVO) throws Exception;
	
	//게시물 목록
	public List<BoardVO> list() throws Exception;
}
