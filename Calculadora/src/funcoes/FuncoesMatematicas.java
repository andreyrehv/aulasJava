package funcoes;

public class FuncoesMatematicas {
	
	public double soma(double a , double b) {
		double resultado;
		resultado = a + b;
		return resultado;	
	}
	
	public double subtrair(double a , double b) {
		double resultado;
		resultado = a - b;
		return resultado;	
	}
	
	public double multiplicar(double a , double b) {
		double resultado;
		resultado = a * b;
		return resultado;	
	}
	
	public double divisao(double a , double b) {
		double resultado;
		resultado = a / b;
		return resultado;	
	}
	
	public double raiz (double a) {
		double resultado = 0;
		resultado = Math.sqrt (a);
		return resultado;
	}
	
	public double percent(double a, double b) {
		double resultado;
		resultado = (a *b)/100;
		return resultado;
	}
	
	public double umx(double a) {
		double resultado;
		resultado = 1 / a;
		return resultado;	
	}
	
	public double maismenos(double a) {
		double resultado;
		resultado = a*(-1);
		return resultado;
	}
	
}