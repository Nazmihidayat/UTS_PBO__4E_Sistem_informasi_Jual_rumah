/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jual_rumah;

/**
 *
 * @author dayat
 */
public class konsumen {
    private int id_konsumen;
    private String nm_konsumen;
    private String alamat;
    private String no_telp;
    private String email;
    private String no_ktp;
    private String no_npwp;
    private String password;
    private String no_kk;
    private String kk;
    private String pekerjaan;
    private double penghasilan;
    private String sk;
    
    public konsumen(int id_konsumen, String nm_konsumen, String alamat, String no_telp, String email, String no_ktp, String no_npwp, String password, String no_kk, String kk, String pekerjaan, double penghasilan, String sk) {
        this.id_konsumen = id_konsumen;
        this.nm_konsumen = nm_konsumen;
        this.alamat = alamat;
        this.no_telp = no_telp;
        this.email = email;
        this.no_ktp = no_ktp;
        this.no_npwp = no_npwp;
        this.password = password;
        this.no_kk = no_kk;
        this.kk = kk;
        this.pekerjaan = pekerjaan;
        this.penghasilan = penghasilan;
        this.sk = sk;
    }
    
    // Getter dan setter untuk setiap atribut
    
    public int getIdKonsumen() {
        return id_konsumen;
    }
    
    public void setIdKonsumen(int id_konsumen) {
        this.id_konsumen = id_konsumen;
    }
    
    public String getNamaKonsumen() {
        return nm_konsumen;
    }
    
    public void setNamaKonsumen(String nm_konsumen) {
        this.nm_konsumen = nm_konsumen;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getNoTelp() {
        return no_telp;
    }
    
    public void setNoTelp(String no_telp) {
        this.no_telp = no_telp;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getNoKTP() {
        return no_ktp;
    }
    
    public void setNoKTP(String no_ktp) {
        this.no_ktp = no_ktp;
    }
    
    public String getNoNPWP() {
        return no_npwp;
    }
    
    public void setNoNPWP(String no_npwp) {
        this.no_npwp = no_npwp;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getNoKK() {
        return no_kk;
    }
    
    public void setNoKK(String no_kk) {
        this.no_kk = no_kk;
    }
    
    public String getKK() {
        return kk;
    }
    

}
