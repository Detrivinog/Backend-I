package Clase9;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    private final static Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {

        try{
            ListaPromedio lista1 = new ListaPromedio(Arrays.asList(1,2,3,4,5,6,7,8));
            ListaPromedio lista2 = new ListaPromedio(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
            ListaPromedio lista3 = new ListaPromedio(new ArrayList<>());
        }catch (Exception e){
            logger.error("La lista es igual a 0");
        }
    }
}
