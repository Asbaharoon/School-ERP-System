package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import dao.SectionDao;
import pojo.Section;

/**
 * Servlet implementation class AddSectionServlet
 */
@WebServlet("/Admin/AddSectionServlet")
public class AddSectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String name= request.getParameter("name");
		
		Section sc=new Section();
		
		sc.setSection_name(name);
		
		//SectionDao sd=new SectionDao();
		//sc.insert(sc);
		
		//request.getRequestDispatcher("index.jsp").forward(request, response);
		
		int status=SectionDao.insert(sc);
		
		if (status>0)
		{
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('You are Successfully added')");
			pw.println("location='index.jsp'");
			pw.println("</script>");
		}
		else
		{
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Please try Again.... ')");
			pw.println("location='add-section.jsp'");
			pw.println("</script>");
		}
			
		
	}

}
