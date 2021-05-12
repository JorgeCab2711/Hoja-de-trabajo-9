import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.HashMap;
import java.util.Map;

/*
Universidad del Valle de Guatemala
Algoritmos y estructuras de datos
Hoja de trabajo 9
Driver
Jorge Caballeros Pérez
Jose Pablo Mozon
*/

public class Controlador{
    public static void main(String[] args) throws FileNotFoundException {
        //Escanear el documento de las palabras traducidas
        File file = new File("Spanish.txt");
        Scanner doc = new Scanner(file);
        Scanner scan = new Scanner(System.in);

        //Escanear lo que se quiere traducir
        File file2 = new File("Spanish.txt");
        Scanner doc2 = new Scanner(file2);
        Scanner scan2 = new Scanner(System.in);

        Map<String,String> hm = new HashMap<String, String>();

    }
}