<%@include file="../common/header.jsp.jspf"%>  

<%@include file="../common/navBar.jsp.jspf"%>

<style>
body{

    background-color: #f7f7ff;
    margin-top:0px;
}
.radius-15 {
    border-radius: 15px;
}
.card {
    position: relative;
    display: flex;
    flex-direction: column;
    min-width: 0;
    word-wrap: break-word;
    background-color: #fff;
    background-clip: border-box;
    border: 0px solid rgba(0, 0, 0, 0);
    border-radius: .25rem;
    margin-bottom: 1.5rem;
    box-shadow: 0 2px 6px 0 rgb(218 218 253 / 65%), 0 2px 6px 0 rgb(206 206 238 / 54%);
}

element.style {
}
.list-inline-item:not(:last-child) {
    margin-right: .5rem;
}
.contacts-social a {
    font-size: 16px;
    width: 36px;
    height: 36px;
    line-height: 36px;
    background: #ffffff;
    border: 1px solid #eeecec;
    text-align: center;
    border-radius: 50%;
    color: #2b2a2a;
}
.bg-facebook {
    background-color: #3b5998!important;
}
.bg-twitter {
    background-color: #55acee!important;
}
.bg-linkedin {
    background-color: #0976b4!important;
}
</style>

<section>
	<div class="container">
		<div align="center" class="mt-4">
		          <h1>Meet our experts</h1>
				  <p>
				    It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.
				  </p>
		</div>
		 <div align="right" class="">
               <a href="/newEmployeeForm" class="btn btn-info"><i class="material-icons">&#xE147;</i> <span>Add New Employee</span></a>
               <a href="/deleteAllEmployees" onclick="return confirm('Are you sure ?')" class="btn btn-danger"><i class="material-icons">&#xE15C;</i> <span>Delete All</span></a>
        </div>
		<div class="row row-cols-1 row-cols-lg-2 row-cols-xl-4 mt-5 mb-5">
		    <c:forEach items="${employees }" var="employee">
					<div class="col">
						<div class="card radius-15">
							<div class="card-body text-center">
								<div class="p-4 border radius-15">
									<img style="cursor: pointer;" src="${ employee.imageUrl }" title="${ employee.firstName } ${ employee.lastName }" width="110" height="110" class="rounded-circle shadow" alt="">
									<h5 class="mb-0 mt-5">${ employee.lastName } ${ employee.firstName }</h5>
									<p class="mb-3">${ employee.jobTitle }</p>
									<div class="list-inline contacts-social mt-3 mb-3"> <a href="javascript:;" class="list-inline-item bg-facebook text-white border-0"><i class="bx bxl-facebook"></i></a>
										<a href="javascript:;" class="list-inline-item bg-twitter text-white border-0"><i class="bx bxl-twitter"></i></a>
										<a href="javascript:;" class="list-inline-item bg-linkedin text-white border-0"><i class="bx bxl-linkedin"></i></a>
									</div>
									<div class="d-grid"> <a href="/detailEmployee?id=${ employee.id }" class="btn btn-outline-info radius-15">Detail</a>
									</div>
								</div>
							</div>
						</div>
					</div>
			</c:forEach>
		</div>
	</div>
</section>

<%@ include file="../common/footer.jsp.jspf" %>