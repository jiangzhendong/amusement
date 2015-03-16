<%@page import="java.util.*" %>

<html>

<body>

<%

out.println("<h2>Hello World!</h1>");

out.println(request.getLocalAddr() + " : " + request.getLocalPort()+"<br>");

out.println("<br>ID "+session.getId()+"<br>");

String dataName=request.getParameter("dataName");

if (dataName != null && dataName.length() > 0){

    String dataValue=request.getParameter("dataValue");

    session.setAttribute(dataName, dataValue);

}

out.println("<b>Session List</b><br>");

System.out.println("==============================");

Enumeration e=session.getAttributeNames();

while(e.hasMoreElements()){

    String name=(String)e.nextElement();

    String value=session.getAttribute(name).toString();

    out.println(name+" = "+value+"<br>");

    System.out.println(name+" = "+value);

}

%>

<form action="index.jsp" method="POST">

  NAME:<input type=text size=20 name="dataName"><br>

  VALUE:<input type=text size=20 name="dataValue"><br>

  <input type=submit>

</form>

</body>

</html>
