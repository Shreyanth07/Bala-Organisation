package application2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.io.PrintWriter;



@WebServlet("/Application2")
public class Application2 extends HttpServlet {
	Connection con;
	Statement stmt;
	String dbs="jdbc:sqlserver://localhost:1433;databaseName=Diagnosis;user=shrey;password=shrey12345";
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Application2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=request.getParameter("id");
		String pwd=request.getParameter("password");
		try(PrintWriter out=response.getWriter())
		{
			try {
				System.out.println("ready");
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				System.out.println("done");
				con=DriverManager.getConnection(dbs);
				stmt=con.createStatement();
				String query="SELECT * from Login where  APPLICANT_ID='"+id+"';";
				ResultSet r=stmt.executeQuery(query);
				while(r.next())
				{
					String p=r.getString("PASSWORD");
					if(pwd.equals(p))
					{
						r.close();
					
				String str="SELECT * from Login where APPLICANT_ID='"+id+"' and PASSWORD='"+pwd+"' ";
				ResultSet rs=stmt.executeQuery(str);
				
				while(rs.next())
				{
					
						String str1="SELECT * from Application where APPLICANT_ID='"+id+"'";
						ResultSet rs1=stmt.executeQuery(str1);
						
						while(rs1.next())
						{
							String a=rs1.getString("APPLICANT_ID");
                            String b=rs1.getString("PARENT_NAME");
                            String c1=rs1.getString("APPLICANT_NAME");
                            String d=rs1.getString("APPLICANT_AGE");
                            String e=rs1.getString("PARENT_EMAIL");
                            String f=rs1.getString("PARENT_CONTACT");
                            String g=rs1.getString("APPLICANT_SCHOOL");
                            String h=rs1.getString("APPLICANT_AREA");
                            String i=rs1.getString("APPLICANT_FEES");
                            String j=rs1.getString("APPLICANT_TIER");
                            String k=rs1.getString("APPLICANT_RATING");
                            String l=rs1.getString("APPLICANT_GENDER");
                            String m=rs1.getString("APPLICANT_MESSAGE");
							
							System.out.println(a);
						
										  request.setAttribute("id", a);
                                          request.setAttribute("pname", b);
                                          request.setAttribute("sname", c1);
                                          request.setAttribute("age", d);
                                          request.setAttribute("email", e);
                                          request.setAttribute("contact", f);
                                          request.setAttribute("school", g);
                                          request.setAttribute("area", h);
                                          request.setAttribute("fees", i);
                                          request.setAttribute("tier", j);
                                          request.setAttribute("rating", k);
                                          request.setAttribute("gender", l);
                                          request.setAttribute("message", m);
							
					        RequestDispatcher requestDispatcher = request.getRequestDispatcher("dummy.jsp");
					 
					        requestDispatcher.forward(request, response);
						
						}
					}	
				}

				else
						
					{
						response.sendRedirect("login.jsp");
					}
				}}
		catch(Exception e) 
			{
				//out.println("<h1 style='text-align: center; padding-top:80px;'>Incoorect Student ID or Password<h1>");
				//out.println("<br><br><br><a href='stud.jsp' style='font-size: 20px;text-align:center; padding-top:40px;'>Back to login page...</a>");
				e.printStackTrace();
			}
		}	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
