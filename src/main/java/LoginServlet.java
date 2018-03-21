/*import login.User;
import login.UserRepository;*/

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Optional;

/**
 * Created by Rafal on 2018-03-10.
 */
@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {

    private static String BAD_CREDENTIALS_DESCRIPTION = "You entered invalid credentials !";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Optional<User> userByCredentials = UserRepository.getUserByCredentials(username, password);
        if (userByCredentials.isPresent()) {
            HttpSession session = req.getSession();
            session.setAttribute("user", userByCredentials.get());
            resp.sendRedirect("/home");
        } else {
            req.setAttribute("error", BAD_CREDENTIALS_DESCRIPTION);
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }

    }
}
