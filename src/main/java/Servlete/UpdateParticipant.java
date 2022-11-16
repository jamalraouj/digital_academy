package Servlete;

import Entity.Participant;
import Entity.Role;
import Entity.User;
import Service.Implimentation.ServiceParticipantImp;
import Service.Interface.ServiceInterface;
import Service.Interface.ServiceParticipant;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "UpdateParticipant", value = "/UpdateParticipant")
public class UpdateParticipant extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession httpSession = request.getSession();
        User user = (User) httpSession.getAttribute("loggedUser");
        if(user == null || user.getRole() != Role.Administrator){
            response.sendRedirect(request.getContextPath() + "/");
            return;
        }
        ServiceInterface serviceInterface =new ServiceParticipantImp();
        Participant participant = (Participant) serviceInterface.findById(Long.parseLong(request.getParameter("id")));
        request.setAttribute("participantToEdit",participant);
        System.out.println(participant.toString());

        request.getRequestDispatcher("/Participant/UpdateParticipant.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServiceInterface<Participant> serviceParticipant = new ServiceParticipantImp();
        Participant participant = (Participant) serviceParticipant.findById(Long.parseLong(request.getParameter("id")));
        String name =request.getParameter("name").trim();
        String phone =request.getParameter("phone").trim();
        Role role=Role.Participant;
        String domaine =request.getParameter("domaine").trim();
        String structure =request.getParameter("structure").trim();


        Participant p=new Participant(participant.getId(),name,phone,role,domaine,structure);
        serviceParticipant.update(p);

//        RequestDispatcher reqd = request.getRequestDispatcher("add_activity");
//        reqd.forward(request, response);
        response.sendRedirect(request.getContextPath() + "/Participant");
    }
}
