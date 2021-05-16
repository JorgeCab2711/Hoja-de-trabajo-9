/**
 *  Fue utilizada la implementacion de Josh Israel como referencia
 *  Obtenida de https://algs4.cs.princeton.edu/33balanced/SplayBST.java.html
 *
 *  Original por Josh Israel.
 */
import java.util.HashMap;

public class Hashmap<Key extends Comparable<Key>, Value> implements Arbol<Key,Value> {

    private HashMap map = new HashMap();

    /**
     * Agrega al mapa
     * @param key Llave
     * @param value Valor
     */
    public void put(Key key, Value value) {
        map.put(key, value);
    }

    /**
     * Si contiene la llave
     * @param key Llave
     * @return Booleano si esta la llave
     */
    public boolean contains(Key key) {
        return map.containsKey(key);
    }

    /**
     * Obtiene el valor
     * @param key Llave
     * @return Valor
     */
    public Value get(Key key) {
        return (Value) map.get(key);
    }
}
