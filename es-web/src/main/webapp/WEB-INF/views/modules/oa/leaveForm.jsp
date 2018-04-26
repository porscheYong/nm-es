	<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>请假管理</title>
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



	<form:form id="inputForm" modelAttribute="leave" action="${ctx}/oa/leave/save" method="post" class="form-horizontal">
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
				<shiro:hasPermission name="oa:leave:edit">请假流程${not empty leave.id?'修改':'申请'}</shiro:hasPermission><shiro:lacksPermission name="oa:leave:edit">查看</shiro:lacksPermission>
			</legend>
			<table class="table-form">
				<tr>
					<td class="tit">申请人</td><td>
					<form:input path="formSender"></form:input>
						<%--<sys:treeselect id="user" name="user.id" value="${leave.formSender}" labelName="user.name" labelValue="${leave.user.name}"--%>
										<%--title="用户" url="/sys/office/treeData?type=3" cssClass="required recipient" cssStyle="width:150px"--%>
										<%--allowClear="true" notAllowSelectParent="true" smallBtn="false"/>--%>
				</td>
				</tr>
				<tr>
					<td class="tit">工单主题 </td>
					<td colspan="5">
						<form:textarea path="formTheme" class="required" cols="200" cssStyle="width:500px" />
					</td>
				</tr>
				<tr>
					<td class="tit">紧急程度</td>
					<td class="tit">
						<div class="control-label">
							<select name="urgent">
								<option value="1">一般</option>
								<option value="2">紧急</option>
							</select>
						</div>
					</td>
				</tr>
				<tr>
					<td class="tit">表单内容 </td>
					<td colspan="5">
						<form:textarea path="formContent" class="required" cols="200" maxlength="200" cssStyle="width:500px"/>
					</td>
				</tr>
			</table>
			<br></br>
			<table class="table-form">
				<tr>
					<td class="tit">请假类型</td>
					<td class="tit">
						<div class="control-label">
							<form:select path="leaveType" >
								<form:options items="${fns:getDictList('oa_leave_type')}" itemLabel="label" itemValue="value" htmlEscape="false" />
							</form:select>
						</div>
					</td>
				</tr>
				<tr>
					<td class="tit">开始时间</td>
					<td>
						<div class="control-label">
							<input id="startTime" name="startTime" type="text" readonly="readonly" maxlength="20" class="Wdate required" value=""
								   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false,maxDate:endTime.value});"/>

						</div>
							<%--</div>--%>
					</td>
				</tr>
				<tr>
					<td class="tit">结束时间</td>
					<td>
						<div class="control-label">
							<input id="endTime" name="endTime" type="text" readonly="readonly" maxlength="20" class="Wdate required"
								   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false,minDate:startTime.value});"/>
						</div>
							<%--</div>--%>
					</td>
				</tr>
				<tr>
					<td class="tit" rowspan="3">请假原因: </td>
					<td colspan="5">
						<form:textarea path="reason" class="required" rows="5" maxlength="200" cssStyle="width:500px"/>
					</td>
				</tr>
			</table>
		</fieldset>
		<div class="form-actions">
			<shiro:hasPermission name="oa:leave:edit">
				<input id="btnSubmit" class="btn btn-primary" type="submit" value="提交申请" onclick="$('#flag').val('yes')"/>&nbsp;
				<c:if test="${not empty leave.id}">
					<input id="btnSubmit2" class="btn btn-inverse" type="submit" value="销毁申请" onclick="$('#flag').val('no')"/>&nbsp;
				</c:if>
			</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
		<c:if test="${not empty leave.id}">
			<act:histoicFlow procInsId="${leave.act.procInsId}" />
		</c:if>
	</form:form>
</body>
</html>
