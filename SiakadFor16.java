import java.util.Scanner;

public class SiakadFor16 {

    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //deklarasi variable
        double nilai, tertinggi = 0, terendah = 100;

        //judul
        System.out.println("=============================");
        System.out.println("===== Siakad Perulangan =====");
        System.out.println("=============================\n");

        //logic dan inputan
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            nilai = input.nextDouble();
            
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

        }

        //output
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);

    }

}