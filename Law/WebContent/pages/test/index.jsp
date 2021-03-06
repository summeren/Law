<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!doctype html>
<head>
<meta charset="utf-8">
<title>法務文管系統</title>
<link rel="stylesheet" href="js/jquery-ui.css">
<link rel="stylesheet" href="js/themes/default/style.min.css" />

<style>

#tabs {
	margin-top: 0.1em;
}

#tabs li .ui-icon-close {
	float: left;
	margin: 0.4em 0.2em 0 0;
	cursor: pointer;
}

#add_tab {
	cursor: pointer;
}
</style>

<script type="text/javascript" src="js/external/jquery/jquery.js"></script>
<script type="text/javascript" src="js/stable/jquery.layout.js"></script>
<script src="js/jquery-ui.js"></script>
<link href="js/jquery.dataTables.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery.dataTables.min.js"></script>
<!-- Add By Jia 2017-02-10 jstree plugin -->
<script src="js/jstree.min.js"></script>

<!-- Add By Jia 2017-03-07 js commons add -->
<script type="text/javascript" src="commons/regex.js"></script>

<script>
	$(document).ready(function() {
		
						var tabcount = 0;
						
						var tabs = $("#tabs").tabs();

						// Actual addTab function: adds new tab using the input from the form above
						function addTab(menuid) {
							
							tabcount ++ ;
							//TODO add by Jia 2017-02-13 用menuid帶出頁面index (去找L_SYS_FUNCTION)
							var tabTitle = "表單設定";
							var tabHref = menuid;
							var tabId = "tabs-" + menuid;
							
							var tabTemplate = "<li><a href='/Law/pages/" + tabHref + "'>#{label}</a> <span class='ui-icon ui-icon-close' role='presentation'>Remove Tab</span></li>"
							
							var label = tabTitle , id = tabId, li = $(tabTemplate.replace(/#\{href\}/g, "#" + id).replace(/#\{label\}/g, label));

							tabs.find(".ui-tabs-nav").append(li);
							tabs.tabs("refresh");
							tabs.tabs({ active: tabcount	});
						}

						// Close icon: removing the tab on click
						tabs.on("click", "span.ui-icon-close", function() {
							var panelId = $(this).closest("li").remove().attr(
									"aria-controls");
							$("#" + panelId).remove();
							tabcount--;
						});

						tabs.on("keyup",
										function(event) {
											if (event.altKey
													&& event.keyCode === $.ui.keyCode.BACKSPACE) {
												var panelId = tabs.find(
														".ui-tabs-active")
														.remove()
														.attr("aria-controls");
												$("#" + panelId).remove();
											}
										});

						$("body").layout({
							applyDemoStyles : true,
							south__initClosed : true,
							north__initClosed : true,
							east__initClosed : true
						});
						
						
						/**
						add by Jia 2017-02-10
						以下為左方Menu實作	
					 	**/
						$('#menu').on("changed.jstree", function (e, data) {
								if(data.selected.length) {
									//$('#tabs-center').tabs("option", "active", $(this).data("tab-index"));
									//alert('The selected node is: ' + data.instance.get_node(data.selected[0]).text);
									//需實作點選打開子頁簽方式
									var menuId = "test01";//TODO Add by Jia 2017-02-13 之後要用Ajax抓出來
									menuId = data.instance.get_node(data.selected[0]).id;
									addTab(menuId);
								}
							})
							.jstree({
								'core' : {
									'multiple' : false,
									'data' : [
										//TODO 這裡之後需要改成系統管理權限，可以新增和設定功能
										{ "text" : "系統管理", "children" : [
												{ "text" : "部門設定", "id" : 1 },
												{ "text" : "使用者設定","id" : 'user.jsp' }
										],"state" : { "opened" : true }},
										{ "text" : "表單流程", "children" : [
											{ "text" : "表單設定", "id" : 'cek/form.jsp' },
											{ "text" : "欄位設定", "id" : 'cek/column.jsp' },
											{ "text" : "流程設定", "id" : 'cek/flow.jsp' },
											{ "text" : "表單申請", "id" : 3 , "children" : [
												{ "text" : "請假單申請", "id" : 'useform.jsp' },
												{ "text" : "表單測試", "id" : 'test/refresh.jsp' }
										],"state" : { "opened" : false }}
									],"state" : { "opened" : true }}
									]
								}
							});
						
					});

	$(function () {
		$("div.tabs a").click(function () {
			alert();
			//$(".litab").hide(); //隐藏所有
		});
		}); 
	
</script>
</head>
<body>

	<div class="ui-layout-center">
		<div id="tabs"  class="tabs">
			<ul class="list-side">
				<li>
					<a href="#tabs-1">Nunc tincidunt</a> 
					<span	class="ui-icon ui-icon-close" role="presentation">Remove Tab</span>
				</li>
					<!--  <li><a href="#tab-3">Google Tab</a></li>-->
				<!--  <li class="litab">
					<a href="#aaaa" target="_blank" >UCAMC</a>
				</li>-->
			</ul>
			<!-- 這裡可以做個首頁來放 -->
			<div id="tabs-1">
				<p>Proin elit arcu, rutrum commodo, vehicula tempus, commodo a,
					risus. Curabitur nec arcu. Donec sollicitudin mi sit amet mauris.
					Nam elementum quam ullamcorper ante. Etiam aliquet massa et lorem.
					Mauris dapibus lacus auctor risus. Aenean tempor ullamcorper leo.
					Vivamus sed magna quis ligula eleifend adipiscing. Duis orci.
					Aliquam sodales tortor vitae ipsum. Aliquam nulla. Duis aliquam
					molestie erat. Ut et mauris vel pede varius sollicitudin. Sed ut
					dolor nec orci tincidunt interdum. Phasellus ipsum. Nunc tristique
					tempus lectus.</p>
			</div>
			<!-- <div id ="aaaa">
				<a href="/Law/pages/cek/form.jsp" target="_blank" >UCAMC</a>
			</div> -->
			<!--  <div id="tab-3">
    			<iframe src="http://www.google.com"></iframe>
			</div>
			-->
		</div>

	</div>
	<div class="ui-layout-north">
		<!--  <button id="add_tab">Add Tab</button>-->
	</div>
	<div class="ui-layout-south">South</div>
	<div class="ui-layout-east">East</div>
	<div class="ui-layout-west">
				<!-- TODO 這裡還沒寫好，之後要從DB撈出功能列，目前先暫時直接寫死-->
				<div id="menu">	</div>
	</div>

	<!-- add by Jia 先定義div，這裡要放的是通用格式的左右移動SelectedBox -->
	<div id="divSelectedBox"></div>
</body>
</html>