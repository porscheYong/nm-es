	<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>盟市人员信息修改重申</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#name").focus();
			$("#ModifyStaffInfoForm").validate({
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

            var today=new Date();
            var currentTime=today.getFullYear()+'-'+(today.getMonth()+1)+'-'+today.getDate()+' '+today.getHours()+":"+today.getMinutes()+":"+today.getSeconds();
			$("#startTime").attr('value',currentTime);
            $("#endTime").attr('value',currentTime);
		});


	</script>
</head>
<body>
	<%--<ul class="nav nav-tabs">--%>
		<%--<li><a href="${ctx}/oa/leave/">待办任务</a></li>--%>
		<%--<li><a href="${ctx}/oa/leave/list">所有任务</a></li>--%>
		<%--<shiro:hasPermission name="oa:leave:edit"><li class="active"><a href="${ctx}/oa/leave/form">请假申请</a></li></shiro:hasPermission>--%>
	<%--</ul>--%>



	<form:form id="ModifyStaffInfoForm" modelAttribute="modifyStaffInfo" action="${ctx}/oa/modifyStaffInfo/save" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<form:hidden path="act.taskId"/>
		<form:hidden path="act.taskName"/>
		<form:hidden path="act.taskDefKey"/>
		<form:hidden path="act.procInsId"/>
		<form:hidden path="act.procDefId"/>
		<form:hidden id="flag" path="act.flag"/>
		<sys:message content="${message}"/>
		<br>
			<legend>
				<shiro:hasPermission name="oa:modifyStaffInfo:edit">人员信息修改流程${not empty modifyStaffInfo.id?'修改':'申请'}</shiro:hasPermission><shiro:lacksPermission name="oa:leave:edit">查看</shiro:lacksPermission>
			</legend>
			<table class="table-form">
				<tr>
					<td class="tit">姓名</td>
					<td>
						<form:input path="newName" htmlEscape="false" maxlength="100" class="name"/>
					</td>
				</tr>
				<tr>
					<td class="tit">电话</td>
					<td>
						<form:input path="newPhone" htmlEscape="false" maxlength="100" class="phone"/>
					</td>
				</tr>
				<tr>
					<td class="tit">邮箱</td>
					<td>
						<form:input path="newEmail" htmlEscape="false" maxlength="100" class="email"/>
					</td>
				</tr>
				<tr>
					<td class="tit">密码</td>
					<td>
						<form:input path="newPassword" htmlEscape="false" maxlength="100" class="password"/>
					</td>
				</tr>
			</table>
		</fieldset>
		<div class="form-actions">
			<input id="btnSubmit" class="btn btn-primary" type="submit" value="提交申请" onclick="$('#flag').val('yes')"/>&nbsp;
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
		<c:if test="${not empty modifyStaffInfo.id}">
			<act:histoicFlow procInsId="${modifyStaffInfo.act.procInsId}" />
		</c:if>
	</form:form>
</body>
</html>
