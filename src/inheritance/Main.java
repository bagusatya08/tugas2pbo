package inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pilihan, pilihan_bangunan, pilih_jenis, pilih_operasi;
        int nilai1, nilai2;
        Scanner input = new Scanner(System.in);

        System.out.println("_____________________________");
        System.out.println("  Jenis Inheritance di Java  ");
        System.out.println("_____________________________");
        System.out.println("[1] Single");
        System.out.println("[2] Multilevel");
        System.out.println("[3] Hierarchical");
        System.out.print("Masukan Pilihan : ");
        pilih_jenis = input.nextInt();

        if (pilih_jenis==1){
            //single inheritance object
            Kalkulasi_tambahan kalkulasi = new Kalkulasi_tambahan();

            System.out.println("____________________________");
            System.out.println(" Program Operasi Aritmatika ");
            System.out.println("____________________________");
            System.out.println("[1] Penjumlahan");
            System.out.println("[2] Pengurangan");
            System.out.println("[3] Perkalian");
            System.out.print("Masukan Pilihan : ");
            pilih_operasi = input.nextInt();
            if (pilih_operasi==1){
                System.out.print("Masukan Nilai Pertama : ");
                nilai1 = input.nextInt();
                System.out.print("Masukan Nilai Kedua : ");
                nilai2 = input.nextInt();
                kalkulasi.penjumlahan(nilai1, nilai2);
            } else if (pilih_operasi==2){
                System.out.print("Masukan Nilai Pertama : ");
                nilai1 = input.nextInt();
                System.out.print("Masukan Nilai Kedua : ");
                nilai2 = input.nextInt();
                kalkulasi.pengurangan(nilai1,nilai2);
            } else if (pilih_operasi==3){
                System.out.print("Masukan Nilai Pertama : ");
                nilai1 = input.nextInt();
                System.out.print("Masukan Nilai Kedua : ");
                nilai2 = input.nextInt();
                kalkulasi.perkalian(nilai1,nilai2);
            } else{
                System.out.println("____________________________");
                System.out.print("Pilihan tidak tertera !");
            }

        } else if (pilih_jenis==2){
            //multilevel inheritance object
            PencetakanKota level = new PencetakanKota();

            System.out.println("________________________________");
            System.out.println(" Program Pencetakan  Multilevel ");
            System.out.println("________________________________");
            level.nama_negara();
            level.nama_ibukota();
            level.nama_kota();
            level.pencetakan_keseluruhan();

        } else if (pilih_jenis==3) {
            // hierarchical inheritance object
            BangunDatar bangundatar = new BangunDatar();
            Persegi persegi = new Persegi();
            Segitiga segitiga = new Segitiga();
            PersegiPanjang persegipanjang = new PersegiPanjang();

            System.out.println("____________________________");
            System.out.println("Program Operasi Bangun Datar");
            System.out.println("____________________________");
            System.out.println("[1] Operasi Luas");
            System.out.println("[2] Operasi Keliling");
            System.out.print("Masukan Pilihan : ");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                bangundatar.luas();
                pilihan_bangunan = input.nextInt();
                if (pilihan_bangunan == 1) {
                    System.out.println("____________________________");
                    System.out.print("Masukan Nilai Sisi : ");
                    persegi.sisi = input.nextFloat();
                    persegi.luas();
                } else if (pilihan_bangunan == 2) {
                    System.out.println("____________________________");
                    System.out.print("Masukan Nilai Panjang : ");
                    persegipanjang.panjang = input.nextFloat();
                    System.out.print("Masukan Nilai Lebar : ");
                    persegipanjang.lebar = input.nextFloat();
                    persegipanjang.luas();
                } else if (pilihan_bangunan == 3) {
                    System.out.println("____________________________");
                    System.out.print("Masukan Nilai Alas : ");
                    segitiga.alas = input.nextFloat();
                    System.out.print("Masukan Nilai Tinggi : ");
                    segitiga.tinggi = input.nextFloat();
                    segitiga.luas();
                } else {
                    System.out.println("____________________________");
                    System.out.print("Pilihan tidak tertera !");
                }

            } else if (pilihan == 2) {
                bangundatar.keliling();
                pilihan_bangunan = input.nextInt();
                if (pilihan_bangunan == 1) {
                    System.out.println("____________________________");
                    System.out.print("Masukan Nilai Sisi : ");
                    persegi.sisi = input.nextFloat();
                    persegi.keliling();
                } else if (pilihan_bangunan == 2) {
                    System.out.println("____________________________");
                    System.out.print("Masukan Nilai Panjang : ");
                    persegipanjang.panjang = input.nextFloat();
                    System.out.print("Masukan Nilai Lebar : ");
                    persegipanjang.lebar = input.nextFloat();
                    persegipanjang.keliling();
                } else if (pilihan_bangunan == 3) {
                    System.out.println("____________________________");
                    System.out.print("Masukan Nilai Sisi : ");
                    segitiga.sisi = input.nextFloat();
                    segitiga.keliling();
                } else {
                    System.out.println("____________________________");
                    System.out.print("Pilihan tidak tertera !");
                }
            }
        }
    }
}
