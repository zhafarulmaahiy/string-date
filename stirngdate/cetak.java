package stirngdate;

import java.util.Scanner;

public class cetak {

    public static void main(String[] args) {
        
        String ism, dress, kobar, nabar, kasir;
        int harga, jumbar;
        
        
        System.out.println("-----SELAMAT DATANG DI SUPERMART----");
        System.out.println("====================================");
        Login log = new Login();
        System.out.println("------------------------------------");
        System.out.println("\n");
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("pembeli\t\t: ");
        ism = in.next();
        System.out.print("alamat\t\t: ");
        dress = in.next();
        System.out.print("Kode barang\t: ");
        kobar = in.next();
        System.out.print("Nama Barang\t: ");
        nabar  = in.next();
        
        do {
            System.out.print("harga\t\t: ");
            harga = in.nextInt();
            System.out.print("jumlah\t\t: ");
            jumbar = in.nextInt();
            
            try {
                if ((harga < 0) || (jumbar <0) ) {
                    throw new Exception("hahahihi");
                }
            } catch (Exception e) {
                System.out.println("jumlah barang dan harga tidak boleh negatif"+e);
                System.out.println("masukkan ulang data.");
            }
            
        } while ((harga < 0) || (jumbar<0));
        System.out.print("kasir\t\t: ");
        kasir = in.next();
        System.out.println("\n");

        
        System.out.println("-------------SUPERMART--------------");
        Pelanggan uang = new Pelanggan(ism, dress);
        Penjualan untung = new Penjualan(nabar, kobar, harga, jumbar);
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("Kasir\t: " + kasir);
        
        

        in.close();
    }
}
