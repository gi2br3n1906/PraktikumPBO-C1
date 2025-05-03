package generik;

public class Datum<T>{  
    private T isi;

    public void setIsi(T isi) {
        this.isi = isi;
    }
    public T getIsi() {
        return isi;
    
    }
}