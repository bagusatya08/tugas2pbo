package inheritance;

import java.util.Scanner;

public class Pencetakan {

    String input_negara;
    Scanner input = new Scanner(System.in);

    void nama_negara(){
        System.out.print("Masukan Nama Negara : ");
        input_negara = input.nextLine();
    }
}
