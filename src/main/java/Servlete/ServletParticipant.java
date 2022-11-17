package Servlete;

import Dao.Implementation.DaoParticipationImp;
import Entity.*;
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
        HttpSession httpSession = request.getSession();
        User user = (User) httpSession.getAttribute("loggedUser");
        if(user == null || user.getRole() != Role.Administrator){
            response.sendRedirect(request.getContextPath() + "/login");
            return;
        }

        if(request.getParameter("activity")==null || request.getParameter("activity").equals("All")){
            ServiceInterface serviceParticipant =new ServiceParticipantImp();
            List<Participant> participants =  serviceParticipant.findAll();
            request.setAttribute("participants",participants);
            System.out.println("if");
        }
        else{
            System.out.println("else");
            long id=Long.parseLong(request.getParameter("activity"));
            DaoParticipationImp daoParticipationImp=new DaoParticipationImp();
            List<Participant> participants =  daoParticipationImp.findParticipantActivity(id);
            request.setAttribute("participants",participants);
        }

        ServiceInterface<Activity> serviceActivity = new ServiceActivity();
        List<Activity> activities =  serviceActivity.findAll();
        System.out.println(activities.toString());
        request.setAttribute("activities",activities);

        request.getRequestDispatcher("/Participant/Participant.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.sendRedirect(request.getContextPath() + "/Participant");


    }
}
