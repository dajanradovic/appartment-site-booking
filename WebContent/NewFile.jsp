<%@page import="java.util.ArrayList, java.io.PrintWriter "%>
<%@page import="com.dajance.*"%>
<%@page import=" java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
										<%
								ArrayList<Integer> slobodniDatumi = new ArrayList<Integer>();
									
										KonekcijaUBazu prva = new KonekcijaUBazu();
									try {
										prva.slobodniDatumi(slobodniDatumi);
									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									out.print(slobodniDatumi.get(7));
									%>
</body>
</html>