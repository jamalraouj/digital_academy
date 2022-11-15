package Servlete;

import Entity.Participant;
import Entity.Responsable;
import Service.Implimentation.ServiceParticipantImp;
import Service.Implimentation.ServiceResponsableImp;
import Service.Interface.ServiceInterface;
import Service.Interface.ServiceResponsable;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServletResponsable", value = "/Responsable")
public class ServletResponsable extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        ServiceInterface serviceResponsable =new ServiceResponsableImp();
        List<Responsable> responsables =  serviceResponsable.findAll();
        responsables.forEach(responsable -> {
            System.out.println(responsable.getName());
        });
        request.setAttribute("responsables",responsables);
        request.getRequestDispatcher("/Responsable/Responsable.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
