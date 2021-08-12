package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkout1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>DapurKue | Checkout</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"css/960.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"css/reset.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"css/text.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"css/style.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"themes/brown/style.css\" />\n");
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
      out.write("        <h3 class=\"login\"><span class=\"hiUser\">Hi, Monika Halim |</span> <span class=\"myAccount\"><a href=\"#\">My Account</a></span> <a href=\"#\">Logout</a></h3>\n");
      out.write("        <p>Subtotal: $ 00.00</p>\n");
      out.write("        <p><span class=\"vChart\"><a href=\"shoppingcart.html\">View Cart</a></span> <span class=\"cOut\"><a href=\"checkout.html\">Checkout</a></span></p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"mainMenu\" class=\"grid_16\">\n");
      out.write("      <ul>\n");
      out.write("        <li><a href=\"index.html\">Home</a></li>\n");
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
      out.write("    <div class=\"pageInfo grid_16\">\n");
      out.write("      <div class=\"dapurBlog grid_11 alpha\">\n");
      out.write("        <h3>Checkout</h3>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"checkout grid_16\">\n");
      out.write("      <div class=\"billInfo grid_11 alpha\">\n");
      out.write("        <h4>1. Billing Information</h4>\n");
      out.write("        <form method=\"post\" action=\"#\" id=\"comment_form\">\n");
      out.write("          <fieldset>\n");
      out.write("            <label for=\"firstName\">First Name: </label>\n");
      out.write("            <input type=\"text\" tabindex=\"1\" size=\"22\" value=\"\" id=\"firstName\" name=\"firstName\" class=\"text\" />\n");
      out.write("            <br />\n");
      out.write("            <label for=\"lastName\">Last Name: </label>\n");
      out.write("            <input type=\"text\" tabindex=\"2\" size=\"22\" value=\"\" id=\"lastName\" name=\"lastName\" class=\"text\" />\n");
      out.write("            <br />\n");
      out.write("            <label for=\"company\">Company:</label>\n");
      out.write("            <input type=\"text\" tabindex=\"3\" size=\"50\" value=\"optional\" id=\"company\" name=\"company\" class=\"text\" />\n");
      out.write("            <br />\n");
      out.write("            <label for=\"address\">Address:</label>\n");
      out.write("            <input type=\"text\" tabindex=\"4\" size=\"50\" value=\"\" id=\"address\" name=\"address\" class=\"text\" />\n");
      out.write("            <br />\n");
      out.write("            <label for=\"address2\">&nbsp;</label>\n");
      out.write("            <input type=\"text\" tabindex=\"5\" size=\"50\" value=\"\" id=\"address2\" name=\"address2\" class=\"text\" />\n");
      out.write("            <br />\n");
      out.write("            <label for=\"address3\">&nbsp;</label>\n");
      out.write("            <input type=\"text\" tabindex=\"6\" size=\"50\" value=\"\" id=\"address3\" name=\"address3\" class=\"text\" />\n");
      out.write("            <br />\n");
      out.write("            <label for=\"city\">City:</label>\n");
      out.write("            <input type=\"text\" tabindex=\"7\" size=\"22\" value=\"\" id=\"city\" name=\"city\" class=\"text\" />\n");
      out.write("            <br />\n");
      out.write("            <label for=\"state\">State/Province:</label>\n");
      out.write("            <select id=\"state\" tabindex=\"8\">\n");
      out.write("              <option>DKI Jakarta</option>\n");
      out.write("              <option>Lembah Silikon</option>\n");
      out.write("              <option>Gunung Kidul</option>\n");
      out.write("            </select>\n");
      out.write("            <br />\n");
      out.write("            <label for=\"zip\">Zip:</label>\n");
      out.write("            <input type=\"text\" tabindex=\"9\" size=\"22\" value=\"\" id=\"zip\" name=\"zip\" class=\"text\" />\n");
      out.write("            <br />\n");
      out.write("            <label for=\"country\">country:</label>\n");
      out.write("            <select id=\"country\" tabindex=\"10\">\n");
      out.write("              <option>United Kingdom</option>\n");
      out.write("              <option>German</option>\n");
      out.write("              <option>Indonesia</option>\n");
      out.write("            </select>\n");
      out.write("            <br />\n");
      out.write("            <label for=\"phone\">Phone:</label>\n");
      out.write("            <input type=\"text\" tabindex=\"11\" size=\"22\" value=\"\" id=\"phone\" name=\"phone\" class=\"text\" />\n");
      out.write("            <br />\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("          </fieldset>\n");
      out.write("          <p><a href=\"checkout-2.html\" id=\"nextSubmit\" class=\"button\">Next</a></p>\n");
      out.write("          <input type=\"hidden\" value=\"30\" name=\"comment_post_ID\" />\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"summary grid_5 omega\">\n");
      out.write("        <h4>Summary</h4>\n");
      out.write("        <div class=\"sumWarp\">\n");
      out.write("          <ul>\n");
      out.write("            <li><a href=\"#\" class=\"down\">Shopping Cart <span><img src=\"images/done.png\" alt=\"\" /></span></a>\n");
      out.write("              <ul>\n");
      out.write("                <li class=\"info\">3 items in your cart</li>\n");
      out.write("                <li class=\"total\">$ 000.00</li>\n");
      out.write("                <li class=\"clear\"></li>\n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("            <li><a href=\"#\" class=\"billActive\">Billing Information</a></li>\n");
      out.write("            <li><a href=\"#\" class=\"billDie\">Shipping Information</a></li>\n");
      out.write("            <li><a href=\"#\" class=\"billDie\">Delivery Option</a></li>\n");
      out.write("            <li><a href=\"#\" class=\"billDie\">Payment Option</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"clear\"></div>\n");
      out.write("</div>\n");
      out.write("<div id=\"richContent2\">\n");
      out.write("  <div class=\"container_16\">\n");
      out.write("    <div class=\"lastTweet grid_4\">\n");
      out.write("      <h4>Latest Tweets</h4>\n");
      out.write("      <p><a href=\"#\">@someone</a> yes indeed this is one hell of a free css template! <a href=\"#\">Read More</a> <span><em>15 minutes ago</em></span></p>\n");
      out.write("      <p><a href=\"#\">@someone</a> yes indeed this is one hell of a free css template! <a href=\"#\">Read More</a> <span><em>15 minutes ago</em></span></p>\n");
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
      out.write("        <li><a href=\"#\">Delivery Terms &amp;amp Pricing</a></li>\n");
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
