<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   <script src="./resources/css/demo1.css"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>


<body>
<header>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">FashionShoe</a>
      <button type="button" class="navbar-toggle buttonlayout" data-toggle="collapse" data-target="#myNavbar">
      <i class="fa fa-bars" style="background-color:white;"></i>
      </button>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
    <ul class="nav navbar-nav">
      <li class="active"><a href="manageproducts">ManageProduct</a></li>
      <li><a href="Supplier" class="s3">Supplier</a></li>
       <li><a href="Category" class="s3">ManageCategary</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      		<li><a href="#"><span class="glyphicon glyphicon-user"></span>Welcome ${Details.user_name}</a></li>
     		 <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
    	</ul>
    	</div>
  
  </div>
</nav>

</header>

