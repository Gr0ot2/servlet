package prueba;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class prueba
 */
@WebServlet("/prueba")
public class prueba extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public prueba() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out;
		out=res.getWriter();
		res.setContentType("text/html");
		
	
			out.println("<html>");
			out.println("<head>"
					+ "<title>datos recogidos</title></head>");
			out.println("<body>");
			out.println("<h1>pulse una opcion</h1>");
			out.println("</body");
			out.println("</html>");	
			
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out;
		out=res.getWriter();
		res.setContentType("text/html");
		String Escoja=(req.getParameter("escoja"));
		if(Escoja.equals("tienda online")) {
			res.sendRedirect("online.jsp");
			
		}else if(Escoja.equals("tienda fisica")) {
			res.sendRedirect("tienda_fisica.jsp");
			
		}else if(Escoja.equals("null")){
		doGet(req, res);
		}
	}

}
