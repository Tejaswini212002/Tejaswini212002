<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="user.Viewservice" %>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }

        header {
            background-color: #333;
            color: white;
            text-align: center;
            padding: 1em;
        }

        main {
            padding: 20px;
            text-align: center;
        }

        form {
            background-color: white;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
            width: 300px;
            margin: 0 auto;
        }

        label {
            display: block;
            margin-bottom: 8px;
        }

        input,textarea {
            width: 100%;
            padding: 8px;
            margin-bottom: 16px;
            box-sizing: border-box;
        }

        button {
            background-color: #333;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        button:hover {
            background-color: #555;
        }
          nav {
            background-color: #333;
            overflow: hidden;
        }

        nav a {
            float: left;
            display: block;
            color: white;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        }

        nav a:hover {
            background-color: #ddd;
            color: black;
        }
         .content {
            padding: 16px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        th, td {
            padding: 12px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #333;
            color: white;
        }

        tr:hover {
            background-color: #f5f5f5;
        }
    </style>
<body>
<% 
	List n=Viewservice.data();
%>
<nav>
    <a href="Addcarservice.jsp">Add</a>
    <a href="Update.jsp" onclick="showUpdate()">Update</a>
    <a href="Delete.jsp" onclick="showDelete()">Delete</a>
    <a href="View.jsp">View</a>
    <a href="Login.jsp">Logout</a>
</nav>
<div class="content">
 <header>
    <h1>Car Service Details</h1>
</header>
</div>
<main>
<table border>
				  <thead>
				    <tr>
				      <th>Cno</th>
				      <th>Customer name</th>
				      <th>Make</th>
				      <th>Model</th>
				      <th>Year</th>
				      <th>Color</th>
				      <th>Car number</th>
				      <th>Pickup date</th>
				      <th>Service </th>
				    </tr>
				  </thead>
				  <tbody>
				  
				  	<%
				          for(int i=0; i<n.size(); i++) {
				        	 String[] custArr=((String)n.get(i)).split(":");    	 
				    %>
				  	  <tr>
				          <td><%= custArr[0] %></td>
					      <td><%= custArr[1] %></td>
					      <td><%= custArr[2] %></td>
					      <td><%= custArr[3] %></td>
					      <td><%= custArr[4] %></td>
					      <td><%= custArr[5] %></td>
					      <td><%= custArr[6] %></td>
					      <td><%= custArr[7] %></td>
					      <td><%= custArr[8] %></td>
					     
					   </tr>
				     <%
				   	      }                              
				     %>
				    <tr>
				      
				    </tr>
				  </tbody>
				</table>
</main>

</body>
</html>