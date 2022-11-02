package Servlete;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        RequestDispatcher rd = getServletConfig().getServletContext().getRequestDispatcher("/jsp/myfile.jsp").forward(request,response);

        response.setContentType("text/html");
        getServletConfig().getServletContext()
                .getRequestDispatcher("/login.jsp").forward(request,response);



        // Hello
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>hhhhhhhhhhhhhh</h1>");
//        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>true used</h1>");
        out.println("</body></html>");

    }
}
