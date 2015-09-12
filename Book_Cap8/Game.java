
package javaapplication4;

/**Tthis program is about dado Game
 *A person choose a number.
 * @author jefferson
 */
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random n = new Random();
        
            //Perguntando o palpite do usuártio 
                System.out.println("______Jogo do Dado ______");
                System.out.println("Qual o seu palpite ?");
                    int palpite = input.nextInt();
        
                    //Exibindo o palpite ...
                        System.out.println("Palpite do jogador ?"+palpite);
                        
                    
                    //sorteio do número do dado 
                        int dado = n.nextInt(6)+1;
                        
                            //Exibindo o valor do dado ...
                                System.out.println("Dado ="+dado);
                        
                             if(dado == palpite){
                                    
                                 System.out.println("Acertou!!win!");
                                 
                             }  else {
                                 
                                 System.out.println("Errou !!Gamer over ...");
                                 
                             }    
    
    }
}   

