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
        <option value="hrAudit">人力资源审批</option>
        <option value="hrLeaderAudit">分管领导审批</option>
    </select>
    <label>用户组选择</label><input type="text" id="procDefKey" name="procDefKey" value="${procDefKey}" class="input-medium"/>
    &nbsp;<input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>
</form>
</body>
</html>
