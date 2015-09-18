
/**
 *
 * @author jefferson
 */
import java.util.Scanner;

public class AppL7Q1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int nuVetor = 2;

		// invocando a classe L7Q1

		L7Q1 agenda = new L7Q1();

		agenda.mostra();

		// Entrando com os dados no laço ...

		for (int x = 0; x < agenda.nuVetor; ++x) {
			// Entrando com o nome no vetor
			System.out.println("Entre com o nome na posição -" + (x + 1));
			agenda.nome[x] = input.nextLine();

			// entrando com o endereço
			System.out.println("Entre com o endereço na posição -" + (x + 1));
			agenda.endereço[x] = input.nextLine();

			// Entrando com o telefone ...
			System.out.println("Entre com o telefone na posição -" + (x + 1));
			agenda.telefone[x] = input.nextLong();
		}

		// exibindo os resultados...

		for (int x = 0; x < agenda.nuVetor; ++x) {
			// exibindo...
			System.out.println("Nome :" + agenda.nome[x] + "    " + "Endereço :" + agenda.endereço[x] + " "
					+ "Telefone :" + agenda.telefone[x]);

		}

	}

}
