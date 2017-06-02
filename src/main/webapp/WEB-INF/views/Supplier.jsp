
<%@include file="adminheader.jsp"%>

<script>
var supplylist=${Supplierlist}
var app = angular.module('getSupplier', []);
app.controller('getSupplierController', function($scope) 
{
       $scope.supples=supplylist;
   
}
);
</script>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="container">
<c:choose>
<c:when test="${clicktoUpdateSupplier== true}">
<form:form class="jumbotron" action="updateSupplier" method="POST" commandName="ms">
		<div class="row" style="padding-bottom: 5px">
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="supplier_id">SupplierID: </form:label>
					<form:input path="supplier_id" class="form-control disabledfield" readonly="true" placeholder="Enter Supplier ID" required="required"></form:input>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="supplier_name">SupplierName: </form:label>
					<form:input path="supplier_name" class="form-control disabledfield" placeholder="Enter Supplier name" required="required"></form:input>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="mobile_no">MobileNumber: </form:label>
					<form:input path="mobile_no" class="form-control disabledfield"  placeholder="Enter Mobile Number" required="required"></form:input>
				</div>
			</div> 
	  </div>
	<div class="row" style="padding-bottom: 5px">
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="city">CITY: </form:label>
					<form:input path="city" class="form-control disabledfield" placeholder="Enter City " required="required"></form:input>
				</div>
			</div>
	</div>	
	<div class="row" style="padding-bottom: 5px">
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="state"> STATE: </form:label>
					<form:input path="state" class="form-control disabledfield" placeholder="Enter State " required="required"></form:input>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="address"> ADDRESS: </form:label>
					<form:input path="address" class="form-control disabledfield" placeholder="Enter Address " required="required"></form:input>
				</div>
			</div>
	</div>
	<div class="row" style="padding-bottom: 5px">
			<div class="col-sm-4 col-sm-offset-4">
			<input type="submit" class="btn btn-primary btn-block" value="updateSupplier"/>
			</div>
   </div>
</form:form>
</c:when>

<c:otherwise>
 <form:form class="jumbotron" action="SaveSupplier" commandName="ms" method="POST">
	<div class="row" style="padding-bottom: 5px">
			<div class="col-sm-4">
			<div class="form-group">
		         <form:label path="supplier_id">SupplierID: </form:label>
			     <form:input path="supplier_id" class="form-control disabledfield" readonly="true" placeholder="Enter Supplier ID" required="required"></form:input>
			</div>
			</div>
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="supplier_name">SupplierName: </form:label>
					<form:input path="supplier_name" class="form-control disabledfield" placeholder="Enter Supplier name" required="required"></form:input>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="mobile_no">MobileNumber: </form:label>
					<form:input path="mobile_no" class="form-control disabledfield"  placeholder="Enter Mobile Number" required="required"></form:input>
				</div>
			</div> 
	</div>
	<div class="row" style="padding-bottom: 5px">
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="city">CITY: </form:label>
					<form:input path="city" class="form-control disabledfield" placeholder="Enter City " required="required"></form:input>
				</div>
			</div>
	</div>		
	<div class="row" style="padding-bottom: 5px">
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="state"> STATE: </form:label>
					<form:input path="state" class="form-control disabledfield" placeholder="Enter State " required="required"></form:input>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="form-group">
					<form:label path="address"> ADDRESS: </form:label>
					<form:input path="address" class="form-control disabledfield" placeholder="Enter Address " required="required"></form:input>
				</div>
			</div>
	</div>
    <div class="row" style="padding-bottom: 5px">
			<div class="col-sm-4 col-sm-offset-4">
				<input type="submit" class="btn btn-primary btn-block" value="SaveSupplier" />
			</div>
	</div>
</form:form>
</c:otherwise>
</c:choose>
	
	

<div ng-app="getSupplier" ng-controller="getSupplierController">
		<div class="col-md-12">
			<h4 align="center">Supplier</h4>
			<div id="custom-search-input">
				<div class="input-group col-md-12">
					<input type="text" class="search-query form-control" placeholder="Search" ng-model="seachproduct" /></span>
				</div>
			</div>

			<div class="table-responsive">
				<table id="mytable" class="table table-bordred table-striped table-hover">
				<tr>
					<th>Supplier Id</th>
					<th>Supplier Name</th>
					<th>Supplier Moblie_No</th>
					<th>Supplier City</th>
				     <th>Supplier State</th>
				     <th>Supplier Address</th>
				     <th>Supplier Status</th>
					<th>Supplier Edit/Delete</th>
					<th>SupplierEnable/Disable</th>
					
			</tr>
			<tr class="success"	ng-repeat="supl in supples|filter:seachproduct">
						<td>{{supl.supplier_id}}</td>
						<td>{{supl.supplier_name}}</td>
						<td>{{supl.mobile_no}}</td>
						<td>{{supl.city}}</td>
						<td>{{supl.state}}</td>
						<td>{{supl.address}}</td>
						<td>{{supl.status}}</td>
					<td> <a href="fetchSupplierById?supplier_id={{supl.supplier_id}}"><button type="button" class="btn btn-default btn-sm"> 
					<span class="glyphicon glyphicon-pencil"></span>Edit</button></a>
					<a href="deleteSupplier?supplier_id={{supl.supplier_id}}"><button type="button" class="btn btn-default btn-sm">
					<span class="glyphicon glyphicon-trash"></span>Delete</button></a></td>
					<td> <a href="Enabble?supplier_id={{supl.supplier_id}}"><button type="button" class="btn btn-default btn-sm"> 
					<span class="glyphicon glyphicon-ok-circle"></span>Enable</button></a>
					<a href="Disabble?supplier_id={{supl.supplier_id}}"><button type="button" class="btn btn-default btn-sm">
					<span class="glyphicon glyphicon-ban-circle"></span>Disable</button></a></td>
			</tr>
		</table>
		</div>
	</div>
</div>

<%@include file="adminfooter.jsp" %>