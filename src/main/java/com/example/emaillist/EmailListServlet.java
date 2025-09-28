package com.example.emaillist;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/emailList")
public class EmailListServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Lấy dữ liệu từ form
        String action = request.getParameter("action");
        if (action == null) action = "join";

        String url = "/index.html";   // mặc định

        if (action.equals("add")) {
            String email = request.getParameter("email");
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");

            // Tạo model User
            User user = new User(firstName, lastName, email);

            // gửi user sang trang JSP
            request.setAttribute("user", user);

            url = "/thanks.jsp";  // điều hướng sang trang cảm ơn
        }

        // forward request
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
