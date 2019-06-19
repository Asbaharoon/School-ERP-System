package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.SectionDao;

import pojo.Section;
import pojo.Standard;

/**
 * Servlet implementation class AddStandardServlet
 */
@WebServlet("/Admin/AddStandardServlet")
public class AddStandardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String Std_name= request.getParameter("std_name");
		String Std_div= request.getParameter("div_name");
		double  Totalfees=Double.parseDouble(request.getParameter("totalfee"));
		double Transportfees=Double.parseDouble (request.getParameter("tra_fees"));
		//String section= request.getParameter("sec_name");
		String staff= request.getParameter("staff");
		
		
		int sec_id = Integer.parseInt(request.getParameter("sec_name"));
		Section section= SectionDao.getSectioneById(sec_id);
		
		
		Standard std=new Standard();
		
		std.setStandard_name(Std_name);
		std.setStandard_division(Std_div);
		std.setTotalfees(Totalfees);
		std.setTransportfees(Transportfees);
		std.setSection(section);
		
		
		int status=StandardDao.add_standard(std);
		
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
