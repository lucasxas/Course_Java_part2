import java.util.Scanner;
	public class Qc{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			
			/*C > 1 coluna = somado 5
			 * C> 2 Raiz
			 * C> 3 coluna = quadrado
			 */
			
			
	double[] A = new double[10];
	double[][] C = new double[10][3]; 

	//Entrando com os valores de A
	for(int x = 0; x < A.length; ++x){
		
			
			System.out.println("Entre com o valor para linha :");
				A[x] = input.nextDouble();
				
			}
		// entrando com 5 para a primeira coluna
		
		for(int x = 0; x < C.length; ++x){
			
			C[x][1] = A[x] + 5;
			C[x][2] = 1;
		}	
		for(int x = 0; x < C.length; ++x){
			
			C[x][2] = Math.sqrt(A[x]) ;
			
		
	}
	for(int x = 0; x < C.length; ++x){
		
		C[x][3] = Math.pow(A[x],2);
		
	}		
	

				for(int x = 0; x < C.length; ++x){
					
					for(int y = 0; y < C[x].length; ++y){
						
						System.out.println(x +"|"+y		+"="+ C[x][y] +"\t");
						
					}
					System.out.println("\n");
				}
		}
}

		
		
		
		
		
		
		
		
		
