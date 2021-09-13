<%@include file="../common/header.jsp.jspf"%>  

<%@include file="../common/navBar.jsp.jspf"%>

<style>
    body {
            color: #566787;
            background: #f5f5f5;
            font-family: 'Varela Round', sans-serif;
            font-size: 13px;
        }
</style>

<section>
	<div class="container">
		<div align="center" class="mt-4 mb-4">
		          <h1>Edit Employee ${ employee.firstName } ${ employee.lastName }</h1>
				 
		</div>
		<div class="col-md-8 m-auto">
		   <div class="card">
			   <div class="card-body">
			        <form:form class="row g-3" method="post" action="/save-update-employee" modelAttribute="employee">
			            <div class="col-md-6 mt-2">
							<form:label path="firstName" >First Name</form:label>
							<form:input path="firstName"  class="form-control" />
					    </div> 
					    <div class="col-md-6 mt-2">
							<form:label path="lastName" class="form-label">Last Name</form:label>
							<form:input path="lastName" class="form-control" />
					    </div>
					    <div class="col-md-6 mt-2">
							<form:label path="email" class="form-label">E-MAIL</form:label>
							<form:input path="email" class="form-control" />
					    </div>
					    <div class="col-md-6 mt-2">
							<form:label path="phoneNumber" class="form-label">Phone Number</form:label>
							<form:input path="phoneNumber" class="form-control" />
					    </div>
					    <div class="col-12 mt-2">
							<form:label path="address" class="form-label">Address</form:label>
							<form:input path="address" class="form-control" />
					    </div>
					    <div class="col-md-6 mt-2">
							<form:label path="jobTitle" class="form-label">Job Title</form:label>
							<form:input path="jobTitle" class="form-control" />
					    </div>
					    <div class="col-12 mt-2">
							<form:label path="imageUrl" class="form-label">Image Url</form:label>
							<form:input path="imageUrl" class="form-control" />
					    </div>
					    <fieldset class="col-12 mt-2">
							<legend class="col-form-label col-sm-2 pt-0">Gender</legend>
							<div class="col-sm-10">
								 <div class="form-check">
								     <form:radiobutton path="gender" class="form-check-input" value="Female" />
								     <form:label class="form-check-label" path="gender">
								          Female
								     </form:label>
								 </div>
								 <div class="form-check">
								     <form:radiobutton path="gender" class="form-check-input" value="Male" />
								     <form:label class="form-check-label" path="gender">
								          Male
								     </form:label>
								 </div>
							  </div>
                         </fieldset>
                         <div class="col-md-6 mt-2">
						    <div class="form-check">
						      <form:checkbox class="form-check-input" path="married" />
						      <form:label class="form-check-label" path="married">
						        Married?
						      </form:label>
						    </div>
						  </div>
						  <div class="col-12 mt-2">
						      <form:label path="description"> Your Description</form:label>
						      <form:textarea class="form-control" path="description" />
						  </div>  
			            <div class="col-12 mt-3">
			               <button onclick="return confirm('Are you sure!')" type="submit" class="btn btn-success">Save Change</button>
			            </div>
			        </form:form>
			   </div>
		   </div>
		   <div class="mt-3">
		      <a href="/home" class="btn btn-info ">Back To Home</a>
		   </div>
		</div>
	</div>
</section>

<%@ include file="../common/footer.jsp.jspf" %>