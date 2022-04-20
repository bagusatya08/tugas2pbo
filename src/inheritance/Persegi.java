package inheritance;

public class Persegi extends BangunDatar{
    float sisi;

    @Override
    float luas(){ //method overriding
        float luas = (sisi*sisi);
        System.out.println("Jadi, Luas Persegi adalah " + luas + "cm");
        return luas;
    }

    @Override
    float keliling(){ //method overriding
        float keliling = (4*sisi);
        System.out.println("Jadi, Keliling Persegi adalah " + keliling + "cm");
        return keliling;
    }
}
