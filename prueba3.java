package prueba;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 * Servlet implementation class prueba3
 */
@WebServlet("/prueba3")
public class prueba3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public prueba3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out;
		out=res.getWriter();
		res.setContentType("text/html");
		String Nombre=(req.getParameter("nombre"));
		String Apellido=(req.getParameter("apellido"));
		String Telefono=(req.getParameter("telefono"));
		String Correo=(req.getParameter("correo"));
		String Yes=(req.getParameter("yes"));
		String Select=(req.getParameter("1"));
		if(Select.equals("amazon")) {
			if(Yes.equals("si")) {
			out=res.getWriter();
			res.setContentType("text/html");
				out.println("<html>");
				out.println("<head>");
				out.println("<title>datos recogidos</title>");
				out.println("</head>");;
				out.println("<body>");
				out.println("<h1> el usuario "+Nombre+" "+Apellido+"</h1>");
				out.println("<h2> con credenciales "+Correo+" "+Telefono+"</h2>");
				out.println("<h1> ha entrado "+Select+"</h1>");
				out.println("</body");
				out.println("</html>");	
			}else {
				JOptionPane.showMessageDialog(null, "por favor acepte los terminos");
			}
			
		}else if(Select.equals("H&M")) {
			if(Yes.equals("si")) {
			out=res.getWriter();
			res.setContentType("text/html");
				out.println("<html>");
				out.println("<head>");
				out.println("<link >");
				out.println("<title>datos recogidos</title>");
				out.println("</head>");
				out.println("<body>");
				out.println("<h1> el usuario "+Nombre+" "+Apellido+"</h1>");
				out.println("<h2> con credenciales "+Correo+" "+Telefono+"</h2>");
				out.println("<h1> ha entrado "+Select+"</h1>");
				out.println("</body");
				out.println("</html>");	
			}else {
				JOptionPane.showMessageDialog(null, "por favor acepte los terminos");
			}
		}else if(Select.equals("maximo dutti")) {
			if(Yes.equals("si")) {
			out=res.getWriter();
			res.setContentType("text/html");
				out.println("<html>");
				out.println("<title>datos recogidos</title></head>");
				out.println("<body>");
				out.println("<h1> el usuario "+Nombre+" "+Apellido+"</h1>");
				out.println("<h2> con credenciales "+Correo+" "+Telefono+"</h2>");
				out.println("<h1> ha entrado "+Select+"</h1>");
				out.println("</body");
				out.println("</html>");	
			}else {
				JOptionPane.showMessageDialog(null, "por favor acepte los terminos");
			}
		}else if(Select.equals("")) {
			JOptionPane.showMessageDialog(null, "escoja una tienda");
		}
	}

}
