<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Volunteer Registration</title>
    <link rel="stylesheet" href="volunteer.css">
    <link href="https://fonts.googleapis.com/css?family=Raleway:300,400,700&display=swap" rel="stylesheet">
</head>
<body>
    <section id="header">
    <div class="header container">
      <div class="nav-bar">
        <div class="brand">
          <a href="index.html" style="text-decoration: none;"><h1><span>B</span>ala  <span>O</span>rganisations</h1></a>
        </div>
      </div>
    </div>
  </section>
    <main>
        <div class="background">
            <div class="text">
                <h1>Volunteer Registration</h1>
            </div>
            <div class="box">
                <form action="Volunteer" method="get">
                    <div class="form">
                    <input type="text" name="name" style="border-bottom: 1px solid white" placeholder="Name" required>
                    <input type="text" name="age" style="border-bottom: 1px solid white" placeholder="Age" required>
                    <input type="email" name="email" style="border-bottom: 1px solid white" placeholder="Email ID" required>
                    <input type="text" name="contact" style="border-bottom: 1px solid white" placeholder="Contact Number" required>
                    <select name="degree">
                      <option value="BE">B.E</option>
                      <option value="ME">M.E</option>
                      <option value="MBBS">MBBS/BDS</option>
                      <option value="BCOM">B.COM</option>
                      <option value="MBA">M.B.A</option>
                      <option value="BSC">B.S.C</option>
                      <option value="Other">Other</option>
                     </select>
                     <br>
                     <select name="gender">
	                  <option value="Male">Male</option>
	                  <option value="Female">Female</option>
	                  <option value="Other">Other</option>
	                 </select>
	                 <br>
	                 <select name="interest">
	                 <option value="interests">Select area of interests</option>
	                  <option value="Teaching">Teaching</option>
	                  <option value="Validation">Profile Validation</option>
	                  <option value="Support">Customer Support</option>
	                  <option value="Management">Management Executive</option>
	                  <option value="Volunteer">Volunteer</option>
	                  <option value="BDE">Business Executive</option>
	                 </select>
	                 <br>
	                 <select name="exp">
	                  <option value="exps">Previous experience in an NGO</option>
	                  <option value="yes">Yes</option>
	                  <option value="no">No</option>
	                 </select>
	                 <br>
	                 <select name="location">
	                  <option value="locs">Willing to work in any location</option>
	                  <option value="yes">Yes</option>
	                  <option value="no">No</option>
	                 </select>
	                 <br>
                    <input type="text" rows="5" cols="55" name="message" style="border-bottom: 1px solid white" placeholder="Message" required>
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
          <span class="far fa-copyright"></span> 2020 All rights reserved by Bala Diagnostics.
        </center>
</div>
</footer>
</body>
</html>