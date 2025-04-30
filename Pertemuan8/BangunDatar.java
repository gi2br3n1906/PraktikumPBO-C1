public abstract class BangunDatar {
    public abstract double luas();
    public abstract double keliling();
    public abstract String getNamaBangunDatar();
    public String getInfo() {
        return "Nama Bangun Datar: " + getNamaBangunDatar() + "\n" +
               "Luas: " + luas() + "\n" +
               "Keliling: " + keliling();
    }
}