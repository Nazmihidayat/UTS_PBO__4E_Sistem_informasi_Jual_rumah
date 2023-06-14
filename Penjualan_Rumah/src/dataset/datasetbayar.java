/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import  java.util.ArrayList;
/**
 *
 * @author dayat
 */
public class datasetbayar {
    private ArrayList<Integer> id_bayar;
    private ArrayList<Integer> id_booking;
    private ArrayList<String> tgl_bayar;
    private ArrayList<String> nm_bank;
    private ArrayList<String> no_rek;
    //private ArrayList<double> jml_bayar;
    private ArrayList<String> bukti_bayar;
    
    
    public datasetbayar(){
     id_bayar = new ArrayList<>();
     id_booking = new ArrayList<>();
     tgl_bayar = new ArrayList<>();
     nm_bank = new ArrayList<>();
     no_rek = new ArrayList<>();
    // jml_bayar = new ArrayList<>();
     bukti_bayar = new ArrayList<>();
    }

    public ArrayList<Integer> getId_bayar() {
        return id_bayar;
    }

     public void setid_bayar(Integer value){
        this.id_bayar.add(value);
    }
    
    public ArrayList<Integer> getId_booking() {
        return id_booking;
    }

     public void setid_booking(Integer value){
        this.id_booking.add(value);
    }

    public ArrayList<String> getTgl_bayar() {
        return tgl_bayar;
    }

     public void settgl_bayar(String value){
        this.tgl_bayar.add(value);
    }

    public ArrayList<String> getNm_bank() {
        return nm_bank;
    }

      public void setnm_bank(String value){
        this.nm_bank.add(value);
    }

    public ArrayList<String> getNo_rek() {
        return no_rek;
    }

     public void setno_rek(String value){
        this.no_rek.add(value);
     }
//    public ArrayList<<any>> getJml_bayar() {
//        return jml_bayar;
//    }
//
//    public void setJml_bayar(ArrayList<<any>> jml_bayar) {
//        this.jml_bayar = jml_bayar;
//    }

    public ArrayList<String> getBukti_bayar() {
        return bukti_bayar;
    }

    public void setbukti(String value){
        this.bukti_bayar.add(value);
    }
    
    
}