<!DOCTYPE html>
<html>
 <head>
   <title>Video</title>
   <#include "head.ftl" />
   <style>
     *{
       font-family: Courier New;
     }
     body{
       background-color: #333333;
     }
     .center {text-align:center;}
     .button{
       background-color: #555555;
       color: white;
       font-size: 20px;
       padding: 4px 16px;
       margin: 8px 4px;
       box-sizing: border-box;
       border: 2px solid #777777;
       border-radius: 4px;
     }
     .button1 {
       background-color: #4CAF50;
       border: none;
       color: white;
       width: 70%;
       font-size: 20px;
       padding: 4px 16px;
       margin: 4px 4px;
     }
     .button2 {
       background-color: #555555;
     } 
     iframe{
       box-sizing: border-box;
       border: 4px solid #1f4720;
       border-radius: 5px;
       height:85vh;
       width: 100vw;
     }
     .input_field{
       width: 70%;
       margin: 4px 4px;
       border: none;
       border-radius: 3px;
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
       height: 26vh;
       top: 37%;     left: 30%;
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
         <font size="4" id="session_url">https://cs56-f18-watch-with-friends.herokuapp.com/room?room=${id}</font><br>
       </h1>
       <input type="submit" onclick="copy()" value="Copy" class="button1">     
       <input type="submit" onclick="linkOff()" value="Close" class="button1 button2">
     </div>
     </div>
   </div>

 

   <div id="playlistOverlay" class="overlay">
     <div class="overlay_input">
     <div class="centered_text">
       <h1>
         <b>Add Video</b><br>
         <!--<font size="4">video url</font><br>-->
       </h1>
       <form>
         <input type="text" id="add_field" class="input_field" value="">
       </form>
       <input type="submit" onclick="submitVid()" value="Add" class="button1">     
       <input type="submit" onclick="addOff()" value="Cancel" class="button1 button2">
     </div>
     </div>
   </div>

   <#include "navbar.ftl" />
   <div text-align: center>
   <iframe id="vidFrame" src="${videoURL}" class="center"> 
   <p>${videoURL}</p>
   </iframe>
   </div>
   <input type="button" onclick="getLink()" value="get link" class="button">
   <input type="button" onclick="addVid()" value="add video" class="button">
   <!--<input type="button" onclick"" value="get link" class=button>-->
   
   <font name="roomName" color="white" size="6" id="current_vid"><B>Currently Room:</b> ${roomName}</font>
   <p hidden id="roomID">${id}</p>
</body>

 <script>
   function onLoad(){
     var url = document.getElementById("videoFrame").src;
     if(url == "none") {
       document.getElementById("videoFrame").src = "https://i.ibb.co/KW5TFrj/Unavalible.png"
     }
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
     if(str != ""){
	     var mod1 = str.replace("watch?v=","embed/");
	     var mod2 = mod1 + "?autoplay=1";
	     document.getElementById("vidFrame").src = mod2;
	     document.getElementById("playlistOverlay").style.display = "none";
	     document.getElementById("current_vid").innerHTML = mod2;

         var url = document.getElementById("roomID").innerHTML;

         window.open("https://cs56-f18-watch-with-friends.herokuapp.com/vid/"+url+"/"+mod2);
     }
   }

   function copy() {   
     var copyText = document.getElementById("session_url").innerHTMLw;   
     copyText.select();   
     document.execCommand("copy");
   }
 </script>
</html>
