package Servlete;

import Entity.Responsable;
import Service.Implimentation.ServiceActivity;
import Service.Implimentation.ServicePersonImp;
import Service.Interface.ServiceInterface;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "ServletActivity", value = "/add_activity")
public class AddActivity extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
       // getServletConfig().getServletContext()
       //         .getRequestDispatcher("/activity/addActivity.jsp").forward(request,response);
        ServiceActivity serviceActivity = new ServiceActivity();
        ServiceInterface servicePersonImp = new ServicePersonImp();
        List<Responsable> responsables =  servicePersonImp.findAll();
//        responsables.forEach(responsable -> {
//            System.out.println(responsable.getName());
//        });
        request.setAttribute("responsables",responsables);
        request.getRequestDispatcher("/activity/addActivity.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>true used</h1>");



//        String title =request.getParameter("title").trim();
//        String description =request.getParameter("description").trim();
//        String type = request.getParameter("type").trim();
//        String startDate = request.getParameter("startDate").trim();
//        String endDate = request.getParameter("endDate").trim();
//        ServiceUserImp serviceUserImp = new ServiceUserImp();
//        User user = serviceUserImp.doLogin(email ,password);
//        HttpSession httpSession = request.getSession();
//        httpSession.setAttribute("loggedUser", user );
//        System.out.println("========="+user.getName()+user.getEmail());

//        HttpSession httpSession = request.getSession();
//        httpSession.setAttribute("user", user);
//        out.println("<h1>true used"+user.getEmail()+user.getName()+"</h1>");
        out.println("</body></html>");
    }
}
