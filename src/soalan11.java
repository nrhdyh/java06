/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.*;
public class soalan11 {
public static void main(String[] args){

        String ulasan = null;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama anda: " );
        String nama=input.next();
        
        System.out.print("Taipkan warna kegemaran anda\n merah/biru/kuning/hijau/hitam/putih: " );
        
        String warna=input.next();
        
        switch(warna) {
            case "merah" :{
            ulasan="membawa makna kekuatan, kemarahan dan semangat";
           break;
           }case "biru" :{
            ulasan=("membawa maksud ketenangan, keikhlasan dan harapan. ");
           break;
           }case "kuning" :{
            ulasan=("melambangkan kegembiraan, penuh semangat dan riang");
           break;
           }case "hijau" :{
            ulasan=("menggambarkan kehidupan, kestabilan dan ketulenan");
           break;
           }case "hitam" :{
            ulasan=("dikaitkan dengan kejahatan dan penuh kerahsiaan. ");
           break;
           }case "putih" :{
            ulasan=("adalah berani tetapi tidak suka tunjukkan keberanian. ");
           break;
           
           }default :{
               
           System.out.println("Maaf pilihan salah ");
                    }
                   }
                    System.out.println(nama+", warna anda "+ulasan);     
                    System.out.println("hi"); 
    }
}