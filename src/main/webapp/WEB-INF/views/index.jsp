<%@ include file="header.jsp"%>

<div class="container-fluid" style="width : 1000px; ">
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
 
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
  </ol>

 
  <div class="carousel-inner " id="demo">
    <div class="item " id="demo2">
      <img src="./resources/images/37a8ed42-d9e1-4dff-a8d4-ad8dbaedd80c.jpg" alt="Los Angeles" id="demo1">
    </div>

    <div class="item" id="demo2">
      <img src="./resources/images/action_23032017.jpg" alt="Chicago" >
    </div>

    <div class="item active " id="demo2">
      <img src="./resources/images/formal_shoes_22032017.jpg" alt="New York">
    </div>
  </div>

  
  <a class="left carousel-control" href="#myCarousel" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
    <span class="sr-only">Next</span>
  </a>
</div>


 </div>   
 

<%@ include file="footer.jsp"%>
