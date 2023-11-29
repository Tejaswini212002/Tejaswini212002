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
            margin: 0;
            font-family: Arial, sans-serif;
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
          header {
            background-color: #333;
            color: white;
            text-align: center;
            padding: 1em;
        }

        main {
            padding: 20px;
        }

        .service {
            border: 1px solid #ddd;
            margin-bottom: 20px;
            padding: 10px;
        }

        .service h2 {
            color: #333;
        }

        .service ul {
            list-style-type: none;
            padding: 0;
        }

        .service li {
            margin-bottom: 5px;
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
    <h1>Car Service Details</h1>
</header>

<main>
    <div class="service">
        <h2>Oil Change</h2>
        <ul>
            <li>Replace engine oil</li>
            <li>Replace oil filter</li>
            <li>Inspect other fluids</li>
        </ul>
        <p>Price: 2000</p>
    </div>

    <div class="service">
        <h2>Brake Inspection and Repair</h2>
        <ul>
            <li>Inspect brake pads and rotors</li>
            <li>Replace brake pads if necessary</li>
            <li>Brake fluid replacement</li>
        </ul>
        <p>Price: 3000</p>
    </div>
    <div class="service">
        <h2>General Service</h2>
        <p>Price: 2500</p>
    </div>

    <!-- Add more service sections as needed -->

</main>
</div>
</body>
</html>