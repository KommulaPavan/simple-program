package test;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewAllProductServlet extends GenericServlet {
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		ArrayList<ProductBean> al=new ViewAllProducrDAO().retrieve();
		if(al.size()==0) {
			pw.println("Products Not Availabrl...<br>");
		}else {
			pw.println("+++ProductDetails++<br>");
			Spliterator<ProductBean> sp=al.spliterator();
			sp.forEachRemaining((k)->
			{
				ProductBean pb=(ProductBean)k;
				pw.println(pb.getpCode()+"&nbps&nbps"+pb.getpName()+"&nbps&nbps"+
				pb.getpPrice()+"&nbps&nbps"+pb.getpQty()+"<br>");
				
			});
		}
		pw.println("<a href='home.html'>home<a>");
	}

}
