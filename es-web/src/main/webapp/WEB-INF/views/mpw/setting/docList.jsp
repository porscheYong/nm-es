<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>FTP文件管理</title>
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
	<form:form id="searchForm" action="${ctx}/mpw/setting/file/" method="post" class="breadcrumb form-search">
		<div>
			<label>开始账期</label><input id="title" name="monthId" type="text" maxlength="10" minlength="6" class="input-mini" value="${document.monthId}"/>
			<label>结束账期</label><input id="titleEnd" name="endmonthId" type="text" maxlength="10" minlength="6" class="input-mini"/>
			<label>文件简称：</label><input id="shortName" name="shortName" type="text" maxlength="200" class="input-mini" value="${document.shortName}"/>
			&nbsp;&nbsp;&nbsp;<input id="btnSubmit" class="btn btn-primary" type="submit" value="查询" onclick="test()"/>&nbsp;&nbsp;
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
				<td>${doc.statuscode}</td>
				<td>${doc.createTime}</td>
				<shiro:hasPermission name="mpw:setting:edit">
					<td>
						<a href="${ctx}/mpw/setting/form?path=${doc.id}">解析入库</a>
						<a href="${ctx}/mpw/setting/delete?path={doc.id}" onclick="return confirmx('要删除该数据吗？', this.href)">删除</a>
					</td>
				</shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
<script language="javascript">
    var monthIdInp = document.getElementById("title");
    function test(){
        var monthId = monthIdInp.value;
        var monthIdStr = null;
        if(monthId.length == 6){
            var year = monthId.substring(0,4);
            var month = monthId.substring(4,6);
            monthIdStr = year +"-" +month;
		} else if (monthId.length == 8){
            var year = monthId.substring(0,4);
            var month = monthId.substring(4,6);
            var day = monthId.substring(6,8);
            monthIdStr = year +"-" +month + "-" + day;
		} else {
            alert("账期格式错误");
            monthIdInp.focus();
		}
        console.info(monthIdStr);
		var date = new Date(monthIdStr);
        console.info(date.getDate());
		if(isNaN(date.getMonth())){
            alert("账期格式错误");
            monthIdInp.focus();
		}
    }
</script>
</body>
</html>