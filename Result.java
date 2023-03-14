package Calculator;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class Result extends GenericServlet
{
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException
	{
     
	 CalciServlet cs=new CalciServlet();
	 PrintWriter pw=resp.getWriter();
	 pw.println("<html><body bgcolor=green>");
	 pw.println("<h1>"+cs.SUM+"</h1>");
	 pw.println("<h1>"+cs.SUB+"</h1>");
	 pw.println("<h1>"+cs.MUL+"</h1>");
	 pw.println("<h1>"+cs.DIV+"</h1>");
	 pw.println("</html></body>");
	
	
	}
	
	
}


	