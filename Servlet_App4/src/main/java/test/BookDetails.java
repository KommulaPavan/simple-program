package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/bd")
public class BookDetails extends GenericServlet {
	public void init() throws ServletException{
		//no code
	}
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String Bname=req.getParameter("bName");
		String Bid=req.getParameter("bId");
		String bAuthor=req.getParameter("bAuthor");
		String bquntity=req.getParameter("bQuantity");
		String bprice=req.getParameter("bPrice");
		pw.println("+++BookDetails+++");
		pw.println("<br>BookName:"+Bname);
		pw.println("<br>BookId:"+Bid);
		pw.println("<br>BookAuthor:"+bAuthor);
		pw.println("<br>BookQuntatiy:"+bquntity);
		pw.println("<br>BookPrice:"+bprice);	
	}
	public void destroy() {
		//nocode
	}
	

}
