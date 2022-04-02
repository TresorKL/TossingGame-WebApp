<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Html.html to edit this template
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <style>
             body{
                  font-family: sans-serif;
             }
        h1 { 
            color: #ff1a1a;
           
            text-align: center;
        }
        form{
             margin: auto;
             width: 60%;
             border: 5px solid #FFFF00;
             padding: 10px;
        }
        div > form {
            margin: auto;
             width: 60%;
             padding: 10px;
        }
        #submit{
            color: white;
            background-color: blue;
            height: 40px;
            width: 80px;
            border-radius: 16px;
            border: 0px;
        }
    </style>
    </head>
    <body>
        <h1>Welcome</h1>
        
        <form action="NextTossServlet.do" method="POST">
  <p>PLEASE SELECT AN OPTION BELOW:</p>
  <input type="radio" id="head" name="guess" value="1">
  <label for="head">HEAD</label><br>
  <input type="radio" id="tail" name="guess" value="2">
  <label for="tail">TAIL</label><br>
  <br>  

   
  <input id="submit" type="submit" value="Submit">
</form>
    </body>
</html>
