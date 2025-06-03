package Pertemuan12;

interface IDiskon {
    public double hitungDiskon(int harga);
}
public class DiskonLambda {
    public static void main(String[] args) {
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3); // Diskon 10% untuk hari kemerdekaan
            }
        };

        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
        
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);// Diskon 20% untuk lebaran
        };
        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));
    }
}
