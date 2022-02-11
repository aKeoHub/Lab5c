<%-- 
    Document   : shoppingList
    Created on : 10-Feb-2022, 4:32:10 PM
    Author     : Kingston
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Shopping List</h1>
        <p>Hello, ${name}, <a href="">Logout</a></p>
        
        <h2>List</h2>
        
        <form>
            <label for="item">Add Item</label>
            <input type="text" name="name" id="name">
            
            
            
            <button type="submit">Add</button>
        </form>
        
        
        <form action="ShoppingList" method="post">
            <input type="hidden" name="action" value="add">
            <p>
            <input type="radio" name="item" value="apples">
            apples
            </p>
            <button type="submit">Delete</button>
        </form>
            
            
    </body>
</html>
