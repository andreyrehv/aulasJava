package aula;

public class PrimeiraAula {
	public static void main(String args []) {
		//variavel do tipo primitivo inteiro
		int numero = 10, numero2 = 2, total = 0;
		/*
		 * + -> soma
		 * - -> subtra��o
		 * * -> multiplica��o
		 * "/" -> divis�o
		 */
		total = numero * numero2;
		
		/*
		System.out.print(total);
		> -> Maior que
		< -> Menor que
		== -> igual
		>= -> Maior ou igual
		<= -> Menor ou igual
		!= -> Diferente
		&& -> E
		|| -> Ou
		*/

		/* if (total > 10) {
		System.out.println(total);
		}else if(total ==10) {
		System.out.println("O valor � igual a 10");
		}else{
		System.out.println("O valor � inferior a 10");
		} */
		
		//La�os de repeti��o

		int i = 0;

		//Enquanto
		/*while(i < 10) {
		System.out.println(i);
		i = i + 1;
	  }*/
		for(int x = 0; x <= 10; x = x + 1) {
			System.out.println(x);
		}
	}
}