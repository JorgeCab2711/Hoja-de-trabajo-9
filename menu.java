import java.util.ArrayList;
import java.util.Scanner;

public class menu {

    /**
     * Imprime el menu y obtiene la implementacio por medio de un factory
     * @return La implementacion por medio del factory
     */
    public static Arbol displaymenu(){
        Scanner scan = new Scanner(System.in);
        Arbol Tree = null;
        int opcion = 0;

        boolean enProceso = true;
        while(enProceso){ //Menu
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
        return Tree;
    }

    /**
     * Imprime una lista dada por cada linea
     * @param Lista El ArrayList<String> a imprimir
     * @param Mensaje El indicador de que mensaje debe imprimir
     */
    public static void printlista(ArrayList<String> Lista,int Mensaje){
        switch (Mensaje){
            case 1: System.out.println("====Mensaje sin Traducir:====");break;
            case 2: System.out.println("====Mensaje Traducido:====");break;}
        for (String LineaTraducida:Lista){
            System.out.println(LineaTraducida);
        }
    }
}
