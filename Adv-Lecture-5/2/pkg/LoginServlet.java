package pkg;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");

		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		
		Cookie c1 = new Cookie("username", name);
		Cookie c2 = new Cookie("password", pass);
		
		resp.addCookie(c1);
		resp.addCookie(c2);
		
		if (pass.equals("garg"))
			resp.sendRedirect("valid");
		else
			resp.sendRedirect("invalid.html");
	}
		
}
