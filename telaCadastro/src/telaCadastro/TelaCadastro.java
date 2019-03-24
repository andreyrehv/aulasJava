package telaCadastro;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCadastro extends JFrame  {
	
	
		JLabel nome = new JLabel("Nome:");
		JLabel endereco = new JLabel("Endereço:");
		JLabel cidade = new JLabel("Cidade:");
		JLabel bairro = new JLabel("Bairro:");
		JLabel tel = new JLabel("Telefone:");
		JLabel rg = new JLabel("RG:");
		JLabel sexo = new JLabel("Sexo:");
		JLabel cep = new JLabel("CEP:");
		JLabel estado = new JLabel("Estado:");
		JLabel celular = new JLabel("Celular:");
		JLabel cpf = new JLabel("CPF:");
		
		JTextField nomeC = new JTextField("");
		JTextField enderecoC = new JTextField("");
		JTextField cidadeC = new JTextField("");
		JTextField bairroC = new JTextField("");
		JTextField telC = new JTextField("");
		JTextField rgC = new JTextField("");
		JTextField sexoC = new JTextField("");
		JTextField cepC = new JTextField("");
		JTextField estadoC = new JTextField("");
		JTextField celularC = new JTextField("");
		JTextField cpfC = new JTextField("");
		
		JButton save = new JButton("Salvar");
		JButton imprimi = new JButton("Imprimir");
		
		
	public TelaCadastro() {
		super("Tela de Cadastro");
		
		Container paine = this.getContentPane();
		
		nome.setBounds(10, 10, 40, 25);
		paine.add(nome);		
		nomeC.setBounds(52, 10, 200, 25);
		paine.add(nomeC);	
		
		
		endereco.setBounds(10, 40, 200, 25);
		paine.add(endereco);
		
		
		
		this.setLayout(null);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 400);
	}
	public static void main(String[] args) {
		TelaCadastro cadastro = new TelaCadastro();
	}

}
