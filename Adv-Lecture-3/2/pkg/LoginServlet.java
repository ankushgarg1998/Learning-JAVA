package pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {
	ServletConfig con;
	public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		con = getServletConfig();
		String aname = con.getInitParameter("aname");
		String apass = con.getInitParameter("apass");
		
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		out.println("<html><body><h1>");
		if (name.equals(aname) && pass.equals(apass))
			out.println("Valid");
		else
			out.println("Invalid");
		out.println("</h1></body></html>");
	}
		
}
