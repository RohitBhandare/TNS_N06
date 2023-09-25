package com.myservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Demo")
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public Connection getCon() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
		} catch (Exception e) {

			e.printStackTrace();
		}

		return con;
	}

	public ResultSet getStudents() {
		Connection con = getCon();
		ResultSet rs = null;
		try {
			Statement s = con.createStatement();
			rs = s.executeQuery("select * from marks");
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return rs;
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.println("<head>");
		out.println("<title>Welcome</title>");
		out.println("<link rel='stylesheet' type='text/css' href='style.css' >");
		out.println("<head>");
		out.println("<body>");
		out.println("<center >");
		out.println("<h1>Welcome To My Web Page</h1>");
		out.println("<form  action='StudentController' method='POST'>");
		out.println("Enter the Name: <input type='text' name='name'>");
		out.println("Roll Number: <input type='text' name='roll' required>");
		out.println("Marks: <input type='text' name='marks'><br><br>");
		out.println("<input type='submit'>");
		out.println("<br><br>");
		out.println("</form>");
		// Check if there is a delete message in the session
		HttpSession session = request.getSession();
		String deleteMessage = (String) session.getAttribute("deleteMessage");
		session.removeAttribute("deleteMessage");

		// Display delete message using JavaScript
		if (deleteMessage != null) {
		    out.print("<script>alert('" + deleteMessage + "')</script>");
		}
		try {

			ResultSet rs = getStudents();
			out.println("<table>");
			out.println("<tr><th>Roll No</th> <th>Name</th> <th>Marks</th> <th>Actions</th></tr>");
			while (rs.next())
				out.println("<tr><td>" + rs.getInt(1) + "</td>" + "<td>" + rs.getString(2) + "<td>" + rs.getInt(3)
						+ "</td> <td><a href='DeleteStudent?roll="+rs.getInt(1)+"'>Delete</a></td></tr></center>");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		out.println("</table>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
