<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>待办任务</title>
</head>
<body>
	<form action="${ctx}/act/task/claim/">
		请输入userId:<input id="name" name="userId" type="text" />
		<input type="submit" value="确定"/>
	</form>
</body>
</html>
