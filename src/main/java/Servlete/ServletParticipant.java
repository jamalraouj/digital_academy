package Servlete;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ServletParticipant", value = "/Participant")
public class ServletParticipant extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        getServletConfig().getServletContext()
                .getRequestDispatcher("/Participant.jsp").forward(request,response);


        //ServiceInterface servicePersonImp = new ServicePersonImp();
        //List<Responsable> responsables =  servicePersonImp.findAll();
//        responsables.forEach(responsable -> {
//            System.out.println(responsable.getName());
//        });
        request.setAttribute("responsables",responsables);
        request.getRequestDispatcher("/activity/addActivity.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
