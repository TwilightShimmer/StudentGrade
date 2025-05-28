<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>添加试题</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/student.css">
</head>
<body>



<div class="container">
    <h2>添加试题</h2>

    <form action="${pageContext.request.contextPath}/question/add" method="post">
        题干：<input type="text" name="content" required><br>
        A：<input type="text" name="optionA" required><br>
        B：<input type="text" name="optionB" required><br>
        C：<input type="text" name="optionC" required><br>
        D：<input type="text" name="optionD" required><br>
        正确答案：<input type="text" name="correctAnswer" required><br>
        难度：
        <select name="difficulty">
            <option value="easy">简单</option>
            <option value="medium">中等</option>
            <option value="hard">困难</option>
        </select><br>
        科目：<input type="text" name="subject" required><br>
        <input type="submit" value="提交">
    </form>
</div>
</body>
</html>