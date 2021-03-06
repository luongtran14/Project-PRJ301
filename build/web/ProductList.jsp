<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>DapurKue | Product Overview</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" media="all" href="css/960.css" />
<link rel="stylesheet" type="text/css" media="all" href="css/reset.css" />
<link rel="stylesheet" type="text/css" media="all" href="css/text.css" />
<link rel="stylesheet" type="text/css" media="all" href="css/style.css" />
<link rel="stylesheet" type="text/css" media="all" href="themes/brown/style.css" />
</head>
<body>
<div id="warp">
  <div id="main" class="container_16">
    <div id="header" class="grid_16">
      <div id="logo" class="grid_4 alpha">
        <h1><a href="index.html">DapurKue</a></h1>
        <h2>Famously Delicious</h2>
      </div>
      <div id="headright" class="grid_7 prefix_5 omega">
        <h3 class="login"><a href="login.html">Sign up</a> / <a href="login.html">Login</a></h3>
        <p>Subtotal: $ 00.00</p>
        <p><span class="vChart"><a href="shoppingcart.html">View Cart</a></span> <span class="cOut"><a href="checkout.html">Checkout</a></span></p>
      </div>
    </div>
    <div id="mainMenu" class="grid_16">
      <ul>
        <li><a href="index.html">Home</a></li>
        <li><a href="#">Cakes</a></li>
        <li><a href="#">Order &amp; Delivery</a></li>
        <li><a href="#">Blog</a></li>
        <li><a href="#">About</a></li>
        <li><a href="#">Contact</a></li>
      </ul>
    </div>
    <div id="stickySearch" class="grid_16">
      <div class="stickyNews grid_12 alpha">
        <p>Valentine?s BrownieCheese Special Package. <em>Free Delivery.</em> <a href="#" class="bookMan">More &raquo;</a></p>
      </div>
      <div class="search grid_4 omega">
        <form action="#" method="get">
          <input type="text" value="Type your keyword" id="s" name="s" onfocus="if (this.value == 'Type your keyword') {this.value = '';}" onblur="if (this.value == '') {this.value = 'Type your keyword';}" />
        </form>
      </div>
    </div>
    <div class="prodNav grid_16">
      <div class="prodHeadline grid_12 alpha">
        <h3>Cakes</h3>
      </div>
      <div class="browseCategory grid_4 omega">
        <form action="#" method="get">
          <select>
            <option>All Category</option>
            <c:forEach var="i" items="${requestScope.lsCategory}">
                <option value="${i.id}" >
                    ${i.name}
                </option></c:forEach>
          </select>
        </form>
      </div>
    </div>
    <div class="bodyContent grid_16">
      <div class="products grid_16 alpha">
        <div class="prodMenu">
          <h4>Brownies <a href="#" class="viewAll">View All &raquo;</a></h4>
          <div class="menu grid_4 alpha">
              <p>
                  <c:forEach var="i" items="${requestScope.lsCategory}">
         ${i.id}
                      
                  </c:forEach>
                  
              </p>
          </div>
          
        </div>
        <div class="prodMenu">
          <h4>Cheesecakes <a href="#" class="viewAll">View All &raquo;</a></h4>
          <div class="menu grid_4 alpha">
            <p><a href="#" class="grid_4 alpha"><img src="images/freshCake1.jpg" alt="" width="220" height="120" /></a><br />
              <a href="#">Delicious Cheesecake in Huge Pan With Choco Slices</a></p>
          </div>
          <div class="menu grid_4">
            <p><a href="#" class="grid_4 alpha"><img src="images/freshCake2.jpg" alt="" width="220" height="120" /></a><br />
              <a href="#">Cheese Poof</a></p>
          </div>
          <div class="menu grid_4">
            <p><a href="#" class="grid_4 alpha"><img src="images/freshCake3.jpg" alt="" width="220" height="120" /></a><br />
              <a href="#">Whatever Cake With Vanilla Ice Cream and Chocolate Melt</a></p>
          </div>
          <div class="menu grid_4 omega">
            <p><a href="#" class="grid_4 alpha"><img src="images/freshCake4.jpg" alt="" width="220" height="120" /></a><br />
              <a href="#">Cheesey Browney</a></p>
          </div>
        </div>
        <div class="prodMenu">
          <h4>Cupcakes <a href="#" class="viewAll">View All &raquo;</a></h4>
          <div class="menu grid_4 alpha">
            <p><a href="#" class="grid_4 alpha"><img src="images/freshCake1.jpg" alt="" width="220" height="120" /></a><br />
              <a href="#">Delicious Cheesecake in Huge Pan With Choco Slices</a></p>
          </div>
          <div class="menu grid_4">
            <p><a href="#" class="grid_4 alpha"><img src="images/freshCake2.jpg" alt="" width="220" height="120" /></a><br />
              <a href="#">Cheese Poof</a></p>
          </div>
          <div class="menu grid_4">
            <p><a href="#" class="grid_4 alpha"><img src="images/freshCake3.jpg" alt="" width="220" height="120" /></a><br />
              <a href="#">Whatever Cake With Vanilla Ice Cream and Chocolate Melt</a></p>
          </div>
          <div class="menu grid_4 omega">
            <p><a href="#" class="grid_4 alpha"><img src="images/freshCake4.jpg" alt="" width="220" height="120" /></a><br />
              <a href="#">Cheesey Browney</a></p>
          </div>
        </div>
        <div class="prodMenu">
          <h4>Pies <a href="#" class="viewAll">View All &raquo;</a></h4>
          <div class="menu grid_4 alpha">
            <p><a href="#" class="grid_4 alpha"><img src="images/freshCake1.jpg" alt="" width="220" height="120" /></a><br />
              <a href="#">Delicious Cheesecake in Huge Pan With Choco Slices</a></p>
          </div>
          <div class="menu grid_4">
            <p><a href="#" class="grid_4 alpha"><img src="images/freshCake2.jpg" alt="" width="220" height="120" /></a><br />
              <a href="#">Cheese Poof</a></p>
          </div>
          <div class="menu grid_4">
            <p><a href="#" class="grid_4 alpha"><img src="images/freshCake3.jpg" alt="" width="220" height="120" /></a><br />
              <a href="#">Whatever Cake With Vanilla Ice Cream and Chocolate Melt</a></p>
          </div>
          <div class="menu grid_4 omega">
            <p><a href="#" class="grid_4 alpha"><img src="images/freshCake4.jpg" alt="" width="220" height="120" /></a><br />
              <a href="#">Cheesey Browney</a></p>
          </div>
        </div>
      </div>
      <div class="commentPages grid_16">
        <ul>
          <li><a href="#">&laquo; Prev</a></li>
          <li><a href="#" class="commentPageActive">1</a></li>
          <li><a href="#">2</a></li>
          <li><a href="#">3</a></li>
          <li><a href="#">4</a></li>
          <li><a href="#">Next &raquo;</a></li>
        </ul>
      </div>
    </div>
  </div>
  <div class="clear"></div>
</div>
<div id="richContent2">
  <div class="container_16">
    <div class="fromBlog grid_4">
      <h4>From the blog</h4>
      <h5>New Recipes in Our Basket</h5>
      <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. vivamus tempor justo sit amet metus cursus consequat. Nulla viverra, felis vel accumsan fermentum... <a href="#" class="bookMan">more &raquo;</a></p>
    </div>
    <div class="corporateInfo grid_4">
      <h4>Corporate Info</h4>
      <ul>
        <li><a href="#">Privacy Policy</a></li>
        <li><a href="#">Term &amp; Conditions</a></li>
        <li><a href="#">Franchise</a></li>
        <li><a href="#">About us</a></li>
        <li><a href="#">FAQ</a></li>
      </ul>
    </div>
    <div class="storeDelivery grid_4">
      <h4>Store &amp; Delivery</h4>
      <ul>
        <li><a href="#">Store Locator</a></li>
        <li><a href="#">Delivery Terms &amp;amp Pricing</a></li>
        <li><a href="#">Delivery Coverage</a></li>
        <li><a href="#">Gift Services</a></li>
        <li><a href="#">Track my order</a></li>
      </ul>
    </div>
    <div class="socialNet grid_4">
      <h4>Keep in touch</h4>
      <ul>
        <li><a href="#" class="facebook">Facebook</a></li>
        <li><a href="#" class="twitter">Twitter</a></li>
        <li><a href="#" class="feed">Feed</a></li>
      </ul>
    </div>
    <div class="clear"></div>
  </div>
</div>
<div id="footer">
  <div class="container_16">
    <div class="copyright grid_16">
      <p class="left">Copyright &copy; 2010, Your Company Here, All Rights Reserved</p>
      <p class="right">Design by <a href="http://tokokoo.com/">Tokokoo</a> &amp; <a href="http://www.instantshift.com/">instantShift</a></p>
      <div class="clear"></div>
    </div>
    <div class="clear"></div>
  </div>
</div>
</body>
</html>