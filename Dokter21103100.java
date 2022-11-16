/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpenduduk;

/**
 *
 * @author fadhilahkh21103100
 */
public class Dokter21103100 extends Penduduk21103100 {
    int jumlahPasien;
    int jumlahObat;
    double totalPendapatanDokter;
    
    public double totalPendapatanDokter (){
        return totalPendapatanDokter = (jumlahPasien * 50.000) + (jumlahObat * 10.000);
        
        public void DataDokter(){
        System.out.println("Jumlah Pasien : " + jumlahPasien);
        System.out.println("Jumlah Obat : " + jumlahObat);
        System.out.println("Total Pendapatan : " + totalPendapatanDokter);
    }
    }
}
