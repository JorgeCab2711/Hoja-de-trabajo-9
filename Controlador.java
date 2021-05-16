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
        for (String LineaText: Text) { //Por cada linea de texto
            String newSentence = ""; //Inicia un string vacio
            String[] SplitText = LineaText.split(" "); //Y separa esa linea de texto en una lista
            for (String Palabra : SplitText) { //Por cada palabra en esa lista
                if (Tree.contains(Palabra)){ //Verifica si el arbol contiene la palabra
                    String nuevaPalabra = (String) Tree.get(Palabra); //Si si la obtiene
                    newSentence += nuevaPalabra + " "; //Y la agrega al string inicial
                } else { //Sino
                    newSentence += "*"+Palabra+"* "; //Agrega la misma palabra con asteriscos
                }
            }
            Traducido.add(newSentence); //Al ginal agrega la oracion a la lista con el texto completo
        }

        menu.printlista(Traducido,2); //Se imprime el nuevo mensaje traducido
    }
}