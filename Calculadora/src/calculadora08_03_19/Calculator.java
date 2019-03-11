package calculadora08_03_19;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import funcoes.FuncoesMatematicas;


// extends serve para acessar outras classes.
public class Calculator extends JFrame{ 
	
	
		
		//Menu
		JLabel Exibir = new JLabel("EXIBIR");
		JLabel Editar = new JLabel("EDITAR");
		JLabel Help = new JLabel("HELP");
		
		
		//Caixa de Resultado
		JTextField resultado = new JTextField("0");
		
		
		//Botões
		//JButton cria os botões
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
		

		FuncoesMatematicas mat = new FuncoesMatematicas();
		String sinal = null;
		double valor1 = 0, valor2 = 0;
	
	
		public Calculator() {
			super("Calculadora"); // Titulo da Janela
			
			
			Container paine = this.getContentPane();
			
			
			
			//Menu
			Exibir.setBounds(10, 5, 100, 20);
			paine.add(Exibir);
			
			Editar.setBounds(50, 5, 100, 20);
			paine.add(Editar);
			
			Help.setBounds(95, 5, 100, 20);
			paine.add(Help);
			
			
			//Caixa de Resultado
			resultado.setBounds(10, 28, 273, 62);
			paine.add(resultado);
			
			
			//Botões
			//Define o tamanho da caixa e onde ela vai estar localizada
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
			btnSete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(resultado.getText().equals("0")) {
						resultado.setText("7");
					}else {
						resultado.setText(resultado.getText() + "7");
					}
					
					
				}
			});
			
			btnOito.setBounds(65, 180, 52, 30);
			paine.add(btnOito);
			btnOito.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(resultado.getText().equals("0")) {
						resultado.setText("8");
					}else {
						resultado.setText(resultado.getText() + "8");
					}
					
					
				}
			});
			
			
			btnNove.setBounds(120, 180, 52, 30);
			paine.add(btnNove);
			btnNove.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(resultado.getText().equals("0")) {
						resultado.setText("9");
					}else {
						resultado.setText(resultado.getText() + "9");
					}
					
					
				}
			});
			
			btnDivisao.setBounds(175, 180, 52, 30);
			paine.add(btnDivisao);
			btnMais.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					valor1 = Double.parseDouble(resultado.getText());
					sinal = "divisao";
					resultado.setText("0");
				}
			});
			
			btnPercent.setBounds(230, 180, 52, 30);
			paine.add(btnPercent);
			
			btnQuatro.setBounds(10, 220, 52, 30);
			paine.add(btnQuatro);
			btnQuatro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(resultado.getText().equals("0")) {
						resultado.setText("4");
					}else {
						resultado.setText(resultado.getText() + "4");
					}
					
					
				}
			});
			
			btnCinco.setBounds(65, 220, 52, 30);
			paine.add(btnCinco);
			btnCinco.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(resultado.getText().equals("0")) {
						resultado.setText("5");
					}else {
						resultado.setText(resultado.getText() + "5");
					}
					
					
				}
			});
			
			btnSeis.setBounds(120, 220, 52, 30);
			paine.add(btnSeis);
			btnSeis.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(resultado.getText().equals("0")) {
						resultado.setText("6");
					}else {
						resultado.setText(resultado.getText() + "6");
					}
					
					
				}
			});
			
			btnMultip.setBounds(175, 220, 52, 30);
			paine.add(btnMultip);
			btnMais.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					valor1 = Double.parseDouble(resultado.getText());
					sinal = "multiplicar";
					resultado.setText("0");
				}
			});
			
			btnUmX.setBounds(230, 220, 52, 30);
			paine.add(btnUmX);
			
			btnUm.setBounds(10, 260, 52, 30);
			paine.add(btnUm);
			btnUm.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(resultado.getText().equals("0")) {
						resultado.setText("1");
					}else {
						resultado.setText(resultado.getText() + "1");
					}
					
					
				}
			});
			
			btnDois.setBounds(65, 260, 52, 30);
			paine.add(btnDois);
			btnDois.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(resultado.getText().equals("0")) {
						resultado.setText("2");
					}else {
						resultado.setText(resultado.getText() + "2");
					}
					
					
				}
			});
			
			btnTres.setBounds(120, 260, 52, 30);
			paine.add(btnTres);
			btnTres.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(resultado.getText().equals("0")) {
						resultado.setText("3");
					}else {
						resultado.setText(resultado.getText() + "3");
					}
					
					
				}
			});
			
			btnMenos.setBounds(175, 260, 52, 30);
			paine.add(btnMenos);
			btnMais.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					valor1 = Double.parseDouble(resultado.getText());
					sinal = "subtrair";
					resultado.setText("0");
				}
			});
			
						
			btnZero.setBounds(10, 300, 107, 30);
			paine.add(btnZero);
			btnZero.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(resultado.getText().equals("0")) {
						resultado.setText("0");
					}else {
						resultado.setText(resultado.getText() + "0");
					}
					
					
				}
			});
			
			btnPonto.setBounds(120, 300, 52, 30);
			paine.add(btnPonto);
			
			btnMais.setBounds(175, 300, 52, 30);
			paine.add(btnMais);
			btnMais.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					valor1 = Double.parseDouble(resultado.getText());
					sinal = "soma";
					resultado.setText("0");
				}
			});
			
			
			
			btnIgual.setBounds(230, 260, 52, 70);
			paine.add(btnIgual);
			btnIgual.addActionListener(new ActionListener() { // Função dos botões
				public void actionPerformed(ActionEvent e) {
					valor2 = Double.parseDouble(resultado.getText());

					if(sinal.equals("soma")) {
						resultado.setText(mat.soma(valor1, valor2) + "");
					}
				}
			});
									
			
			
			this.setLayout(null);// Definir um layout
			this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Permite fechar a janela no "X"
			this.setVisible(true); // Define a tela visivel 
			this.setSize(310, 400); // Tamanho da tela
			// this. serve para acessar metodos de outras classes.
		}
		
		
	
	
	public static void main(String[] args) {
		
		Calculator tela = new Calculator();
	}

}
