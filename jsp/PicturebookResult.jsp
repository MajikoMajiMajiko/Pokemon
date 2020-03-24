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
    <table border="1" align="center">
        <tr>
            <th>${pokemon.pokename}</th>
        </tr>
        <tr>
        <td>タイプ</td>
        <td>${pokemon.type}</td>
        </tr>
        <tr>
            <td>高さ</td>
            <td>${pokemon.height}m</td>
        </tr>
        <tr>
            <td>重さ</td>
            <td>${pokemon.weight}kg</td>
        </tr>
        <tr>
            <td>とくせい</td>
            <td>${pokemon.characteristic}</td>
        </tr>
        <tr>
            <td></td>
            <td><img src="${pokemon.image}"></td>
        </tr>
    </table>
    <br>
    <br>
    <a href="/Pokemon/ToPicturebook"> 戻る </a>
</body>
</html>