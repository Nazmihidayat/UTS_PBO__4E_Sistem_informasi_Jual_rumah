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
public class Bayar {
    private int id_bayar;
    private int id_booking;
    private String tgl_bayar;
    private String nm_bank;
    private String no_rek;
    private double jml_bayar;
    private String bukti_bayar;
    
    public Bayar(int id_bayar, int id_booking, String tgl_bayar, String nm_bank, String no_rek, double jml_bayar, String bukti_bayar) {
        this.id_bayar = id_bayar;
        this.id_booking = id_booking;
        this.tgl_bayar = tgl_bayar;
        this.nm_bank = nm_bank;
        this.no_rek = no_rek;
        this.jml_bayar = jml_bayar;
        this.bukti_bayar = bukti_bayar;
    }
    
    // Getter dan setter untuk setiap atribut
    
    public int getIdBayar() {
        return id_bayar;
    }
    
    public void setIdBayar(int id_bayar) {
        this.id_bayar = id_bayar;
    }
    
    public int getIdBooking() {
        return id_booking;
    }
    
    public void setIdBooking(int id_booking) {
        this.id_booking = id_booking;
    }
    
    public String getTanggalBayar() {
        return tgl_bayar;
    }
    
    public void setTanggalBayar(String tgl_bayar) {
        this.tgl_bayar = tgl_bayar;
    }
    
    public String getNamaBank() {
        return nm_bank;
    }
    
    public void setNamaBank(String nm_bank) {
        this.nm_bank = nm_bank;
    }
    
    public String getNomorRekening() {
        return no_rek;
    }
    
    public void setNomorRekening(String no_rek) {
        this.no_rek = no_rek;
    }
    
    public double getJumlahBayar() {
        return jml_bayar;
    }
    
    public void setJumlahBayar(double jml_bayar) {
        this.jml_bayar = jml_bayar;
    }
    
    public String getBuktiBayar() {
        return bukti_bayar;
    }
    
    public void setBuktiBayar(String bukti_bayar) {
        this.bukti_bayar = bukti_bayar;
    }
     public static void main(String[] args) {
        // Membuat objek Bayar
        Bayar bayar1 = new Bayar(1, 1, "2023-05-31", "Bank A", "1234567890", 1000.0, "bukti1.jpg");
        Bayar bayar2 = new Bayar(2, 2, "2023-05-31", "Bank B", "0987654321", 2000.0, "bukti2.jpg");

        // Membuat ArrayList untuk menyimpan objek Bayar
        ArrayList<Bayar> listBayar = new ArrayList<>();

        // Menambahkan objek Bayar ke ArrayList
        listBayar.add(bayar1);
        listBayar.add(bayar2);

        // Mengakses objek Bayar dari ArrayList
        System.out.println("Data Bayar:");
        for (Bayar bayar : listBayar) {
            System.out.println("ID Bayar: " + bayar.getIdBayar());
            System.out.println("ID Booking: " + bayar.getIdBooking());
             System.out.println("Tanggal Bayar: " + bayar.getTanggalBayar());
            System.out.println("Nama Bank: " + bayar.getNamaBank());
            System.out.println("Nomor Rekening: " + bayar.getNomorRekening());
            System.out.println("Jumlah Bayar: " + bayar.getJumlahBayar());
            System.out.println("Bukti Bayar: " + bayar.getBuktiBayar());
            System.out.println();
        }
    }
}

