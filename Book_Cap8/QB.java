import java.util.Scanner;
	public class QB{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);

	byte[] v1 = new byte[2];
	byte[] v2 = new byte[2];
	int[][] r = new int[2][2];
	
	//Entrando com os valores para o Vetor1
	
	for(int x = 0; x < v1.length; ++x){
	   	
			System.out.println("Entre com o valor para o vetor na posição -"+(x+1));
				v1[x] = input.nextByte();
				
			}
			
			// Entrando com os valores para o vetor 2
			
			for(int y = 0; y < v2.length; ++y){
				
				System.out.println("Entre com os valores para o vetor na posição -"+(y+1));
					v2[y] = input.nextByte();
					
				}
				
				//r[x][y] onde x = v1 e y = v2 
				
				for(int x = 0; x < r.length;++x){
				
				//	for(int y = 0; y < r[x].length; ++y){
						
						
					r[x][0] = v1[x];
					r[x][1] = v2[x];
					
				}
			
			
			//Exibindo o a matriz r
			
			for(int x = 0; x < r.length; ++x){
					
					for(int y = 0; y < r[x].length; ++y){
						
						System.out.println(x +"|"+y		+"="+ r[x][y] +"\t");
						
					}
					System.out.println("\n");	
				}
		}
}
						
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
