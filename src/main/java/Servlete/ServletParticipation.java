package Servlete;

import Entity.Activity;
import Entity.Participant;
import Service.Implimentation.ServiceActivity;
import Service.Implimentation.ServiceParticipantImp;
import Service.Implimentation.ServiceResponsableImp;
import Service.Interface.ServiceInterface;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import javax.swing.text.html.parser.Entity;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServletParticipation", value = "/Activity/participation")
public class ServletParticipation extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        ServiceInterface serviceParticipant =new ServiceParticipantImp();
        List<Participant> participants =  serviceParticipant.findAll();

        request.setAttribute("participants",participants);
//
        request.getRequestDispatcher("/activity/participation.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] parts = request.getParameterValues("part");
        ServiceInterface<Activity> serviceActivity = new ServiceActivity();
        Activity activity = (Activity) serviceActivity.findById(Long.parseLong(request.getParameter("id")));
        for(String par : parts){
//            ServiceInterface<Participant> serviceParticipantImp = new P
//            Participant res = (Participant) serviceParticipantImp.findById(Long.parseLong(par));
//            serviceParticipantImp.insert();
        }
    }
}
