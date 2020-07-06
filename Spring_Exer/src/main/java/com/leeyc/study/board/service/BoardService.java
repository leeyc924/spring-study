package com.leeyc.study.board.service;

import com.leeyc.study.board.vo.BoardVO;

public interface BoardService {

	// 게시글 작성
	public void write(BoardVO boardVO) throws Exception;
}
