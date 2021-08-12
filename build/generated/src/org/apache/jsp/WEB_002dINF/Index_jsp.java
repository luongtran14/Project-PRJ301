package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<title>DapurKue</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"styles/960.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"styles/reset.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"styles/text.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"style.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"themes/brown/style.css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/jquery-1.4.2.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/jquery.tools.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/dapur.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"warp\">\n");
      out.write("  <div id=\"main\" class=\"container_16\">\n");
      out.write("    <div id=\"header\" class=\"grid_16\">\n");
      out.write("      <div id=\"logo\" class=\"grid_4 alpha\">\n");
      out.write("        <h1><a href=\"index.html\">DapurKue</a></h1>\n");
      out.write("        <h2>Famously Delicious</h2>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"headright\" class=\"grid_7 prefix_5 omega\">\n");
      out.write("        <h3 class=\"login\"><a href=\"login.html\">Sign up</a> / <a href=\"login.html\">Login</a></h3>\n");
      out.write("        <p>Subtotal: $ 00.00</p>\n");
      out.write("        <p><span class=\"vChart\"><a href=\"shoppingcart.html\">View Cart</a></span> <span class=\"cOut\"><a href=\"checkout.html\">Checkout</a></span></p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"mainMenu\" class=\"grid_16\">\n");
      out.write("      <ul>\n");
      out.write("        <li><a href=\"index.html\" class=\"aActive\">Home</a></li>\n");
      out.write("        <li><a href=\"#\">Cakes</a></li>\n");
      out.write("        <li><a href=\"#\">Order &amp; Delivery</a></li>\n");
      out.write("        <li><a href=\"#\">Blog</a></li>\n");
      out.write("        <li><a href=\"#\">About</a></li>\n");
      out.write("        <li><a href=\"#\">Contact</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"stickySearch\" class=\"grid_16\">\n");
      out.write("      <div class=\"stickyNews grid_12 alpha\">\n");
      out.write("        <p>Valentine?s BrownieCheese Special Package. <em>Free Delivery.</em> <a href=\"#\" class=\"bookMan\">More &raquo;</a></p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"search grid_4 omega\">\n");
      out.write("        <form action=\"#\" method=\"get\">\n");
      out.write("          <input type=\"text\" value=\"Type your keyword\" id=\"s\" name=\"s\" onfocus=\"if (this.value == 'Type your keyword') {this.value = '';}\" onblur=\"if (this.value == '') {this.value = 'Type your keyword';}\" />\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"products grid_16\">\n");
      out.write("      <div class=\"productsWarp\">\n");
      out.write("        <ul>\n");
      out.write("          <li><a href=\"product-overview.html\"><img src=\"images/cake1.jpg\" alt=\"\" width=\"938\" height=\"398\" /></a></li>\n");
      out.write("          <li><a href=\"product-overview.html\"><img src=\"images/cake2.jpg\" alt=\"\" width=\"938\" height=\"398\" /></a></li>\n");
      out.write("          <li><a href=\"product-overview.html\"><img src=\"images/cake3.jpg\" alt=\"\" width=\"938\" height=\"398\" /></a></li>\n");
      out.write("          <li><a href=\"product-overview.html\"><img src=\"images/cake3.jpg\" alt=\"\" width=\"938\" height=\"398\" /></a></li>\n");
      out.write("          <li><a href=\"product-overview.html\"><img src=\"images/cake3.jpg\" alt=\"\" width=\"938\" height=\"398\" /></a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"productThumb grid_10 prefix_3 suffix_3\">\n");
      out.write("      <ul>\n");
      out.write("        <li class=\"grid_2 alpha\"><a href=\"#\"><img src=\"images/thumb1.jpg\" alt=\"\" width=\"100\" height=\"60\" /></a></li>\n");
      out.write("        <li class=\"grid_2\"><a href=\"#\"><img src=\"images/thumb2.jpg\" alt=\"\" width=\"100\" height=\"60\" /></a></li>\n");
      out.write("        <li class=\"grid_2\"><a href=\"#\"><img src=\"images/thumb1.jpg\" alt=\"\" width=\"100\" height=\"60\" /></a></li>\n");
      out.write("        <li class=\"grid_2\"><a href=\"#\"><img src=\"images/thumb2.jpg\" alt=\"\" width=\"100\" height=\"60\" /></a></li>\n");
      out.write("        <li class=\"grid_2 omega\"><a href=\"#\"><img src=\"images/thumb1.jpg\" alt=\"\" width=\"100\" height=\"60\" /></a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"clear\"></div>\n");
      out.write("</div>\n");
      out.write("<div id=\"fresh\">\n");
      out.write("  <div class=\"container_16\">\n");
      out.write("    <div id=\"freshCake\" class=\"grid_16\">\n");
      out.write("      <div class=\"grid_1 alpha\"> <a class=\"prevButton\">&laquo;</a></div>\n");
      out.write("      <div class=\"headLine grid_14\">\n");
      out.write("        <h3>Fresh from the oven</h3>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"grid_1 omega\"> <a class=\"nextButton\">&raquo;</a></div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"newCakes\">\n");
      out.write("      <div class=\"scroller\">\n");
      out.write("        <div class=\"newCake\"><a href=\"product-details.html\" class=\"grid_4\"><img src=\"images/freshCake1.jpg\" alt=\"\" width=\"220\" height=\"120\" /></a></div>\n");
      out.write("        <div class=\"newCake\"><a href=\"product-details.html\" class=\"grid_4\"><img src=\"images/freshCake2.jpg\" alt=\"\" width=\"220\" height=\"120\" /></a></div>\n");
      out.write("        <div class=\"newCake\"><a href=\"product-details.html\" class=\"grid_4\"><img src=\"images/freshCake3.jpg\" alt=\"\" width=\"220\" height=\"120\" /></a></div>\n");
      out.write("        <div class=\"newCake\"><a href=\"product-details.html\" class=\"grid_4\"><img src=\"images/freshCake4.jpg\" alt=\"\" width=\"220\" height=\"120\" /></a></div>\n");
      out.write("        <div class=\"newCake\"><a href=\"product-details.html\" class=\"grid_4\"><img src=\"images/freshCake2.jpg\" alt=\"\" width=\"220\" height=\"120\" /></a></div>\n");
      out.write("        <div class=\"newCake\"><a href=\"product-details.html\" class=\"grid_4\"><img src=\"images/freshCake3.jpg\" alt=\"\" width=\"220\" height=\"120\" /></a></div>\n");
      out.write("        <div class=\"newCake\"><a href=\"product-details.html\" class=\"grid_4\"><img src=\"images/freshCake4.jpg\" alt=\"\" width=\"220\" height=\"120\" /></a></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"clear\"></div>\n");
      out.write("</div>\n");
      out.write("<div id=\"richContent\">\n");
      out.write("  <div class=\"container_16\">\n");
      out.write("    <div class=\"popularCakes grid_4\">\n");
      out.write("      <h4>Popular Cakes</h4>\n");
      out.write("      <ul>\n");
      out.write("        <li><a href=\"#\">Ultimate Choco Brownie</a></li>\n");
      out.write("        <li><a href=\"#\">Mokakokoa Brownie</a></li>\n");
      out.write("        <li><a href=\"#\">CoffeeBrown</a></li>\n");
      out.write("        <li><a href=\"#\">Delicacheese</a></li>\n");
      out.write("        <li><a href=\"#\">Berries Cheesecake</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"recommended grid_4\">\n");
      out.write("      <h4>Recommended</h4>\n");
      out.write("      <ul>\n");
      out.write("        <li><a href=\"#\">Ultimate Choco Brownie</a></li>\n");
      out.write("        <li><a href=\"#\">Mokakokoa Brownie</a></li>\n");
      out.write("        <li><a href=\"#\">CoffeeBrown</a></li>\n");
      out.write("        <li><a href=\"#\">Delicacheese</a></li>\n");
      out.write("        <li><a href=\"#\">Berries Cheesecake</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"specialOffer grid_4\">\n");
      out.write("      <h4>Special Offer</h4>\n");
      out.write("      <ul>\n");
      out.write("        <li><a href=\"#\">Ultimate Choco Brownie</a></li>\n");
      out.write("        <li><a href=\"#\">Mokakokoa Brownie</a></li>\n");
      out.write("        <li><a href=\"#\">CoffeeBrown</a></li>\n");
      out.write("        <li><a href=\"#\">Delicacheese</a></li>\n");
      out.write("        <li><a href=\"#\">Berries Cheesecake</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"orderPhone grid_4\">\n");
      out.write("      <h4><em>Order by Phone</em> <span>987-654-321</span></h4>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"clear\"></div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div id=\"richContent2\">\n");
      out.write("  <div class=\"container_16\">\n");
      out.write("    <div class=\"fromBlog grid_4\">\n");
      out.write("      <h4>From the blog</h4>\n");
      out.write("      <h5>New Recipes in Our Basket</h5>\n");
      out.write("      <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. vivamus tempor justo sit amet metus cursus consequat. Nulla viverra, felis vel accumsan fermentum... <a href=\"#\" class=\"bookMan\">more &raquo;</a></p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"corporateInfo grid_4\">\n");
      out.write("      <h4>Corporate Info</h4>\n");
      out.write("      <ul>\n");
      out.write("        <li><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("        <li><a href=\"#\">Term &amp; Conditions</a></li>\n");
      out.write("        <li><a href=\"#\">Franchise</a></li>\n");
      out.write("        <li><a href=\"#\">About us</a></li>\n");
      out.write("        <li><a href=\"#\">FAQ</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"storeDelivery grid_4\">\n");
      out.write("      <h4>Store &amp; Delivery</h4>\n");
      out.write("      <ul>\n");
      out.write("        <li><a href=\"#\">Store Locator</a></li>\n");
      out.write("        <li><a href=\"#\">Delivery Terms &amp; Pricing</a></li>\n");
      out.write("        <li><a href=\"#\">Delivery Coverage</a></li>\n");
      out.write("        <li><a href=\"#\">Gift Services</a></li>\n");
      out.write("        <li><a href=\"#\">Track my order</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"socialNet grid_4\">\n");
      out.write("      <h4>Keep in touch</h4>\n");
      out.write("      <ul>\n");
      out.write("        <li><a href=\"#\" class=\"facebook\">Facebook</a></li>\n");
      out.write("        <li><a href=\"#\" class=\"twitter\">Twitter</a></li>\n");
      out.write("        <li><a href=\"#\" class=\"feed\">Feed</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"clear\"></div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div id=\"footer\">\n");
      out.write("  <div class=\"container_16\">\n");
      out.write("    <div class=\"copyright grid_16\">\n");
      out.write("      <p class=\"left\">Copyright &copy; 2010, Your Company Here, All Rights Reserved</p>\n");
      out.write("      <p class=\"right\">Design by <a href=\"http://tokokoo.com/\">Tokokoo</a> &amp; <a href=\"http://www.instantshift.com/\">instantShift</a></p>\n");
      out.write("      <div class=\"clear\"></div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"clear\"></div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
