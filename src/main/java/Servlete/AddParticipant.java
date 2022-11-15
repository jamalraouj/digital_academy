package Servlete;

import Entity.*;
import Service.Implimentation.ServiceActivity;
import Service.Implimentation.ServiceParticipantImp;
import Service.Implimentation.ServiceResponsableImp;
import Service.Interface.ServiceInterface;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.time.LocalDate;

@WebServlet(name = "AddParticipant", value = "/AddParticipant")
public class AddParticipant extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ajouter ====");
        request.getRequestDispatcher("/Participant/AddParticipant.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name =request.getParameter("name").trim();
        String phone =request.getParameter("phone").trim();
        Role role=Role.Participant;
        String domaine =request.getParameter("domaine").trim();
        String structure =request.getParameter("structure").trim();
        ServiceInterface<Participant> serviceParticipant = new ServiceParticipantImp();

        Participant p=new Participant(name,phone,role,domaine,structure);
        System.out.println("=== add participant ===");
        System.out.println(p.toString());
        serviceParticipant.insert(p);

//        RequestDispatcher reqd = request.getRequestDispatcher("add_activity");
//        reqd.forward(request, response);
        response.sendRedirect(request.getContextPath() + "/Participant");
    }
}
