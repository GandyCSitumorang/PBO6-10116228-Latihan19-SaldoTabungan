/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116228.latihan19.saldotabungan;

/**
 *
 * @author 
 * NAMA : Gandy Christian Situmorang
 * KELAS: PBO-6
 * NIM  : 101162288
 * Deskripsi Program : Program ini berisi Program yang menampilkan saldo 
 * setiap bulan (bulan ke-6).
 */

import java.util.Scanner;
public class PBO610116228Latihan19SaldoTabungan {

    
 static int saldoAkhir;
 static void hitung(int a, int b){
  saldoAkhir = (a + (a*b/100));
 }
 
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i = 1;
        int saldoAwal = 2500000;
        double bunga = 0.15;
        int saldoBulanan;
        
        do{
            saldoBulanan = (int) (bunga * saldoAwal);
            saldoAwal = (saldoAwal + saldoBulanan);
            System.out.println("Saldo di bulan ke- "+ i + " Rp " + saldoAwal);
            i++;
        } while (i<=6);
    }
    
}
