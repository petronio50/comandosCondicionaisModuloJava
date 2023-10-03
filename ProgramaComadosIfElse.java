package comandoscondicionais;
/*
If/else
O if/else é uma estrutura de condição em que uma expressão booleana é analisada. 
Quando a condição que estiver dentro do if for verdadeira, ela é executada. 
Já o else é utilizado para definir o que é executado quando a condição analisada pelo if for falsa. 
Caso o if seja verdadeiro e, consequentemente executado, o else não é executado.
O if pode ser utilizado em conjunto com o else ou até mesmo sozinho, caso necessário.
Bibliografia- https://www.treinaweb.com.br/blog/estruturas-condicionais-e-estruturas-de-repeticao-em-java
*/
public class ProgramaComadosIfElse {
	public static void main(String[] args) {
		int a = 2;
		int b = 4;
		if (a == 3) {
			System.out.println("a é iqual a 2");
		} else if (b == 2) {
			System.out.println("b é igual a 4");
		} else if (a == 2) {
			System.out.println("a é igual a 2");
		} else {
			System.out.println("Nenhuma condição é vedadeira");
		}
			System.out.println("FIM");
		
	}

}
