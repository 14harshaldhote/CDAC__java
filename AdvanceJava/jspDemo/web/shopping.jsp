<%-- 
    Document   : shopping
    Created on : 24-Nov-2023, 2:18:24 pm
    Author     : harshalsMac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Shopping Page</title>
</head>
<body>
    <h1>Welcome to Our Shopping App</h1>

    <form method="post" action="gbill.jsp">
        <div>
            <input type="checkbox" name="products" value="Shampoo"> Shampoo -10
        </div>
        <div>
            <input type="checkbox" name="products" value="BodyWash"> Body Wash - 8
        </div>
        <div>
            <input type="checkbox" name="products" value="Lotion"> Body Lotion - 15
        </div>

        <div>
            <button type="submit">Generate Bill</button>
        </div>
    </form>

</body>
</html>
