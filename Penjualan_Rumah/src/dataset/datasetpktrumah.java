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
public class datasetpktrumah {
    private ArrayList<Integer> id_tipe;
    private ArrayList<String> nm_rumah;
    private ArrayList<String> detail;
//    private ArrayList<double> harga;
//    private ArrayList<double> book_fee;
    private ArrayList<Integer> jumlah_unit;   

    public datasetpktrumah() {
        id_tipe = new ArrayList<>();
        nm_rumah = new ArrayList<>();
        detail =new ArrayList<>();
        jumlah_unit = new ArrayList<>();
    }

    public ArrayList<Integer> getId_tipe() {
        return id_tipe;
    }

     public void setid_tipe(Integer value){
        this.id_tipe.add(value);
    }

    public ArrayList<String> getNm_rumah() {
        return nm_rumah;
    }

    public void setnm_rumah(String value){
        this.nm_rumah.add(value);
    }

    public ArrayList<String> getDetail() {
        return detail;
    }

     public void setdetail(String value){
        this.detail.add(value);
    }

    public ArrayList<Integer> getJumlah_unit() {
        return jumlah_unit;
    }

     public void setjumlah_unit(Integer value){
        this.jumlah_unit.add(value);
    }
    
    
}
