/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectpenduduk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author fadhilahkh21103100
 */
public class ProjectPenduduk {

    public static void main(String[] args) {

        //Menambahkan object
        Nelayan21103100 n1 = new Nelayan21103100();
        Nelayan21103100 n2 = new Nelayan21103100();
        Dokter21103100 d1 = new Dokter21103100();
        Dokter21103100 d2 = new Dokter21103100();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("NIK : ");
            n1.nik = br.readLine();
            System.out.println("Nama : ");
            n1.nama = br.readLine();
            System.out.println("Umur : ");
            n1.umur = Integer.parseInt(br.readLine());
            System.out.println("Alamat : ");
            n1.alamat = br.readLine();
            System.out.println("jumlah Berat Ikan : ");
            n1.jumlahBeratIkan = Integer.parseInt(br.readLine());
            System.out.println("jumlah Pakai Solar : ");
            n1.jumlahSolar = Integer.parseInt(br.readLine());
          
            System.out.println();

            System.out.println("NIK : ");
            n2.nik = br.readLine();
            System.out.println("Nama : ");
            n2.nama = br.readLine();
            System.out.println("Umur : ");
            n2.umur = Integer.parseInt(br.readLine());
            System.out.println("Alamat : ");
            n2.alamat = br.readLine();
            System.out.println("jumlah Berat Ikan : ");
            n2.jumlahBeratIkan = Integer.parseInt(br.readLine());
            System.out.println("jumlah Pakai Solar : ");
            n2.jumlahSolar = Integer.parseInt(br.readLine());
            
            System.out.println();
           
            System.out.println("NIK : ");
            d1.nik = br.readLine();
            System.out.println("Nama : ");
            d1.nama = br.readLine();
            System.out.println("Umur : ");
            d1.umur = Integer.parseInt(br.readLine());
            System.out.println("Alamat : ");
            d1.alamat = br.readLine();
            System.out.println("Jumlah Pasien : ");
            d1.jumlahPasien = Integer.parseInt(br.readLine());
            System.out.println("Jumlah Obat : ");
            d1.jumlahObat = Integer.parseInt(br.readLine());

            System.out.println();

            System.out.println("NIK : ");
            d2.nik = br.readLine();
            System.out.println("Nama : ");
            d2.nama = br.readLine();
            System.out.println("Umur : ");
            d2.umur = Integer.parseInt(br.readLine());
            System.out.println("Alamat : ");
            d2.alamat = br.readLine();
            System.out.println("Jumlah Pasien : ");
            d2.jumlahPasien = Integer.parseInt(br.readLine());
            System.out.println("Jumlah Obat : ");
            d2.jumlahObat = Integer.parseInt(br.readLine());
            
            System.out.println();
       

            System.out.println("=========== DATA NELAYAN ===========");
            n1.tampilDataPenduduk();
            n1.DataNelayan();
            System.out.println("total Pendapatan Nelayan :"+n1.totalPendapatanNelayan());
            
            System.out.println();
            
            n2.tampilDataPenduduk();
            n2.DataNelayan();
            System.out.println("total Pendapatan Nelayan :"+n2.totalPendapatanNelayan());
            
            System.out.println("=========== DATA DOKTER ===========");
            
            d1.tampilDataPenduduk();
            d1.DataDokter();
            System.out.println("total Pendapatan Dokter :"+d1.totalPendapatanDokter());
            
            System.out.println();
            
            d2.tampilDataPenduduk();
            d2.DataDokter();
            System.out.println("total Pendapatan Dokter :"+d2.totalPendapatanDokter());

        } catch (IOException eox) // menangkap kesalahan
        {
            System.out.println(eox);
        }
    }
}
