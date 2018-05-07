<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: liuxiaodong
  Date: 2018/5/4
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script>
    function kk(){
        var handleEl = document.getElementById("kkHandler");
        var els = document.getElementsByName("kk");
        for(i=0;i<els.length;i++){
            els[i].checked = handleEl.checked;
        }

    }
</script>
<input type=checkbox onclick="kk()" name="kkHandler">全选<br>
<input type=checkbox name="kk">
<input type=checkbox name="kk">
<form name="form" ID="Form1" action="${ctx}/testCase/getUsers" method="post">
    <input type="checkbox" name="id" value="" ID="Checkbox1">1
    <input type="checkbox" name="id" value="" ID="Checkbox2">2

    <div id="userRange" style="width:30%;height: 30%; position: absolute;left:20%;top: 10%;overflow: auto;">
        <c:forEach items="${users}" var="user">
            <input type="checkbox" name="atiUserId" value="${user.atiUserId}">${user.name}<br/>
        </c:forEach>
        <input type="checkbox" name="chose" value="" onclick="selectAll()" ID="Checkbox3">allselect
    </div>

    <input type="submit" />

</form>
<script>
    function selectAll()
    {
        if(!document.form.atiUserId.length){
            if(document.form.chose.checked){
                document.form.atiUserId.checked=true;
            }
            else{
                document.form.atiUserId.checked=false;
            }
        }
        else{
            for(var i=0;i<document.form.atiUserId.length;i++){
                if(document.form.chose.checked){
                    document.form.atiUserId[i].checked=true;
                }
                else{
                    document.form.atiUserId[i].checked=false;
                }
            }
        }
    }
</script>
</body>
</html>
