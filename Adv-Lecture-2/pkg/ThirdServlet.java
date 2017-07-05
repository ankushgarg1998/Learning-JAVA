package pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

@SuppressWarnings("serial")
public class ThirdServlet extends HttpServlet {
	public void service(ServletRequest req, ServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><body><h1>Yo by third method</h1></body></html>");
	}

}
