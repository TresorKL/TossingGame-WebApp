<%-- 
    Document   : Summary
    Created on : 29 Mar 2022, 17:40:01
    Author     : tresorkl
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <style>
             body{
                 font-family: sans-serif;
             }
             h1{
                 margin-bottom: 15px;
             }
             #again{
            color: white;
            background-color: blue;
            height: 40px;
            width: 80px;
            border-radius: 16px;
            border: 0px;
            margin-bottom:20px;
             }
          #end{
            color: white;
            background-color: red;
            height: 40px;
            width: 80px;
            border-radius: 16px;
            border: 0px;
            margin-bottom:20px;
             }
             
             .container{
                 
                 
  
             margin: auto;
             width: 60%;
             border: 5px solid #DE3163;
             padding: 10px;
             position: relative;
             top:10vw;
             }
         </style>
    </head>
    <body>
        <% 
            
        String result = session.getAttribute("result").toString();
         
        int score=(int)session.getAttribute("score");
        int tosses=(int)session.getAttribute("numOfTosses");
        
        %>
        
        <div class="container">
        <h1>RESULT: <%=result%></h1>
        <h1>NUMBER OF TOSS: <%=tosses%></h1>
        
                 
        <form action="PlayAgainServlet.do" method="POST">
            <input id="again" type="submit" value="PLAY AGAIN">
            
        </form>
        <form action="EndGameServlet.do" method="POST">
            <input id="end" type="submit" value="END GAME">
            
        </form>
        
        </div>
   
        
    </body>
</html>
