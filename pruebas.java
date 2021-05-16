import org.junit.jupiter.api.Test;

import java.security.PublicKey;

import static org.junit.jupiter.api.Assertions.*;

class pruebas {

    @Test
    public void pruebainsertarSplay(){
        Factory factory = new Factory();

        Arbol Tree = factory.factorycall(1);

        Tree.put("Meme","Prueba");

        assertEquals(true, Tree.contains("Meme"));

    }

    @Test
    public void pruebabuscarSplay(){
        Factory factory = new Factory();

        Arbol Tree = factory.factorycall(1);

        Tree.put("Meme","Prueba");

        assertEquals("Prueba", Tree.get("Meme"));

    }

}