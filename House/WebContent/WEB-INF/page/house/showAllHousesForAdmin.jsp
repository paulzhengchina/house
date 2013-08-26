<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html lang="ch">
<head>
<meta charset="UTF-8">
<title>高邮房产网</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Bootstrap -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap-responsive.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/colorpicker.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/datepicker.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/uniform.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/select2.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/unicorn.main.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/unicorn.grey.css"
	class="skin-color" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>
	<div class="navbar">	
		<div class="navbar-inner">
			<a class="brand" href="/">首页</a>
			<ul class="nav nav-pills">
				<li class="active"><a href="house/showAllHouses.action">楼盘信息管理</a></li>
				<li ><a href="showAddHouse.action">添加楼盘信息管理</a></li>
			</ul>
		</div>
	</div>
	<div class="content">
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span12">
				<div class="widget-box">
							<div class="widget-title">
								<span class="icon">
									<i class="icon-th"></i>
								</span>
								<h5>楼盘列表</h5>
								<span class="label label-info"></span>
							</div>
							<div class="widget-content">
								<table class="table table-bordered table-striped with-check">
									<thead>
										<tr>
											<th><div class="checker" id="uniform-title-table-checkbox"><span><input type="checkbox" id="title-table-checkbox" name="title-table-checkbox" style="opacity: 0;"></span></div></th>
											<th>名称</th>
											<th>位置</th>
											<th>均价</th>
										</tr>
									</thead>
									<tbody>
									    <s:iterator value="houses" var="house">
									  		<tr>
												<td><div class="checker" id="uniform-undefined"><span><input type="checkbox" style="opacity: 0;"></span></div></td>
												<td><s:property value="name"/></td>
												<td><s:property value="address"/></td>
												<td><s:property value="average_price"/></td>
										</tr>
		                                </s:iterator>
										
									</tbody>
								</table>							
							</div>
						</div>
						</div>
			</div>


			<div class="row-fluid">	
				<div id="footer" class="span12">2013 &copy; 创展科技</div>
			</div>
		</div>
	</div>

	<script
		src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
            <script
		src="${pageContext.request.contextPath}/js/jquery.ui.custom.js"></script>
            <script
		src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
            <script
		src="${pageContext.request.contextPath}/js/bootstrap-colorpicker.js"></script>
            <script
		src="${pageContext.request.contextPath}/js/bootstrap-datepicker.js"></script>
            <script
		src="${pageContext.request.contextPath}/js/jquery.uniform.js"></script>
            <script
		src="${pageContext.request.contextPath}/js/select2.min.js"></script>
            <script
		src="${pageContext.request.contextPath}/js/unicorn.js"></script>
            <script
		src="${pageContext.request.contextPath}/js/unicorn.form_common.js"></script>
	</body>
</html>
