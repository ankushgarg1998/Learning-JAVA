package pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Valid extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		Cookie c[] = req.getCookies();
		for (int i=0; i<c.length; i++) {
			out.println(c[i].getName());
			out.println(c[i].getValue());
		}
	}
		
}
