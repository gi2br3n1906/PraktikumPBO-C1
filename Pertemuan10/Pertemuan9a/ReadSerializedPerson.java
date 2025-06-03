package Pertemuan9.Pertemuan9a;

import java.io.*;
public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null;

        try {
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream o = new ObjectInputStream(f);
            person = (Person) o.readObject();
            o.close();
            System.out.println("Name: " + person.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
