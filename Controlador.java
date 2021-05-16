import com.sun.source.tree.Tree;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
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
        Arbol Tree = null;
        int opcion = 0;

        boolean enProceso = true;
        while(enProceso){
            System.out.println("Ingrese la implementacion que quiere usar: \n[1] SplayTree \n[2] HashMap");
            opcion = scan.nextInt();

            if (opcion != 1 && opcion != 2){
                    System.out.println("Lo que ha ingresado no es valido");
            } else {
                Factory factory = new Factory();
                Tree = factory.factorycall(opcion);
                enProceso = false;
            }
        }

        ArrayList<String> Dict = lectura.leerdiccionario();
        ArrayList<String> Text = lectura.leertexto();

        for (String Linea: Dict) {
            String[] Splitline = Linea.split("\t");
            //System.out.println(Splitline[0]);
            Tree.put(Splitline[0],Splitline[1]);
            System.out.println(Splitline[0] + "/" + Splitline[1]);
        }

        ArrayList<String> Traducido = new ArrayList<String>();

        for (String LineaText: Text) {
            String newSentence = "";
            String[] SplitText = LineaText.split(" ");
            for (String Palabra : SplitText) {
                if (Tree.contains(Palabra)){
                    String nuevaPalabra = (String) Tree.get(Palabra);
                    newSentence += nuevaPalabra + " ";
                } else {
                    newSentence += "*"+Palabra+"* ";
                }
            }
            Traducido.add(newSentence);
        }

        for (String LineaTraducida:Traducido){
            System.out.println(LineaTraducida);
        }
    }
}