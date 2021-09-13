<%@include file="../common/header.jsp.jspf"%>  

<%@include file="../common/navBar.jsp.jspf"%>

<style type="text/css">
 
        body {
            color: #566787;
            background: #f5f5f5;
            font-family: 'Varela Round', sans-serif;
            font-size: 13px;
        }
</style>

<section>
	<div class="container">
		<div class="rows mb-5">
		   <div class="col-md-8 m-auto">
		        <h4 align="center" class="mt-4 mb-4">Form Employee</h4>
		    <div class="card">
		       <div class="card-body">
		          <form class="row g-3" action="/saveEmployee" method="post">
						  <div class="col-md-6 mt-2">
						    <label for="firstName" class="form-label">First Name</label>
						    <input type="text" class="form-control" id="firstName" name="firstName" value="${ firstName }" autofocus="autofocus" required="required" />
						  </div>
						  <div class="col-md-6 mt-2">
						    <label for="lastName" class="form-label">Last Name</label>
						    <input type="text" class="form-control" id="lastName" name="lastName" value="${ lastName }" required="required" />
						  </div>
						  <div class="col-md-6 mt-2">
						    <label for="email" class="form-label">E-Mail</label>
						    <input type="email" class="form-control" id="email" name="email" value="${ email }" placeholder="exemple@gmail.com" required="required"/>
						  </div>
						  <div class="col-md-6 mt-2">
						    <label for="phoneNumber" class="form-label">Phone Number</label>
						    <input type="text" class="form-control" id="phoneNumber" name="phoneNumber" value="${ phoneNumber }" required="required" />
						  </div>
						  <div class="col-12 mt-2">
						    <label for="address" class="form-label">Address</label>
						    <input type="text" class="form-control" id="address" name="address" value="${ address }" required="required" />
						  </div>
						  <div class="col-md-6 mt-2">
						    <label for="jobTitle" class="form-label">Job Title</label>
						    <input type="text" class="form-control" id="jobTitle" name="jobTitle" value="${jobTitle }" required="required" />
						  </div>
						   <div class="col-12 mt-2">
						    <label for="imageUrl" class="form-label">Image Url</label>
						    <input type="text" class="form-control" id="imageUrl" name="imageUrl" value="${ imageUrl }" placeholder="https://bootdey.com/img/Content/avatar/avatar2.png" required="required" />
						  </div>
						  
				          <fieldset class="col-12 mt-2">
							    <legend class="col-form-label col-sm-2 pt-0">Gender</legend>
							    <div class="col-sm-10">
								      <div class="form-check">
								        <input class="form-check-input" type="radio" name="gender" id="gender" value="Female" checked>
								        <label class="form-check-label" for="gender">
								          Female
								        </label>
								      </div>
								      <div class="form-check">
								        <input class="form-check-input" type="radio" name="gender" id="gender" value="Male">
								        <label class="form-check-label" for="gender">
								          Male
								        </label>
								      </div>
							    </div>
                          </fieldset>
						  <div class="col-12 mt-2">
						    <div class="form-check">
						      <input class="form-check-input" type="checkbox" id="isMarried" name="isMarried">
						      <label class="form-check-label" for="isMarried">
						        Married?
						      </label>
						    </div>
						  </div>
						  <div class="col-12 mt-2">
						      <label for="description"> Your Description</label>
						      <textarea class="form-control" id="description" name="description" placeholder="Enter Your Description Here" rows="4" cols=""></textarea>
						  </div>
						  <div class="col-12 mt-3">
						    <div>
						        <button type="submit" class="btn btn-success">Save Employee</button>
						    </div>
						  </div>
                     </form>
		       </div>
		    </div>
		    <div class="mt-4 mb-4">
		     <a href="/home" class="btn btn-info">Back To Home</a>
		   </div>
		   </div>
		</div>
	</div>
</section>

<%@ include file="../common/footer.jsp.jspf" %>