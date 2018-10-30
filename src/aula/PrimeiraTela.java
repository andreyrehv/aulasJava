package aula;

import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class PrimeiraTela extends JFrame{
	
	
	//Parte esquerda--------------------------------------------------
	
	JLabel lblNome = new JLabel("NOME: ");
	JTextField txtNome = new JTextField();
	
	JLabel lblEndereco = new JLabel("ENDEREÇO: ");
	JTextField txtEndereco = new JTextField();
	
	JLabel lblCidade = new JLabel("CIDADE: ");
	JTextField txtCidade = new JTextField();
	
	JLabel lblBairro = new JLabel("BAIRRO: ");
	JTextField txtBairro = new JTextField();
	
	JLabel lblTelefone = new JLabel("TELEFONE: ");
	JTextField txtTelefone = new JTextField();
	
	JLabel lblRG = new JLabel ("RG: ");
	JTextField txtRG = new JTextField();
	
	
	
	//Parte direita-----------------------------------------------------
	
	
	JLabel lblSexo = new JLabel("SEXO: ");

	JRadioButton[] rdbSexo = new JRadioButton[2]; // Botão para opções
	ButtonGroup grupo = new ButtonGroup();{ 	 // Group impede de marcar mais de uma opção no objeto
		
		rdbSexo[0]= new JRadioButton("Masculino");
		rdbSexo[1] = new JRadioButton("Feminino");
	}
	
	JLabel lblCEP = new JLabel("CEP: ");
	JTextField txtCEP = new JTextField();
	
	JLabel lblEstado = new JLabel("ESTADO: ");
	// Falta por essa parte ainda 
	
	
	JLabel lblCelular = new JLabel("CELULAR: ");
	JTextField txtCelular = new JTextField();
	
	JLabel lblCpf = new JLabel("CPF: ");
	JTextField txtCpf = new JTextField();
	
	
	
	
	
	public PrimeiraTela() {
		super("Cadastro de Compras ");
		
		Container paine = this.getContentPane();   //Fixa os objetos no layout
		
		
		//Nome
		paine.add(lblNome);
		lblNome.setBounds(10,20,100,30);
		
		paine.add(txtNome);
		txtNome.setBounds(80,20,250,30);
		
		//Endereço 
		paine.add(lblEndereco);
		lblEndereco.setBounds(10,60,100,30);
			
		paine.add(txtEndereco);
		txtEndereco.setBounds(80,60,250,30);
		
		//Cidade
		paine.add(lblCidade);
		lblCidade.setBounds(10,100,100,30);
		
		paine.add(txtCidade);
		txtCidade.setBounds(80,100,250,30);
		
		//Bairro
		paine.add(lblBairro);
		lblBairro.setBounds(10,140,100,30);
		
		paine.add(txtBairro);
		txtBairro.setBounds(80,140,250,30);
		
		//Telefone
		paine.add(lblTelefone);
		lblTelefone.setBounds(10,180,100,30);
				
		paine.add(txtTelefone);
		txtTelefone.setBounds(80,180,130,30);
		
		//RG
		paine.add(lblRG);
		lblRG.setBounds(10,220,100,30);
		
		paine.add(txtRG);
		txtRG.setBounds(80,220,130,30);
		
		//----------------------------------------
		
		
		//Sexo
		paine.add(lblSexo);
		lblSexo.setBounds(370,20,100,30);
		
		grupo.add(rdbSexo[0]); //grupo para o sexo
		grupo.add(rdbSexo[1]);
		
		paine.add(rdbSexo[0]); // grupo para o sexo
		rdbSexo[0].setBounds(410,20,85,30);
		paine.add(rdbSexo[1]);
		rdbSexo[1].setBounds(495,20,85,30);
		
		//CEP
		paine.add(lblCEP);
		lblCEP.setBounds(370,60,40,30);
		paine.add(txtCEP);
		txtCEP.setBounds(410,60,100,30);
		
		//Estado
		paine.add(lblEstado);
		lblEstado.setBounds(370,100,100,30);
		
		//Celular
		paine.add(lblCelular);
		lblCelular.setBounds(370,180,100,30);
					
		paine.add(txtCelular);
		txtCelular.setBounds(430,180,130,30);
		
		//CPF
		paine.add(lblCpf);
		lblCpf.setBounds(370,220,60,30);
			
		paine.add(txtCpf);
		txtCpf.setBounds(430,220,130,30);
		
	
		this.setLayout(null);
		this.setSize(600,320);
		//this.setResizable(0);
		this.setVisible(true);
		
		
	}
	public static void main(String args[]) {
		PrimeiraTela tela = new PrimeiraTela();
	}
}