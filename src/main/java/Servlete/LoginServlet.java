package com.example.digital_academy;

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
        getServletConfig().getServletContext()
                .getRequestDispatcher("/login.jsp").forward(request,response);
        HttpSession httpSession = request.getSession();
        PrintWriter out = response.getWriter();
        if(httpSession.getAttribute("loggedUser") != null){
            
        }
//        System.out.println(httpSession.getAttribute("loggedUser").toString());





        // Hello

//        out.println("<html><body>");
//        out.println("<h1>hhhhhhhhhhhhhh</h1>");
//        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();


        String email=request.getParameter("userEmail").trim();
        String password=request.getParameter("userPass").trim();

        ServiceUserImp serviceUserImp = new ServiceUserImp();
        User user = serviceUserImp.doLogin(email ,password);
        HttpSession httpSession = request.getSession();
        httpSession.setAttribute("loggedUser", user );
        System.out.println("========="+user.getName()+user.getEmail());

//        HttpSession httpSession = request.getSession();
//        httpSession.setAttribute("user", user);

        out.println("<html><body>");
        out.println("<h1>true used"+user.getEmail()+user.getName()+"</h1>");
        out.println("</body></html>");

    }
}
