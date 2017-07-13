package osa;

import static osa.OfyService.ofy;
//import static com.googlecode.objectify.ObjectifyService.ofy;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import osa.UserDetails;

@SuppressWarnings("serial")
public class Datatstore_demoServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

//		String name = req.getParameter("email");
//		String pass = req.getParameter("pass");
//
//		UserDetails user = new UserDetails(name, pass);
//		UserDetails usr1 = new UserDetails("abc", "123");
//
//		ofy().save().entities(user);
//		ofy().save().entity(usr1);
		
		
//		ofy().delete().type(UserDetails.class).ids("abc","ankush").now();
//		System.out.println(th1.pass);

		List<UserDetails> li = ofy().load().type(UserDetails.class).list();
		for(int i=0; i<li.size();i++) {
			System.out.println(li.get(i).name);
		}
		
		ofy().clear();

		
//		resp.getWriter().println("Your data has been saved successfully please check the datastore");

//		System.out.println("name = " + name);
//		System.out.println("pass = " + pass);
	}
}
