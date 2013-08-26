<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>添加楼盘信息</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
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
			<a class="brand" href="#">首页</a>
			<ul class="nav nav-pills">
				<li class="active"><a href="house/showAllHouses.action">楼盘信息管理</a></li>
				<li ><a href="house/showAddHouse.action">添加楼盘信息管理</a></li>
			</ul>
		</div>
	</div>

	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span12">
				<div class="widget-box">
					<div class="widget-title">
						<span class="icon"> <i class="icon-align-justify"></i>
						</span>
						<h5>添加楼盘信息</h5>
					</div>
					<div class="widget-content nopadding">
						<s:form name="saveHouse" action="saveHouse" method="POST" theme="bootstrap" enctype="multipart/form-data" cssClass="form-horizontal" >

						<s:textfield  label="楼盘名称"  name="house.name"/>
						<s:textfield  label="楼盘地址"  name="house.address"/>
						<s:textfield  label="楼盘均价"  name="house.average_price"/>
						<s:file label="上传Logo" name="logo" />
						<s:file label="上传概览图" name="over_view" />
						<s:submit cssClass="btn btn-primary"></s:submit>
						</s:form>
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
