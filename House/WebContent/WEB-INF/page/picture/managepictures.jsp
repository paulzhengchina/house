<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>后台管理</title>
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


	<div id="header">
		<h1>
			<a href="./dashboard.html">后台管理</a>
		</h1>
	</div>

	<div id="sidebar">
		<a href="#" class="visible-phone"><i class="icon icon-home"></i>
			暂无</a>
		<ul>
			<li><a href="#"><i class="icon icon-home"></i> <span>欢迎</span></a></li>
			<li class="submenu"><a href="#"><i class="icon icon-th-list"></i>
					<span>类型设置</span> <span class="label">2</span></a>
				<ul>
					<li><a
						href="${pageContext.request.contextPath}/type/showAllTypes.action">类型列表</a></li>
					<li><a
						href="${pageContext.request.contextPath}/type/showAddType.action">新增类型</a></li>
				</ul></li>
			<li class="submenu active open"><a href="#"><i
					class="icon icon-th-list"></i> <span>楼盘信息管理</span> <span
					class="label">2</span></a>
				<ul>
					<li class="active"><a
						href="${pageContext.request.contextPath}/house/showAllHouses.action">楼盘列表</a></li>
					<li><a
						href="${pageContext.request.contextPath}/house/showAddHouse.action">新增楼盘</a></li>
				</ul></li>
			<li class="submenu"><a href="#"><i class="icon icon-file"></i>
					<span>公共资源管理管理</span> <span class="label">2</span></a>
				<ul>
					<li><a href="invoice.html">公共资源列表</a></li>
					<li><a href="chat.html">新增公共资源</a></li>
				</ul></li>
			<li><a href="${pageContext.request.contextPath}"><i
					class="icon icon-home"></i> <span>返回首页</span></a></li>

		</ul>

	</div>


	<div id="content">
		<div id="content-header">
			<h1>后台管理</h1>

		</div>
		<div id="breadcrumb">
			<a href="#" title="Go to Home" class="tip-bottom"><i
				class="icon-home"></i> 后台管理</a> <a href="#" class="tip-bottom">楼盘信息管理</a>
			<a href="#" class="current">图片管理</a>
		</div>
		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span12">
					<div class="widget-box">
						<div class="widget-title">
							<span class="icon"> <i class="icon-th"></i>
							</span>
							<h5>图片列表</h5>
							<span class="label label-info"><a href="#addPicture"
								data-toggle="modal">上传图片</a></span>
							<div id="addPicture" class="modal hide">
								<div class="modal-header">
									<button data-dismiss="modal" class="close" type="button">×</button>
									<h3>上传图片</h3>
								</div>
								<div class="modal-body">
									<s:form name="savePicture" action="savePicture" method="POST"
										theme="bootstrap" enctype="multipart/form-data"
										cssClass="form-horizontal">
										<s:hidden name="picture.ownerId" value="%{ownerId}"></s:hidden>
										<s:file label="上传图片" name="image" />
										<s:textarea label="图片介绍" name="picture.description" />
										<s:submit cssClass="btn btn-primary"></s:submit>
									</s:form>
								</div>
							</div>
							<div class="widget-content">
								<table class="table table-bordered table-striped with-check">
									<thead>
										<tr>
											<th><div class="checker"
													id="uniform-title-table-checkbox">
													<span><input type="checkbox"
														id="title-table-checkbox" name="title-table-checkbox"
														style="opacity: 0;"></span>
												</div></th>
											<th>图片</th>
											<th>描述</th>
											<th>维护</th>
										</tr>
									</thead>
									<tbody>
										<s:iterator value="pictures" var="pic">

											<tr>

												<td><div class="checker" id="uniform-undefined">
														<span><input type="checkbox" style="opacity: 0;"></span>
													</div></td>
												<td><img
													src="${pageContext.request.contextPath}/<s:property value='path'/>"
													class="img-rounded" width="150" /></td>
												<td><s:property value="description" /></td>
												<td></td>
											</tr>
										</s:iterator>

									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
				<div class="row-fluid">
					<div id="footer" class="span12">
						2013 &copy; 创展科技</a>
					</div>
				</div>
			</div>
		</div>


		<script src="${pageContext.request.contextPath}/js/excanvas.min.js"></script>
		<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
		<script
			src="${pageContext.request.contextPath}/js/jquery.ui.custom.js"></script>
		<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
		<script src="${pageContext.request.contextPath}/js/jquery.flot.min.js"></script>
		<script
			src="${pageContext.request.contextPath}/js/jquery.flot.resize.min.js"></script>
		<script
			src="${pageContext.request.contextPath}/js/jquery.peity.min.js"></script>
		<script
			src="${pageContext.request.contextPath}/js/fullcalendar.min.js"></script>
		<script src="${pageContext.request.contextPath}/js/unicorn.js"></script>
		<script src="${pageContext.request.contextPath}/js/jquery.uniform.js"></script>
		<script type="text/javascript">
	            $(document).ready(function(){          	         	
	            	$('input[type=checkbox]').uniform();
	            	$('input[type=file]').uniform();
	            });
            </script>
</body>
</html>

