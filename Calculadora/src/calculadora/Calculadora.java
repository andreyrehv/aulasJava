package calculadora;


import java.awt.Container;
import java.awt.TextField;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;


public class Calculadora extends JFrame{
	
		
	//Campos do Menu
	JLabel Exibir = new JLabel("Exibir");
		
	JLabel Editar = new JLabel("Editar");
	
	JLabel Ajuda = new JLabel ("Ajuda");
	
	//Resultado
	JTextField result = new JTextField();
	
	
	//Botões
	JButton btnMC = new JButton("MC");
	JButton btnMR = new JButton("MR");
	JButton btnMS = new JButton("MS");
	JButton btnMmais = new JButton("M+");
	JButton btnMmenos = new JButton("M-");
	JButton btnBackspace = new JButton("<-");
	JButton btnCE = new JButton("CE");
	JButton btnC = new JButton("C");
	JButton btnMaisOuMenos = new JButton("+/-");
	JButton btnRQuad = new JButton(" √");
	JButton btnSete = new JButton("7");
	JButton btnOito = new JButton("8");
	JButton btnNove = new JButton("9");
	JButton btnDivisao = new JButton("/");
	JButton btnPorcento = new JButton("%");
	JButton btnQuatro = new JButton("4");
	JButton btnCinco = new JButton("5");
	JButton btnSeis = new JButton("6");
	JButton btnMultiplica = new JButton("*");
	JButton btnUmX = new JButton("1/x");
	JButton btnUm = new JButton("1");
	JButton btnDois = new JButton("2");
	JButton btnTres = new JButton("3");
	JButton btnSubtrair = new JButton("-");	
	JButton btnZero = new JButton("0");
	JButton btnVirgula = new JButton(",");
	JButton btnSomar = new JButton("+");
	JButton btnIgual = new JButton("=");
	
	public Calculadora(){
		super("Calculadora");
		
		Container paine = this.getContentPane();
		
		
			
		//Menu	
		Exibir.setBounds(10, 10, 100, 20);
		paine.add(Exibir);
		
		
		Editar.setBounds(50, 10, 100, 20);
		paine.add(Editar);
		
		Ajuda.setBounds(90, 10, 100, 20);
		paine.add(Ajuda);
		
		
		paine.add(result);
		result.setBounds(10, 45, 273, 50);
		
		
		//Botões
		paine.add(btnMC);
		btnMC.setBounds(10,100,52,30);
		
		paine.add(btnMR);
		btnMR.setBounds(65,100,52,30);
		
		paine.add(btnMS);
		btnMS.setBounds(120,100,52,30);
		
		paine.add(btnMmais);
		btnMmais.setBounds(175,100,52,30);
		
		paine.add(btnMmenos);
		btnMmenos.setBounds(230,100,52,30);
		
		paine.add(btnBackspace);
		btnBackspace.setBounds(10,140,52,30);
		
		paine.add(btnCE);
		btnCE.setBounds(65,140,52,30);
		
		paine.add(btnC);
		btnC.setBounds(120,140,52,30);
		
		paine.add(btnMaisOuMenos);
		btnMaisOuMenos.setBounds(175,140,52,30);
		
		paine.add(btnRQuad);
		btnRQuad.setBounds(230,140,52,30);
		
		paine.add(btnSete);
		btnSete.setBounds(10,180,52,30);
		
		paine.add(btnOito);
		btnOito.setBounds(65,180,52,30);
		
		paine.add(btnNove);
		btnNove.setBounds(120,180,52,30);
		
		paine.add(btnDivisao);
		btnDivisao.setBounds(175,180,52,30);
		
		paine.add(btnPorcento);
		btnPorcento.setBounds(230,180,52,30);
		
		paine.add(btnQuatro);
		btnQuatro.setBounds(10,220,52,30);
		
		paine.add(btnCinco);
		btnCinco.setBounds(65,220,52,30);
		
		paine.add(btnSeis);
		btnSeis.setBounds(120,220,52,30);
		
		paine.add(btnMultiplica);
		btnMultiplica.setBounds(175,220,52,30);
		
		paine.add(btnUmX);
		btnUmX.setBounds(230,220,52,30);
		
		paine.add(btnUm);
		btnUm.setBounds(10,260,52,30);
		
		paine.add(btnDois);
		btnDois.setBounds(65,260,52,30);
		
		paine.add(btnTres);
		btnTres.setBounds(120,260,52,30);
		
		paine.add(btnSubtrair);
		btnSubtrair.setBounds(175,260,52,30);
		
		paine.add(btnZero);
		btnZero.setBounds(10,300,104,30);
		
		paine.add(btnVirgula);
		btnVirgula.setBounds(120,300,52,30);
		
		paine.add(btnSomar);
		btnSomar.setBounds(175,300,52,30);
		
		paine.add(btnIgual);
		btnIgual.setBounds(230,260,52,70);
		
		
		
		
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(307, 400);
	}
	public static void main(String args[]){
		Calculadora tela = new Calculadora();
		
	}
}