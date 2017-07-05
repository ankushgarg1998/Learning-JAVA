package pkg;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@SuppressWarnings("serial")
public class SecondServlet  extends GenericServlet{
	
	public void service (ServletRequest req, ServletResponse res) throws IOException {
		res.setContentType("text/html");
		res.getWriter().println("<html><body><h1>YO by second method</h1></body></html>");
	}

}
