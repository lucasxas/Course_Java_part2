
/**
 *Question 20 ,course XTI about java.
 * This class is about class Arrays
 * @author jefferson
 */



import java.util.Arrays;
	import java.util.Scanner;
		public class AboutArrays20{
			public static void main(String[] args){
				Scanner input = new Scanner(System.in);
				
	int numeroVetor = 4;
	
	double[] vetor1 = new double[numeroVetor];
	double[] vetor2 = new double[numeroVetor];
	double[] resultado = new double[numeroVetor];
	int posicao,escolha;
	int cont = 0;



            //Entrando com o laço..
            do{
            

                //criando o Menu
	
		System.out.println("__________________MENU______________________");
		System.out.println("1 - Entra com os valores do vetor1 e vetor2.");
		System.out.println("2 - Ordena o vetor1.");
		System.out.println("3 - procura pela posição de um número no vetor2.");
		System.out.println("4 - O vetor resultante recebe a subtração do vetor1 - vetor2.");
                System.out.println("5 - Sair");
		System.out.println("Qual a sua escolha ?");
		 escolha = input.nextInt();
		
                 // Laço case
                 
		switch(escolha){
                    
			case 1:
                            cont = 1;
                            //Entrando com os valores do vetor
				for(int x = 0; x < numeroVetor ; ++x){
					
					System.out.println("Entre com o valor na posição do vetor1 " +(x+1));
						vetor1[x] = input.nextDouble();
						
					System.out.println("Entre com o valor na posição do vetor2 " +(x+1));
						vetor2[x] = input.nextDouble();
						
					}
				break;
			case 2:
                            if(cont == 1){
				// ordenando 
				Arrays.sort(vetor1, 0, vetor1.length);
				
				for(int x = 0; x < numeroVetor; ++x){
					
					System.out.println((x+1) +"-"+vetor1);
                                }
                            }else {
                                        System.out.println("Vetores não cadastrados ...");
                                        break;
                                        }
				break;
			case 3 :
				//posição
				if(cont == 1){
				System.out.println("Qual o valor que se deseja saber da posição ?");
					 posicao = input.nextInt();
					
					
						int resu = Arrays.binarySearch(vetor2,posicao);
						
							if(resu == posicao){
								
								System.out.println("Posição do valor no vetor2 ="+resu);
								
							} else {
								
								System.out.println("Posição não encontrado no vetor ...");
								
							}
                                } else {
                            
                                        System.out.println("Vetores não cadastrados com sucesso ...");
                                                break;
                                           }
				break;
				case 4 :
                                    if(cont ==1){
				//subtraindo
				
				for(int x = 0; x < numeroVetor; ++x){
					
				resultado[x] = vetor1[x] - vetor2[x];
				
			}
					//exibindo
					for(int x = 0; x < numeroVetor; ++x){
						
						System.out.println((x+1) +"-"+ resultado[x]);
						
					}
                                    } else {
                                        System.out.println("Vetor não cadastrado ....");
                                            break;
                                    }
				
				break;
                                case 5 :
                                    
                                    System.out.println("Programa finalizado com sucesso...!Thanks!");
                                   break;
				default:
				
					System.out.println("Opção incorreta ...");
					
				}
                
            } while(escolha != 5);
		}
}
				
					
						
					