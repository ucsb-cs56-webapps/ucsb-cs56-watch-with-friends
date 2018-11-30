<!DOCTYPE html>
<html>
  <style>
    #vcontainer{
      display: table;
      height: 100%;
      width: 100% ;  
    }
    #hcontainer{
      display: table-cell;
      vertical-align: middle;
      text-align: center;
    }
    #content{
      display: inline-block;
      border: lightGray 1px solid;
      background-color: lightBlue;
      text-align: left;
    }
  </style>
  <head>
    <title>Join</title>
    <#include "head.ftl" />
  </head>
  <body>
    <#include "navbar.ftl" />
    <div id="vcontainer"><div id="hcontainer">
      <div id="content">
        <h1>Joinning server</h1>
        <form action="/video"> 
          <input type="text" name="invi_code"><br> 
        <input type="submit" value="Submit"> </form>
      </div>
    </div></div>
</html>
