package inheritance;

public class Kalkulasi {
    int hasil;

    void penjumlahan(int nilai1, int nilai2){
        hasil = nilai1+nilai2;
        System.out.println("Total Penjumlahan adalah " + hasil);
    }

    void pengurangan(int nilai1, int  nilai2){
        hasil = nilai1-nilai2;
        System.out.println("Total Pengurangan adalah " + hasil);
    }
}
