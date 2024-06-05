package week9;

public class BangunRuang extends BangunDatar{
    private int tinggi;

    public BangunRuang( double panjang, double lebar, int tinggi){
        super(panjang, lebar);
        this.tinggi=tinggi;
    }

    // konstruktor
    public BangunRuang(double sisi){
        super(sisi);
    }

    // vol kubus
    public double volume(double sisi){
        return super.getSisi()*super.getSisi()*super.getSisi();
    }

    // vol tabung
    public double volume(double a, double tinggi){
        return super.getPi()*(a*a)*tinggi;
    }
}
