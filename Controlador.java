/**
 * Universidad del Valle de Guatemala
 * Algoritmos y estructuras de datos
 * Hoja de trabajo 9
 * por Jorge Caballeros y José Monzón
 *
 * Algunas interfaces implementadas fueron obtenidas del modulo de canvas y enlaces externos
 * Ver interfaz SplayBST para referencia externa
 *
 * @author JorgeCab2711
 * @author TheJPMZ
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Archivo Main
 */
public class Controlador{

    /**
     * Controlador
     * @param args
     */
    public static void main(String[] args){

        Arbol Tree = menu.displaymenu();

        ArrayList<String> Dict = lectura.leerdiccionario();
        ArrayList<String> Text = lectura.leertexto();

        menu.printlista(Text,1);

        for (String Linea: Dict) {
            String[] Splitline = Linea.split("\t");
            //System.out.println(Splitline[0]);
            Tree.put(Splitline[0],Splitline[1]);
            //System.out.println(Splitline[0] + "/" + Splitline[1]);
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

        menu.printlista(Traducido,2);
    }
}