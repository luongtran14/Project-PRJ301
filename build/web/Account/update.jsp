<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>DapurKue | Login</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <link rel="stylesheet" type="text/css" media="all" href="css/960.css" />
        <link rel="stylesheet" type="text/css" media="all" href="css/reset.css" />
        <link rel="stylesheet" type="text/css" media="all" href="css/text.css" />
        <link rel="stylesheet" type="text/css" media="all" href="css/style.css" />
        <link rel="stylesheet" type="text/css" media="all" href="themes/brown/style.css" />
    </head>
    <script>
        function checkpass() {
            if (document.form.newpassword.value != document.form.repassword.value) {
                alert("Not match! Try again please");

                return false;
            }
            return true;
        }
    </script>
    <body>
        <div id="warp">
            <div id="main" class="container_16">
                <div id="header" class="grid_16">
                    <div id="logo" class="grid_4 alpha">
                        <h1><a href="index.html">DapurKue</a></h1>
                        <h2>Famously Delicious</h2>
                    </div>
                    <div id="headright" class="grid_7 prefix_5 omega">
                        <h3 class="login"><span class="hiUser">Hi, Monika Halim |</span> <span class="myAccount"><a href="#">My Account</a></span> <a href="#">Logout</a></h3>
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
                            <input type="text" value="Type your keyword" id="s" name="s" onfocus="if (this.value == 'Type your keyword') {
                                        this.value = '';
                                    }" onblur="if (this.value == '') {
                                                this.value = 'Type your keyword';
                                            }" />
                        </form>
                    </div>
                </div>
                <div class="checkout grid_16">
                    <div class="newAccount grid_8 alpha">
                        <h4>Setting an account</h4>

                        <form method="post" action="UpdateAccountController"  onsubmit="return checkpass()"  name="form"  >

                            <fieldset>

                                <input type="hidden" tabindex="2" size="22" value="${requestScope.accountone.id}" id="id"  name="id" class="text" />
                                <br />
                                <label for="user">Username: </label>
                                <input type="text" tabindex="1" size="22" value="${requestScope.accountone.account}" name="user" id="user" class="text" />
                                <br />
                                <label for="password">old password: </label>
                                <input type="text" tabindex="2" size="22" value="${requestScope.accountone.password}" id="password"  name="password" class="text" />
                                <br />
                                <label for="newpassword">new password: </label>
                                <input type="password" tabindex="3" size="22" value=""  name="newpassword" class="text" />
                                <br />
                                <label for="repassword">Retype Password:</label>
                                <input type="password" tabindex="4" size="22" value=""  name="repassword" class="text" />
                                <br />


                            </fieldset>

                            <p>
                                <input type="submit" value="Update Account Button" name="update" class="UpdateAccountButton" 
                                       style="display:block;
                                       float:left;
                                       cursor:pointer;
                                       height:39px;
                                       border:none;
                                       width:254px;
                                       background-color: #FF9900;
                                       border-radius: 50px 50px;
                                       font-weight: bold;
                                       "/>
                            </p>
                        </form>

                    </div>

                </div>
            </div>
            <div class="clear"></div>
        </div>
        <div id="richContent2">
            <div class="container_16">
                <div class="lastTweet grid_4">
                    <h4>Latest Tweets</h4>
                    <p><a href="#">@someone</a> yes indeed this is one hell of a free css template! <a href="#">Read More</a> <span><em>15 minutes ago</em></span></p>
                    <p><a href="#">@someone</a> yes indeed this is one hell of a free css template! <a href="#">Read More</a> <span><em>15 minutes ago</em></span></p>
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
                        <li><a href="#">Delivery Terms &amp; Pricing</a></li>
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