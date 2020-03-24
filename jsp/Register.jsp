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
<br>
どんなポケモン？
<br>
<br>
<form action="" method="POST">
    ID：<input type="text" name="id"><br>
    なまえ：<input type="text" name="name"><br>
    タイプ：<input type="text" name="type"><br>
    高さ：<input type="text" name="height"><br>
    重さ：<input type="text" name="weight"><br>
    とくせい：<input type="text" name="characteristic"><br>
    しゃしん：<input type="text" name="image"><br>
</form>
<br>
<input type="submit" value="とうろく">
<br>
<br>
<a href="/Pokemon/BackToTopServlet">戻る</a>
</body>
</html>