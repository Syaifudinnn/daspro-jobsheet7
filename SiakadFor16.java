import java.util.Scanner;

public class SiakadFor16 {

    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //deklarasi variable
        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidak_lulus = 0;
        int batas_lulus = 60;

        //judul
        System.out.println("=============================");
        System.out.println("===== Siakad Perulangan =====");
        System.out.println("=============================\n");

        //logic dan inputan
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + "\t: ");
            nilai = input.nextDouble();
            
            //cari nilai tertinggi dan terendah
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            //cari siswa lulus dan tidak
            if (nilai >= 60) {
                lulus++; 
            }
            else {
                tidak_lulus++;
            }

        }

        //output
        System.out.println("Nilai tertinggi\t\t\t: " + tertinggi);
        System.out.println("Nilai terendah\t\t\t: " + terendah);
        System.out.println("Jumlah mahasiswa lulus\t\t: " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus\t: " + tidak_lulus);

    }

}