<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>Bean实体管理</title>
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
	<form:form id="searchForm" action="${ctx}/mpw/bean/list/" method="post" class="breadcrumb form-search">
		<div>
			<label>数据库表名</label><input id="tableName" name="tableName" type="text" maxlength="50" class="input-mini" value="${tab2BeanCorresRef.tableName}"/>
			<label>实体类名：</label><input id="entityName" name="entityName" type="text" maxlength="200" class="input-mini" value="${doctab2BeanCorresRefument.entityName}"/>
			&nbsp;&nbsp;&nbsp;<input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/>&nbsp;&nbsp;
		</div>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead><tr><th>数据库表名</th><th>描述</th><th>SPRING组件名称</th><th>实体类名</th>
			<shiro:hasPermission name="mpw:setting:edit"><th>操作</th></shiro:hasPermission></thead>
		<tbody><%request.setAttribute("strEnter", "\n");request.setAttribute("strTab", "\t");%>
		<c:forEach items="${page.list}" var="doc">
			<tr>
				<td>${doc.tableName}</td>
				<td>${doc.tableDesc}</td>
				<td>${doc.serviceName}</td>
				<td><strong>${doc.entityName}</strong></td>
				<shiro:hasPermission name="mpw:setting:edit">
					<td>
						<a href="${ctx}/mpw/setting/form?path=${doc.tableName}">修改</a>
						<a href="${ctx}/mpw/setting/delete?path={doc.tableName}" onclick="return confirmx('要删除该数据吗？', this.href)">删除</a>
					</td>
				</shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>