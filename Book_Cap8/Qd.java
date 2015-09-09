/*This question i will go to use
 *the class Arrays ....
 * @author: jefferson
 */

import java.util.Arrays;
import java.util.Scanner;
    
public class Qd {
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       
       int numeroVetor = 6;
       double aux;
       
       double[] vetor1 = new double[numeroVetor];
       double[] vetor2 = new double[numeroVetor];
       
       //Entrando com os valores do vetor1
       
        for(int x = 0; x < vetor1.length; ++x){
            
                System.out.println("Entre com o valor do vetor na posição -"+(x+1));
                    vetor1[x] = input.nextDouble();
        }
       
            //vetor2 vai receber o vetor1 ao quadrado ....
                    for (int x = 0; x < vetor2.length; ++x){
                        
                        vetor2[x] = Math.pow(vetor1[x], 2);
                        
                    }
                        
                        //localizar uma posição do valor escolhido...
                             System.out.println("Qual o valor da posição deseja obter...?");
                                   int proc = input.nextInt();
                        
                                       int posicao =   Arrays.binarySearch(vetor2, proc);
                                
                                          System.out.println("Posição ="+posicao);
                                          
                                          //ordenando ed forma decrscente
                                          
                                            for(int x = 0; x < vetor2.length; ++x){
                                                
                                                for(int y = 0; y < vetor2.length; ++y){
                                                    
                                                     if(vetor2[x] < vetor2[y]){
                                                         
                                                         
                                                         aux = vetor2[y] ;
                                                         vetor2[y] = vetor2[x];
                                                         vetor2[x] = aux;
                                                         
                                                     }
                                                }
                                            }               
                                                           
                                            //Exibindo em ordem decrescente        
                                                 for (int x = 0; x < vetor2.length; ++x){
                                                     
                                                            System.out.println(vetor2[x]);
                                                     
                                                 }
                                                 
                                                 
                                                         //Exibindo em orde crescente vetor1 ...
                                                 
                                                        Arrays.sort(vetor1, 0 ,vetor1.length );
                                                            
                                                            //exibindo vetor em crescente ...
                                                        
                                                                for (int x = 0; x < vetor1.length; ++x){
                                                     
                                                                        System.out.println(vetor1[x]);

                                                                    }
                                                           
       
   } 
}
