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
public class datasetdetailbooking {
    private ArrayList<Integer> id_booking;
    private ArrayList<Integer> id_tipe;
    private ArrayList<Integer> jumlah;
//    private ArrayList<Double> subharga

    public datasetdetailbooking() {
        id_booking = new ArrayList<>();
        id_tipe = new ArrayList<>();
        jumlah = new ArrayList<>();
    }

    public ArrayList<Integer> getId_booking() {
        return id_booking;
    }

    public void setid_booking(Integer value){
        this.id_booking.add(value);
    }
    

    public ArrayList<Integer> getId_tipe() {
        return id_tipe;
    }

    public void setid_tipe(Integer value){
        this.id_tipe.add(value);
    }

    public ArrayList<Integer> getJumlah() {
        return jumlah;
    }

   public void setjumlah(Integer value){
        this.jumlah.add(value);
    }
    
}
