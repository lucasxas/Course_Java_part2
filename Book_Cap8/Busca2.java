/*@author :Jefferson Santos
 *E-mail: Jeff_conexion2014@yahoo.com
 * 
 * This question is about the posicion whatever
 * in the array with the class java.util.array
 */
 
import java.util.Arrays;  //

	import java.util.Scanner;
		
		public class Busca2{
			
			public static void main(String[] args){
				
				Scanner input = new Scanner(System.in);

  //Definindo o tamanho do Vetor

	int NumeroPaises = 4;
	
	String[] paises = new String[NumeroPaises];
	
	// Usando laço for para entrar com os países
	
	for(int x = 0; x < paises.length; ++x){
		
	System.out.println("Entre com os países para a posição "+(x+1)+" "+"Do vetor");
		paises[x] = input.nextLine();
	}
	
	// Fazendo a busca da posição do país no vetor
	
	int posicao = Arrays.binarySearch(paises, "Russia");		//Classe que está sendo importada
		
		//Ordenando o vetor
		
		Arrays.sort(paises, 0,paises.length);
				
				
					for(int x = 0; x < paises.length; ++x){
						System.out.println((x +1)+"-"+paises[x]);
						
					}

		

		System.out.println("Russia está na posição do vetor "+(posicao) );
	
  }
}
 

