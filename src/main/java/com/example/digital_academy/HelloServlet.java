package com.example.digital_academy;

import java.io.*;

import Entity.Role;
import Entity.User;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello SuperAdmin!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession httpSession = request.getSession();
        User user = (User) httpSession.getAttribute("loggedUser");
        if(user == null || user.getRole() != Role.SuperAdmin){

            response.sendRedirect(request.getContextPath() + "/login");
            return;
        }
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}