/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.77
 * Generated at: 2017-07-04 10:26:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/error.jsp", Long.valueOf(1499157643000L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1499157643000L));
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>eBusiness Framework Demo - Login</title>\r\n");
      out.write("<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"default.css\">\r\n");
      out.write("</head>\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h1>Login</h1>\r\n");
      out.write("\r\n");
      out.write("<form name=\"loginForm\" method=\"post\" action=\"");
      out.print( response.encodeURL("controllerservlet") );
      out.write("\" >\r\n");
      out.write("<input type=\"hidden\" name=\"action\" value=\"login\">\r\n");
      out.write("<table>\r\n");
      out.write("<tr><td>Username:</td><td><input name=\"username\" value=\"\" /></td></tr>\r\n");
      out.write("<tr><td>Password:</td><td><input name=\"password\" type=\"password\" value=\"\"></td></tr>\r\n");
      out.write("<tr><td>Role:</td><td>\r\n");
      out.write("<select name=\"role\" size=\"1\">\r\n");
      out.write("\t<option value=\"1\" selected>Internal</option>\r\n");
      out.write("\t<option value=\"2\">Customer</option>\r\n");
      out.write("\t<option value=\"3\">Supplier</option>\r\n");
      out.write("</select></td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("<p>\r\n");
      out.write("<input type=\"submit\" name=\"Submit\" value=\"Login\">\r\n");
      out.write("<input type=\"reset\" value=\"Reset\">\r\n");
      out.write("</p>\r\n");
      out.write("<br>\r\n");
      out.write("<p>\r\n");
      out.write("<b>Internal user:</b><br>\r\n");
      out.write("Username: <a href=\"");
      out.print( response.encodeURL("controllerservlet?action=login&role=1&username=internal1&password=internal1") );
      out.write("\"><i>internal1</i></a> and password: <i>internal1</i><br>\r\n");
      out.write("<br>\r\n");
      out.write("<b>Customer:</b><br>\r\n");
      out.write("Username: <a href=\"");
      out.print( response.encodeURL("controllerservlet?action=login&role=2&username=customer1&password=customer1") );
      out.write("\"><i>customer1</i></a> and password: <i>customer1</i><br>\r\n");
      out.write("Username: <a href=\"");
      out.print( response.encodeURL("controllerservlet?action=login&role=2&username=customer2&password=customer2") );
      out.write("\"><i>customer2</i></a> and password: <i>customer2</i><br>\r\n");
      out.write("<br>\r\n");
      out.write("<b>Supplier:</b><br>\r\n");
      out.write("Username: <a href=\"");
      out.print( response.encodeURL("controllerservlet?action=login&role=3&username=supplier1&password=supplier1") );
      out.write("\"><i>supplier1</i></a> and password: <i>supplier1</i><br>\r\n");
      out.write("Username: <a href=\"");
      out.print( response.encodeURL("controllerservlet?action=login&role=3&username=supplier2&password=supplier2") );
      out.write("\"><i>supplier2</i></a> and password: <i>supplier2</i><br>\r\n");
      out.write("</p>\r\n");
      out.write("</form>\r\n");
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
