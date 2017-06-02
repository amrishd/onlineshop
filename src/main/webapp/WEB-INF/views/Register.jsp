
<%@include file="adminheader.jsp"%>


<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="container">
<form:form class="jumbotron" action="AddUser" method="POST" commandName="user">
		<div class="row" style="padding-bottom: 5px">
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="user_name">UserName: </form:label>
					<form:input path="user_name" class="form-control disabledfield" placeholder="Enter User name" required="required"></form:input>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="user_lastname">UserLastname: </form:label>
					<form:input path="user_lastname" class="form-control disabledfield"  placeholder="Enter Lastname" required="required"></form:input>
				</div>
			</div> 
	  </div>
	<div class="row" style="padding-bottom: 5px">
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="username">User_Name: </form:label>
					<form:input path="username" class="form-control disabledfield" placeholder="Enter City " required="required"></form:input>
				</div>
			</div>
	</div>	
	<div class="row" style="padding-bottom: 5px">
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="user_emailid"> EmailId: </form:label>
					<form:input path="user_emailid" class="form-control disabledfield" placeholder="Enter email id " required="required"></form:input>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="user_password"> Password: </form:label>
					<form:input path="user_password" class="form-control disabledfield" placeholder="Enter Password " required="required"></form:input>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="user_confirmpassword">Confirm Password: </form:label>
					<form:input path="user_confirmpassword" class="form-control disabledfield" placeholder="Enter Confirm password " required="required"></form:input>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="user_contactno">ContactNumber: </form:label>
					<form:input path="user_contactno" class="form-control disabledfield" placeholder="Enter Contact Number" required="required"></form:input>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="user_address"> Address: </form:label>
					<form:input path="user_address" class="form-control disabledfield" placeholder="Enter Address " required="required"></form:input>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="user_city"> City: </form:label>
					<form:input path="user_city" class="form-control disabledfield" placeholder="Enter City " required="required"></form:input>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="user_pincode"> Pincode: </form:label>
					<form:input path="user_pincode" class="form-control disabledfield" placeholder="Enter Pincode" required="required"></form:input>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="user_gender"> Gender: </form:label>
					<form:input path="user_gender" class="form-control disabledfield" placeholder="Enter Gender" required="required"></form:input>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="user_dob"> DateOfBirth: </form:label>
					<form:input path="user_dob" class="form-control disabledfield" placeholder="Enter DOB" required="required"></form:input>
				</div>
			</div>
		</div>
	<div class="row" style="padding-bottom: 5px">
			<div class="col-sm-4 col-sm-offset-4">
			<input type="submit" class="btn btn-primary btn-block" value="AddUser"/>
			</div>
   </div>
</form:form>

<%@include file="adminfooter.jsp" %>