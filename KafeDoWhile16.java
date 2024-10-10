import java.util.Scanner;

public class KafeDoWhile16 {
    
    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //deklarasi variable
        int jml_kopi, jml_teh, jml_roti, total_harga;
        int harga_kopi = 12000, harga_teh = 7000, harga_roti = 20000;
        String nama_pelanggan;

        //judul
        System.out.println("=============================");
        System.out.println("======= Kafe Do While =======");
        System.out.println("=============================");

        //logic dan inputan
        do {
            //input nama pelanggan
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar) : ");
            nama_pelanggan = input.nextLine();

            //jika batal
            if (nama_pelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi Dibatalkan");
                break;
            }

            //jika tidak batal inputkan jumlah pembelian
            System.out.print("Jumlah beli kopi\t : ");
            jml_kopi = input.nextInt();
            
            System.out.print("Jumlah beli teh\t\t : ");
            jml_teh = input.nextInt();

            System.out.print("Jumlah beli roti\t : ");
            jml_roti = input.nextInt();

            System.out.println("=============================");

            //perhitungan harga
            total_harga = (jml_kopi * harga_kopi) + (jml_roti * harga_roti) + (jml_teh * harga_teh);

            //output
            System.out.println("Total yang harus dibayar : " + total_harga);
            input.nextLine();

        } while (true);

        //selesai
        System.out.println("Transaksi Selesai");

    }

}
