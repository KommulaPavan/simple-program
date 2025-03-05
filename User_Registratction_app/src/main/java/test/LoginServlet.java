package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		UserBean ub=new LoginDAO().Login(req);
		if(ub==null) {
			req.setAttribute("msg","Invalid valid Process<br>");
			RequestDispatcher rd=req.getRequestDispatcher("Home.jsp");
			rd.forward(req, res);
		}else {
			ServletContext sct=req.getServletContext();
			sct.setAttribute("ubean", ub);
			Cookie ck=new Cookie("FristName",ub.getfName());
			res.addCookie(ck);
			RequestDispatcher rd=req.getRequestDispatcher("Log.jsp");
			rd.forward(req, res);
		
		}
	}

}
