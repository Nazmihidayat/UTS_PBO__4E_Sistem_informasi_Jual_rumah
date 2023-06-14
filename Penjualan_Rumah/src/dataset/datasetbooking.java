/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;
import javax.swing.JTextField;


/**
 *
 * @author dayat
 */
public class datasetbooking {

    private ArrayList<Integer> id_booking;
    private ArrayList<Integer> id_konsumen;
    private ArrayList<Integer> id_admin;
    private ArrayList<String> tgl_booking;
    private ArrayList<String> status;
    private ArrayList<String> tgl_verifikasi;

    public datasetbooking() {
        id_booking =  new ArrayList<>();
        id_konsumen =  new ArrayList<>();
        id_admin =  new ArrayList<>();
        tgl_booking =  new ArrayList<>();
        status =  new ArrayList<>();
        tgl_verifikasi =  new ArrayList<>();
    }

    public ArrayList<Integer> getId_booking() {
        return id_booking;
    }

   public void setid_booking(Integer value){
        this.id_booking.add(value);
    }

    public ArrayList<Integer> getId_konsumen() {
        return id_konsumen;
    }

    public void setid_konsumen(Integer value){
        this.id_konsumen.add(value);
    }

    public ArrayList<Integer> getId_admin() {
        return id_admin;
    }

     public void setid_admin(Integer value){
        this.id_admin.add(value);
    }

    public ArrayList<String> getTgl_booking() {
        return tgl_booking;
    }

     public void settgl_booking(String value){
        this.tgl_booking.add(value);
    }

    public ArrayList<String> getStatus() {
        return status;
    }

     public void setStatus(String value){
        this.status.add(value);
    }

    public ArrayList<String> getTgl_verifikasi() {
        return tgl_verifikasi;
    }

     public void settgl_verifi(String value){
        this.tgl_verifikasi.add(value);
    }

    public Object settgl_booking(JTextField txttglbooking) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
