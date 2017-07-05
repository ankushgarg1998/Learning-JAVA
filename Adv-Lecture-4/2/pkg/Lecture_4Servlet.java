package pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Lecture_4Servlet extends HttpServlet {
	public void doGet (HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/plain");
		PrintWriter out = res.getWriter();
		ServletContext s = getServletContext();
//		HttpSession s = req.getSession();
		Integer count = (Integer)s.getAttribute("hitCount");
		if (count == null)
		{
		count = new Integer(1);
		}
		s.setAttribute("hitCount", count+1);
		out.println(count);
	}
}
