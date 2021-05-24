package xirpl1_03_ameliarachma_beratideal;

import java.util.Scanner;

public class XIRPL1_03_Ameliarachma_BeratIdeal {
    
    public static void main(String[] args) {
        Scanner masuk = new Scanner (System.in);
        
        System.out.println("======PROGRAM MENGHIRUNG BERAT IDEAL======");
        System.out.println("Masukkan Nama :");
        String nama= masuk.next();
        System.out.println("Masukkan Jenis Kelamin (1. Laki-Laki)| (2. Perempuan) :");
        int jk = masuk.nextInt();
        System.out.println("Masukkan Tinggi Badan Kamu : ");
        int tb = masuk.nextInt();
        System.out.println("Masukkan Berat Badan Kamu : ");
        int bb = masuk.nextInt();
        System.out.println("======HASIL======");
        
        switch(jk){
          case 1:
            double idealPria = (tb -100)-((tb - 100)*0.1);
            System.out.println("Nama Anda : "+nama);
            System.out.println("Berat Badan Idealmu : "+idealPria);
            if(bb<idealPria){
                System.out.println("Ayo Tingkatkan Lagi dan Semangat Hidup Sehat");
            }
            else if(bb==idealPria){
                System.out.println("Selamat Berat Badanmu Ideal");
            }
             else if(bb==idealPria){
                System.out.println("Berat Badan Anda Melebihi Berat Badan Ideal");
             }
            break;
          case 2:
            double idealWanita = (tb - 100)-((tb - 100)*0.15); 
            System.out.println("Nama Anda : "+nama);
            System.out.println("Berat Badan Idealmu : "+idealWanita);
            if(bb<idealWanita){
                System.out.println("Ayo Tingkatkan Lagi dan Semangat Hidup Sehat");
            }
            else if(bb==idealWanita){
                System.out.println("Selamat Berat Badanmu Ideal");
            }
             else if(bb==idealWanita){
                System.out.println("Berat Badan Anda Melebihi Berat Badan Ideal");
             }
            break;
        }
    }
    
}
