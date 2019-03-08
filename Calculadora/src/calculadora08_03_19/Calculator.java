package calculadora08_03_19;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator extends JFrame{
	
	
		
		//Menu
		JLabel Exibir = new JLabel("EXIBIR");
		JLabel Editar = new JLabel("EDITAR");
		JLabel Help = new JLabel("HELP");
		
		
		//Caixa de Resultado
		JTextField Resultado = new JTextField();
		
		
		//Botões
		JButton btnMC = new JButton("MC");
		JButton btnMR = new JButton("MR");
		JButton btnMS = new JButton("MS");
		JButton btnMmais = new JButton("M+");
		JButton btnMmenos = new JButton("M-");
		JButton btnBack	= new JButton("<-");
		JButton btnCE = new JButton("CE");
		JButton btnC = new JButton("C");
		JButton btnMaisMenos = new JButton("+/-");
		JButton btnRaizQ = new JButton("√");
		JButton btnSete = new JButton("7");
		JButton btnOito = new JButton("8");
		JButton btnNove = new JButton("9");
		JButton btnDivisao = new JButton("/");
		JButton btnPercent = new JButton("%");
		JButton btnQuatro = new JButton("4");
		JButton btnCinco = new JButton("5");
		JButton btnSeis = new JButton("6");
		JButton btnMultip = new JButton("*");
		JButton btnUmX = new JButton("1/x");
		JButton btnUm = new JButton("1");
		JButton btnDois = new JButton("2");
		JButton btnTres = new JButton("3");
		JButton btnMenos = new JButton("-");
		JButton btnZero = new JButton("0");
		JButton btnPonto = new JButton(".");
		JButton btnMais = new JButton("+");
		JButton btnIgual = new JButton("=");
	
	
		public Calculator() {
			super("Calculadora");
			
			
			Container paine = this.getContentPane();
			
			
			//Menu
			Exibir.setBounds(10, 5, 100, 20);
			paine.add(Exibir);
			
			Editar.setBounds(50, 5, 100, 20);
			paine.add(Editar);
			
			Help.setBounds(95, 5, 100, 20);
			paine.add(Help);
			
			
			//Caixa de Resultado
			Resultado.setBounds(10, 28, 273, 62);
			paine.add(Resultado);
			
			
			//Botões
			btnMC.setBounds(10, 100, 52, 30);
			paine.add(btnMC);
			
			btnMR.setBounds(65, 100, 52, 30);
			paine.add(btnMR);
			
			btnMS.setBounds(120, 100, 52, 30);
			paine.add(btnMS);
			
			btnMmais.setBounds(175, 100, 52, 30);
			paine.add(btnMmais);
			
			btnMmenos.setBounds(230, 100, 52, 30);
			paine.add(btnMmenos);
			
			btnBack.setBounds(10, 140, 52, 30);
			paine.add(btnBack);
			
			btnCE.setBounds(65, 140, 52, 30);
			paine.add(btnCE);
			
			btnC.setBounds(120, 140, 52, 30);
			paine.add(btnC);
			
			btnMaisMenos.setBounds(175, 140, 52, 30);
			paine.add(btnMaisMenos);
			
			btnRaizQ.setBounds(230, 140, 52, 30);
			paine.add(btnRaizQ);
			
			btnSete.setBounds(10, 180, 52, 30);
			paine.add(btnSete);
			
			btnOito.setBounds(65, 180, 52, 30);
			paine.add(btnOito);
			
			btnNove.setBounds(120, 180, 52, 30);
			paine.add(btnNove);
			
			btnDivisao.setBounds(175, 180, 52, 30);
			paine.add(btnDivisao);
			
			btnPercent.setBounds(230, 180, 52, 30);
			paine.add(btnPercent);
			
			btnQuatro.setBounds(10, 220, 52, 30);
			paine.add(btnQuatro);
			
			btnCinco.setBounds(65, 220, 52, 30);
			paine.add(btnCinco);
			
			btnSeis.setBounds(120, 220, 52, 30);
			paine.add(btnSeis);
			
			btnMultip.setBounds(175, 220, 52, 30);
			paine.add(btnMultip);
			
			btnUmX.setBounds(230, 220, 52, 30);
			paine.add(btnUmX);
			
			btnUm.setBounds(10, 260, 52, 30);
			paine.add(btnUm);
			
			btnDois.setBounds(65, 260, 52, 30);
			paine.add(btnDois);
			 
			btnTres.setBounds(120, 260, 52, 30);
			paine.add(btnTres);
			
			btnMenos.setBounds(175, 260, 52, 30);
			paine.add(btnMenos);
			
			btnIgual.setBounds(230, 260, 52, 70);
			paine.add(btnIgual);
			
			btnZero.setBounds(10, 300, 107, 30);
			paine.add(btnZero);
			
			btnPonto.setBounds(120, 300, 52, 30);
			paine.add(btnPonto);
			
			btnMais.setBounds(175, 300, 52, 30);
			paine.add(btnMais);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			this.setLayout(null);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setVisible(true);
			this.setSize(310, 400);
			
		}
	
	
	public static void main(String[] args) {
		
		Calculator tela = new Calculator();
	}

}
