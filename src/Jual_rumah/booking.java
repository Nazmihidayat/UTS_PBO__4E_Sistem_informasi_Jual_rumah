/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jual_rumah;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author dayat
 */
public class booking {

    private int id_booking;
    private int id_konsumen;
    private int id_admin;
    private Date tgl_booking;
    private String status;
    private Date tgl_verifikasi;
    
    public booking(int id_booking, int id_konsumen, int id_admin, Date tgl_booking, String status, Date tgl_verifikasi) {
        this.id_booking = id_booking;
        this.id_konsumen = id_konsumen;
        this.id_admin = id_admin;
        this.tgl_booking = tgl_booking;
        this.status = status;
        this.tgl_verifikasi = tgl_verifikasi;
    }
    
    // Getter dan setter untuk setiap atribut
    
    public int getIdBooking() {
        return id_booking;
    }
    
    public void setIdBooking(int id_booking) {
        this.id_booking = id_booking;
    }
    
    public int getIdKonsumen() {
        return id_konsumen;
    }
    
    public void setIdKonsumen(int id_konsumen) {
        this.id_konsumen = id_konsumen;
    }
    
    public int getIdAdmin() {
        return id_admin;
    }
    
    public void setIdAdmin(int id_admin) {
        this.id_admin = id_admin;
    }
    
    public Date getTanggalBooking() {
        return tgl_booking;
    }
    
    public void setTanggalBooking(Date tgl_booking) {
        this.tgl_booking = tgl_booking;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public Date getTanggalVerifikasi() {
        return tgl_verifikasi;
    }
    
    public void setTanggalVerifikasi(Date tgl_verifikasi) {
        this.tgl_verifikasi = tgl_verifikasi;
    }
     public static void main(String[] args) {
        // Membuat objek booking
        booking booking1 = new booking(1, 1, 1, new Date(), "Booked", null);
        booking booking2 = new booking(2, 2, 2, new Date(), "Verified", new Date());

        // Membuat ArrayList untuk menyimpan objek booking
        ArrayList<booking> listBooking = new ArrayList<>();

        // Menambahkan objek booking ke ArrayList
        listBooking.add(booking1);
        listBooking.add(booking2);

        // Mengakses objek booking dari ArrayList
        System.out.println("Data Booking:");
        for (booking booking : listBooking) {
            System.out.println("ID Booking: " + booking.getIdBooking());
            System.out.println("ID Konsumen: " + booking.getIdKonsumen());
            System.out.println("ID Admin: " + booking.getIdAdmin());
            System.out.println("Tanggal Booking: " + booking.getTanggalBooking());
            System.out.println("Status: " + booking.getStatus());
            System.out.println("Tanggal Verifikasi: " + booking.getTanggalVerifikasi());
            System.out.println();
        }
    }

    public String getDetailBooking() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
   
