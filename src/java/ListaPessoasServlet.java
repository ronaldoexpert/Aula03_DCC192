
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ListaPessoasServelet", urlPatterns = {"/pessoas.html"})
public class ListaPessoasServlet extends HttpServlet{
    private List<String> pessoas;
    public ListaPessoasServlet(){
        pessoas = new ArrayList<String>();
        pessoas.add("Ronaldo S");
        pessoas.add("Mazu");
        pessoas.add("Expert Info");        
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        try(PrintWriter out = resp.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Página Principal</title>");            
            out.println("</head>");
            out.println("<H1>Lista de Pessoas</h1>");
            out.println("<ul>");
            out.println("<li><a href='index.html'>Início</a></li>");
            out.println("<li><a href='relogio.html'>Relógio</a></li>");
            out.println("<li><a href='numeros.html'>Números de 1 a 100</a></li>");
            out.println("<li><a href='pares.html'>Números de 1 a 100 (Pares)</a></li>");
            out.println("<li><a href='impares.html'>Números de 1 a 100 (Impares)</a></li>");
            out.println("<li><a href='pessoas.html'>Pessoas</a></li>");
            out.println("</ul>");
            
            
            out.println("<ul>");
            for (String pessoa : pessoas) {
                out.println("<li>"
                        + pessoa + "</li>");
            }
            out.println("</ul>");
            
            
            out.println("</body>");
            out.println("</html>");   
        }
    }
    
}
