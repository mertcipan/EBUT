/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.77
 * Generated at: 2017-06-12 17:09:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.*;
import de.htwg_konstanz.ebus.framework.wholesaler.api.boa.*;
import de.htwg_konstanz.ebus.wholesaler.demo.util.Constants;
import java.util.*;
import de.htwg_konstanz.ebus.wholesaler.demo.util.Constants;

public final class export_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/authentication.jsp", Long.valueOf(1456398838000L));
    _jspx_dependants.put("/navigation.jspfragment", Long.valueOf(1494318393000L));
    _jspx_dependants.put("/error.jsp", Long.valueOf(1456398820000L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1456398820000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>eBusiness Framework Demo - Export</title>\r\n");
      out.write("<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"default.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"layout.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div style=\"background-color: #224565; border-bottom: 1px; border-color: silver; border-bottom-style: solid; spacing: 4 4 4 4; padding: 6 6 6 6\">\r\n");
      out.write("<img alt=\"Home\" title=\"Home\" src=\"images/logo_de.png\">\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      boolean _jspx_th_c_005fforEach_005f0_reused = false;
      try {
        _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fforEach_005f0.setParent(null);
        // /error.jsp(5,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setVar("error");
        // /error.jsp(5,0) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.errorList}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
        try {
          int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
          if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write('\r');
              out.write('\n');
              java.lang.String error = null;
              error = (java.lang.String) _jspx_page_context.getAttribute("error", javax.servlet.jsp.PageContext.PAGE_SCOPE);
              if (error == null){
                throw new java.lang.InstantiationException("bean error not found within scope");
              }
              out.write("\r\n");
              out.write("<b><font color=\"Red\">");
              out.print( error );
              out.write("</font></b><br><br>\r\n");
              int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            return;
          }
        } catch (java.lang.Throwable _jspx_exception) {
          while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
            out = _jspx_page_context.popBody();
          _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
        } finally {
          _jspx_th_c_005fforEach_005f0.doFinally();
        }
        _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
        _jspx_th_c_005fforEach_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      de.htwg_konstanz.ebus.wholesaler.demo.LoginBean loginBean = null;
      synchronized (session) {
        loginBean = (de.htwg_konstanz.ebus.wholesaler.demo.LoginBean) _jspx_page_context.getAttribute("loginBean", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (loginBean == null){
          loginBean = new de.htwg_konstanz.ebus.wholesaler.demo.LoginBean();
          _jspx_page_context.setAttribute("loginBean", loginBean, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
 
   if(loginBean != null && loginBean.isLoggedIn())
   {	

      out.write("\r\n");
      out.write("\tWelcome ");
      out.print( loginBean.getUserName() );
      out.write(", you are authenticated! <a href=\"");
      out.print( response.encodeURL("controllerservlet?action=logout") );
      out.write("\">Logout</a>\r\n");

   }
   else
   {

      out.write(" \t      \r\n");
      out.write("    Authentication is missing! <br>\r\n");
      out.write("    Please login <a href=\"");
      out.print( response.encodeURL("login.jsp") );
      out.write("\">here</a> an.\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    ");
      if (true) {
        _jspx_page_context.forward("login.jsp");
        return;
      }
      out.write('\r');
      out.write('\n');

   }

      out.write('	');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<p style=\"background-color: whitesmoke; border-bottom: 1px; border-color: silver; border-bottom-style: solid; spacing: 4 4 4 2; padding-left: 6px; padding-top: 4px\">\r\n");
 
   if(loginBean.getRole() == Constants.USER_INTERNAL)
   {	

      out.write("\r\n");
      out.write("<a href=\"");
      out.print( response.encodeURL("welcome.jsp") );
      out.write("\"><img alt=\"Startseite\" title=\"Startseite\" border=\"0\" src=\"images/buttons/home.png\">&nbsp;Home</a>&nbsp;&nbsp;\r\n");
      out.write("<a href=\"");
      out.print( response.encodeURL("controllerservlet?action=showProductList") );
      out.write("\"><img alt=\"Articles\" title=\"Articles\" border=\"0\" src=\"images/buttons/catalog.png\">&nbsp;Articles</a>&nbsp;&nbsp;\r\n");
      out.write("<a href=\"");
      out.print( response.encodeURL("controllerservlet?action=showOrderList") );
      out.write("\"><img alt=\"Orders\" title=\"Orders\" border=\"0\" src=\"images/buttons/order.png\">&nbsp;Orders</a>&nbsp;&nbsp;\r\n");
      out.write("<a href=\"");
      out.print( response.encodeURL("import.jsp") );
      out.write("\"><img alt=\"Import\" title=\"Import\" border=\"0\" src=\"images/buttons/import.png\">&nbsp;Import</a>&nbsp;&nbsp;\r\n");
      out.write("<a href=\"");
      out.print( response.encodeURL("export.jsp") );
      out.write("\"><img alt=\"Export\" title=\"Export\" border=\"0\" src=\"images/buttons/export.png\">&nbsp;Export</a>&nbsp;&nbsp;\r\n");
      out.write("\r\n");
 }
   else if(loginBean.getRole() == Constants.USER_CUSTOMER)
   {	

      out.write("\r\n");
      out.write("\t<a href=\"");
      out.print( response.encodeURL("controllerservlet?action="+Constants.ACTION_READ_WS_SETTINGS) );
      out.write("\"><img alt=\"Preferences\" title=\"Preferences\" border=\"0\" src=\"images/buttons/configure.png\">&nbsp;Preferences</a>\r\n");
      out.write(" \t<a href=\"");
      out.print( response.encodeURL("controllerservlet?action=showOrderList") );
      out.write("\"><img alt=\"Orders\" title=\"Orders\" border=\"0\" src=\"images/buttons/order.png\">&nbsp;Orders</a>&nbsp;&nbsp;\r\n");
      out.write(" \r\n");
 }
   else if(loginBean.getRole() == Constants.USER_SUPPLIER)
   {	

      out.write("\r\n");
      out.write("\t<a href=\"");
      out.print( response.encodeURL("controllerservlet?action="+Constants.ACTION_READ_WS_SETTINGS) );
      out.write("\"><img alt=\"Preferences\" title=\"Preferences\" border=\"0\" src=\"images/buttons/configure.png\">&nbsp;Preferences</a>\r\n");
      out.write(" \t ");

   }

      out.write("\r\n");
      out.write("</p>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h1>Export Product Catalog Matching Short Description</h1>\r\n");
      out.write("<table class=\"dataTable\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th>Export Matching Products</th>\r\n");
      out.write("\t\t<th colspan=\"2\">View</th>\r\n");
      out.write("\t\t<th colspan=\"1\">Download</th>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<form id=\"searchForm\" method=\"post\" action=\"controllerservlet?action=export\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"view\" id=\"view\"/>\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"download\" id=\"download\"/>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"search\" id=\"search\" placeholder=\"SEARCHING TEXT\"/>\r\n");
      out.write("\t\t\t\t<input type=\"reset\" value=\"Reset\">\r\n");
      out.write("\t\t\t</form> \r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\tfunction submitScript(view, download) {\r\n");
      out.write("\t\t\t\tif(document.getElementById(\"search\").value !== \"\"){\r\n");
      out.write("\t\t\t\t\t\tdocument.getElementById(\"view\").value = view;\r\n");
      out.write("\t\t\t\t\t\tdocument.getElementById(\"download\").value = download;\r\n");
      out.write("\t\t\t\t\t\tdocument.getElementById(\"searchForm\").submit();\t\t\t\t\r\n");
      out.write("\t\t\t\t} \r\n");
      out.write("\t\t\t\telse {\r\n");
      out.write("\t\t\t\t\talert(\"Please type in some text!\");\r\n");
      out.write("\t\t\t\t}\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t<td><button onclick=\"submitScript('BMECAT');\">BMECAT</button></td>\r\n");
      out.write("\t\t<td><button onclick=\"submitScript('XHTML');\">XHTML</button></td>\r\n");
      out.write("\t\t<td><button onclick=\"submitScript('BMECAT','yes');\">BMECAT</button></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("</table>\r\n");
      out.write("<p></p>\r\n");
      out.write("<h1>Export Whole Product Catalog</h1>\r\n");
      out.write("<table class=\"dataTable\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th colspan=\"2\">View</th>\r\n");
      out.write("\t\t<th colspan=\"1\">Download</th>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<form method =\"post\" action=\"controllerservlet?action=export&view=BMECAT\">\r\n");
      out.write("\t\t\t\t<button type=\"submit\">BMECAT</button>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<form method =\"post\" action=\"controllerservlet?action=export&view=XHTML\">\r\n");
      out.write("\t\t\t\t<button type=\"submit\">XHTML</button>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<form method =\"post\" action=\"controllerservlet?action=export&view=BMECAT&download=yes\">\r\n");
      out.write("\t\t\t\t<button type=\"submit\">BMECAT</button>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<p>\r\n");
      out.write("<input type=button name=go-back value=\" back \" onclick=\"javascript:history.back()\">\r\n");
      out.write("</p>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
