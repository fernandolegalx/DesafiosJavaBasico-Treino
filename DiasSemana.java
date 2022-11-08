import java.util.Scanner;

public class desafiodiasemana{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o nome do dia: ");
		String dia = entrada.next();

		if("domingo".equalsIgnoreCase(dia)){
			System.out.println(1);
		}else if("segunda".equalsIgnoreCase(dia)){
			System.out.println(2);
		}else if("terça".equalsIgnoreCase(dia)){
			System.out.println(2);
		}else if("quarta".equalsIgnoreCase(dia)){
			System.out.println(2);
		}else if("quinta".equalsIgnoreCase(dia)){
			System.out.println(2);
		}else if("sexta".equalsIgnoreCase(dia)){
			System.out.println(2);
		}else{
			System.out.println("Dia inválido");
		}
		entrada.close();

	}
}