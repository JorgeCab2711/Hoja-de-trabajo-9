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

/**
 * Archivo Main
 */
public class Controlador{

    /**
     * Controlador
     * @param args
     */
    public static void main(String[] args){

        Arbol Tree = menu.displaymenu(); //Se obtiene el metodo a usar del menu

        //Se leen los archivos iniciales
        ArrayList<String> Dict = lectura.leerdiccionario();
        ArrayList<String> Text = lectura.leertexto();

        menu.printlista(Text,1); //Se imprime el mensaje inicial

        //Se agregan los valores al arbol
        for (String Linea: Dict) {
            String[] Splitline = Linea.split("\t");
            Tree.put(Splitline[0],Splitline[1]);
        }

        ArrayList<String> Traducido = new ArrayList<String>(); //Inicializacion

        //Se traduce el String
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

        menu.printlista(Traducido,2); //Se imprime el nuevo mensaje traducido
    }
}