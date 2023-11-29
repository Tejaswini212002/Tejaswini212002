<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
    </style>
<body>
<nav>
    <a href="Addcarservice.jsp">Add</a>
    <a href="Update.jsp" onclick="showUpdate()">Update</a>
    <a href="Delete.jsp" onclick="showDelete()">Delete</a>
    <a href="View.jsp">View</a>
    <a href="Login.jsp">Logout</a>
</nav>
<div class="content">
 <header>
    <h1>Remove Service</h1>
</header>
</div>
<main>
    <form action="Deleteservice" method="get">
    	<label for="sno">Service number:</label>
        <input type="text" id="sno" name="sno" required>
        <button type="submit">Submit</button>
    </form>
</main>
</body>
</html>