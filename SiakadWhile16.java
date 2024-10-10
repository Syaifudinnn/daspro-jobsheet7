import java.util.Scanner;

public class SiakadWhile16 {
    
    public static void main(String[] args) {
        
        //deklarasi scanner
        Scanner input = new Scanner(System.in);

        //deklarasi variable
        int nilai, jml, i = 1;

        //judul
        System.out.println("=============================");
        System.out.println("===== Siakad Perulangan =====");
        System.out.println("=============================\n");

        //logic dan inputan
        System.out.print("Masukkan jumlah mahasiswa\t : ");
        jml = input.nextInt();

        while (i <= jml) {
            //input nilai
            System.out.print("Masukkan nilai mahasiswa ke-" + i + "\t : ");
            nilai = input.nextInt();

            //cek apakah nilai yang dimasukkan valid
            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid, masukkan nilai yang valid");
                continue;
            }

            //pengelompokan nilai
            if (nilai <= 100 && nilai > 80) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah A");
            }
            else if (nilai <= 80 && nilai > 73) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah B+");
            }
            else if (nilai <= 73 && nilai > 65) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah B");
            }
            else if (nilai <= 65 && nilai > 60) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah C+");
            }
            else if (nilai <= 60 && nilai > 50) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah C");
            }
            else if (nilai <= 50 && nilai > 39) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah D");
            }
            else {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah E");
            }

            i++;
        }

    }

}
