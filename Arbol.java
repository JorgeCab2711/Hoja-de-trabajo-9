public interface Arbol<key,value>{

    public void put(key K, value V);

    public boolean contains(key K);

    public value get(key K);
}
