<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


	<div class="menu-wrapper">
		<div class="menu-title-wrapper">
			<div class="menu-title">
				Categories
			</div>
		</div>

		<div class="list-menu-invisible-wrapper">
			<div class="list-menu-wrapper" style="float: right;">
				<ul style="list-style-image: url(images/img.jpg); text-align: left;">
					<c:forEach var="category" items="${sessionScope.listCategory}">
						<li style="padding-left: 15px;">
							<a href="">
								<c:out value="${category.nameCategory}"/>
							</a>
						</li>
					</c:forEach>

						<c:if test="${sessionScope.role eq 'admin'}">
							<li style="padding-left: 15px;">

								<a href="">add news </a>

								
							</li>
						</c:if>
				</ul>
			</div>
			<div class="clear"></div>
		</div>
		<!--  grey free space at the bottom of menu -->
		<div style="height: 25px;"></div>
	</div>