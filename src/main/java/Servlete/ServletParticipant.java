package Servlete;

import Entity.Participant;
import Service.Implimentation.ServiceParticipantImp;
import Service.Implimentation.ServicePersonImp;
import Service.Interface.ServiceInterface;
import Service.Interface.ServiceParticipant;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServletParticipant", value = "/Participant")
public class ServletParticipant extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        ServiceInterface serviceParticipant =new ServiceParticipantImp();
        List<Participant> participants =  serviceParticipant.findAll();
        participants.forEach(participant -> {
            System.out.println(participant.getName());
        });
        request.setAttribute("participants",participants);
        request.getRequestDispatcher("/Participant/Participant.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
