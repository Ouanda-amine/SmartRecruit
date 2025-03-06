package org.example.smartrecruit.dao;

import org.example.smartrecruit.bean.Offre;
import org.example.smartrecruit.bean.Users;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OffreDao {

    private Connection con;


    public OffreDao (){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jobdb","root","");
            System.out.println("Connected to the database successfully");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to connect to database");
        }
    }

    public void CreateOffre (Offre offre) {
        String sql = "insert into offre (idoffre, titre , description , dateoffre) values(?,?,?,?) ";
        try (PreparedStatement pr = con.prepareStatement(sql)){
            pr.setInt(1,offre.getIdoffre());
            pr.setString(2, offre.getTitre());
            pr.setString(3, offre.getDescription());
            pr.setString(4, offre.getDateoffre());
            pr.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public List<Offre> getallOffre() {
        List<Offre> offreListe = new ArrayList<>();
        String sql="SELECT * FROM offre ";
        try(Statement stmt = con.createStatement(); ResultSet res = stmt.executeQuery(sql)) {
            System.out.println("offres");
            while (res.next()) {
                Offre offre = new Offre();
                offre.setIdoffre(res.getInt("idoffre"));
                offre.setTitre(res.getString("titre"));
                offre.setDescription(res.getString("description"));
                offre.setDateoffre(res.getString("dateoffre"));

                offreListe.add(offre);
            }

        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("oooo");
        }
        return offreListe;

    }

    public Offre getOffreBYid(int idoffre) {
        Offre offre = null;
        String sql="SELECT * FROM offre WHERE idoffre = ?";
        try(PreparedStatement prest = con.prepareStatement(sql)) {
            prest.setInt(1, idoffre);
            try (ResultSet res = prest.executeQuery()){
                if (res.next()) {
                    offre = new Offre();
                    offre.setIdoffre(res.getInt("idoffre"));
                    offre.setTitre(res.getString("titre"));
                    offre.setDescription(res.getString("description"));
                    offre.setDateoffre(res.getString("dateoffre"));



                }

            }
            System.out.println("l'offre");

        }catch (Exception e) {
            System.out.println("l'offre not found");
        }
        return offre;
    }


    public void modifierOffre(Offre offre) {
        System.out.println("off");
        String query = "UPDATE offre SET titre = ?, description = ? , dateoffre = ? WHERE idoffre = ?";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, offre.getTitre());
            stmt.setString(3, offre.getDescription());
            stmt.setString(2, offre.getDateoffre());
            stmt.setInt(5, offre.getIdoffre());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("offre not found ");
        }
    }

    public  void deleteOffre(int idoffre) {
        String sql = "DELETE FROM users WHERE idoffre = ?";
        try (PreparedStatement pres = con.prepareStatement(sql)){
            pres.setInt(1,idoffre);
            pres.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("offre not founddd");
        }
    }



























}
