package Servlete.Activity;

import Dao.Implementation.DaoResponsableImp;
import Entity.*;
import Service.Implimentation.ServiceActivity;
import Service.Implimentation.ServiceResponsableImp;
import Service.Interface.ServiceInterface;
import Service.Interface.ServiceResponsable;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.List;

@WebServlet(name = "ServletActivity", value = "/activity/add_activity")
public class AddActivity extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession httpSession = request.getSession();
        User user = (User) httpSession.getAttribute("loggedUser");
        if(user == null || user.getRole() != Role.Administrator){
            response.sendRedirect(request.getContextPath() + "/");
            return;
        }
        response.setContentType("text/html");
//        getServletConfig().getServletContext()
//                .getRequestDispatcher("/activity/addActivity.jsp").forward(request,response);
//        ServiceActivity serviceActivity = new ServiceActivity();
        ServiceInterface servicePersonImp = new ServiceResponsableImp();
        List<Responsable> responsables =  servicePersonImp.findAll();
//        responsables.forEach(responsable -> {
//            System.out.println(responsable.getName());
//        });


        request.setAttribute("responsables",responsables);
        request.getRequestDispatcher("/activity/addActivity.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String title =request.getParameter("title").trim();
        String description =request.getParameter("description").trim();
        Type type = Type.valueOf(request.getParameter("type").trim());
        long responsable = Long.parseLong(request.getParameter("responsable"));
        Status status = Status.valueOf(request.getParameter("status"));
        LocalDate startDate = LocalDate.parse(request.getParameter("startDate").trim());
        LocalDate endDate = LocalDate.parse(request.getParameter("endDate").trim());
        ServiceInterface<Activity> serviceActivity = new ServiceActivity();
        System.out.println(responsable);

        ServiceResponsableImp responsableImp = new ServiceResponsableImp();
        Responsable res = responsableImp.findById( responsable);
        System.out.println(res.getName()+"=================");
//        responsableImp
        Activity activity = new Activity(title,description,type,startDate,endDate,status,res);
        System.out.println(activity.toString());
        serviceActivity.insert(activity);

//        RequestDispatcher reqd = request.getRequestDispatcher("add_activity");
//        reqd.forward(request, response);
        response.sendRedirect(request.getContextPath() + "/activity/add_activity");

    }
}
