
package javaapplication4;

/**
 *
 * @author jefferson
 */
public class CachorroTest {
    public static void main(String[] args){
        
        //objeto ,instancia de Objeto...
        Cachorro pitbull = new Cachorro();
        
        pitbull.raca = "Pit Bull";
        pitbull.tamanho = 40;
        pitbull.latir();
        
        Cachorro viralata = new Cachorro();
        viralata.raca = "viralata";
        viralata.tamanho = 20;
        viralata.latir();
        
        
    }
}