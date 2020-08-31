package volunteer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletConfig;

@WebServlet("/Volunteer")
public class Volunteer extends HttpServlet {
	Connection conn;
	Statement stmt;
	String dbstring="jdbc:sqlserver://localhost:1433;databaseName=Diagnosis;user=shrey;password=shrey12345";
       
    public Volunteer() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		String email=request.getParameter("email");
		String contact=request.getParameter("contact");
		String degree=request.getParameter("degree"); 
		String gender=request.getParameter("gender"); 
		String interest=request.getParameter("interest");
		String exp=request.getParameter("exp");
		String location=request.getParameter("location");
		String message=request.getParameter("message");
	
		try(PrintWriter out=response.getWriter())
		{
			out.println("<h1>Warm Greetings from Bala Organisations to "+name+"</h1>");
			out.println("<h2>We are happy to inform that your profile is updated!! </h2>");
			out.println("<h2>You will get an interview call shortly from one of our senior executive</h2>");
			out.println("<body style='color:white; background:url(https://www.wallpapertip.com/wmimgs/11-119968_computer-aided-diagnosis-ai.jpg); padding-top:17%; padding-left:13%; font-family:sans-serif; border:10px solid rgba(0,0,0,0.6); border-radius:5px; opacity:0.8'>");
			out.println("<br><br>");

		try 
			{
			System.out.println("Successfully registered");
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				System.out.println("Successfully updated");
				conn=DriverManager.getConnection(dbstring);
				stmt=conn.createStatement();
				String query="insert into Volunteer values('"+name+"','"+age+"','"+email+"','"+contact+"','"+degree+"','"+gender+"','"+interest+"','"+exp+"','"+location+"','"+message+"');";
				stmt.execute(query);
			System.out.println("Successfully Inserted");
			
			String s="SELECT VOLUNTEER_ID, VOLUNTEER_NAME from Volunteer where VOLUNTEER_EMAIL='"+email+"'";
			ResultSet rp=stmt.executeQuery(s);
			
			while(rp.next())
			{
				String x=rp.getString("VOLUNTEER_ID");
				String y=rp.getString("VOLUNTEER_NAME");
				String z="INSERT into Login1 values('"+x+"','"+y+"','"+x+"');";
				stmt.execute(z);
				System.out.println("VOLUNTEER_ID and Password Generated");
				out.println("<h2>You will be generated with a Volunteer ID and Password..Please tell the password to the interviewer before taking the interview!!");
				out.println("<h1>Your VOLUNTEER_ID is: "+x+" and the password is: "+x+ "</h2>");
				System.out.println(x);
				out.println("<a href='index.html' style='font-weight:500; color: white; padding-top:17%; padding-left:25%; font-family:sans-serif;'>Click Here to Redirect Back to Home Page</a>");
			}
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
