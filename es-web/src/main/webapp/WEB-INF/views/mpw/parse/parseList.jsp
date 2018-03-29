<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>数据解析管理</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		function page(n,s){
			$("#pageNo").val(n);
			$("#pageSize").val(s);
			$("#searchForm").submit();
	    	return false;
	    }

	</script>
</head>
<body>
<!-- 	<ul class="nav nav-tabs"> -->
<%-- 		<li class="active"><a href="${ctx}/sys/log/">日志列表</a></li> --%>
<!-- 	</ul> -->
	<form:form id="searchForm" action="${ctx}/mpw/parse/file/" method="post" class="breadcrumb form-search">
		<div>
			<label>账期(开始)：</label><input id="title" name="monthId" type="text" maxlength="10" minlength="6" class="input-mini" value="${document.monthId}"/>
			<label>账期(结束)：</label><input id="shortName" name="shortName" type="text" maxlength="200" class="input-mini" value="${document.shortName}"/>
			&nbsp;&nbsp;&nbsp;<input id="btnSubmit" class="btn btn-primary" type="submit" value="导入"/>&nbsp;&nbsp;&nbsp;
		</div>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead><tr><th>文件名</th><th>账期</th><th>实际数量</th><th>入库数量</th><th>入库状态</th><th>创建时间</th><shiro:hasPermission name="mpw:setting:edit"><th>操作</th></shiro:hasPermission></thead>
		<tbody><%request.setAttribute("strEnter", "\n");request.setAttribute("strTab", "\t");%>
		<c:forEach items="${list}" var="doc">
			<tr>
				<td>${doc.name}</td>
				<td>${doc.monthId}</td>
				<td>${doc.counts}</td>
				<td><strong>${doc.exuCounts}</strong></td>
				<td>${doc.flag}</td>
				<td>${doc.createTime}</td>
				<shiro:hasPermission name="mpw:setting:edit">
					<td>
						<a href="${ctx}/mpw/parse/delete?path={doc.id}" onclick="return confirmx('要删除该数据吗？', this.href)">删除</a>
					</td>
				</shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>