<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>审批管理</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
        $(document).ready(function() {
            $("#name").focus();
            $("#inputForm").validate({
                submitHandler: function(form){
                    loading('正在提交，请稍等...');
                    form.submit();
                },
                errorContainer: "#messageBox",
                errorPlacement: function(error, element) {
                    $("#messageBox").text("输入有误，请先更正。");
                    if (element.is(":checkbox")||element.is(":radio")||element.parent().is(".input-append")){
                        error.appendTo(element.parent().parent());
                    } else {
                        error.insertAfter(element);
                    }
                }
            });
        });
	</script>
</head>
<body>
<%--<ul class="nav nav-tabs">--%>
<%--<li><a href="${ctx}/oa/testAudit/">审批列表</a></li>--%>
<%--<li class="active"><a href="${ctx}/oa/testAudit/form?id=${testAudit.id}"><shiro:hasPermission name="oa:testAudit:edit">审批${not empty testAudit.id?'修改':'申请'}流程</shiro:hasPermission><shiro:lacksPermission name="oa:testAudit:edit">查看</shiro:lacksPermission></a></li>--%>
<%--<li><a href="#">审批修改流程</a></li>--%>
<%--</ul>--%>
<form:form id="inputForm" modelAttribute="testAudit" action="${ctx}/oa/testAudit/save" method="post" class="form-horizontal">
	
	<sys:message content="${message}"/>
	<fieldset>
		<legend>
			<shiro:hasPermission name="oa:testAudit:edit">调薪流程${not empty testAudit.id?'修改':'申请'}</shiro:hasPermission><shiro:lacksPermission name="oa:testAudit:edit">查看</shiro:lacksPermission>
		</legend>
		<table class="table-form">
			<tr>
				<td class="tit">姓名</td><td>
				<sys:treeselect id="user" name="user.id" value="${testAudit.user.id}" labelName="" labelValue=""
								title="用户" url="/sys/office/treeData?type=3" cssClass="required recipient" cssStyle="width:150px"
								allowClear="true" notAllowSelectParent="true" smallBtn="false"/>
			</td>
				<%--<td class="tit">部门</td><td>--%>
				<%--<sys:treeselect id="office" name="office.id" value="${testAudit.office.id}" labelName="office.name" labelValue="${testAudit.office.name}"--%>
								<%--title="用户" url="/sys/office/treeData?type=2" cssClass="required recipient" cssStyle="width:150px"--%>
								<%--allowClear="true" notAllowSelectParent="true" smallBtn="false"/></td>--%>
				<td class="tit">岗位职级</td><td>

			</td>
			</tr>
			<tr>

			</tr>
			<tr>

			</tr>
			<tr>

			</tr>
			<tr>

			</tr>
			<tr>

			</tr>
			<tr>
				<td class="tit">人力资源部意见</td>
				<td colspan="5">
						${testAudit.hrText}
				</td>
			</tr>
			<tr>
				<td class="tit">人力资源部分管领导意见</td>
				<td colspan="5">
						${testAudit.leadText}
				</td>
			</tr>
			<tr>
				<td class="tit">集团主要领导意见</td>
				<td colspan="5">
						${testAudit.mainLeadText}
				</td>
			</tr>
		</table>
	</fieldset>
	<div class="form-actions">
		<shiro:hasPermission name="oa:testAudit:edit">
			<input id="btnSubmit" class="btn btn-primary" type="submit" value="提交申请" onclick="$('#flag').val('yes')"/>&nbsp;
			<c:if test="${not empty testAudit.id}">
				<input id="btnSubmit2" class="btn btn-inverse" type="submit" value="销毁申请" onclick="$('#flag').val('no')"/>&nbsp;
			</c:if>
		</shiro:hasPermission>
		<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
	</div>
	<c:if test="${not empty testAudit.id}">
		<act:histoicFlow procInsId="${testAudit.act.procInsId}" />
	</c:if>
</form:form>
</body>
</html>