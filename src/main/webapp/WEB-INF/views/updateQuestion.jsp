<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>修改试题</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css">
</head>
<body>

<div class="container">
    <h2>修改试题</h2>

    <form action="${pageContext.request.contextPath}/question/update" method="post">
        <input type="hidden" name="questionId" value="${question.questionId}">
        题干：<input type="text" name="content" value="${question.content}" required><br>
        A：<input type="text" name="optionA" value="${question.optionA}" required><br>
        B：<input type="text" name="optionB" value="${question.optionB}" required><br>
        C：<input type="text" name="optionC" value="${question.optionC}" required><br>
        D：<input type="text" name="optionD" value="${question.optionD}" required><br>
        正确答案：<input type="text" name="correctAnswer" value="${question.correctAnswer}" required><br>
        难度：
        <select name="difficulty">
            <option value="easy" ${question.difficulty == 'easy' ? 'selected' : ''}>简单</option>
            <option value="medium" ${question.difficulty == 'medium' ? 'selected' : ''}>中等</option>
            <option value="hard" ${question.difficulty == 'hard' ? 'selected' : ''}>困难</option>
        </select><br>
        科目：<input type="text" name="subject" value="${question.subject}" required><br>
        <input type="submit" value="更新">
    </form>
</div>

</body>
</html>
