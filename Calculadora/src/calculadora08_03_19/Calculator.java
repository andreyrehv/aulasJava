package calculadora08_03_19;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calculator extends JFrame{
	
	
		
		//Menu
		JLabel Exibir = new JLabel("EXIBIR");
		JLabel Editar = new JLabel("EDITAR");
		JLabel Help = new JLabel("HELP");
		
		
		//Botões
		JButton btnMC = new JButton("MC");
		JButton btnMR = new JButton("MR");
		JButton btnMS = new JButton("MS");
		JButton btnMmais = new JButton("M+");
		JButton btnMenos = new JButton("M-");
		JButton btnBack	= new JButton("<--");
		JButton btnCE = new JButton("CE");
		JButton btnC = new JButton("C");
		JButton btnMaisMenos = new JButton("+/-");
		JButton btnRaizQ = new JButton("√");
		JButton btnSete = new JButton("7");
		JButton btnOite = new JButton("8");
		JButton btnNove = new JButton("9");
		JButton btnDivisao = new JButton("/");
		JButton btnPercent = new JButton("%");
		JButton btnQuatro = new JButton("4");
				
		
		
	
	
	
	
	
		public Calculator() {
			super("Calculadora");
			
			
			Container paine = this.getContentPane();
			
			
			//Menu
			Exibir.setBounds(10, 5, 100, 20);
			paine.add(Exibir);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			this.setLayout(null);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setVisible(true);
			this.setSize(310, 400);
			
		}
	
	
	public static void main(String[] args) {
		
		Calculator tela = new Calculator();
	}

}
