/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanVeryEasy;

/**
 *
 * @author Administrator
 */
public class Senjata {
    private String bunyi;
    private int peluru;
    
    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0;
    }
    
    public String getBunyi(){
        return bunyi;
    }
    
    public int getPeluru() {
        return peluru;
    }
    
    public void menembak() {
        System.out.println(this.getBunyi());
        System.out.println("Sisa Peluru: " + getPeluru());
    }
    
    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }
    
    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
}
