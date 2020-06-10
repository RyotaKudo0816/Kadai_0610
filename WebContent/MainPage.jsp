<%@page import="java.util.ArrayList"%>
<%@page import="bean.PostBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<link rel = "stylesheet" href = "./css/style.css">

<meta charset="UTF-8">
<title>MainPage</title>
</head>
<body>

	<a href = "/Keiziban_0525/Editor"><input type="submit" value="管理画面へ"></a><br>

	<form action="/Keiziban_0525/MainPage" method="post">
		<label for="name">投稿者</label><br>
		<input type="text" name="name"><br>
		<label for="mailadd">メールアドレス	</label><br>
		<input type="email" name="mailadd" size="40"><br>
		<label for="content">内容</label><br>
		<textarea name="content" rows="7" cols="40" maxlength="256"></textarea>
		<input type="submit" value="投稿">
	</form>

	<hr class = "double">

	<%
	ArrayList<PostBean> postList = (ArrayList<PostBean>)request.getAttribute("posts");
	for(int i = 0; i < postList.size(); i++){
		PostBean post = postList.get(i);
	%>
	<lib>
	<p><%=post.getContent() %></p><br>
	<p>投稿者：<%=post.getName() %>  </p>
	<p>投稿時間：<%=post.getPosttime() %>
	<%if(!(("0000-00-00 00:00:00").equals(post.getEdittime())) && !(post.getEdittime().equals(post.getPosttime()))){%>
		更新時間：<%=post.getEdittime() %>
	<%} %>
	</p>
	<hr>
	</lib>
	<%
	}
	%>

</body>
</html>