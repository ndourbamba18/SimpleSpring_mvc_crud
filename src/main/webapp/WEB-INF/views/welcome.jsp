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
		<div class="rows mt-5">
		   <div class="col-md-6 m-auto mt-5">
		       <div class="jumbotron">
				   <div class="card">
				     <div class="card-body">
				        <div align="center" class="mt-4">
				          <h1>Welcome ${ username }</h1>
						  <p>
						    It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.
						  </p>
				         </div>
				     </div>
				   </div>
		       </div>
		       <div align="left" class="">
	               <a href="/home" class="btn btn-info"><span>Go To Home</span></a>
	               <a href="/logout" class="btn btn-danger"><span>Log Out</span></a>
               </div>
		    </div>
		</div>
		
	</div>
</section>

<%@ include file="../common/footer.jsp.jspf" %>