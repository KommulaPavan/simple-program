package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewProfileServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		Cookie c[]=req.getCookies();
		if(c==null) {
			req.setAttribute("msg", "SessionExpired");
			RequestDispatcher rd=req.getRequestDispatcher("Home.jsp");
			rd.forward(req, res);
		}else {
			String name=c[0].getValue();
			req.setAttribute("fName", name);
			RequestDispatcher rd=req.getRequestDispatcher("view.jsp");
			rd.forward(req, res);
			
			
		
		}
	}

}
