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
        
        Scanner scan = new Scanner(System.in);

        //Escanear el documento de las palabras traducidas
        File file = new File("text.txt");
        Scanner doc = new Scanner(file);
        Scanner text = new Scanner(System.in);

        //Escanear lo que se quiere traducir
        File file2 = new File("Spanish.txt");
        Scanner doc2 = new Scanner(file2);
        Scanner spanish = new Scanner(System.in);

        Map<String,String> hm = new HashMap<String, String>();

        boolean enProceso = true;
        while(enProceso){
            System.out.println("Ingrese la implementacion que quiere usar: \n[1] Association\n[2] Map");
            int opcion = scan.nextInt();
            
            //El usuario selecciona que quiere la implementación de la asociacion
            if (opcion == 1){
                //Se ejecita la implementacion de Association
                System.out.println("--> Tradicción del texto con Assosiation: ");
            }

            //El usuario selecciona la implementacion de Map
            else if (opcion == 2){
                //Se ejecita la implementacion de Map
                System.out.println("--> Traducción del texto con Map: \n");
                while(spanish.hasNextLine()){
                    String linea = text.nextLine();
                    String [] mutilarLineas = linea.split("\n");
                    
                }
            }
        }

    }
}