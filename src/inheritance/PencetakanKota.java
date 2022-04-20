package inheritance;

import java.util.Scanner;

public class PencetakanKota extends PencetakanIbuKota{
    String input_kota;
    Scanner input = new Scanner(System.in);

    void nama_kota(){
        System.out.print("Masukan Nama Kota : ");
        input_kota = input.nextLine();
    }
    void pencetakan_keseluruhan(){
        System.out.println("________________________________");
        System.out.println("Digabungkan Menjadi ");
        System.out.println( input_negara + ", " + input_ibukota + ", " + input_kota);
    }
}
