<!DOCTYPE html>
<html>
<head>

<title>Bala Organisation Application</title>
<style>
.heading {
  background-color: #102029;
  height: 200px;
  width: 100%;
  font-family: "Times New Roman", Times, serif; 
}
.heading a {
  float: left;
  font-size: 16px;
  color: white;
  padding: 10px 16px;
  font-family: inherit;
  text-decoration: none;
  
}
.text {
  color: #f2f2f2;
  font-size: 15px;
  padding: 8px 12px;
  position: absolute;
  bottom: 100px;
  width: 100%;
  text-align: center;
}
a:hover {
  color: yellow;
}
p{
font-size: 20px;
text-align: center;
color: grey;
line-height: 2;
padding-left: 80px;
padding-right: 80px;}
h2{
  color:white;
  text-align: center;
  padding-left: 150px;
  }
  footer
{
	height:30px;
	position: relative;
	left: 0;
	bottom: 0;
	width: 100%;
	text-align:center;
	font-size: 20px; 
	padding: 50px 0px 0px 0px;	
}
footer p
{
	font-size: 16px;
  color:grey;
}
</style>
</head>
<body>
<div class="heading">
<h2><a href="index.html">BALA ORGANISATIONS</a></h2>
</div>
<br> <br>
	<p>Applicant ID             : <b>${id}</b> </p>
    <p>Parent Name              : <b>${pname}</b> </p>
    <p>Applicant Name           : <b>${sname}</b> </p>
    <p>Applicant Age            : <b>${age}</b> </p>
    <p>Parent Email             : <b>${email}</b> </p>
    <p>Parent Contact           : <b>${contact}</b> </p>
    <p>Applicant School         : <b>${school}</b> </p>
    <p>Applicant School Area    : <b>${area}</b> </p>
    <p>Applicant School Fees    : <b>${fees}</b> </p>
    <p>Applicant School Tier    : <b>${tier}</b> </p> 
    <p>Applicant School Rating  : <b>${rating}</b> </p> 
    <p>Applicant School Gender  : <b>${gender}</b> </p> 
    <p>Parent Message           : <b>${message}</b> </p>    
<br><br> <br> <br>
<hr style="width:75%">
<br> <br>
</body>
</html>