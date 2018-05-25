<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>运行中的流程</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function(){
			top.$.jBox.tip.mess = null;
		});
		function page(n,s){
        	location = '${ctx}/workflow/act/process/running/?pageNo='+n+'&pageSize='+s;
        }
		function updateCategory(id, category){
			$.jBox($("#categoryBox").html(), {title:"设置分类", buttons:{"关闭":true}, submit: function(){}});
			$("#categoryBoxId").val(id);
			$("#categoryBoxCategory").val(category);
		}
	</script>
	<script type="text/template" id="categoryBox">
		<form id="categoryForm" action="${ctx}/workflow/act/process/updateCategory" method="post" enctype="multipart/form-data"
			style="text-align:center;" class="form-search" onsubmit="loading('正在设置，请稍等...');"><br/>
			<input id="categoryBoxId" type="hidden" name="procDefId" value="" />
			<select id="categoryBoxCategory" name="category">
				<c:forEach items="${fns:getDictList('act_category')}" var="dict">
					<option value="${dict.value}">${dict.label}</option>
				</c:forEach>
			</select>
			<br/><br/>　　
			<input id="categorySubmit" class="btn btn-primary" type="submit" value="   保    存   "/>　　
		</form>
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li><a href="${ctx}/workflow/act/process/">流程管理</a></li>
		<li><a href="${pageContext.request.contextPath}/workflow/act/process/deploy/">部署流程</a></li>
		<li class="active"><a href="${ctx}/workflow/act/process/running/">运行中的流程</a></li>
	</ul>
	<form id="searchForm" action="${ctx}/workflow/act/process/running/" method="post" class="breadcrumb form-search">
		<label>流程实例ID：</label><input type="text" id="procInsId" name="procInsId" value="${procInsId}" class="input-medium"/>
		<label>流程定义Key：</label><input type="text" id="procDefKey" name="procDefKey" value="${procDefKey}" class="input-medium"/>
		&nbsp;<input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/>
	</form>
	<form id="workHandOver" action="${ctx}/workflow/act/process/workHandOver/" method="post" class="breadcrumb form-search">
		离职人：<input type="text" id="leaveUser" name="leaver" class="input-medium"/>&nbsp;
		接管人：<input type="text" id="receiver" name="receiver" class="input-medium"/>&nbsp;
		<input type="submit" value="工作交接" class="btn btn-primary"/>
	</form>
	<sys:message content="${message}"/>
	<table class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>执行ID</th>
				<th>流程实例ID</th>
				<th>流程定义ID</th>
				<th>当前环节</th>
				<th>是否挂起</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.list}" var="procIns">
				<tr>
					<td>${procIns.id}</td>
					<td><a href="${ctx}/workflow/act/process/alterAssignee?procInstId=${procIns.id}">${procIns.processInstanceId}</a></td>
					<td><a href="${ctx}/workflow/act/process/alterAssignee?procInstId=${procIns.id}">${procIns.processDefinitionId}</a></td>
					<td><a href="${ctx}/workflow/act/process/alterAssignee?procInstId=${procIns.id}">${procIns.activityId}</a></td>
					<td>${procIns.suspended}</td>
					<td>
						<%--<shiro:hasPermission name="act:process:edit">--%>
							<a href="${ctx}/act/process/deleteProcIns?procInsId=${procIns.processInstanceId}&reason=" onclick="return promptx('删除流程','删除原因',this.href);">删除流程</a>
							&nbsp;
							<a href="${ctx}/act/task/taskBack?procInstId=${procIns.processInstanceId}">回退</a>
						<%--</shiro:hasPermission>&nbsp;--%>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>
