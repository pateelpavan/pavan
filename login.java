// Java Backend for Login Page

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Simple authentication logic (Replace with a database check in real scenarios)
        if ("Pavan".equals(username) && "pavan123".equals(password)) {
            out.println("<h2>Login successful!</h2>");
        } else {
            out.println("<h2>Invalid username or password</h2>");
        }
        out.close();
    }
}