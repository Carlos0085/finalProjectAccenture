<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<nav class="navbar navbar-default">
		<div class="container-fluid">
		
			<div class="navbar-header">
      			<a class="navbar-brand" href="<spring:url value="/"/>">Final Project</a>
    		</div>
    		
    		<ul class="nav navbar-nav">
    		
    			<li><a href="<spring:url value="/"/>">Hello User</a></li>
    		
    			<li class="dropdown">
          			
          			<a href="#" class="dropdown-toggle" 
          				data-toggle="dropdown" role="button" 
          				aria-expanded="false">Users <span class="caret"></span></a>
          	
          			<ul class="dropdown-menu" role="menu">
          				<li><a href="<spring:url value="/Users/"/>">All Users</a></li>
            			<li><a href="<spring:url value="/Users/Add"/>">Add User</a></li>
          			</ul>
          			
        		</li>
        		
        		
    		</ul>
    		
		</div>
</nav>