package inheritance;

public class Segitiga extends BangunDatar{
    float alas, tinggi, sisi;

    @Override
    float luas(){ //method overriding
        float luas = (0.5f*alas*tinggi);
        System.out.println("Jadi, Luas Segitiga adalah " + luas + "cm");
        return luas;
    }

    @Override
    float keliling(){ //method overriding
        float keliling = (3*sisi);
        System.out.println("Jadi, Keliling Segitiga adalah " + keliling + "cm");
        return keliling;
    }
}
