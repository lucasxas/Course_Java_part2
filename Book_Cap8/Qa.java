import java.util.Scanner;
	public class Qa{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			
	int[][] v1 = new int[5][3];
	int[][] v2 = new int[5][3];
	int[][] r = new int [5][3];
	
	//Entrando com os Valores do Vetor 1
	
		for(int x = 0; x < v1.length; ++x){
			
			for(int y = 0; y < v1[x].length; ++y){
				
				System.out.println("Entre com o valor para linha do Vetor1"+"  " +(x+1)+"  " +"Coluna"+"  "+(y+1));
					v1[x][y] = input.nextInt();
					
				}
			}
			
			//Entrando com o valor para vetor 2
			
			for(int x = 0; x < v2.length; ++x){
				
				for(int y = 0; y < v2[x].length; ++y){  // vetor do Vetor
					
				  System.out.println("Entre com o valor para linha do Vetor2"+"   " +(x+1)+	"  "+"Coluna"+"  "+(y+1));
						v2[x][y] = input.nextInt();
						
					}
				}
				
				//V1 + v2 = r
				for(int x = 0; x < r.length; ++x){
					
					for(int y = 0; y < r[x].length; ++y){
						
						r[x][y] = v1[x][y] + v2[x][y];
						
					}
				}
				
				// Exibindo o Resultado
				for(int x = 0; x < r.length; ++x){
					
					for(int y = 0; y < r[x].length; ++y){
						
						System.out.println(x +"|"+y		+"="+ r[x][y] +"\t");
						
					}
					System.out.println("\n");
				}
				
		}
}
					
					
					
					
					
					
				
						
						
						
						
						
						
				
				
				
				
				
				
				
				
				
				
				
			
			
	
