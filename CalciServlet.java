package Calculator;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class CalciServlet extends GenericServlet
{
	Double SUM=0.0,MUL=1.0,DIV=1.0,SUB=0.0;
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
   {
	PrintWriter pw=res.getWriter(); 
	
	Double num1=Double.parseDouble((req.getParameter("num1")));
	Double num2=Double.parseDouble((req.getParameter("num2")));
	String opt=req.getParameter("operations");
	pw.println("<body></body>");
	switch (opt) {

	case "SUM":
	SUM=num1+num2;
	pw.println("<h1>Result="+SUM+"</h1>");
	break;
	case "SUB":
		SUB=num1-num2;
	pw.println("<h1>Result="+SUB+"</h1>");
	break;
	case "MUL":
		MUL=num1*num2;
	pw.println("<h1>Result="+MUL+"</h1>");
	break;
	case "DIV":
		DIV=num1/num2;
	pw.println("<h1>Result="+DIV+"</h1>");
	
	pw.println("<a href='index.html'>indexpage</a>");
  // System.out.println(SUM);
//	System.out.println(sub);
//	System.out.println(mul);
//	System.out.println(div);
//	
//	
	
	
	
   }
}

}
