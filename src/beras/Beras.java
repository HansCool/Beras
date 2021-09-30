package beras;

import java.util.Scanner;

public class Beras {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hari, jumlahHari = 0, jumlahBeras, penggunaanBeras;
        System.out.print("Masukkan jumlah beras dalam karung : ");
        jumlahBeras = scan.nextInt();
        
        System.out.print("Masukkan jumlah beras yang digunakan sehari : ");
        penggunaanBeras = scan.nextInt();
        
        while(jumlahBeras > 0){
            hari = 1;
            while(hari <= 7){
                if (hari < 6) {
                    jumlahBeras -= penggunaanBeras;
                    System.out.println("Sisa beras : "+jumlahBeras+" (hari "+hari+")");
                }else{
                    jumlahBeras -= 2 * penggunaanBeras;
                    System.out.println("Sisa beras : "+jumlahBeras+" (hari "+hari+")");
                }
                hari++;
                jumlahHari++;
                if (jumlahBeras <= 0) {
                    break;
                }
            }
        }
        
        System.out.println("Jumlah Hari : " + jumlahHari);
    }
    
}
