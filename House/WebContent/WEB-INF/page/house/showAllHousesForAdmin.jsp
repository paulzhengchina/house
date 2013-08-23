<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html lang="ch">
<head>
<meta charset="UTF-8">
<title>高邮房产网</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Bootstrap -->
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet" media="screen">
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
	<div class="container">
		<table class="table table-striped">
			<tboady> <s:iterator value="houses" var="house">
				<tr>
					<s:property value='%{#house.name}' />

				</tr>
			</s:iterator> </tboady>
		</table>

		<hr>
		<footer>
			<p>&copy;创展科技 Company 2013</p>
		</footer>
	</div>

	<script src="http://code.jquery.com/jquery.js"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</body>
</html>