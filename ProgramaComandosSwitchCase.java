package comandoscondicionais;
/*
Switch/case
A estrutura condicional switch/case vem como alternativa em momentos em que temos que utilizar múltiplos ifs no código.
Múltiplos if/else encadeados tendem a tornar o código muito extenso, pouco legível e com baixo índice de manutenção.
O switch/case testa o valor contido em uma variável, realizando uma comparação com cada uma das opções. 
Cada uma dessas possíveis opções é delimitada pela instrução case.
Podemos ter quantos casos de análise forem necessários e, quando um dos valores corresponder ao da variável, o código do case correspondente será executado. 
Caso a variável não corresponda a nenhum dos casos testados, o último bloco será executado, chamado de default (padrão).
A análise de cada caso também precisa ter seu final delimitado. Essa delimitação é feita através da palavra break.
Bibliografia - https://www.treinaweb.com.br/blog/estruturas-condicionais-e-estruturas-de-repeticao-em-java
*/
import java.util.Scanner;
public class ProgramaComandosSwitchCase {
	private static final Scanner ENTRADA = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Digite o número ao mês correspondente");
		int numMes = ENTRADA.nextInt();
		
        switch (numMes) {
            case 1:
            	System.out.println("O mês é janeiro");
            	break;
            case 2:
            	System.out.println("O mês é fevereiro");
            	break;
            case 3:
            	System.out.println("O mês é março");
            	break;
            case 4:
            	System.out.println("O mês é abril");
            	break;
            case 5:
            	System.out.println("O mês é maio");
            	break;
            case 6:
            	System.out.println("O mês é junho");
            	break;
            case 7:
            	System.out.println("O mês é julho");
            	break;
            case 8:
            	System.out.println("O mês é agosto");
            	break;
            case 9:
            	System.out.println("O mês é setembro");
            	break;
            case 10:
            	System.out.println("O mês é outubro");
            	break;
            case 11:
            	System.out.println("O mês é novembro");
            	break;
            case 12:
            	System.out.println("O mês é dezembro");
            	break;
            default: 
            	//System.out.println("O mês é inválido");
            	//break;
            	
	}
        
}
}

