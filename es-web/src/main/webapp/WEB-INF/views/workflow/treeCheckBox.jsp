<%--
  Created by IntelliJ IDEA.
  User: liuxiaodong
  Date: 2018/5/3
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>CheckBox Tree - jQuery EasyUI Demo</title>
    <link rel="stylesheet" type="text/css" href="../../themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../../themes/icon.css">
    <link rel="stylesheet" type="text/css" href="../demo.css">
    <script type="text/javascript" src="../../jquery.min.js"></script>
    <script type="text/javascript" src="../../jquery.easyui.min.js"></script>
</head>
<body>
<h2>CheckBox Tree</h2>
<p>Tree nodes with check boxes.</p>
<div style="margin:20px 0;">
    <a href="#" class="easyui-linkbutton" onclick="getChecked()">GetChecked</a>
</div>
<div style="margin:10px 0">
    <input type="checkbox" checked onchange="$('#tt').tree({cascadeCheck:$(this).is(':checked')})">CascadeCheck
    <input type="checkbox" onchange="$('#tt').tree({onlyLeafCheck:$(this).is(':checked')})">OnlyLeafCheck
</div>
<div class="easyui-panel" style="padding:5px">
    <ul id="tt" class="easyui-tree" data-options="url:'tree_data1.json',method:'get',animate:true,checkbox:true"></ul>
</div>
<script type="text/javascript">
    function getChecked(){
        var nodes = $('#tt').tree('getChecked');
        var s = '';
        for(var i=0; i<nodes.length; i++){
            if (s != '') s += ',';
            s += nodes[i].text;
        }
        alert(s);
    }
</script>
<script src="src/jquery.js" type="text/javascript"></script>
<script src="src/Plugins/jquery.tree.js" type="text/javascript"></script>
<script src="data/tree1.js" type="text/javascript"></script>
<script type="text/javascript">
    var userAgent = window.navigator.userAgent.toLowerCase();
    $.browser.msie8 = $.browser.msie && /msie 8\.0/i.test(userAgent);
    $.browser.msie7 = $.browser.msie && /msie 7\.0/i.test(userAgent);
    $.browser.msie6 = !$.browser.msie8 && !$.browser.msie7 && $.browser.msie && /msie 6\.0/i.test(userAgent);
    function load() {
        var o = { showcheck: true
            //onnodeclick:function(item){alert(item.text);},
        };
        o.data = treedata;
        $("#tree").treeview(o);
        $("#showchecked").click(function(e){
            var s=$("#tree").getCheckedNodes();
            if(s !=null)
                alert(s.join(","));
            else
                alert("NULL");
        });
        $("#showcurrent").click(function(e){
            var s=$("#tree").getCurrentNode();
            if(s !=null)
                alert(s.text);
            else
                alert("NULL");
        });
    }
    if( $.browser.msie6)
    {
        load();
    }
    else{
        $(document).ready(load);
    }
</script>
</body>
</html>
