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
     public static void main(String[] args) {
        // Membuat objek detail_booking
        detail_booking detailBooking1 = new detail_booking(1, 1, 2, 500000.0);
        detail_booking detailBooking2 = new detail_booking(1, 2, 1, 750000.0);

        // Membuat ArrayList untuk menyimpan objek detail_booking
        ArrayList<detail_booking> listDetailBooking = new ArrayList<>();

        // Menambahkan objek detail_booking ke ArrayList
        listDetailBooking.add(detailBooking1);
        listDetailBooking.add(detailBooking2);

        // Mengakses objek detail_booking dari ArrayList
        System.out.println("Data Detail Booking:");
        for (detail_booking detailBooking : listDetailBooking) {
            System.out.println("ID Booking: " + detailBooking.getIdBooking());
            System.out.println("ID Tipe: " + detailBooking.getIdTipe());
            System.out.println("Jumlah: " + detailBooking.getJumlah());
            System.out.println("Subharga: " + detailBooking.getSubharga());
            System.out.println();
        }
    }
}
  
