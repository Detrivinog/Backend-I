package Clase19;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Contacto c1 = new Contacto("David", "dav@mail.com", "123456");
        Contacto c2 = new Contacto("Luisa", "lui@mail.com", "123456");
        Contacto c3 = new Contacto("Maria", "mar@mail.com", "123456");
        Contacto c4 = new Contacto("Mik", "mik@mail.com", "123456");

        List<Contacto> contactos = new ArrayList<>();
        contactos.add(c1);
        contactos.add(c2);
        contactos.add(c3);
        contactos.add(c4);

        try {
            FileOutputStream fo = new FileOutputStream("Contactos.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            oos.writeObject(contactos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fi = new FileInputStream("Contactos.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);
//            System.out.println(ois.readObject());
            List<Contacto> contactosLeidos = (ArrayList<Contacto>) ois.readObject();
            for (Contacto x:contactosLeidos){
                System.out.println(x.toString());
            }
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }


    }
}
