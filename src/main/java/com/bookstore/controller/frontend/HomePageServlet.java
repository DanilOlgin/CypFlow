package com.bookstore.controller.frontend;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class HomePageServlet extends HttpServlet {

    public HomePageServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }

}
