package week9;

public class BangunDatar {
    private Double panjang, lebar, diameter, sisi;
    private static final Double pi = 3.14;
    
    public BangunDatar(Double sisi){
        this.sisi=sisi;
    }

    public BangunDatar(Double panjang, Double lebar){
        this.panjang=panjang;
        this.lebar=lebar;
    }

    // luas persegi
    public int luas(int a){
        return a*a;
    }

    // luas segitiga
    public int luas(int a, int b){
        return (a*b)/2;
    }

    // luas persegi panjang
    public Double luas(Double a, Double b){
        return a*b;
    }

    // luas lingkaran
    public Double luas(Double a){
       return pi*a*a;
    }

    
    // keliling persegi
    public int keliling(int a){
        return 4*a;
    }

    // keliling segitiga
    public Double keliling(Double a, Double b, Double c){
        return a+b+c;
    }

    // keliling persegi panjang
    public Double keliling(Double a, Double b){
        return 2*(a+b);
    }

    // keliling lingkaran
    public Double keliling(Double a){
        return 2*pi*a;
    }

    public Double getSisi(){
        return sisi;
    }

    public Double getPanjang(){
        return panjang;
    }
    
    public Double getLebar(){
        return lebar;
    }

    public Double getPi(){
        return pi;
    }
}
