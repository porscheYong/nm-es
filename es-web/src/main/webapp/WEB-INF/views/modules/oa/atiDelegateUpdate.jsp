<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>代理设置</title>
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

            <%--时间控件上添加默认时间为当前 --%>
            var today=new Date();
            var currentTime=today.getFullYear()+'-'+(today.getMonth()+1)+'-'+today.getDate()+' '+today.getHours()+":"+today.getMinutes()+":"+today.getSeconds();
            $("#startTime").attr('value',currentTime);
            $("#endTime").attr('value',currentTime);
        });


		<%--$.ajax({--%>
			<%--"url":"${ctx}/oa/delegate/getProcDefIdList",--%>
			<%--"type":"GET",--%>
			<%--"dataType":"json",--%>
			<%--"success":function (obj) {--%>
                <%--$("#delegate_activities").empty();--%>
                <%--var options;--%>
                <%--for(var i=0;i<obj.data.length;i++){--%>
                   <%--options = "<option value=" + obj.data[i].ID_ + ">" + obj.data[i].NAME_ + "</option>";--%>
                    <%--console.log(obj.data[i].ID_ + "  " + obj.data[i].NAME_);--%>
                    <%--$("#delegate_activities").append(options);--%>
                <%--}--%>
            <%--}--%>
		<%--});--%>


	</script>
</head>
<body>

<form:form id="delegateForm" modelAttribute="delegateInfo" action="${ctx}/oa/delegate/modifyDelegateInfo?atiDelegateInfoId=${delegateInfo.atiDelegateInfoId}" method="post" class="form-horizontal">
	<sys:message content="${message}"/>
	<fieldset>
		<legend>
			代理设置
		</legend>
		<table class="table-form">
			<tr>
				<td class="tit">委托人</td><td>
				<%--<sys:treeselect id="assign" name="assignee" value="${delegateInfo.assignee}" labelName="user.name" labelValue="${name}"--%>
								<%--title="用户" url="/sys/office/treeData?type=3" cssClass="required recipient" cssStyle="width:150px"--%>
								<%--allowClear="true" notAllowSelectParent="true" smallBtn="false"/>--%>
				<form:input path="assignee"></form:input>
			</td>
			</tr>
			<tr>
				<td class="tit">代理人</td><td>
				<%--<sys:treeselect id="attorney" name="attorney" value="${sys_user.id}" labelName="user.name" labelValue="${sys_user.name}"--%>
								<%--title="用户" url="/sys/office/treeData?type=3" cssClass="required recipient" cssStyle="width:150px"--%>
								<%--allowClear="true" notAllowSelectParent="true" smallBtn="false"/>--%>
				<form:input path="attorney"></form:input>
			</td>
			</tr>
			<tr>
				<td class="tit">生效时间</td>
				<td>
					<div class="control-label">
						<input id="startTime" name="startTime" type="text" readonly="readonly" maxlength="20" class="Wdate required" value=""
							   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false,maxDate:endTime.value});"/>

					</div>
				</td>
			</tr>
			<tr>
				<td class="tit">终止时间</td>
				<td>
					<div class="control-label">
						<input id="endTime" name="endTime" type="text" readonly="readonly" maxlength="20" class="Wdate required"
							   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false,minDate:startTime.value});"/>
					</div>
				</td>
			</tr>
			<tr>
				<td class="tit">代理流程</td>
				<td colspan="5">
					<%--<div>--%>
						<%--<form:select path="procDefId" class="input-medium">--%>
							<%--<form:option value="" label="全部流程"/>--%>
							<%--<form:options items="${fns:getDictList('act_type')}" itemLabel="label" itemValue="value" htmlEscape="false"/>--%>
						<%--</form:select>--%>
					<%--</div>--%>
					<%--<sys:treeselect id="delegateProcDefId" name="procDefId" value="" labelName="" labelValue=""--%>
									<%--title="delegateProcDefId" url="${ctx}/oa/delegate/getProcDefIdList"></sys:treeselect>--%>
						<select id="delegate_activities" name="process_definition_id" class="control-label">
							<option value="0">全部流程</option>
							<option value="leave:22:de13aa0cb04d4c9d97d51d386486775b">请假流程</option>
							<option value="test_audit:5:9547c30464054e7d935b17991e415aad">调薪流程</option>
						</select>
				</td>
			</tr>
			<tr>
				<td class="tit" rowspan="3">代理原因</td>
				<td colspan="5">
					<form:textarea path="delegateReason" class="required" rows="5" maxlength="200" cssStyle="width:500px"/>
					<%--<textarea  name="reason" maxlength="200" ></textarea>--%>
				</td>
			</tr>
		</table>
	</fieldset>
	<div class="form-actions">
		<c:if test="${ati_delegate_info_id == null}">
			<input id="btnSave" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;
		</c:if>
		<c:if test="${ati_delegate_info_id != null}">
			<input id="btnUpdate" class="btn btn-primary" type="submit" value="更 新"/>&nbsp;
		</c:if>
		<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
	</div>
</form:form>
</body>
</html>
