package proyecto;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class caballos_seleccionCM
 */
@WebServlet("/caballos_seleccionCM")
public class caballos_seleccionCM extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public caballos_seleccionCM() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String opcion=(request.getParameter("escoja"));
		nombreC c= new nombreC();
		if(opcion.equals("Cap")) {
		      response.sendRedirect("cap.jsp");
		      String nombre=c.setNombre("cap");
				 c.getNombre(nombre);
		}else if(opcion.equals("M")){
				response.sendRedirect("M.html");
				 String nombre=c.setNombre("m");
				 c.getNombre(nombre);
		}
		}

}
