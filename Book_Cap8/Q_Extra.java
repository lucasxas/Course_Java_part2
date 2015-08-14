import java.util.Scanner;
	public class Q_Extra{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);


	int numero =5;
	String[] nom = new String[5];
	double[] sal = new double[5];
	
	boolean cad,achou;
	
cad = false;
achou = false;
String aux,nome ;
double auxs;
int op;
double sala,salf;
do{

	do{	
	
	System.out.println("_________Empresa vale tudo _______________");
	System.out.println("1-Cadastra dados");
	
	if(cad != false) {
		System.out.println("2- Ordenação");
		System.out.println("3- Lista todos os funcionários");
		System.out.println("4- Lista dados de um funcionário");
		System.out.println("5- Lista total de funcionário dentro de uma faixa de salário");
	}
	System.out.println("6- Sair");
	System.out.println();
	System.out.println("Selecione uma opção :");
		op = input.nextInt();
		
	} while(op ==1 || op ==6 || cad == true);
	
	switch (op){
		case 1:
			for(int x = 0;x < nom.length; ++x){
				System.out.println("Entre com o nome do funcionário na posição -"+(x+1));
					nom[x] = input.nextLine();
					
				System.out.println("Entre com o salário do funcionário para a posição -"+(1+x));
					sal[x] = input.nextDouble();
					System.out.println();
				}
				cad = true;
				
				
		break;
		case 2:
			for(int x = 0; x < numero; ++x){
				for(int y = 0; y < (numero -1); ++y){
					if(nom[y] > nom[y +1]){
						
						aux = nom[y];
						nom[y] = nom[y +1];
						nom[y + 1] = aux;
					}
				}
			}
			for(int x = 0; x < sal.length; ++x){
				for (int y =0; y < (sal.length -1); ++y){
					if(sal[y] > sal[y +1]){
						
						auxs = sal[y];
						sal[y] = sal[y + 1];
						sal[y + 1] = auxs;
					}
				}
			}
		break;
		case 3:
		System.out.println("Lista ordenada dos funcionários :");
		System.out.println();
		
		for(int x =0; x < 5; ++x){
			System.out.println((x+1)+"-"+nom[x]);
			System.out.println("Salário ="+sal[x]);
			System.out.println();
			
		}
		break;
		case 4:
			System.out.println("Campo de busca ");
			System.out.println();
			System.out.println("Digite um nome :");
				nome = input.nextLine();
				System.out.println();
				for(int x = 0; x < 5; ++x){
					
					while(nome == nom[x]){
						System.out.println("Nome ="+nom[x]);
						System.out.println("Salário = "+sal[x]);
						System.out.println();
						System.out.print("Digite um nome :");
							nome = input.nextLine();
						}
					}
				System.out.println("Nome não encontrado !!");
				System.out.println();
			break;
			case 5:
			System.out.println("Busca de salário:");
			System.out.println();
			System.out.print("Digite uma faixa de salário inicial :");
				sala = input.nextDouble();
			System.out.print("Digite uma faixa de Salario final :");
				salf = input.nextDouble();
			System.out.println();
			for(int x = 0; x < 5; ++x){
				
				if(sal[x] >= sala && sal[x] <= salf){
					System.out.println("Nome :"+nom[x]);
					System.out.println("Salário ="+sal[x]);
					System.out.println();
					achou = true;
				}
			}
			if(achou == false ){
				System.out.println("Faixa salarial não encontrado ...");
				
			}
			break;
			case 6:
				System.out.println("Encerrando programa...Stark program agradece a preferencia ...");
				
			break;
			default:
			System.out.println("Opção inválida ...");
		}
	} while( op == 6);
	System.out.println("..........................");
		
	}
}
			
	
	
	
	
	
	
