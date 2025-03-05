package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateProfileServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws
	ServletException,IOException{
		Cookie c[]=req.getCookies();
		if(c==null) {
		req.setAttribute("msg","Session Expired..<br>");
		RequestDispatcher rd=req.getRequestDispatcher("home.jsp");
		rd.forward(req, res);
		}else {
			String name=c[0].getValue();
			req.setAttribute("fName", name);
			ServletContext sct=req.getServletContext();
			UserBean ub=(UserBean)sct.getAttribute("ubean");
			ub.setAddr(req.getParameter("addr"));
			ub.setmId(req.getParameter("mid"));
			ub.setPhno(Long.parseLong(req.getParameter("phno")));
			int k=new UpdateProfileDAO().update(ub);
			if(k>0) {
				req.setAttribute("msg", "Profile Update Sucessfullyy..<br>");
				RequestDispatcher rd=req.getRequestDispatcher("update.jsp");
				rd.forward(req, res);
			}
		}
	}

}
