package aula;

public class QuartaAula {
	public static int soma(int n1, int n2) {
		int total = n1 + n2;
		return total;
		}

	public static int divis�o(int n1, int n2) {
		int total = n1 / n2;
		return total;
	}
	
	public static int poten(int n1, int n2) {
		int total = (int) Math.pow( n1, n2);
		return total;
	}
	
		public static void main(String[] args) {
		System.out.println(soma(10,2));
		System.out.println(divis�o(10,2));
		System.out.println(poten(2,2));
		}
}