package com.idea.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/ShowData")
public class ShowData extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("test/html;charset=utf-8");
        String username = request.getParameter("username");
        String age = request.getParameter("age");
        System.out.println("username："+username);
        System.out.println("age："+age);

    }
}
