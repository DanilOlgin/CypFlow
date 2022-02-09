package com.photostore.controller.admin;

import com.photostore.entity.Users;
import com.photostore.service.UsersService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet("/admin/list_users")
public class ListUsersServlet extends HttpServlet {

    public ListUsersServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UsersService usersService = new UsersService();
        List<Users> usersList = usersService.listUsers();

        request.setAttribute("listUsers", usersList);
        request.getRequestDispatcher("list_users.jsp");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("list_users.jsp");
        requestDispatcher.forward(request, response);
    }
}
