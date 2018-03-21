/*
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "CheckOutFilter", urlPatterns = {"/", "/home"})
public class CheckOutFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        try {
            Integer age = Integer.parseInt(request.getParameter("age"));
            request.setAttribute("age", age);
            request.getRequestDispatcher("age.jsp").forward(request, response);
        } catch ()

    }

    @Override
    public void destroy() {

    }
}
*/
