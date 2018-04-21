<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>代理信息列表</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function(){
			top.$.jBox.tip.mess = null;
		});
		function page(n,s){
        	location = '${ctx}/act/task/process/?pageNo='+n+'&pageSize='+s;
        }
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li><a href="${ctx}/act/task/todo/">待办任务</a></li>
		<li><a href="${ctx}/act/task/historic/">已办任务</a></li>
		<li class="active"><a href="${ctx}/act/task/process/">新建任务</a></li>
		<li><a href="${ctx}/oa/delegate/list/">代理设置</a></li>
	</ul>
	<form id="searchForm" action="${ctx}/oa/delegate/list/" method="post" class="breadcrumb form-search">
		<select id="category" name="category" class="input-medium">
			<option value="">全部分类</option>
			<c:forEach items="${fns:getDictList('act_category')}" var="dict">
				<option value="${dict.value}" ${dict.value==category?'selected':''}>${dict.label}</option>
			</c:forEach>
		</select>
		&nbsp;<input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/>
	</form>
	<form id="addDelegateInfo" action="${ctx}/oa/delegate/add/" method="post" class="breadcrumb form-search">
		&nbsp;<input id="addDelegateInfoBtn" class="btn btn-primary" type="submit" value="添加"/>
	</form>
	<sys:message content="${message}"/>
	<table class="table table-striped table-bordered table-condensed">
		<thead>
		<tr>
			<th>序号</th>
			<th>委托人</th>
			<th>代理人</th>
			<th>开始日期</th>
			<th>终结日期</th>
			<th>流程名称</th>
			<th>操作</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${delegateInfoList}" var="delegateInfo">
			<tr>
				<td>${delegateInfo.atiDelegateInfoId}</td>
				<td><a href="${ctx}/oa/delegate/modify?atiDelegateInfoId=${delegateInfo.atiDelegateInfoId}">${delegateInfo.assignee}</a></td>
				<td><a href="${ctx}/oa/delegate/modify?atiDelegateInfoId=${delegateInfo.atiDelegateInfoId}">${delegateInfo.attorney}</a></td>
				<td><fmt:formatDate value="${delegateInfo.startTime}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate> </td>
				<td><fmt:formatDate value="${delegateInfo.endTime}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate> </td>
				<td><a href="${ctx}/oa/delegate/modify?atiDelegateInfoId=${delegateInfo.atiDelegateInfoId}">${delegateInfo.procDefId}</a></td>
				<td>
					<a href="${ctx}/oa/delegate/modify?atiDelegateInfoId=${delegateInfo.atiDelegateInfoId}">修改</a>&nbsp;
					&nbsp;<a href="${ctx}/oa/delegate/deleteDelegateInfo?atiDelegateInfoId=${delegateInfo.atiDelegateInfoId}">删除</a>
				</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>
