package estruturasderepetiçao;

import java.util.Scanner;
public class ProgramaDoWhile {
	private static final Scanner ENTRADA = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Digite seu login");
		long login = ENTRADA.nextLong();
		System.out.println("Digite sua senha");
		long senha = ENTRADA.nextLong();
		while (true) {
		if (login == 123456 && senha == 90000) {
		System.out.println("logado");
		} else {		
		System.out.println("não logado"); 
		break;
	}
		}
	}
}


	





