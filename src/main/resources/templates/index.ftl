<!DOCTYPE html>
<html>
 <style>
  p { text-align: center; }
  h1 { text-align: center; }
  img {
      display: block;     
      margin-left: auto;     
      margin-right: auto;deploy
  }
  .center { margin: auto; }
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
  .button1 {background-color: #555555;}
 </style>
 <head>
   <title>Watch Wth Friends App</title>
   <#include "head.ftl" />
 </head>
 <body>
   <#include "navbar.ftl" />
   <h1><b>Welcome to watch with FRIENDS!@#</b></h1>
   <img src="https://www.synaptop.com/wp-content/uploads/2015/01/watch_movie_with_friend_16_6.jpg" alt="random ass image" CSS style="width:95%">
   <p><small><sup>this image is copyrighted</sup></small></p>
   <p>this is an app desgined to watch videos and songs simultaneously with your friends</p>
   <p><big><b>To get started click one of the buttons below</b></big></p>
   <p><div class="center" style="width:100%">
     <button type="button" class="button" onclick="location.href='video'"> Join Room </button>
     <button type="button" class="button button1" onclick="location.href='music'"> Create Room </button>
    </p>
    <p><a href="video">test page</a></p>
   </div>
 </body>
</html>
