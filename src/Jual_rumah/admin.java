/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jual_rumah;

import java.util.ArrayList;

/**
 *
 * @author dayat
 */
public class admin {
    private int id_admin;
    private String username;
    private String password;
    
    public admin(int id_admin, String username, String password) {
        this.id_admin = id_admin;
        this.username = username;
        this.password = password;
    }
    
    // Getter dan setter untuk setiap atribut
    
    public int getIdAdmin() {
        return id_admin;
    }
    
    public void setIdAdmin(int id_admin) {
        this.id_admin = id_admin;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public static void main(String[] args) {
        // Membuat objek admin
        admin admin1 = new admin(1, "admin1", "password1");
        admin admin2 = new admin(2, "admin2", "password2");

        // Membuat ArrayList untuk menyimpan objek admin
        ArrayList<admin> listAdmin = new ArrayList<>();

        // Menambahkan objek admin ke ArrayList
        listAdmin.add(admin1);
        listAdmin.add(admin2);

        // Mengakses objek admin dari ArrayList
        System.out.println("Data Admin:");
        for (admin admin : listAdmin) {
            System.out.println("ID Admin: " + admin.getIdAdmin());
            System.out.println("Username: " + admin.getUsername());
            System.out.println("Password: " + admin.getPassword());
            System.out.println();
        }
    }
}

