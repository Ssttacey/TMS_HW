import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Registration extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
       getServletContext().getRequestDispatcher("/save-request.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        if (!isAnyValueNull(name, email)) {
            req.setAttribute("name", name);
            req.setAttribute("email", email);
            getServletContext().getRequestDispatcher("/success.jsp").forward(req, resp);
        }else {
            getServletContext().getRequestDispatcher("/save-request.jsp").forward(req, resp);
        }
    }

    private boolean isAnyValueNull(String name, String email) {
        return name == null
                || email == null
                || name.isEmpty()
                || email.isEmpty();
    }
}