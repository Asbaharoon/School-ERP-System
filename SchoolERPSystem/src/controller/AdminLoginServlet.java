package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.AdminDao;
import pojo.Admin;


@WebServlet("/Admin/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String name= request.getParameter("name");
		String password= request.getParameter("password");
		
		Admin a=new Admin();
		a.setAdmin_name(name);
		a.setAdmin_pass(password);
		
		Admin a2= AdminDao.loginAdmin(a);
		
		if(a2!=null)
		{
		    if(password.equals(a2.getAdmin_pass())&& name.equals(a2.getAdmin_name()))
		      {
			   HttpSession session =request.getSession();
			    session.setAttribute("Admin", a2);
			    pw.println("<script type=\"text/javascript\">");
				pw.println("alert('You are Successfully logged in')");
				pw.println("location='index.html'");
				pw.println("</script>");

		     }
		   else
		   {
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('name and Password incorrect')");
			pw.println("location='Login.jsp'");
			pw.println("</script>");
		   }
		
	    }
		else
		{
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('oops error....login again')");
			pw.println("location='AdminIndex.jsp'");
			pw.println("</script>");
		}
	}
		
	}


