
import java.util.ArrayList;
import java.util.Scanner;

public class QE {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        
        int numeroVetor = 5;
        int numeroVetorRe = 10;
        
            
        int[] vetor1 = new int[numeroVetor];
        int[] vetor2 = new int[numeroVetor];
        double[] vetorResu = new double[numeroVetorRe];
        
          //  Entrando com o valor para os vetores 1 e 2 
        
                for(int x = 0; x < numeroVetor; ++x){
                    
                        System.out.println("Entre com o valor para a posição do vetor1 -"+(x+1));
                            vetor1[x] = input.nextInt();
                            
                        System.out.println("Entre com o valor para a posição do vetor2 -"+(x+1));
                            vetor2[x] = input.nextInt();
                }
                
                            //Entrando com vetor1 e vetor 2 em vetorResu
                
                                for(int x = 0; x < numeroVetor; ++x){
                                    
                                      vetorResu[x] = vetor1[x];
                                      vetorResu[x + 5] = vetor2[x];
                                }
                                
                                             //Exibindo o vetorResu
                                                    for(int x = 0; x < numeroVetorRe; ++x){
                                                            
                                                            System.out.println((x+1) +"-"+vetorResu[x]);
                                                        
                                                    }     
                                         /*Agora eu irei importar ArrayList para estarmos trabalhando ...
                                          *Muias coisas aqui não sei como explicar ...
                                          */
                                                    
                                               ArrayList<Double> vetor = new ArrayList<>();    
                                
                                
                                                    for(int x =0 ; x < numeroVetorRe;++x){
                                                        
                                                        vetor.add (vetorResu[x]);
                                                        
                                                    }
                                                            
                                                        //Exibindo o tamanho do vetor,o mesmo que length
                                                            
                                                                System.out.println(vetor.size());
                                                                
                                                                 //recuperar um elemento dentro do array
        
                                                                        System.out.println("Elemento recuperado... ="+vetor.get(1));
                                                                        
                                                                        //Fazer uma busca de um elemento e
                                                                            
                                                                            System.out.println("Entre com o valor que se procura ?");
                                                                                double numero = input.nextDouble();
                                                                                
                                                                                    System.out.println(" Posição do número ="+vetor.indexOf(numero));
                                                                                    
                                                                                        //verificar se o número existe
                                                                                            vetor.contains(numero);
                                                                                            System.out.println("O elemento existe :"+vetor.contains(numero));
                                
                              
        
                    }
    
}
