package inheritance;

public class PersegiPanjang extends BangunDatar{
    float panjang, lebar;

    @Override
    float luas(){ //method overriding
        float luas = (panjang*lebar);
        System.out.println("Jadi, Luas Persegi Panjang adalah " + luas + "cm");
        return luas;
    }

    @Override
    float keliling(){ //method overriding
        float keliling = (2*(panjang+lebar));
        System.out.println("Jadi, Keliling Persegi Panjang adalah " + keliling + "cm");
        return keliling;
    }

}
