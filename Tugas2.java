import java.util.Scanner;

public class Tugas2 {
    
    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //deklarasi variable
        int jenis, durasi, total = 0, totalAll = 0;

        //judul
        System.out.println("========================================");
        System.out.println("========== Perhitungan Parkir ==========");
        System.out.println("========================================");

        //daftar kendaraan
        System.out.println("Daftar kendaraan : ");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("0. Keluar");

        //logic & input
        do {
            //input kendaraan 
            System.out.println("----------------------------------------");
            System.out.print("Masukkan jenis kendaraan\t : ");
            jenis = input.nextInt();

            //batal jika input == 0
            if (jenis == 0) {
                System.out.println("----------------------------------------");
                System.out.println("Program Selesai");
                break;
            }

            //jika lanjut
            if (jenis == 1 || jenis == 2) {
                //input durasi parkir
                System.out.print("Masukkan durasi parkir (jam)\t : ");
                durasi = input.nextInt();

                //ketika durasi lebih dari 5 jam
                if (durasi > 5) {
                    total = 12500;
                    System.out.println("total bayar\t\t\t : " + total);
                }
                if (jenis == 1) {
                    total = durasi * 3000;
                    System.out.println("total bayar\t\t\t : " + total);
                }
                else if (jenis == 2) {
                    total = durasi * 2000;
                    System.out.println("total bayar\t\t\t : " + total);
                }
                
            }

            //total keseluruhan
            totalAll += total;

        } while (jenis != 0);

        //output ketika selesai
        System.out.println("Total pembayaran parkir\t\t : " + totalAll);

    }

}
