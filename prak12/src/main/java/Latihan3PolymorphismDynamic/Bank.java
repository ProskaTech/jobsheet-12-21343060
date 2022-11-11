/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan3PolymorphismDynamic;

/**
 *
 * @author ASUS
 */
public class Bank {
    float sukuBunga(){
        return 0;
    }
}
class BRI extends Bank{
    //overriding sukuBunga method
    float sukuBunga(){
        return 5.5f;
    }
}
class BNI extends Bank{
    //overriding sukuBungs method
    float sukuBunga(){
        return 10.6f;
    }
}
class Mandiri extends Bank{
    //overriding sukuBungs method
    float sukuBunga(){
        return 9.4f;
    }
}