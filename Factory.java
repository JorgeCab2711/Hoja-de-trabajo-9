/*
Fue utilizado https://www.tutorialspoint.com/design_pattern/factory_pattern.htm como referencia
 */

import java.util.HashMap;

public class Factory {

    /**
     * Clase Factory, regresa el tipo de arbol a utilizar
     * @param num int que decide la implementacion
     * @return La implementacion a utilizar
     */
    public Arbol factorycall(int num){
        switch(num){
            case 1: return new SplayBST<>();
            case 2: return (Arbol) new HashMap<String,String>();
        }
        return null;
    }
}
