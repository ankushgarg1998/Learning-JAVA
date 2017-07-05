package pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class HitmanServlet_Cookies extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		PrintWriter out = resp.getWriter();
		HttpSession sess = req.getSession();
		Integer count = (Integer)sess.getAttribute("hitCount");
		if (count == null)
			count = new Integer(1);
		sess.setAttribute("hitCount", count+1);
		out.println(count + "session is new ? The answer is :" + sess.isNew());
//		out.println(sess.getCreationTime());
//		out.println(sess.getLastAccessedTime());
//		out.println(sess.getMaxInactiveInterval());
//		out.println(sess.getId());
		
//		sess.invalidate();
	}
}
