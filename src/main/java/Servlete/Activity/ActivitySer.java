package Servlete.Activity;

import Entity.Activity;
import Entity.Role;
import Entity.User;
import Service.Implimentation.ServiceActivity;
import Service.Interface.ServiceInterface;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "Activity", value = "/activity")
public class ActivitySer extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        HttpSession httpSession = request.getSession();
        User user = (User) httpSession.getAttribute("loggedUser");
        if(user == null || user.getRole() != Role.Administrator){
            response.sendRedirect(request.getContextPath() + "/login");
            return;
        }

        ServiceInterface<Activity> serviceActivity = new ServiceActivity();
        List<Activity> activities =  serviceActivity.findAll();
        System.out.println(activities.toString());

        request.setAttribute("activities",activities);
        request.getRequestDispatcher("/activity/activity.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
