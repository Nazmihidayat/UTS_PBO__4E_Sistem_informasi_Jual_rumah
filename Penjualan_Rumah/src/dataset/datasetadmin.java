/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;
/**
 *
 * @author dayat
 */
public class datasetadmin {
    private ArrayList<Integer> id_admin;
    private ArrayList<String> username;
    private ArrayList<String> password;

    public datasetadmin() {
        id_admin = new ArrayList<>();
        username = new ArrayList<>();
        password = new ArrayList<>();
    }

    public ArrayList<Integer> getId_admin() {
        return id_admin;
    }
     public void setid_admin(Integer value){
        this.id_admin.add(value);
    }

    public ArrayList<String> getusername() {
        return username;
    }
     public void setusername(String value){
        this.username.add(value);
    }

    public ArrayList<String> getPassword() {
        return password;
    }

     public void setpassword(String value){
        this.password.add(value);
    }
   
    
    
}
