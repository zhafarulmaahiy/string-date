package stirngdate;

import java.text.SimpleDateFormat;
import java.util.*;

public class Pelanggan implements Supermart {
    public String Nama;
    public String Alamat;

    public Pelanggan(){

    }

    public Pelanggan(String name, String alamat){
        this.Nama = name; this.Alamat = alamat;
        Date time = new Date();
        SimpleDateFormat tanggal = new SimpleDateFormat("EEEE, dd MMMM yyyy");
        SimpleDateFormat waktu = new SimpleDateFormat("HH : mm : ss");
        String format = tanggal.format(time);
        String forwak = waktu.format(time);
        System.out.println("Tanggal : " + format);
        System.out.println("Waktu   : " + forwak +"WIB");
        System.out.println("====================================");
        System.out.println("DATA PELANGGAN");
        System.out.println("------------------------------------");
        System.out.println("Nama Pelanggan\t: " + Nama);
        System.out.println("Alamat\t\t: " + alamat);
    }

    public void CetakBill(){

    }
}
