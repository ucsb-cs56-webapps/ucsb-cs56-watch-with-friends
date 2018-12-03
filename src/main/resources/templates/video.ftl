<!DOCTYPE html>
<html>
 <head>
   <title>Video</title>
   <#include "head.ftl" />
   <style>
     body{
       background-color: #333333;
     }
     .button{
       background-color: #555555;
       border: none;
       color: white;
       font-size: 5;
       padding: 4px 16px;
       margin: 8px 4px;
     }
     iframe{
       box-sizing: border-box;
       border: 4px solid #1f4720;
       border-radius: 5px;
       height:85vh;
       width: 100vw;
     }
   
    .overlay {
      position: fixed;
      display: none;
      width: 100%;
      height: 100%;
      background-color: rgba(0,0,0,0.5);
      z-index:2;
    }
    .overlay_input{
      position: fixed;
      width: 40vw;
      height: 30vh;
      top: 25%;     left: 30%;
      background-color: rgba(192,192,192,0.85);
      z-index: 3;
      cursor: pointer;
      text-align: center;
      box-sizing: border-box;
      border: 4px solid grey;
      border-radius: 10px;
    }
    .short_overlay{
      height: 25vh;
    }
     
   </style>
 </head>
 <body onload = "onLoad()">

   <div id="urlOverlay" class="overlay">
     <div class="overlay_input">
     <div class="centered_text">
       <h1>
         <b>Share Room</b><br>
         <font size="6" id="session_url">video url</font><br>
       </h1>
       <input type="submit" onclick="copy()" value="Copy" class="button2">     
       <input type="submit" onclick="linkOff()" value="Close" class="button2 button1">
     </div>
     </div>
   </div>

 

   <div id="playlistOverlay" class="overlay">
     <div class="overlay_input">
     <div class="centered_text">
       <h1>
         <b>Add Video</b><br>
         <font size="4">video url</font><br>
       </h1>
       <form>
         <input type="text" id="add_field" value="">
       </form>
       <input type="submit" onclick="submitVid()" value="Add" class="button2">     
       <input type="submit" onclick="addOff()" value="Cancel" class="button2 button1">
     </div>
     </div>
   </div>

   <#include "navbar.ftl" />
   <div text-align: center>
   <iframe id="vidFrame" src="https://cdn.dribbble.com/users/46891/screenshots/973812/color.jpg"> 
   <p>No Video Avalible</p>
   </iframe>
   </div>
   <input type="button" onclick="getLink()" value="get link" class=button>
   <input type="button" onclick="addVid()" value="add video" class=button>
   <!--<input type="button" onclick"" value="get link" class=button>-->
   
   <font color="white" id="current_vid">Currently Playing: Unavalible</font>

 </body>

 <script>
   function onLoad(){
     document.getElementById("current_vid").innerHTML = "Currently Playing: K/DA - POP/STARS";
   }

   function getLink(){
     document.getElementById("urlOverlay").style.display = "block";
   }

   function linkOff(){
     document.getElementById("urlOverlay").style.display = "none";
   }

   function addVid(){ 
     document.getElementById("playlistOverlay").style.display = "block";
     document.getElementById("add_field").value = "";
   }

   function addOff(){
     document.getElementById("playlistOverlay").style.display = "none";
   }

   function submitVid(){
     var str = document.getElementById("add_field").value;
     var mod1 = str.replace("watch?v=","embed/");
     var mod2 = mod1 + "?autoplay=1";
     document.getElementById("vidFrame").src = mod2;
     document.getElementById("playlistOverlay").style.display = "none";
     document.getElementById("current_vid").innerHTML = mod2;
   }

   function copy() {   
     var copyText = document.getElementById("session_url");   
     copyText.select();   
     document.execCommand("copy");
   }
 </script>
</html>
