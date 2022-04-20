package inheritance;

import java.util.Scanner;

public class PencetakanIbuKota extends Pencetakan{
    String input_ibukota;
    Scanner input = new Scanner(System.in);

    void nama_ibukota(){
        System.out.print("Masukan Nama Ibukota : ");
        input_ibukota = input.nextLine();
    }
}
