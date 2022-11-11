/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan1Inheritance;

/**
 *
 * @Created By Dieueuel
 */
public class JavaInheritance
{
            public static void main(String[]args)
            {
                //Membuat objek Kendaraan roda dua
                RodaDua sepeda = new RodaDua();
                //Membuat objek Kendaraan roda empat
                RodaEmpat mobil = new RodaEmpat();
                
                sepeda.tampilkanHarga();
                sepeda.hargaAkhir();
                
                mobil.tampilkanHarga();
                mobil.hargaAkhir();
            }
}
