package application;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Application")
public class Application extends HttpServlet {
	
	Connection conn;
	Statement stmt;
	String dbstring="jdbc:sqlserver://localhost:1433;databaseName=Diagnosis;user=shrey;password=shrey12345";
	public void init(ServletConfig config) throws ServletException {
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String id=request.getParameter("id");
		String pname=request.getParameter("pname");
		String sname=request.getParameter("sname");
		String age=request.getParameter("age");
		String email=request.getParameter("email");
		String contact=request.getParameter("contact");
		String school=request.getParameter("school");
		String area=request.getParameter("area");
		String fees=request.getParameter("fees");
		String tier=request.getParameter("tier"); 
		String rating=request.getParameter("rating");
		String gender=request.getParameter("gender");
		String message=request.getParameter("message");
	
		try(PrintWriter out=response.getWriter())
		{
			out.println("<h1>Hello, "+pname+" </h1>");
			out.println("<h2>Your Application has been approved successfully!!</h2>");
			out.println("<h2>Our executive will contact you shortly </h2>");
			out.println("<body style='color:black; background:url(https://cdnb.artstation.com/p/assets/images/images/013/494/433/large/mel-florance-conceptart9.jpg?1539848666); padding-top:17%; padding-left:20%; font-family:sans-serif; border:10px solid rgba(0,0,0,0.6); border-radius:5px; opacity:0.8'>");
			out.println("<br><br>");
		try 
			{
			    System.out.println("Successfully registered");
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				System.out.println("Successfully updated");
				conn=DriverManager.getConnection(dbstring);
				stmt=conn.createStatement();
				String query="insert into Application values('"+pname+"','"+sname+"','"+age+"','"+email+"','"+contact+"','"+school+"','"+area+"','"+fees+"','"+tier+"','"+rating+"','"+gender+"','"+message+"');";
				stmt.execute(query);
			System.out.println("Successfully Inserted");
			
			String r="SELECT APPLICANT_ID, APPLICANT_NAME from Application where PARENT_EMAIL='"+email+"'";
			ResultSet rp=stmt.executeQuery(r);
			
			while(rp.next())
			{
				String x=rp.getString("APPLICANT_ID");
				String y=rp.getString("APPLICANT_NAME");
				String z="INSERT into Login values('"+x+"','"+y+"','"+x+"');";
				stmt.execute(z);
				System.out.println("UserID and Password Generated");
				out.println("<h1>Your UserID is: "+x+" and the password is: "+x+ "</h2>");
				out.println("<a href='index.html' style='color: black; padding-top:17%; padding-left:20%; font-family:sans-serif;'>Click Here to Redirect Back to Home Page</a>");
				System.out.println(x);
			}
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
