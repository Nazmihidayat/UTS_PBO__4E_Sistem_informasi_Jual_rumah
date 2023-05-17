/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jual_rumah;

/**
 *
 * @author dayat
 */
public class pkt_rumah {
    private int id_tipe;
    private String nm_rumah;
    private String detail;
    private double harga;
    private double book_fee;
    private int jumlah_unit;
    
    public pkt_rumah(int id_tipe, String nm_rumah, String detail, double harga, double book_fee, int jumlah_unit) {
        this.id_tipe = id_tipe;
        this.nm_rumah = nm_rumah;
        this.detail = detail;
        this.harga = harga;
        this.book_fee = book_fee;
        this.jumlah_unit = jumlah_unit;
    }
    
    // Getter dan setter untuk setiap atribut
    
    public int getIdTipe() {
        return id_tipe;
    }
    
    public void setIdTipe(int id_tipe) {
        this.id_tipe = id_tipe;
    }
    
    public String getNamaRumah() {
        return nm_rumah;
    }
    
    public void setNamaRumah(String nm_rumah) {
        this.nm_rumah = nm_rumah;
    }
    
    public String getDetail() {
        return detail;
    }
    
    public void setDetail(String detail) {
        this.detail = detail;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    public double getBookFee() {
        return book_fee;
    }
    
    public void setBookFee(double book_fee) {
        this.book_fee = book_fee;
    }
    
    public int getJumlahUnit() {
        return jumlah_unit;
    }
    
    public void setJumlahUnit(int jumlah_unit) {
        this.jumlah_unit = jumlah_unit;
    }
}
    
