/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan2PolymorphismeStatic;

/**
 *
 * @author ASUS
 */
public class PolymorphismStatic {
    public static void main(String[] args){
        //memanggil metode perimeter dengan satu argumen
        System.out.println("Sisi Persegi adalah : 4\n Keliling Persegi adalah :" + CompileTime.keliling(4) + "\n");
        //memanggil metode perimter dengan dua argumen
        System.out.println(
                "Sisi Persegi Panjang adalah : 10, 13\nKeliling Persegi Panjang adalah :" +CompileTime.keliling(10,13));
    }
}
