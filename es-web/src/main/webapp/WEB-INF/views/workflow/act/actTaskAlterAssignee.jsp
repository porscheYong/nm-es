<%--
  Created by IntelliJ IDEA.
  User: liuxiaodong
  Date: 2018/4/24
  Time: 9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
    <title>任务改派</title>
</head>
<body>
<legend>
    任务改派
</legend>
<form id="alterAssign" action="${ctx}/workflow/act/process/saveTaskAlterAssignee?procInstId=${procInstId}" method="post" class="breadcrumb form-search">
    <label>流程实例</label>${proInstId}
    <select name="taskDefKey">
        <c:forEach items="${list}" var="taskDef">
            <option value="${taskDef.id}">${taskDef.name}</option>
        </c:forEach>
    </select>
    <label>用户选择</label>
    <div id="userRange" style="width:30%;height: 30%; position: absolute;left:20%;top: 10%;overflow: auto;border: solid;">
    <c:forEach items="${users}" var="user">
        <input type="checkbox" name="atiUserId" value="${user.atiUserId}">${user.name}<br/>
    </c:forEach>
    <input type="checkbox" name="chose" value="" onclick="selectAll()" ID="Checkbox3">allselect
</div>
    &nbsp;<input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>
</form>
</body>
</html>
