/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package generik;

/**
 *
 * @author Administrator
 */
public class ContohMetodeGenerik {

    public static void main(String[] args) {
        // Create Datum with Kucing
        Datum<Anabul> datum = new Datum<>();
        datum.setIsi(new Kucing());
        // Display information about each animal
        datum.getIsi().Bersuara();
        datum.getIsi().Gerak();
        
        // Create Datum with Anjing
        datum.setIsi(new Anjing());
        datum.getIsi().Bersuara();
        datum.getIsi().Gerak();
        
        // Create Datum with Burung
        datum.setIsi(new Burung());
        datum.getIsi().Bersuara();
        datum.getIsi().Gerak();
    }
}
