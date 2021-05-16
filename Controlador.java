import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
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

        boolean enProceso = true;
        while(enProceso){
            System.out.println("Ingrese la implementacion que quiere usar: \n[1] Association\n[2] Map");
            int opcion = scan.nextInt();

            if (opcion != 1 || opcion != 2){
                    System.out.println("Lo que ha ingresado no es valido");
            } else {
                Factory factory = new Factory();
                Arbol Tree= factory.factorycall(opcion);
                enProceso = false;
            }
        }

        ArrayList<String> Dict = lectura.leerdiccionario();
        ArrayList<String> Text = lectura.leertexto();

        for (String Linea: Dict) {
            String[] Splitline = Linea.split("\t");
            Arbol.put(Splitline[0],Splitline[1]);
        }
        
        for (String LineaText: Text) {
            String[] SplitText = LineaText.split(" ");

        }


    }
}