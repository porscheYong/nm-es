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
	<%--&lt;%&ndash;<li><a href="${ctx}/oa/leave/">审批列表</a></li>&ndash;%&gt;--%>
	<%--&lt;%&ndash;<li class="active"><a href="#"><shiro:hasPermission name="oa:leave:edit">${leave.act.taskName}</shiro:hasPermission><shiro:lacksPermission name="oa:leave:edit">查看</shiro:lacksPermission></a></li>&ndash;%&gt;--%>
	<%--<li><a href="#">审批流程</a></li>--%>
<%--</ul>--%>
<form:form id="modifyStaffInfoForm" modelAttribute="modifyStaffInfo" action="${ctx}/oa/modifyStaffInfo/saveAudit" method="post" class="form-horizontal">
	<form:hidden path="id"/>
	<form:hidden path="act.taskId"/>
	<form:hidden path="act.taskName"/>
	<form:hidden path="act.taskDefKey"/>
	<form:hidden path="act.procInsId"/>
	<form:hidden path="act.procDefId"/>
	<form:hidden id="flag" path="act.flag"/>
	<sys:message content="${message}"/>
	<fieldset>
		<%--<legend>${leave.act.task.name}</legend>--%>
		<legend>人员信息修改流程审批</legend>
		<table class="table-form">
			<tr>
				<td class="tit">工单主题</td><td>${modifyStaffInfo.formTheme}</td>
			</tr>
			<tr>
				<td class="tit">紧急程度</td><td>${modifyStaffInfo.urgent}</td>
			</tr>
			<tr>
				<td class="tit">表单内容</td><td>${modifyStaffInfo.formContent}</td>
			</tr>
			<tr>
				<td class="tit">申请人</td><td>${applyUser.name}</td>
			</tr>
			<tr>
				<td class="tit">部门</td><td>${org.orgName}</td>
			</tr>
				<%--<tr>--%>
				<%--<td class="tit">岗位职级</td><td></td>--%>
				<%--</tr>--%>
		</table>
		<br />
		<table class="table-form">
			<tr>
				<td class="tit">原姓名</td>
				<td>${applyUser.name}</td>
				<td class="tit">新姓名</td>
				<td>${modifyStaffInfo.newName}</td>
			</tr>
			<tr>
				<td class="tit">原手机号</td>
				<td>${applyUser.phone}</td>
				<td class="tit">新手机号</td>
				<td>${modifyStaffInfo.newPhone}</td>
			</tr>
			<tr>
				<td class="tit">原邮箱</td>
				<td>${applyUser.mail}</td>
				<td class="tit">新邮箱</td>
				<td>${modifyStaffInfo.newEmail}</td>
			</tr>
			<tr>
				<td class="tit">原密码</td>
				<td>${applyUser.password}</td>
				<td class="tit">新密码</td>
				<td>${modifyStaffInfo.newPassword}</td>
			</tr>
			<tr>
				<td class="tit">人力资源意见</td>
				<td colspan="3">
						${modifyStaffInfo.hrText}
				</td>
			</tr>
			<tr>
				<td class="tit">分管领导意见</td>
				<td colspan="3">
						${modifyStaffInfo.hrLeaderText}
				</td>
			</tr>
			<tr>
				<c:if test="${modifyStaffInfo.act.taskDefKey ne 'admin'}">
					<td class="tit">您的意见</td>
					<td colspan="5">
						<form:textarea path="act.comment" class="required" rows="5" maxlength="20" cssStyle="width:500px"/>
					</td>
				</c:if>
			</tr>
		</table>
	</fieldset>
	<div class="form-actions">
		<c:if test="${modifyStaffInfo.act.taskDefKey ne 'admin'}">
			<input id="btnSubmit" class="btn btn-primary" type="submit" value="同 意" onclick="$('#flag').val('yes')"/>&nbsp;
			<input id="btnSubmit" class="btn btn-inverse" type="submit" value="驳 回" onclick="$('#flag').val('no')"/>&nbsp;
		</c:if>
		<c:if test="${modifyStaffInfo.act.taskDefKey eq 'admin'}">
			<input id="btnSubmit" class="btn btn-primary" type="submit" value="确 定"/>&nbsp;
		</c:if>
		<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
	</div>
	<act:histoicFlow procInsId="${modifyStaffInfo.act.procInsId}"/>
</form:form>
</body>
</html>