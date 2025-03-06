package org.example.smartrecruit.bean;

public class Users {
    private int id;
    private String nom;
    private String email;
    private String role;
    private String password ;

    public Users( String nom, String email, String role , String password) {
        this.nom = nom;
        this.email = email;
        this.role = role;
        this.password = password;
    }
    public Users (){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

