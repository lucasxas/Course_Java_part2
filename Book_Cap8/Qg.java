
package javaapplication4;

/*two vetor A=3 B=2 so vetor result 
 * is equals R=5
 * @author jefferson
 */

import java.util.Scanner;
import java.util.ArrayList;


public class Qg {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Double> vetSuper = new ArrayList <>();
        
        
        byte[] vetor1 = new byte[3];
        double[] vetor2 = new double[3];
        double[] resu  = new double[6];
        int op;
        int cont = 0;

            // Entrando no laço do/while
            do{
                System.out.println("______________MENU_______________");
                System.out.println("1 - Entrar com os valores do vetor 1");
                System.out.println("2 - Entrar com os valores do vetor 2");
                System.out.println("3 - Passar os valores do Vetor1 e vetor 2 para vetor resu.");
                System.out.println("4 -Finalizar o programa com sucesso...");
                System.out.println("Qual a sua escolha ?");
                   op = input.nextInt();
                   
                    switch(op){
                        case 1:     //Entrando com os valores para vetor1
                            cont = 1;
                            for(int x = 0; x < vetor1.length; ++x){
                                    
                                    System.out.println("Entre com o valor para a posição do vetor1 -"+(x+1));
                                        vetor1[x] = input.nextByte();
                            }
                            
                            
                            
                            break;
                        case 2:         //Entrando com os valores para vetor2
                            if(cont ==1){
                                cont += 1;
                                for(int x = 0; x < vetor2.length; ++x){
                                        
                                    System.out.println("Entre com os valores para o vetor2 -"+(x+1));
                                        vetor2[x] = input.nextDouble();
                                        
                                }
                         
                                } else {
                                
                                    System.out.println("Vetor1 Não cadastrado com sucesso....");
                            }
                            
                            
                            break;
                        case 3:     //passando os valores de vetor1 e 2 para resu
                             if( cont ==2){
                                for(int x = 0; x < 3; ++x){
                                    
                                    resu[x] = vetor1[x];
                                    resu[x +3] = vetor2[x];
                                    
                                     }
                                    
                                
                            } else {
                                 
                                System.out.println("Vetor 1 e 2 não cadastrado com sucesso...");
                            }
                            
                            for(int x = 0; x < 6; ++x){
                                System.out.println((x+1)+"-"+resu[x]);
                            }
                            
                            break;
                        case 4:             //Finalizando programa
                            System.out.println("Estaremos fazendo mais algumas perguntas para a finalização do programa...");
                            
                            break;
                        default:        //Padrão para erros
                            
                            System.out.println("!! Opção inválida ...");
                            
                    }
                  
            } while(op != 4);           //Finalizando o laço do/while
        
        //Trabalhando com o ArrayList
            //Adicionando a varialvel resu
            
            for(int x = 0; x < resu.length; ++x){
                
                vetSuper.add(resu[x]);      //Adicionando o vetor para poder trabalha com o ArrayList
                
            }
            
            // verificar o tamanho do vetor resu
                System.out.println("A quantidade de elementos existete no vetor resu ="+vetSuper.size());
                
                
                //Removendo um elemento de resu
                
                    System.out.println("Qual o elemento que se deseja remover");
                        double remove = input.nextDouble();
                        
                        vetSuper.remove(remove);
                        
                            //vamos fazer uma busca dentro do vetor
                        
                                System.out.println("Qual a posição do elemento que se deseja achar?");
                                    double acharPosi = input.nextDouble();
                                    
                                        System.out.println(vetSuper.indexOf(acharPosi));
                                        
                                        //Verificar se um elemento existe
                                        System.out.println("Qual o elemento que deseja saber se existe?");
                                            double existe = input.nextDouble();
                                            
                                            System.out.println("O elemento"+existe+" "+"Tem no vetor?"+vetSuper.contains(existe));
                                            
                                                System.out.println("O programa finalizado com sucesso!!Obrigado por sua preferencia!");
                                                
            
            
            
     
    }
    
}
