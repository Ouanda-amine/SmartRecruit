package org.example.smartrecruit.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.smartrecruit.bean.Users;
import org.example.smartrecruit.dao.UseDao;

import java.io.IOException;
import java.util.List;


@WebServlet("/user")
    public class UserServlet extends HttpServlet {

        private UseDao userdao ;

        public void init(){
            userdao = new UseDao();
        }



        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            String action = request.getParameter("action");
            if("edit".equals(action)) {
                int id = Integer.parseInt(request.getParameter("id"));
                Users users = userdao.getUserBYid(id);
                request.setAttribute("users", users);
                request.getRequestDispatcher("modifierUser.jsp").forward(request, response);

            }else if ("delete".equals(action)) {
                int id = Integer.parseInt(request.getParameter("id"));
                userdao.deleteUser(id);
                response.sendRedirect(request.getContextPath() + "/user");


            } else{

                List<Users> usersList = userdao.getallUsers();
                request.setAttribute("userslist", usersList);
                request.getRequestDispatcher("userList.jsp").forward(request, response);
            }
        }

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {

            String action = request.getParameter("action");
            if("update".equals(action)) {
                int id = Integer.parseInt(request.getParameter("id"));
                String nom = request.getParameter("nom");
                String email = request.getParameter("email");
                String role = request.getParameter("role");
                String password = request.getParameter("password");



                Users users = new Users(nom,email,role,password);
                users.setId(id);
                userdao.modifieruser(users);

            }else{

            String nom = request.getParameter("nom");
            String email = request.getParameter("email");
            String role = request.getParameter("role");
            String psw = request.getParameter("password");

            Users users = new Users(nom,email,role,psw);

            userdao.CreateUser(users);
            }
            response.sendRedirect(request.getContextPath() + "/user");




        }
    }

