/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jual_rumah;

/**
 *
 * @author dayat
 */
public class detail_booking {
    private int id_booking;
    private int id_tipe;
    private int jumlah;
    private double subharga;
    
    public detail_booking(int id_booking, int id_tipe, int jumlah, double subharga) {
        this.id_booking = id_booking;
        this.id_tipe = id_tipe;
        this.jumlah = jumlah;
        this.subharga = subharga;
    }
    
    // Getter dan setter untuk setiap atribut
    
    public int getIdBooking() {
        return id_booking;
    }
    
    public void setIdBooking(int id_booking) {
        this.id_booking = id_booking;
    }
    
    public int getIdTipe() {
        return id_tipe;
    }
    
    public void setIdTipe(int id_tipe) {
        this.id_tipe = id_tipe;
    }
    
    /**
     *
     * @return
     */
    public int getJumlah() {
        return jumlah;
    }
    
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    public double getSubharga() {
        return subharga;
    }
    
    public void setSubharga(double subharga) {
        this.subharga = subharga;
    }
}
  
