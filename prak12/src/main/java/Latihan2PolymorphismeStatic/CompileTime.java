/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan2PolymorphismeStatic;

/**
 *
 * @author ASUS
 */
public class CompileTime {
    //method kelilinng dengan single arugmen
    static int keliling(int a){
        return 4 * a;
    }
    //method keliling dengan dua argumen (method overloading)
    static int keliling(int L, int b){
        return 2 * (L + b);
    }
}
