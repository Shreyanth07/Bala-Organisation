<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Application Form for school admission</title>
    <link rel="stylesheet" href="application.css">
    <link href="https://fonts.googleapis.com/css?family=Raleway:300,400,700&display=swap" rel="stylesheet">
</head>
<body>
    <section id="header">
    <div class="header container">
      <div class="nav-bar">
        <div class="brand">
          <a href="index.html" style="text-decoration: none;"><h1><span>B</span>ala  <span>O</span>rganisation</h1></a>
        </div>
      </div>
    </div>
  </section>
    <main>
        <div class="background">
            <div class="text">
                <h1>Application for school admission</h1>
                <p>Already Applied? Click Here <a href="login.jsp">Login</a></p>
            </div>
            <div class="box">
                <form action="Application" method="get">
                    <div class="form">
                    <input type="text" name="pname" style="color:black; font-weight:500;border-bottom: 1px solid white" placeholder="Parent Name" required>
                    <input type="text" name="sname" style="color:black; font-weight:500;border-bottom: 1px solid white" placeholder="Student Name" required>
                    <input type="text" name="age" style="color:black; font-weight:500;border-bottom: 1px solid white" placeholder="Student Age" required>
                    <input type="email" name="email" placeholder="Parent Email ID" style="color:black; font-weight:500;border-bottom: 1px solid white" required>
                    <input type="text" name="contact" placeholder="Parent Contact Number" style="color:black; font-weight:500;border-bottom: 1px solid white" required>
                    <input type="text" name="school" placeholder="Preferred School" style="color:black; font-weight:500;border-bottom: 1px solid white" required>
                    <input type="text" name="area" placeholder="Preferred City" style="color:black; font-weight:500;border-bottom: 1px solid white" required>
                    <select name="fees">
                     <option value="greater25">Select the preferred fees range</option>
                      <option value="fees-1">Between Rs. 8000 - Rs. 15000</option>
                      <option value="fees-2">Between Rs. 15000 - Rs. 30000</option>
                      <option value="fees-3">Between Rs. 31000 - Rs. 45000</option>
                      <option value="fees-4">Above Rs. 45000</option>
                     </select>
                     <br>
                      <select name="tier">
                      <option value="tiers">Select the preferred tier of school</option>
                      <option value="tier-a">Tier-A Schols</option>
                      <option value="tier-b">Tier-B Schools</option>
                      <option value="tier-c">Tier-C schools</option>
                     </select>
                     <br>
                     <select name="rating">
                      <option value="rates">Select the preferred rating of school</option>
                      <option value="rating-1">Above 4.5 rating</option>
                      <option value="rating-2">Above 4.0 rating</option>
                      <option value="rating-3">Above 3.5 rating</option>
                     </select>
                     <br>
                     <select name="gender">
	                  <option value="Male">Male</option>
	                  <option value="Female">Female</option>
	                  <option value="Other">Other</option>
	                 </select>
	                 <br>  
                    <input type="text" rows="5" cols="55" name="message" style="color:black; font-weight:500;border-bottom: 1px solid white" placeholder="Message" required>  
                    <input type="submit" class="button" value="Submit">
                    </div>
                </form>
            </div>
        </div>
    </main>
    <footer>
<div class="bottom">
<center>
          <span class="credit">Designed and developed by <a href="https://www.instagram.com/_sb_07_/">ShreyanthBalasubramanian</a> | </span>
          <span class="far fa-copyright"></span> 2020 All rights reserved by Bala Organisation.
        </center>
</div>
</footer>
</body>
</html>