/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpenduduk;

/**
 *
 * @author fadhilahkh21103100
 */
public class Nelayan21103100 extends Penduduk21103100 {
int jumlahBeratIkan;
    int jumlahSolar;
    double totalPendapatanNelayan;

    public double totalPendapatNelayan() {
        return totalPendapatanNelayan = (jumlahBeratIkan * 8.000) - (jumlahSolar * 10.000);
    }
    
    public void DataNelayan(){
        System.out.println("Jumlah Berat Ikan : " + jumlahBeratIkan);
        System.out.println("Jumlah Pakai Solar : " + jumlahSolar);
        System.out.println("Total Pendapatan : " + totalPendapatanNelayan);
    }

    String totalPendapatanNelayan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
