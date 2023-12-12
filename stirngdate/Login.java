package stirngdate;

import java.util.Scanner;

public class Login {

    String userisi = "zhafa", passisi = "123",cap = "NaHH!!";

    public Login(){
        Scanner in = new Scanner(System.in);
        String username, pass, captcha;
        boolean kunci1 = true, kunci2 = false;
        boolean key1 = true, key2 = false;

        do{
            System.out.print("masukkan username\t: ");
            username = in.nextLine();
            System.out.print("masukkan Password\t: ");
            pass = in.nextLine();
            if(username.equals(userisi) && pass.equals(passisi)){
                kunci1 = kunci2;
            }else{
                System.out.println("Username atau Passwor salah");
            }
        }while(kunci1);
            
        do{
            System.out.println("Captcha\t: "+cap);
            System.out.print("masukkan captcha\t: ");
            captcha = in.nextLine();
            if(captcha.equals(cap)){
                System.out.println("ANDA BERHASIL LOGIN");
                key1 = key2;
            }
        }while(key1);
    }
        
}
