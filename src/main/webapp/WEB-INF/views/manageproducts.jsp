<%@include file="adminheader.jsp"%>

<script>
	var productlist = ${prodlist}
	var supplylist = ${Supplierlist}
	var categorylist = ${catlist}
	var app = angular.module('myApp', []);
	app.controller('myCtrl', function($scope) {
		$scope.products = productlist;
		$scope.supples = supplylist;
		$scope.category = categorylist;
	});
</script>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div ng-app="myApp">
	<div class="container">
		<c:choose>
			<c:when test="${userClickUpdateProduct == true}">
				<form:form class="jumbotron" action="updateProduct" method="POST"
					enctype="multipart/form-data" commandName="mp">
					<div class="row" style="padding-bottom: 5px">
						<div class="col-sm-4">
							<div class="form-group">
								<form:label path="productid">ID: </form:label>
								<form:input path="productid" class="form-control disabledfield"
									readonly="true" placeholder="Enter Product ID"
									required="required"></form:input>
							</div>
						</div>
						<div class="col-sm-4">
							<div class="form-group">
								<form:label path="product_img">Product Image: </form:label>
								<form:input path="product_img" class="form-control" type="file"
									required="required"></form:input>
							</div>
						</div>

						<div class="col-sm-4">
							<div class="form-group">
								<form:label path="pdname">Name: </form:label>
								<form:input path="pdname" class="form-control disabledfield"
									placeholder="Enter Product name" required="required"></form:input>
							</div>
						</div>
						<div class="col-sm-4">
							<div class="form-group">
								<form:label path="price">price: </form:label>
								<form:input path="price" class="form-control disabledfield"
									placeholder="Enter Product ID" required="required"></form:input>
							</div>
						</div>
					</div>
					<div class="row" style="padding-bottom: 5px">
						<div class="col-sm-4">
							<div class="form-group">
								<form:label path="desc">desc: </form:label>
								<form:input path="desc" class="form-control disabledfield"
									placeholder="Enter Product desc" required="required"></form:input>
							</div>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="form-group">
							<form:label path="size">Size: </form:label>
							<form:input path="size" class="form-control disabledfield"
								placeholder="Enter Product size" required="required"></form:input>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="form-group">
							<form:label path="discount">Discount: </form:label>
							<form:input path="discount" class="form-control disabledfield"
								placeholder="Enter Product disc" required="required"></form:input>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="form-group">
							<form:label path="qty">Qty: </form:label>
							<form:input path="qty" class="form-control disabledfield"
								placeholder="Enter Product qty" required="required"></form:input>
						</div>
					</div>
					<div class="row" style="padding-bottom: 5px">
						<div class="col-sm-4">
							<div class="form-group" ng-controller="myCtrl">
								<form:label path="supplier_id">supplier_id</form:label>
								<form:select path="supplier_id" class="form-control">
									<option ng-repeat="suplist in supples" value="{{suplist.supplier_id}}">{{suplist.supplier_name}} </option>
								</form:select>
							</div>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="form-group" ng-controller="myCtrl">
							<form:label path="cat_id">category_id</form:label>
							<form:select path="cat_id" class="form-control">
								<option ng-repeat="catlist in category"
									value="{{catlist.categoryid}}">{{catlist.categoryname}}</option>
							</form:select>
						</div>
					</div>
					<div class="row" style="padding-bottom: 5px">
						<div class="col-sm-4 col-sm-offset-4">
							<input type="submit" class="btn btn-primary btn-block"
								value="Update Product" />
						</div>
					</div>
				</form:form>
			</c:when>
			<c:otherwise>
				<form:form class="jumbotron" action="addProduct" commandName="mp"
					method="POST" enctype="multipart/form-data">
					<div class="row" style="padding-bottom: 5px">
						<div class="col-sm-4">
							<div class="form-group">
								<form:label path="productid">ID: </form:label>
								<form:input path="productid" class="form-control disabledfield"
									readonly="true" placeholder="Enter Product ID"
									required="required"></form:input>
							</div>
						</div>
						<div class="col-sm-4">
							<div class="form-group">
								<form:label path="product_img">Product Image: </form:label>
								<form:input path="product_img" class="form-control" type="file"
									required="required"></form:input>
							</div>
						</div>
						<div class="col-sm-4">
							<div class="form-group">
								<form:label path="pdname">Name: </form:label>
								<form:input path="pdname" class="form-control disabledfield"
									placeholder="Enter Product name" required="required"></form:input>
							</div>
						</div>
					</div>
					<div class="row" style="padding-bottom: 5px">
						<div class="col-sm-4">
							<div class="form-group">
								<form:label path="price">Price: </form:label>
								<form:input path="price" class="form-control disabledfield"
									placeholder="Enter Product ID" required="required"></form:input>
							</div>
						</div>
						<div class="col-sm-4">
							<div class="form-group">
								<form:label path="desc">Desc: </form:label>
								<form:input path="desc" class="form-control disabledfield"
									placeholder="Enter Product desc" required="required"></form:input>
							</div>
						</div>
						<div class="col-sm-4">
							<div class="form-group">
								<form:label path="size">Size: </form:label>
								<form:input path="size" class="form-control disabledfield"
									placeholder="Enter Product size" required="required"></form:input>
							</div>
						</div>
					</div>
					<div class="row" style="padding-bottom: 5px">
						<div class="col-sm-4">
							<div class="form-group">
								<form:label path="discount">Discount: </form:label>
								<form:input path="discount" class="form-control disabledfield"
									placeholder="Enter Product desc" required="required"></form:input>
							</div>
						</div>
						<div class="col-sm-4">
							<div class="form-group">
								<form:label path="qty">Qty: </form:label>
								<form:input path="qty" class="form-control disabledfield"
									placeholder="Enter Product desc" required="required"></form:input>
							</div>
						</div>

						<div class="col-sm-4">
							<div class="form-group" ng-controller="myCtrl">
								<form:label path="supplier_id">supplier_id</form:label>
								<form:select path="supplier_id" class="form-control">
									<option ng-repeat="suplist in supples"
										value="{{suplist.supplier_id}}">{{suplist.supplier_name}}
									</option>
								</form:select>
							</div>
						</div>
					</div>
					<div class="row" style="padding-bottom: 5px">
						<div class="col-sm-4" ng-controller="myCtrl">
							<div class="form-group">
								<form:label path="cat_id">category_id</form:label>
								<form:select path="cat_id" class="form-control">
									<option ng-repeat="catlist in category"
										value="{{catlist.categoryid}}">{{catlist.categoryname}}</option>
								</form:select>
							</div>
						</div>
					</div>
					<div class="row" style="padding-bottom: 5px">
						<div class="col-sm-4 col-sm-offset-4">
							<input type="submit" class="btn btn-primary btn-block"
								value="Add Product" />
						</div>
					</div>
				</form:form>
			</c:otherwise>
		</c:choose>
	</div>


	<div  ng-controller="myCtrl">
		<div class="col-md-12">
			<h4 align="center">Manage Products</h4>
			<div id="custom-search-input">
				<div class="input-group col-md-12">
					<input type="text" class="search-query form-control"
						placeholder="Search" ng-model="seachproduct" /></span>
				</div>
			</div>

			<div class="table-responsive">
				<table id="mytable"
					class="table table-bordred table-striped table-hover">
					<tr>
						<th>Product Id</th>
						<th>Product image</th>
						<th>Product Name</th>
						<th>Product Description</th>
						<th>Product Price</th>
						<th>Product Size</th>
						<th>Product Discount</th>
						<th>Product Quantity</th>
						<th>SupplierId</th>
						<th>CategoryId</th>
						<th>Product Status</th>
						<th>Product Edit/Delete</th>
						<th>Product Enable/Disable</th>

					</tr>
					<tr class="success"
						ng-repeat="prod in products|filter:seachproduct">
						<td>{{prod.productid}}</td>
						<td><img src="./resources/prodimg/{{prod.productid}}.jpg"
							style="height: 50px; width: 50px;" /></td>
						<td>{{prod.pdname}}</td>
						<td>{{prod.desc}}</td>
						<td>{{prod.price}}</td>
						<td>{{prod.size}}</td>
						<td>{{prod.discount}}</td>
						<td>{{prod.qty}}</td>
						<td>{{prod.supplier_id}}</td>
						<td>{{prod.categoryid}}</td>
						<td>{{prod.productsstatus}}</td>
						<td><a href="fetchProductById?product_id={{prod.productid}}"><button
									type="button" class="btn btn-default btn-sm">
									<span class="glyphicon glyphicon-pencil"></span>Edit
								</button></a> <a href="deleteProduct?id={{prod.productid}}"><button
									type="button" class="btn btn-default btn-sm">
									<span class="glyphicon glyphicon-trash"></span>Delete
								</button></a></td>
						<td><a href="enablle?id={{prod.productid}}"><button
									type="button" class="btn btn-default btn-sm">
									<span class="glyphicon glyphicon-ok-circle"></span>Enable
								</button></a> <a href="disablle?id={{prod.productid}}"><button
									type="button" class="btn btn-default btn-sm">
									<span class="glyphicon glyphicon-ban-circle"></span>Disable
								</button></a></td>

					</tr>
				</table>
			</div>
		</div>
	</div>
</div>
<%@include file="adminfooter.jsp"%>