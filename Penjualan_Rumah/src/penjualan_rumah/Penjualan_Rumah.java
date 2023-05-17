/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package penjualan_rumah;

import Jual_rumah.admin;
import Jual_rumah.Bayar;
import Jual_rumah.booking;
import Jual_rumah.detail_booking;
import Jual_rumah.konsumen;
import Jual_rumah.pkt_rumah;
import java.util.Date;
/**
 *
 * @author dayat
 */
public class Penjualan_Rumah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek PaketRumah
        pkt_rumah paket1 = new pkt_rumah(1, "Rumah A", "Rumah dengan 3 kamar tidur", 200000, 5000000, 5);
        // Membuat objek DetailBooking
        detail_booking detail_booking = new detail_booking(1, 1, 2, 300000000);
        // Menampilkan informasi paket rumah
        System.out.println("Informasi Paket Rumah:");
        System.out.println("ID Tipe: " + paket1.getIdTipe());
        System.out.println("Nama Rumah: " + paket1.getNamaRumah());
        System.out.println("Detail: " + paket1.getDetail());
        System.out.println("Harga: " + paket1.getHarga());
        System.out.println("Book Fee: " + paket1.getBookFee());
        System.out.println("Jumlah Unit: " + paket1.getJumlahUnit());
        System.out.println();
        // Contoh penggunaan class-class lain yang telah dibuat
        
        // Membuat objek-objek yang diperlukan
        admin admin = new admin(1, "admin123", "password123");
        konsumen konsumen = new konsumen(1, "Nazmi", "Jalan adyaksa", "081234567890", "nazmi.@gmail.com", "1234567890", "0987654321", "password123", "9876543210", "KK1234567890", "Pegawai", 5000000.0, "SK123");
        pkt_rumah pkt_rumah = new pkt_rumah(1, "Tipe A", "Rumah tipe A", 200000000.0, 5000000.0, 10);
        booking booking = new booking(1, konsumen.getIdKonsumen(), admin.getIdAdmin(), new Date(), "Belum Verifikasi", null);
       //detail_booking detailBooking = new detail_booking(booking.getIdBooking(), "paketRumah2".getIdTipe(), 2, paketRumah.getHarga() * 2);
        
        // Mengakses informasi dari objek-objek
        System.out.println("Informasi Konsumen:");
        System.out.println("Nama: " + konsumen.getNamaKonsumen());
        System.out.println("Alamat: " + konsumen.getAlamat());
        System.out.println("No. Telepon: " + konsumen.getNoTelp());
        
        System.out.println();
        
        System.out.println("Informasi Paket Rumah:");
        System.out.println("Tipe: " + pkt_rumah.getNamaRumah());
        System.out.println("Harga: " + pkt_rumah.getHarga());
        System.out.println("Jumlah Unit Tersedia: " + pkt_rumah.getJumlahUnit());
        
        System.out.println();
        
        System.out.println("Informasi Booking:");
        System.out.println("ID Booking: " + booking.getIdBooking());
        System.out.println("Tanggal Booking: " + booking.getTanggalBooking());
        System.out.println("Status: " + booking.getStatus());
        
        System.out.println();
        
        System.out.println("Informasi Detail Booking:");
        System.out.println("Jumlah: " + detail_booking.getJumlah());
        System.out.println("Subharga: " + detail_booking.getSubharga());
    }
}

    
    

