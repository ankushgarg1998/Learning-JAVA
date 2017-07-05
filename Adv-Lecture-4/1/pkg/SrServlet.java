package pkg;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class SrServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		
		if (name.equals("ankush") && pass.equals("garg"))
		{
		resp.sendRedirect("valid.html");
		}
		else
		{
		resp.sendRedirect("invalid.html");
		}
	}
}
