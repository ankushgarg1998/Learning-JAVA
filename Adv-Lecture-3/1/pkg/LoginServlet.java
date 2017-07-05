package pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		out.println("<html><body><h1>");
		if (name.equals("ankush") && pass.equals("garg"))
			out.println("Valid");
		else
			out.println("Invalid");
		out.println("</h2></body></html>");
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		out.println("<html><body><h1>");
		if (name.equals("ankush") && pass.equals("garg"))
			out.println("Validg");
		else
			out.println("Invalidg");
		out.println("</h2></body></html>");
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		out.println("<html><body><h1>");
		if (name.equals("ankush") && pass.equals("garg"))
			out.println("Validp");
		else
			out.println("Invalidp");
		out.println("</h2></body></html>");
	}
	
}
