package com.leeyc.study.board.dao;

import com.leeyc.study.board.vo.BoardVO;

public interface BoardDao {
	//게시글 작성
	public void write(BoardVO boardVO) throws Exception;
}
