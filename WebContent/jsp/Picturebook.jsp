<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ポケモンずかん</title>
</head>
<body>
<h1>ポケモンずかん</h1>
<br>
ポケモンの なまえを にゅうりょくしてね<br>
<br>
<form action="/Pokemon/PokeMainServlet" method="post">
なまえ：<input type="text" name="pokename">
<br>
<br>
<input type="submit" value="さがす">
</form>
<br>
<a href="/Pokemon/BackToTopServlet">戻る</a>
</body>
</html>