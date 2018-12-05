<!DOCTYPE html>
<html>
 <style>
  *{
    
  }
  p { text-align: center; }
  h1 { text-align: center; }
  body{
    background-color: #333333;
  }
  img {
      display: block;     
      margin-left: auto;     
      margin-right: auto;
  }
  .center { margin: auto; text-align: center;}
  .button {
      background-color: #4CAF50;
      border: none;     
      color: white;     
      padding: 16px 32px;     
      text-align: center;     
      text-decoration: none;     
      display: inline-block;          
      cursor: pointer;
      font-size: 32px;
      width: 90%;
      margin: 8px 0px;
      margin-left: 5%;
      margin-right: 5%;
      
  }
  .button2 {
    background-color: #4CAF50;
    border: none;
    color: white;
    width: 90%;
    font-size: 20px;
    padding: 4px 16px;
    margin: 0px 0px;
  }
  .button1 {
    background-color: #555555;
  }
  #join_textfield {width:90%;}
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
    width: 40%;
    height: 50%;
    top: 25%;     left: 30%;
    background-color: rgba(192,192,192,0.85);
    z-index: 3;
    cursor: pointer;
    text-align: center;
    box-sizing: border-box;
    border: 4px solid grey;
    border-radius: 10px;
  }
  .extended_input{
    height: 70%;
  }
  .centered_text{     
    position: absolute;     
    top: 50%;     
    left: 50%;     
    font-size: 50px;     
    color: white;     
    transform: translate(-50%,-50%);     
    -ms-transform: translate(-50%,-50%); 
  }
  input[type=text] {
    width: 90%;
    box-sizing: border-box;
    border: 2px solid white;
    border-radius: 6px;
  }
 </style>
 <head>
   <title>Watch Wth Friends App</title>
   <#include "head.ftl" />
 </head>
   <div id="joinOverlay" class="overlay">
     <div class="overlay_input">
     <div class="centered_text">  
       <h1>
         <b>Join Room</b><br>
         <font size="4">Room ID</font><br>
       </h1>
       <form>
         <input type="text" name="roomName" value="" id="join_textfield">
       </form>
       <input type="submit" onclick="joinRoom()" value="Connect" class="button2">     
       <input type="submit" onclick="joinOff()" value="Cancel" class="button2 button1">
     </div>
     </div>
   </div>

   <div id="createOverlay" class="overlay">
     <div class="overlay_input">
     <div class="centered_text">
       <h1>
         <b>Create Room</b><br>
         <font size="4">Room Name</font><br>
       </h1>
       <form>
         <input type="text" id="create_textfield" value="">
       </form>
       <input type="submit" onclick="createRoom()" value="Connect" class="button2">     
       <input type="submit" onclick="createOff()" value="Cancel" class="button2 button1">
     </div>
     </div>
   </div>


   <#include "navbar.ftl" />
   <h1><b>Welcome to watch with FRIENDS!@#</b></h1>
   <img src="https://www.synaptop.com/wp-content/uploads/2015/01/watch_movie_with_friend_16_6.jpg" alt="random ass image" CSS style="width:95%">
   <p><small><sup>this image is copyrighted</sup></small></p>
   <p>this is an app desgined to watch videos and songs simultaneously with your friends</p>
   <p id="message"><big><b>To get started click one of the buttons below</b></big></p>
   <p><div class="center" style="width:100%">
     <button type="button" class="button" onclick="joinClick()"> Join Room </button>
     <button type="button" class="button button1" onclick="createClick()"> Create Room </button>
    </p>
   </div>

   <script>
    function joinClick() {
      document.getElementById("joinOverlay").style.display = "block";
    }
    function joinOff() {     
      document.getElementById("joinOverlay").style.display = "none"; 
    }
    function createClick() {
      document.getElementById("createOverlay").style.display = "block";
    }
    function createOff() {
      document.getElementById("createOverlay").style.display = "none";
    }
    function joinRoom() {
      var link = getHash(document.getElementById("join_textfield").value);
      var newlink ="https://cs56-f18-watch-with-friends.herokuapp.com/room/"+link;
      location.href=newlink;
    }
    function getHash(str) {
      var hash = 0;
      for (var i = 0; i < str.length; i++) {
         hash += str.charCodeAt(i);
      }
      hashStr = hash.toString(5);
      return hashStr.substring(0,6);
    }
	function createRoom() {
      var link = getHash(document.getElementById("create_textfield").value);
      var newlink ="https://cs56-f18-watch-with-friends.herokuapp.com/room/"+link;
      //window.open("https://cs56-f18-watch-with-friends.herokuapp.com/create/"+link);
      location.href=newlink;
    }
  </script>
 </body>
</html>
