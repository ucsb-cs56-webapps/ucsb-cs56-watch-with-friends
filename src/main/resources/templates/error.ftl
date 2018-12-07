<!DOCTYPE html>
<html>
 <head>
  <style>
    .button{
       background-color: #555555;
       color: white;
       font-size: 20px;
       padding: 4px 16px;
       margin: 8px 4px;
       box-sizing: border-box;
       border: 2px solid #777777;
       border-radius: 4px;
       width: 90%;
       margin-left:5%;
     }
     h1 {
       text-align: center;
     }
   </style>

   <title>Error</title>
   <#include "head.ftl" />
 </head>
 <body style="background-color:#333333;">
   <#include "navbar.ftl" />
   <h1> <font color="white">Sorry an error has occured</h1><font>
 
   <input type="button" onclick="goBack()" value="Click Here to go Back"class="button">
 </body>
 <script> 
   function goBack() {     
     window.history.back(); 
   } 
 </script>
</html>
