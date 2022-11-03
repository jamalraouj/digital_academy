package Servlete;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletProfile", value = "/ServletProfile")
public class ServletProfile extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        getServletConfig().getServletContext()
                .getRequestDispatcher("/login.jsp").forward(request,response);
        HttpSession httpSession = request.getSession();
        PrintWriter out = response.getWriter();
        if(httpSession.getAttribute("loggedUser") != null){

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
