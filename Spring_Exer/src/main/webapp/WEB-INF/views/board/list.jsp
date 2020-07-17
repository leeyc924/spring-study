<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<title>게시판</title>
</head>
<body>
	<div id="root">
		<header>
			<h1>게시판</h1>
		</header>
		<hr />
			<a href="board/list"> 목록 </a> 
			<a href="board/writeView"> 글 작성 </a>
		<hr />
		<section id="container">
			<table>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>등록일</th>
				</tr>
				<c:forEach items="${list}" var="list">
					<tr>
						<td><c:out value="${list.bno}" /></td>
						<td><c:out value="${list.title}" /></td>
						<td><c:out value="${list.writer}" /></td>
						<td><fmt:formatDate value="${list.regdate}"
								pattern="yyyy-MM-dd" /></td>
					</tr>
				</c:forEach>
			</table>
		</section>
		<hr />
	</div>
</body>
</html>