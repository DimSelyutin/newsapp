<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


	<div class="menu-wrapper">
		<div class="menu-title-wrapper">
			<div class="menu-title">
				Categories
			</div>
		</div>

		<div class="list-menu-invisible-wrapper">
			<div class="list-menu-wrapper">
				<ul class="list-menu">
					<c:forEach var="category" items="${sessionScope.listCategory}">
						<li class="list-menu-зщште">
							<a href="">
								<c:out value="${category.nameCategory}"/>
							</a>
						</li>
					</c:forEach>
				</ul>
			</div>
			<div class="clear"></div>
		</div>
		<!--  grey free space at the bottom of menu -->
	</div>