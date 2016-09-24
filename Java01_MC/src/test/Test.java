package test;

import java.io.PrintWriter;
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Test extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.println("Helloooooooo Yuki!");
	}

}
