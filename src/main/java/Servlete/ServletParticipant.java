package Servlete;

import Entity.Activity;
import Entity.Participant;
import Entity.TypeResponsable;
import Service.Implimentation.ServiceActivity;
import Service.Implimentation.ServiceParticipantImp;
import Service.Interface.ServiceInterface;
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

        request.setAttribute("participants",participants);
        ServiceInterface<Activity> serviceActivity = new ServiceActivity();
        List<Activity> activities =  serviceActivity.findAll();
        System.out.println(activities.toString());

        request.setAttribute("activities",activities);

        request.getRequestDispatcher("/Participant/Participant.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServiceInterface<Activity> serviceActivity = new ServiceActivity();
        Activity act = (Activity) serviceActivity.findById(Long.parseLong(request.getParameter("activity")));


    }
}
