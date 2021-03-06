<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>行政区域管理</title>
	<meta name="decorator" content="default"/>
	<%@include file="/WEB-INF/views/include/treetable.jsp" %>
	<script type="text/javascript">
		$(document).ready(function() {
			var tpl = $("#treeTableTpl").html().replace(/(\/\/\<!\-\-)|(\/\/\-\->)/g,"");
			var data = ${fns:toJson(list)}, rootId = "${not empty location.id ? location.id : '0'}";
			addRow("#treeTableList", tpl, data, rootId, true);
			$("#treeTable").treeTable({expandLevel : 5});
		});
		function addRow(list, tpl, data, pid, root){
			for (var i=0; i<data.length; i++){
				var row = data[i];
                //console.log("i =>"+id+" ;parentIds="+treeNode.pIds);
				if ((${fns:jsGetVal('row.parentId')}) == pid){
					$(list).append(Mustache.render(tpl, {
						dict: {
							type: getDictLabel(${fns:toJson(fns:getDictList('sys_office_type'))}, row.type)
						}, pid: (root?0:pid), row: row
					}));
					addRow(list, tpl, data, row.id);
				}
			}
		}
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/core/location/list?id=${location.id}">行政区域列表</a></li>
		<shiro:hasPermission name="area:location:edit"><li><a href="${ctx}/core/location/form?parent.id=${location.id}">行政区域添加</a></li></shiro:hasPermission>
	</ul>
	<sys:message content="${message}"/>
	<table id="treeTable" class="table table-striped table-bordered table-condensed">
		<thead><tr><th>行政区域名称</th><th>所有父级编号</th><th>行政区域编码</th><th>备注</th><shiro:hasPermission name="area:location:edit"><th>操作</th></shiro:hasPermission></tr></thead>
		<tbody id="treeTableList"></tbody>
	</table>
	<script type="text/template" id="treeTableTpl">
		<tr id="{{row.id}}" pId="{{pid}}">
			<td><a href="${ctx}/core/location/form?id={{row.id}}">{{row.name}}</a></td>
			<td>{{row.parentIds}}</td>
			<td>{{row.localCode}}</td>
			<td>{{row.remarks}}</td>
			<shiro:hasPermission name="area:location:edit"><td>
				<a href="${ctx}/core/location/form?id={{row.id}}">修改</a>
				<a href="${ctx}/core/location/delete?id={{row.id}}" onclick="return confirmx('要删除该节点吗？', this.href)">删除</a>
				<a href="${ctx}/core/location/form?parent.id={{row.id}}">添加下级节点</a>
			</td></shiro:hasPermission>
		</tr>
	</script>
</body>
</html>