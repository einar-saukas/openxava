/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2019-10-01 08:57:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.xava.editors;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DateFormat;
import org.openxava.util.Users;
import org.openxava.util.Locales;
import org.openxava.util.XavaResources;
import org.openxava.web.editors.DiscussionComment;
import java.util.UUID;
import java.util.ArrayList;
import java.util.Collection;
import org.openxava.model.meta.MetaProperty;
import org.openxava.web.Ids;

public final class discussionEditor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/lib/standard-jstlel.jar", Long.valueOf(1569836169828L));
    _jspx_dependants.put("jar:file:/C:/Users/javi/git/openxava/OpenXavaTest/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/fmt-1_0.tld", Long.valueOf(1425975068000L));
    _jspx_dependants.put("jar:file:/C:/Users/javi/git/openxava/OpenXavaTest/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/c-1_0.tld", Long.valueOf(1425975068000L));
    _jspx_dependants.put("/xava/editors/../imports.jsp", Long.valueOf(1569836169499L));
    _jspx_dependants.put("/WEB-INF/openxava.tld", Long.valueOf(1569836169832L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.openxava.model.meta.MetaProperty");
    _jspx_imports_classes.add("org.openxava.web.editors.DiscussionComment");
    _jspx_imports_classes.add("org.openxava.util.Users");
    _jspx_imports_classes.add("java.util.Collection");
    _jspx_imports_classes.add("org.openxava.util.XavaResources");
    _jspx_imports_classes.add("java.util.UUID");
    _jspx_imports_classes.add("org.openxava.web.Ids");
    _jspx_imports_classes.add("org.openxava.util.Locales");
    _jspx_imports_classes.add("java.text.DateFormat");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005flabel_0026_005fkey_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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
    _005fjspx_005ftagPool_005fxava_005flabel_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxava_005flabel_0026_005fkey_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

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

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.openxava.web.style.Style style = null;
      style = (org.openxava.web.style.Style) _jspx_page_context.getAttribute("style", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (style == null){
        style = new org.openxava.web.style.Style();
        _jspx_page_context.setAttribute("style", style, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("\r\n");
      out.write("\r\n");
 
String contextPath = (String) request.getAttribute("xava.contextPath");
if (contextPath == null) contextPath = request.getContextPath();
String version = org.openxava.controller.ModuleManager.getVersion();

      out.write("\t\r\n");
      out.write("<script type='text/javascript' src='");
      out.print(contextPath);
      out.write("/dwr/interface/Discussion.js?ox=");
      out.print(version);
      out.write("'></script>\t\r\n");
      out.write("\r\n");

String propertyKey = request.getParameter("propertyKey");
MetaProperty p = (MetaProperty) request.getAttribute(propertyKey);
String discussionId = (String) request.getAttribute(propertyKey + ".value");
if (discussionId == null) discussionId = UUID.randomUUID().toString().replace("-", ""); 
boolean editable="true".equals(request.getParameter("editable"));

      out.write("\r\n");
      out.write("<div class=\"ox-discussion\" id=\"xava_comments_");
      out.print(discussionId);
      out.write("\">   \r\n");

Collection<DiscussionComment> comments = new ArrayList<DiscussionComment>(DiscussionComment.findByDiscussion(discussionId));
DiscussionComment templateComment = new DiscussionComment();
templateComment.setUserName(Users.getCurrent());
comments.add(templateComment);

for (DiscussionComment comment: comments) {
		String hidden = comment.getId() == null?"style='display:none;'":"";
		String formattedTime = comment.getTime()==null?XavaResources.getString(request, "now"):DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, Locales.getCurrent()).format(comment.getTime());

      out.write("\r\n");
      out.write("\t<div class=\"ox-discussion-comment\" ");
      out.print(hidden);
      out.write("> \r\n");
      out.write("\t\t<div class=\"ox-discussion-comment-header\"><span class=\"ox-discussion-comment-author\">");
      out.print(comment.getUserName());
      out.write("</span> - ");
      out.print(formattedTime);
      out.write("</div>\r\n");
      out.write("\t\t<div class=\"ox-discussion-comment-content\">");
      out.print(comment.getComment());
      out.write("</div>  \r\n");
      out.write("\t</div>\r\n");

}

      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
 if (editable) { 
      out.write("\r\n");
      out.write("<textarea id=\"xava_new_comment_");
      out.print(discussionId);
      out.write("\" class=\"ox-simple-ckeditor xava-new-comment\" tabindex=\"1\"></textarea>\r\n");
      out.write("\r\n");
      out.write("<div id=\"xava_new_comment_");
      out.print(discussionId);
      out.write("_buttons\" class=\"ox-discussion-post-button\">\r\n");
      out.write("\t<input type=\"button\" tabindex=\"1\" class=\"");
      out.print(style.getButton());
      out.write("\" style=\"display: none;\" \r\n");
      out.write("\t\tonclick=\"discussionEditor.postMessage('");
      out.print(request.getParameter("application"));
      out.write("', '");
      out.print(request.getParameter("module"));
      out.write("', '");
      out.print(discussionId);
      out.write("')\" value=\"");
      if (_jspx_meth_xava_005flabel_005f0(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("\t<input type=\"button\" tabindex=\"1\" class=\"");
      out.print(style.getButton());
      out.write("\" style=\"display: none;\" \r\n");
      out.write("\t\tonclick=\"discussionEditor.cancel('");
      out.print(discussionId);
      out.write("')\" \r\n");
      out.write("\t\tvalue=\"");
      if (_jspx_meth_xava_005flabel_005f1(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("</div>\r\n");
 } 
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("<input id=\"");
      out.print(propertyKey);
      out.write("\" type=\"hidden\" name=\"");
      out.print(propertyKey);
      out.write("\" value=\"");
      out.print(discussionId);
      out.write('"');
      out.write('>');
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

  private boolean _jspx_meth_xava_005flabel_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:label
    org.openxava.web.taglib.LabelTag _jspx_th_xava_005flabel_005f0 = (org.openxava.web.taglib.LabelTag) _005fjspx_005ftagPool_005fxava_005flabel_0026_005fkey_005fnobody.get(org.openxava.web.taglib.LabelTag.class);
    boolean _jspx_th_xava_005flabel_005f0_reused = false;
    try {
      _jspx_th_xava_005flabel_005f0.setPageContext(_jspx_page_context);
      _jspx_th_xava_005flabel_005f0.setParent(null);
      // /xava/editors/discussionEditor.jsp(55,152) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_xava_005flabel_005f0.setKey("addComment");
      int _jspx_eval_xava_005flabel_005f0 = _jspx_th_xava_005flabel_005f0.doStartTag();
      if (_jspx_th_xava_005flabel_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fxava_005flabel_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005flabel_005f0);
      _jspx_th_xava_005flabel_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005flabel_005f0, _jsp_getInstanceManager(), _jspx_th_xava_005flabel_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_xava_005flabel_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:label
    org.openxava.web.taglib.LabelTag _jspx_th_xava_005flabel_005f1 = (org.openxava.web.taglib.LabelTag) _005fjspx_005ftagPool_005fxava_005flabel_0026_005fkey_005fnobody.get(org.openxava.web.taglib.LabelTag.class);
    boolean _jspx_th_xava_005flabel_005f1_reused = false;
    try {
      _jspx_th_xava_005flabel_005f1.setPageContext(_jspx_page_context);
      _jspx_th_xava_005flabel_005f1.setParent(null);
      // /xava/editors/discussionEditor.jsp(58,9) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_xava_005flabel_005f1.setKey("cancel");
      int _jspx_eval_xava_005flabel_005f1 = _jspx_th_xava_005flabel_005f1.doStartTag();
      if (_jspx_th_xava_005flabel_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fxava_005flabel_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005flabel_005f1);
      _jspx_th_xava_005flabel_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005flabel_005f1, _jsp_getInstanceManager(), _jspx_th_xava_005flabel_005f1_reused);
    }
    return false;
  }
}
