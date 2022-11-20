package Servlete;

import Entity.*;
import Service.Implimentation.ServiceParticipantImp;
import Service.Implimentation.ServiceResponsableImp;
import Service.Interface.ServiceInterface;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "AddResponsable", value = "/AddResponsable")
public class AddResponsable extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession httpSession = request.getSession();
        User user = (User) httpSession.getAttribute("loggedUser");
        if(user == null || user.getRole() != Role.Administrator){
            response.sendRedirect(request.getContextPath() + "/login");
            return;
        }
        request.getRequestDispatcher("/Responsable/AddResponsable.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name =request.getParameter("name").trim();
        String phone =request.getParameter("phone").trim();
        Role role=Role.Responsable;
        TypeResponsable typeResp=TypeResponsable.valueOf(request.getParameter("typeResp").trim());
        String domaine =request.getParameter("domaine").trim();
        ServiceInterface<Responsable> serviceResponsable = new ServiceResponsableImp();
        Responsable r=new Responsable(name,phone,role,typeResp,domaine);
        serviceResponsable.insert(r);

        response.sendRedirect(request.getContextPath() + "/Responsable");
    }
}
