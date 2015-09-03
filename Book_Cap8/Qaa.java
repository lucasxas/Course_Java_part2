/*put some names in vetor and order in decreasing
*@author :Jefferson Santos
*E-mail: Jeff_conexion2014@yahoo.com
*/


   import java.util.Arrays;
     import java.util.Scanner;
		public class Qaa{
			public static void main(String[] args){
				Scanner input = new Scanner(System.in);
				
				
	int numeroNome = 5;
	String aux ;
	
	String[] nome = new String[numeroNome];
	String[] nome2 = new String[numeroNome];
	//Entrando com os nomes nos vetores 
	
		for(int x = 0; x < nome.length ; ++x){
			
				System.out.println("Informe o nome para a posição do vetor -"+(x+1));
					nome[x] = input.nextLine();
					
				}
				
				//Entrando com os nomes no segundo vetor 
				
					for(int x = 0; x < nome2.length ; ++x){
			
				System.out.println("Informe o nome para a posição do vetor -"+(x+1));
					nome2[x] = input.nextLine();
					
				}
				
				//Ordenando de crescente
				
				Arrays.sort(nome,0,nome.length);//tentei colocar em ordem decrescente,porem dá erro ao copilar.
				
					// ordenando para descrecente
					for(int x = 0; x < nome2.length;++x){
						for(int y = 0; y < nome2.length; ++y){
							
						if(nome2[x] < nome2[y]){   //existe um erro por tem que ser feito com equals
							
							aux = nome2[x];
							nome2[x] = nome2[y];
							nome2[y] = aux;
						}
					}	
				}		
					//Exibindo o resultado	
					
					for(int x = 0; x < nome.length; ++x){
						
						System.out.println((x+1)+"-"+nome[x]);
						
					}
					//Exibindo o resultado
					for(int x = 0; x < nome2.length; ++x){
						
						System.out.println((x+1)+"-"+nome2[x]);
						
					}
		}
}
						
						
						
						
				
				
				
				
				
				
				
				
				
				
				
	

