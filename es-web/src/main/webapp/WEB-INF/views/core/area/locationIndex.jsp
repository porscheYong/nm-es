<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>行政区域管理</title>
	<meta name="decorator" content="default"/>
	<%@include file="/WEB-INF/views/include/treeview.jsp" %>
	<style type="text/css">
		.ztree {overflow:auto;margin:0;_margin-top:10px;padding:10px 0 0 10px;}
	</style>
</head>
<body>
	<sys:message content="${message}"/>
	<div id="content" class="row-fluid">
		<div id="left" class="accordion-group">
			<div class="accordion-heading">
		    	<a class="accordion-toggle">行政区域<i class="icon-refresh pull-right" onclick="refreshTree();"></i></a>
		    </div>
			<div id="ztree" class="ztree"></div>
		</div>
		<div id="openClose" class="close">&nbsp;</div>
		<div id="right">
			<iframe id="officeContent" src="${ctx}/core/location/list?id=&parentIds=" width="100%" height="91%" frameborder="0"></iframe>
		</div>
	</div>
	<script type="text/javascript">

        var zTree ;
        var nodes="";
        var setting = {
            view: {
                showLine: true
            },
            async: {
                enable: true,
                url: "${ctx}/core/location/treeData",//异步加载时的请求地址
                autoParam: ["id"],//提交参数
                contentType : "application/json",
                type: 'get',
                dataType: 'json',
                dataFilter: filter
            },
            data:{
                simpleData:{
                    enable:true,idKey:"id",pIdKey:"pId",rootPId:'1'
                }
            },callback: {
                onAsyncSuccess: zTreeOnAsyncSuccess,
                onClick:onClick
            }
        }

        function filter(treeId, parentNode, childNodes) {
            //console.info("childNodes="+childNodes.length);
            if (!childNodes) return null;
            for (var i=0, l=childNodes.length; i<l; i++) {
                childNodes[i].name = childNodes[i].name.replace(/\.n/g, '.');
            }
            return childNodes;
        }

        function onClick(event, treeId, treeNode){
            var id = treeNode.id == '0' ? '0' :treeNode.id;
            $('#officeContent').attr("src","${ctx}/core/location/list?id="+id);
        }

        $(document).ready(function(){
            zTree= $.fn.zTree.init($("#ztree"), setting);

        });


        function zTreeOnAsyncSuccess(event, treeId, treeNode, msg) {
            if(treeNode==null){
                var zTree = $.fn.zTree.getZTreeObj("ztree");

                nodes = zTree.getNodes();

                for (var i=0, l=nodes.length; i<l; i++) {
                    zTree.expandNode(nodes[i], true, false, false);
                }
                asyncNodes(zTree.getNodes());
                if (!goAsync) {
                    curStatus = "";
                }
            }
            //zTree.updateNode(treeNode);
        }

        function asyncNodes(nodes) {
            if (!nodes) return;
            curStatus = "async";
            var zTree = $.fn.zTree.getZTreeObj("ztree");
            for (var i=0, l=nodes.length; i<l; i++) {
                if (nodes[i].isParent && nodes[i].zAsync) {
                    asyncNodes(nodes[i].children);
                } else {
                    goAsync = true;
                    zTree.reAsyncChildNodes(nodes[i], "refresh", true);
                }
            }
        }


		var leftWidth = 180; // 左侧窗口大小
		var htmlObj = $("html"), mainObj = $("#main");
		var frameObj = $("#left, #openClose, #right, #right iframe");
		function wSize(){
			var strs = getWindowSize().toString().split(",");
			htmlObj.css({"overflow-x":"hidden", "overflow-y":"hidden"});
			mainObj.css("width","auto");
			frameObj.height(strs[0] - 5);
			var leftWidth = ($("#left").width() < 0 ? 0 : $("#left").width());
			$("#right").width($("#content").width()- leftWidth - $("#openClose").width() -5);
			$(".ztree").width(leftWidth - 10).height(frameObj.height() - 46);
		}
	</script>
	<script src="${ctxStatic}/common/wsize.min.js" type="text/javascript"></script>
</body>
</html>