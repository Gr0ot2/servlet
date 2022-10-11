package prueba;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 * Servlet implementation class Prueba2
 */
@WebServlet("/Prueba2")
public class Prueba2 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public Prueba2() {
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
    out = res.getWriter();
    res.setContentType("text/html");
    String Nombre = (req.getParameter("nombre"));
    String Apellido = (req.getParameter("apellido"));
    String Telefono = (req.getParameter("telefono"));
    String Correo = (req.getParameter("correo"));
    String Yes = (req.getParameter("yes"));
    String Select = (req.getParameter("1"));
    ArrayList < Object > gmail = new ArrayList < Object > ();
    gmail.add("jose@gmail.com");
    gmail.add("luis@gmail.com");
    gmail.add("raul@gmail.com");
    ArrayList < Object > gmails = new ArrayList < Object > ();
    gmails.add("roberto@gmail.com");
    gmails.add("marcos@gmail.com");
    gmails.add("lucas@gmail.com");
    ArrayList < Object > gmailss = new ArrayList < Object > ();
    gmailss.add("jorge@gmail.com");
    gmailss.add("diego@gmail.com");
    gmailss.add("alvaro@gmail.com");
    if (Select.equals("zara")) {
      if (Yes.equals("si")) {
        if (gmail.contains(Correo)) {
          out = res.getWriter();
          res.setContentType("text/html");
          out.println("<html>");
          out.println("<head>");
          out.println("<link rel=stylesheet href=tiendas.css >");
          out.println("<title>datos recogidos</title>");
          out.println("</head>");;
          out.println("<body>");
          out.println("<h1> el usuario " + Nombre + " " + Apellido + "</h1>");
          out.println("<h2> con credenciales " + Correo + " " + Telefono + "</h2>");
          out.println("<h1> ha entrado " + Select + "</h1>");
          out.println("<img src=img/zara.jpeg>");
          out.println("</body");
          out.println("</html>");
        } else {
          out.println("<html>");
          out.println("<head>");
          out.println("<link rel=stylesheet href=tiendas.css >");
          out.println("<title>datos recogidos</title>");
          out.println("</head>");;
          out.println("<body>");
          out.println("<h1> el usuario " + Nombre + "</h1>");
          out.println("<h2> con credenciales " + Correo + " " + Telefono + "</h2>");
          out.println("<h1> ha entrado " + Select + "</h1>");
          out.println("<img src=img/zara.jpeg>");
          out.println("</body");
          out.println("</html>");
        }

      } else {
        JOptionPane.showMessageDialog(null, "por favor acepte los terminos");
        res.sendRedirect("tienda_fisica.jsp");
      }
    } else if (Select.equals("H&M")) {
      if (Yes.equals("si")) {
        if (gmails.contains(Correo)) {
          out = res.getWriter();
          res.setContentType("text/html");
          out.println("<html>");
          out.println("<head>");
          out.println("<link rel=stylesheet href=tiendas.css >");
          out.println("<title>datos recogidos</title>");
          out.println("</head>");
          out.println("<body>");
          out.println("<h1> el usuario " + Nombre + " " + Apellido + "</h1>");
          out.println("<h2> con credenciales " + Correo + " " + Telefono + "</h2>");
          out.println("<h1> ha entrado " + Select + "</h1>");
          out.println("<img src=img/H&M.jpeg>");
          out.println("</body");
          out.println("</html>");
        } else {
          out.println("<html>");
          out.println("<head>");
          out.println("<link rel=stylesheet href=tiendas.css >");
          out.println("<title>datos recogidos</title>");
          out.println("</head>");
          out.println("<body>");
          out.println("<h1> el usuario " + Nombre + "</h1>");
          out.println("<h2> con credenciales " + Correo + " " + Telefono + "</h2>");
          out.println("<h1> ha entrado " + Select + "</h1>");
          out.println("<img src=img/H&M.jpeg>");
          out.println("</body");
          out.println("</html>");
        }
      } else {
        JOptionPane.showMessageDialog(null, "por favor acepte los terminos");
      }
    } else if (Select.equals("bershka")) {
      if (Yes.equals("si")) {
        if (gmailss.contains(Correo)) {
          out = res.getWriter();
          res.setContentType("text/html");
          out.println("<html>");
          out.println("<head>");
          out.println("<link rel=stylesheet href=tiendas.css >");
          out.println("<title>datos recogidos</title>");
          out.println("</head>");
          out.println("<body>");
          out.println("<h1> el usuario " + Nombre + " " + Apellido + "</h1>");
          out.println("<h2> con credenciales " + Correo + " " + Telefono + "</h2>");
          out.println("<h1> ha entrado " + Select + "</h1>");
          out.println("<img src=img/bershka.jpeg>");
          out.println("</body");
          out.println("</html>");
        } else {
          out.println("<html>");
          out.println("<head>");
          out.println("<link rel=stylesheet href=tiendas.css >");
          out.println("<title>datos recogidos</title>");
          out.println("</head>"); 
          out.println("<body>");
          out.println("<h1> el usuario " + Nombre + " " + Apellido + "</h1>");
          out.println("<h2> con credenciales " + Correo + " " + Telefono + "</h2>");
          out.println("<h1> ha entrado " + Select + "</h1>");
          out.println("<img src=img/bershka.jpeg>");
          out.println("</body");
          out.println("</html>");
        }
      } else {
        JOptionPane.showMessageDialog(null, "por favor acepte los terminos");
      }
    } else if (Select.equals("")) {
      JOptionPane.showMessageDialog(null, "escoja una tienda");
    }

  }

}