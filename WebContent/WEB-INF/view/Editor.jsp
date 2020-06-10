<%@page import="java.util.ArrayList"%>
<%@page import="bean.PostBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<link rel = "stylesheet" href = "./css/style.css">

<meta charset="UTF-8">
<title>EditerPage</title>
</head>
<body>

<a href = "/Keiziban_0525/MainPage"><input type="submit" value = "TOPへ戻る"></a><br>

	<%
	ArrayList<PostBean> postList = (ArrayList<PostBean>)request.getAttribute("posts");
	for(int i = 0; i < postList.size(); i++){
		PostBean post = postList.get(i);
	%>
	<lib>
	<p><%=post.getContent() %></p>
	<p>投稿者：<%=post.getName() %>  </p>
	<p>投稿時間：<%=post.getPosttime() %>
	<%if(!(("0000-00-00 00:00:00").equals(post.getEdittime())) && !(post.getEdittime().equals(post.getPosttime()))){%>
		編集時間：<%=post.getEdittime() %>
	<%
	}
	%>
	</p>
	<form action="/Keiziban_0525/Edit" method="post">
	<button type="submit" name ="eid" value="<%=post.getId() %>">編集</button>
	<input type="text" name="msg">
	</form>
	<form action="/Keiziban_0525/Delete" method="post">
	<button type="submit" name ="rid" value="<%=post.getId() %>">削除</button>
	</form>
	<hr>
	</lib>
	<%
	}
	%>
</body>
</html>