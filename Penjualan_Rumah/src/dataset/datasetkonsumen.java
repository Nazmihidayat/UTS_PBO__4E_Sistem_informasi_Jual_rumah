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
public class datasetkonsumen {
    private ArrayList<Integer> id_konsumen;
    private ArrayList<String> nm_konsumen;
    private ArrayList<String> alamat;
    private ArrayList<String> no_telp;
    private ArrayList<String> email;
    private ArrayList<String> no_ktp;
    private ArrayList<String> no_npwp;
    private ArrayList<String> password;
    private ArrayList<String>  no_kk;
    private ArrayList<String> kk;
    private ArrayList<String> pekerjaan;
    private ArrayList<String> penghasilan;
    private ArrayList<String> sk;

    public datasetkonsumen() {
        id_konsumen = new ArrayList<>();
       nm_konsumen = new ArrayList<>();
        alamat = new ArrayList<>();
        no_telp = new ArrayList<>();
        email = new ArrayList<>();
        no_ktp = new ArrayList<>();
        no_npwp = new ArrayList<>();
        password = new ArrayList<>();
       no_kk = new ArrayList<>();
        kk = new ArrayList<>();
        pekerjaan = new ArrayList<>();
        penghasilan = new ArrayList<>();
        sk = new ArrayList<>();
    }

    public ArrayList<Integer> getId_konsumen() {
        return id_konsumen;
    }

     public void setid_konsumen(Integer value){
        this.id_konsumen.add(value);
    }

    public ArrayList<String> getNm_konsumen() {
        return nm_konsumen;
    }

     public void setnm_konsumen(String value){
        this.nm_konsumen.add(value);
    }
   

    public ArrayList<String> getAlamat() {
        return alamat;
    }

   public void setalamat(String value){
        this.alamat.add(value);
    }

    public ArrayList<String> getNo_telp() {
        return no_telp;
    }

     public void setno_telp(String value){
        this.no_telp.add(value);
    }

    public ArrayList<String> getEmail() {
        return email;
    }

    public void setemail(String value){
        this.email.add(value);
    }

    public ArrayList<String> getNo_ktp() {
        return no_ktp;
    }

     public void setno_ktp(String value){
        this.no_ktp.add(value);
    }

    public ArrayList<String> getNo_npwp() {
        return no_npwp;
    }

    public void setNo_npwp(ArrayList<String> no_npwp) {
        this.no_npwp = no_npwp;
    }

    public void set_npwp(String value){
        this.no_npwp.add(value);
    }
 public ArrayList<String> getpassword() {
        return password;
    }


    public void setpassword(String value){
        this.password.add(value);
    }

    public void setnokk(String value){
        this.kk.add(value);
    }


    public ArrayList<String> getKk() {
        return kk;
    }

    public void setkk(String value){
        this.kk.add(value);
    }

    public ArrayList<String> getPekerjaan() {
        return pekerjaan;
    }

    public void setpekerjaan(String value){
        this.pekerjaan.add(value);
    }

    public ArrayList<String> getPenghasilan() {
        return penghasilan;
    }

    public void setpenghasilan(String value){
        this.penghasilan.add(value);
    }

    public ArrayList<String> getSk() {
        return sk;
    }

    public void setsk(String value){
        this.sk.add(value);
    }
    
    
    
}
