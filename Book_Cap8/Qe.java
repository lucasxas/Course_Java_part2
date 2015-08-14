import java.util.Scanner;
	public class Qe{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			
			
	double[] Mat_1 = new double[1];
	double[] Mat_2 = new double[1];
	double[][] Mat_resu = new double[1][2];
	
	//Entrando com o valor para vetor 1
	for(int x = 0; x < Mat_1.length; ++x){
		
			
			System.out.println("Informe o valor para Matriz:");
				Mat_1[x] = input.nextDouble();
			}
		
		//Entrando com o valor da vetor 2
		for(int x = 0; x < Mat_2.length; ++x){
		
			
			System.out.println("Informe o valor para Matriz:");
				Mat_2[x] = input.nextDouble();
			}
		
			// Tranferindo o  valor da Mtriz resultado...
			
			for(int x = 0; x < Mat_resu.length; ++x){
		
					
					Mat_resu[x][1] = (Mat_1[x] *2);
					Mat_resu[x][2] = (Mat_2[x] -5);
	                
				}
				//Exibindo o resultado ...
				
				for(int x = 0; x < Mat_resu.length; ++x){
					
					for(int y = 0; y < Mat_resu[x].length ; ++y){
						
						System.out.println(x +"|"+y		+"="+ Mat_resu[x][y] +"\t");
						
					}
					System.out.println("\n");	
				}
		}
}
	
