package Servlete;

import Entity.Person;
import Entity.Role;
import Entity.User;
import Service.Implimentation.ServiceUserImp;
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
        HttpSession httpSession = request.getSession();
        if(httpSession.getAttribute("loggedUser") != null){
            response.sendRedirect(request.getContextPath() + "/");
            return;
        }
        getServletConfig().getServletContext()
                .getRequestDispatcher("/login.jsp").forward(request,response);

//        PrintWriter out = response.getWriter();
//        System.out.println(httpSession.getAttribute("loggedUser").toString());

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //PrintWriter out = response.getWriter();
        //out.println("<html><body>");
        //out.println("<h1>true used</h1>");

        String email=request.getParameter("userEmail").trim();
        String password=request.getParameter("userPass").trim();

        ServiceUserImp serviceUserImp = new ServiceUserImp();
        try {
            User user = serviceUserImp.doLogin(email, password);
            HttpSession httpSession = request.getSession();
            httpSession.setAttribute("loggedUser", user);
            if(user.getRole() == Role.SuperAdmin){
                response.sendRedirect(request.getContextPath() + "/hello-servlet");
            } else if (user.getRole() == Role.Administrator) {
                response.sendRedirect(request.getContextPath() + "/activity");
            }
        }catch (Exception e){
            e.getMessage();
        }

        //out.println("</body></html>");

    }
}
