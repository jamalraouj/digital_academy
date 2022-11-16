package Servlete;

import Entity.Participant;
import Entity.Responsable;
import Entity.Role;
import Entity.TypeResponsable;
import Service.Implimentation.ServiceParticipantImp;
import Service.Implimentation.ServiceResponsableImp;
import Service.Interface.ServiceInterface;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "UpdateResponsable", value = "/UpdateResponsable")
public class UpdateResponsable extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServiceInterface serviceInterface =new ServiceResponsableImp();
        Responsable r= (Responsable) serviceInterface.findById(Long.parseLong(request.getParameter("id")));
        request.setAttribute("responsableToEdit",r);
        System.out.println(r.toString());

        request.getRequestDispatcher("/Responsable/UpdateResponsable.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServiceInterface<Responsable> serviceResponsable = new ServiceResponsableImp();
        Responsable responsable = (Responsable) serviceResponsable.findById(Long.parseLong(request.getParameter("id")));
        String name =request.getParameter("name").trim();
        String phone =request.getParameter("phone").trim();
        Role role=Role.Responsable;
        String domaine =request.getParameter("domaine").trim();
        TypeResponsable typeResp=TypeResponsable.valueOf(request.getParameter("typeResp").trim());


        Responsable r=new Responsable(responsable.getId(),name,phone,role,domaine,typeResp);
        serviceResponsable.update(r);

//        RequestDispatcher reqd = request.getRequestDispatcher("add_activity");
//        reqd.forward(request, response);
        response.sendRedirect(request.getContextPath() + "/Responsable");
    }
}
