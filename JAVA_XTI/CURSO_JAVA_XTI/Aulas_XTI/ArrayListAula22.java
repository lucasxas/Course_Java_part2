
/* @author jefferson
*this question is about Arraylist
 */
import java.util.ArrayList;

public class ArrayListAula22 {
    
    public static void main(String[] args){
        
        ArrayList<String> cores = new ArrayList<>();
   
        cores.add ("Branco");
        cores.add (0,"Preto");
        cores.add ("Azul");
        
        //Saber a quantidade de elementos no arrays
        System.out.println(cores.size());
        
        //recuperar um elemento dentro do array
        
        System.out.println(cores.get(1));
        
        //Fazer uma busca de um elemento
        System.out.println(cores.indexOf("Preto"));
        
        //removendo um elemento
        cores.remove("Preto");
        
        // verificar se o elemento existe
        cores.contains ("Amarelo");
        
        System.out.println("Tem Preto ?" +cores.contains("Preto"));
        
        System.out.println(cores.toString());
        
    
        
        
    }
}

