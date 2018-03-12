
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/numeros.html", "/impares.html", "/pares.html"})
public class Numeros extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try (PrintWriter out = resp.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Página Principal</title>");
            out.println("</head>");
            out.println("<H1>Numeros de 1 a 100</h1>");            
            out.println("<ul>");
            out.println("<li><a href='index.html'>Início</a></li>");
            out.println("<li><a href='relogio.html'>Relógio</a></li>");
            out.println("<li><a href='numeros.html'>Números de 1 a 100</a></li>");
            out.println("<li><a href='pares.html'>Números de 1 a 100 (Pares)</a></li>");
            out.println("<li><a href='impares.html'>Números de 1 a 100 (Impares)</a></li>");
            out.println("<li><a href='pessoas.html'>Pessoas</a></li>");
            out.println("</ul>");

            resp.setContentType("text/html");
            
            if (req.getServletPath().equals("/numeros.html")) {
                for (int i = 1; i <= 100; i++) {
                    out.println(i);
                }   
            }else if (req.getServletPath().equals("/pares.html")){
                for (int i = 1; i <= 100; i++) {
                    if (i % 2 == 0){
                        out.println(i);   
                    }                    
                }
            }else{
                for (int i = 1; i <= 100; i++) {
                    if (i % 2 != 0){
                        out.println(i);   
                    }                    
                }
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }

}
