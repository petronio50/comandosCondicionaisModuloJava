package comandoscondicionais;
/*
O for é uma estrutura de repetição na qual seu ciclo será executado por um tempo ou condição pré-determinados,
e em uma quantidade de vezes que determinamos.
Quando utilizamos o for, precisamos de uma variável para auxiliar a controlar a quantidade de repetições a serem executadas. Essa variável é chamada de variável de controle e é declarada no primeiro argumento do for.
O segundo argumento do for é utilizado para definir até quando o for será executado. Geralmente, trata-se de uma condição booleana em cima da variável de controle.
O terceiro argumento indica o quanto a variável de controle será modificada no final de cada execução dentro do for.
Bibliografia - https://www.treinaweb.com.br/blog/estruturas-condicionais-e-estruturas-de-repeticao-em-java
*/
public class ComandosCondicionaisFor {
	public static void main(String[] args) {
        for (int i = 50; i <= 100; i++) {
            System.out.println("A variável i agora vale " + i);
}
	}
}
