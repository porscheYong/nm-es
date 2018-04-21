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
<form:form id="inputForm" modelAttribute="leave" action="${ctx}/oa/leave/saveAudit" method="post" class="form-horizontal">
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
		<legend>请假流程审批</legend>
		<table class="table-form">
			<tr>
				<td class="tit">姓名</td><td>${leave.formSender}</td>
			</tr>
			<tr>
				<td class="tit">部门</td><td></td>
			</tr>
			<tr>
				<td class="tit">岗位职级</td><td></td>
			</tr>
			<tr>
				<td class="tit">请假原因 </td>
				<td>${leave.reason}</td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td class="tit">
					开始时间
				</td>
				<%--<td><fmt:formatDate value="${leave.startTime}" pattern="yyyy年MM月dd日 HH时mm分ss秒"></fmt:formatDate> </td>--%>
				<td>${leave.startTime}</td>
			</tr>
			<tr>
				<td class="tit">
					结束时间
				</td>
				<%--<td><fmt:formatDate value="${leave.endTime}" pattern="yyyy年MM月dd日 HH时mm分ss秒"></fmt:formatDate></td>--%>
				<td>${leave.endTime}</td>
			</tr>
			<tr>
				<td class="tit">部门领导意见</td>
				<td colspan="3">
						${leave.deptLeaderText}
				</td>
			</tr>
			<tr>
				<td class="tit">人力资源部意见</td>
				<td colspan="3">
						${leave.hrText}
				</td>
			</tr>
			<tr>
				<td class="tit">您的意见</td>
				<td colspan="5">
					<form:textarea path="act.comment" class="required" rows="5" maxlength="20" cssStyle="width:500px"/>
				</td>
			</tr>
		</table>
	</fieldset>
	<div class="form-actions">
		<shiro:hasPermission name="oa:leave:edit">
			<c:if test="${leave.act.taskDefKey eq 'apply_end'}">
				<input id="btnSubmit" class="btn btn-primary" type="submit" value="兑 现" onclick="$('#flag').val('yes')"/>&nbsp;
			</c:if>
			<c:if test="${leave.act.taskDefKey ne 'apply_end'}">
				<input id="btnSubmit" class="btn btn-primary" type="submit" value="同 意" onclick="$('#flag').val('yes')"/>&nbsp;
				<input id="btnSubmit" class="btn btn-inverse" type="submit" value="驳 回" onclick="$('#flag').val('no')"/>&nbsp;
			</c:if>
		</shiro:hasPermission>
		<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
	</div>
	<act:histoicFlow procInsId="${leave.act.procInsId}"/>
</form:form>
</body>
</html>