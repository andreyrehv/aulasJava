package matriz;

public class MatrizJava {

	public static void main (String[] args) {
		
		int m [][]  = new int [3][3];
		int soma=0;
		
		
		m[0][0]= 1;
		m[0][1]= 10;
		m[0][2]= 20;
		
		m[1][0]= 2;
		m[1][1]= 20;
		m[1][2]= 40;
		
		m[2][0]= 3;
		m[2][1]= 52;
		m[2][2]= 74;
		
		for(int i = 0; i <= 2; i++){
			for(int x = 0;  x <= 2; x++){
				System.out.print(m[i][x] + " ");
				
			
			if(i == x) {
				soma= m[i][x]+soma;
				
			}
		}
			System.out.println();
					
		}
		System.out.println("A soma da diagonal é: "+ soma);
	}
}

	