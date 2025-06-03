package Pertemuan9.Pertemuan9a;

import java.io.*;

class Person implements Serializable {
    private String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("John Doe");
        
        // Serialize the object
        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(person);
            o.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
