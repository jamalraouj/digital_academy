package Servlete.Activity;

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
import java.util.List;

@WebServlet(name = "ActivityUpdate", value = "/Activity/ActivityUpdate")
public class ActivityUpdate extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        ServiceInterface serviceActivity =new ServiceActivity();
        Activity activity = (Activity) serviceActivity.findById(Long.parseLong(request.getParameter("id")));
        System.out.println(activity.getStatus());
        ServiceInterface servicePersonImp = new ServiceResponsableImp();
        List<Responsable> responsables =  servicePersonImp.findAll();
        request.setAttribute("activityToEdit",activity);
        request.setAttribute("responsables",responsables);
        request.getRequestDispatcher("/activity/UpdateActivity.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

         int id = Integer.parseInt(request.getParameter("idActivi"));
        String title =request.getParameter("title").trim();
        String description =request.getParameter("description").trim();
        Type type = Type.valueOf(request.getParameter("type").trim());
        long responsable = Long.parseLong(request.getParameter("responsable"));
        Status status = Status.valueOf(request.getParameter("status"));
        LocalDate startDate = LocalDate.parse(request.getParameter("startDate").trim());
        LocalDate endDate = LocalDate.parse(request.getParameter("endDate").trim());
        ServiceInterface<Responsable> servicePersonImp = new ServiceResponsableImp();
        Responsable res = (Responsable) servicePersonImp.findById(responsable);

        Activity activity = new Activity(id,title,description,type ,startDate,endDate,status,res);

        ServiceInterface<Activity> serviceActivity = new ServiceActivity();
        serviceActivity.update(activity);
        response.sendRedirect(request.getContextPath() + "/activity");

    }
}
