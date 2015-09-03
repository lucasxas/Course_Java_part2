/*@author :Jefferson Santos
 *E-mail: Jeff_conexion2014@yahoo.com
*A vetor "A" another vetor B
*so the vetor "A" pass your values to vetor "B" * 2
*/

 import java.util.Arrays;
   import java.util.Scanner;
	public class Qb{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			
			
	int tamanhoVetor = 4 ;
	float change ;
	double[] vetor = new double[tamanhoVetor];
	double[] resultado = new double[tamanhoVetor];

	// Entrando com os valores no vetor

		for(int x = 0; x < vetor.length; ++x){
			
			System.out.println("Entre com o número na posição -"+(x+1));
				vetor[x] = input.nextDouble();
				
			}
			
				//B[x] = A [x] * 2
				
				for(int x = 0; x < resultado.length; ++x){
					
					resultado[x] = vetor[x] * 2;
					
				}
					//Entrando com o número de busca
					
					System.out.println("Qual o número que deseja ser buscado...?");
						change = input.nextFloat();
						
						double posição = Arrays.binarySearch(resultado,change);
						
				
							//Exibindo a posição
								System.out.println("Posição do número no vetor é = "+posição);
				
					//Exibindo o resultado 
							for(int x = 0; x < resultado.length; ++x){
								
								System.out.println((x+1)+"-"+resultado);
							}
		}
}
				
				
				
				
				
			
