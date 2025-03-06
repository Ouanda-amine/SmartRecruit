package org.example.smartrecruit.dao;

import org.example.smartrecruit.bean.Users;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UseDao {
    private Connection con ;

    public  UseDao(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jobdb","root","");
            System.out.println("Connected to the database successfully");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to connect to database");
        }
    }

    public  void  CreateUser (Users users){
        String sql = "insert into users(nom , email , role , password) values(?,?,?,?) ";

        try (PreparedStatement pr = con.prepareStatement(sql)){
            pr.setString(1,users.getNom());
            pr.setString(2, users.getEmail());
            pr.setString(3, users.getRole());
            pr.setString(4, users.getPassword());
            pr.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }


    }
    public List<Users> getallUsers() {
        List<Users> usersList = new ArrayList<>();
        String sql="SELECT * FROM users";
        try(Statement stmt = con.createStatement(); ResultSet res = stmt.executeQuery(sql)) {
            System.out.println("ww");
            while (res.next()) {
                Users users = new Users();
                users.setId(res.getInt("id"));
                users.setNom(res.getString("nom"));
                users.setEmail(res.getString("email"));
                users.setRole(res.getString("role"));
                users.setPassword(res.getString("password"));
                usersList.add(users);
            }

        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("qsqs");
        }
        return usersList;

    }

    public Users getUserBYid(int id) {
        Users users = null;
        String sql="SELECT * FROM users WHERE id = ?";
        try(PreparedStatement prest = con.prepareStatement(sql)) {
            prest.setInt(1, id);
            try (ResultSet res = prest.executeQuery()){
                if (res.next()) {
                    users = new Users();
                    users.setId(res.getInt("id"));
                    users.setNom(res.getString("nom"));
                    users.setEmail(res.getString("email"));
                    users.setRole(res.getString("role"));
                    users.setPassword(res.getString("password"));


                }

            }
            System.out.println("fff");

        }catch (Exception e) {
            System.out.println("user  not found");
        }
        return users;
    }

    public void modifieruser(Users users) {
        System.out.println("nnn");
        String query = "UPDATE users SET nom = ?, email = ? , role = ? , password = ? WHERE id = ?";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, users.getNom());
            stmt.setString(3, users.getEmail());
            stmt.setString(2, users.getRole());
            stmt.setString(4, users.getPassword());
            stmt.setInt(5, users.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("user n f ");
        }
    }

    public  void deleteUser(int id) {
        String sql = "DELETE FROM users WHERE id = ?";
        try (PreparedStatement pres = con.prepareStatement(sql)){
            pres.setInt(1,id);
            pres.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("user not founddd");
        }
    }



}
