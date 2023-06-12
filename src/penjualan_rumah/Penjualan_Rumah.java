/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package penjualan_rumah;

import Jual_rumah.booking;
import Jual_rumah.detail_booking;
import Jual_rumah.konsumen;
import Jual_rumah.pkt_rumah;
import java.util.ArrayList;
import java.util.Date;

public class Penjualan_Rumah {

    public static void main(String[] args) {
        ArrayList<pkt_rumah> listPaketRumah = new ArrayList<>();
        ArrayList<detail_booking> listDetailBooking = new ArrayList<>();
        ArrayList<konsumen> listKonsumen = new ArrayList<>();
        ArrayList<booking> listBooking = new ArrayList<>();

        pkt_rumah paket1 = new pkt_rumah(1, "Rumah A", "Rumah dengan 3 kamar tidur", 200000, 5000000, 5);
        listPaketRumah.add(paket1);

        detail_booking detailBooking = new detail_booking(1, 1, 2, 300000000);
        listDetailBooking.add(detailBooking);

        konsumen konsumen = new konsumen(1, "Nazmi", "Jalan adyaksa", "081234567890", "nazmi.@gmail.com", "1234567890", "0987654321", "password123", "9876543210", "KK1234567890", "Pegawai", 5000000.0, "SK123");
        listKonsumen.add(konsumen);

        booking booking = new booking(1, konsumen.getIdKonsumen(), 1, new Date(), "Belum Verifikasi", null);
        listBooking.add(booking);

        // Mengakses objek-objek dalam ArrayList
        System.out.println("Informasi Paket Rumah:");
        for (pkt_rumah paket : listPaketRumah) {
            System.out.println("ID Tipe: " + paket.getIdTipe());
            System.out.println("Nama Rumah: " + paket.getNamaRumah());
            System.out.println("Detail: " + paket.getDetail());
            System.out.println("Harga: " + paket.getHarga());
            System.out.println("Book Fee: " + paket.getBookFee());
            System.out.println("Jumlah Unit: " + paket.getJumlahUnit());
            System.out.println();
        }

        System.out.println("Informasi Detail Booking:");
        for (detail_booking detail : listDetailBooking) {
            System.out.println("ID Booking: " + detail.getIdBooking());
            System.out.println("ID Tipe: " + detail.getIdTipe());
            System.out.println("Jumlah: " + detail.getJumlah());
            System.out.println("Subharga: " + detail.getSubharga());
            System.out.println();
        }

        System.out.println("Informasi Konsumen:");
        for (konsumen k : listKonsumen) {
            System.out.println("ID Konsumen: " + k.getIdKonsumen());
            System.out.println("Nama: " + k.getNamaKonsumen());
            System.out.println("Alamat: " + k.getAlamat());
            System.out.println("No. Telepon: " + k.getNoTelp());
            System.out.println();
        }

        System.out.println("Informasi Booking:");
        for (booking b : listBooking) {
            System.out.println("ID Booking: " + b.getIdBooking());
            System.out.println("ID Konsumen: " + b.getIdKonsumen());
            System.out.println("ID Admin: " + b.getIdAdmin());
            System.out.println("Tanggal Booking: " + b.getTanggalBooking());
            System.out.println("Status: " + b.getStatus());
            //System.out.println("Detail Booking: " + b.getDetailBooking());
            System.out.println();
        }
    }
}

    
    

