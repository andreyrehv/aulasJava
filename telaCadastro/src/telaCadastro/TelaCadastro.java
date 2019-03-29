package telaCadastro;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
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
		JTextField celularC = new JTextField("");
		JTextField cpfC = new JTextField("");
		
		JRadioButton sexoM = new JRadioButton("Masculino");
		JRadioButton sexoF = new JRadioButton("Feminino");
		
		JButton save = new JButton("Salvar");
		JButton imprimir = new JButton("Imprimir");
		
		String [] estados = {"----", "SP", "MG", "RJ", "PR"};
		JComboBox estadoC = new JComboBox(estados);
		
		
	public TelaCadastro() {
		super("Tela de Cadastro");
		
		Container paine = this.getContentPane();
		
		nome.setBounds(10, 10, 40, 25);
		paine.add(nome);		
		nomeC.setBounds(70, 10, 200, 25);
		paine.add(nomeC);	
		
		
		endereco.setBounds(10, 40, 200, 25);
		paine.add(endereco);
		enderecoC.setBounds(70, 40, 200, 25);
		paine.add(enderecoC);
		
		cidade.setBounds(10, 70, 50, 25);
		paine.add(cidade);
		cidadeC.setBounds(70, 70, 200, 25);
		paine.add(cidadeC);
		
		bairro.setBounds(10, 100, 50, 25);
		paine.add(bairro);
		bairroC.setBounds(70, 100, 200, 25);
		paine.add(bairroC);
		
		tel.setBounds(10, 130, 100, 25);
		paine.add(tel);
		telC.setBounds(70, 130, 200, 25);
		paine.add(telC);
		
		rg.setBounds(10, 160, 50, 25);
		paine.add(rg);
		rgC.setBounds(70, 160, 200, 25);
		paine.add(rgC);
		
		sexo.setBounds(290, 10, 40, 25);
		paine.add(sexo);
		sexoM.setBounds(335, 10, 90, 25);
		paine.add(sexoM);
		sexoF.setBounds(425, 10, 90, 25);
		paine.add(sexoF);
		
		cep.setBounds(290, 40, 50, 25);
		paine.add(cep);
		cepC.setBounds(340, 40, 150, 25);
		paine.add(cepC);
		
		estado.setBounds(290, 70, 50, 25);
		paine.add(estado);
		estadoC.setBounds(340, 70, 150, 25);
		paine.add(estadoC);
		
		celular.setBounds(290, 130, 50, 25);
		paine.add(celular);
		celularC.setBounds(340, 130, 150, 25);
		paine.add(celularC);
		
		cpf.setBounds(290, 160, 50, 25);
		paine.add(cpf);
		cpfC.setBounds(340, 160, 150, 25);
		paine.add(cpfC);
		
		save.setBounds(299, 210, 90, 35);
		paine.add(save);
		
		imprimir.setBounds(399, 210, 90, 35);
		paine.add(imprimir);
		
		
		
		this.setLayout(null);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(530, 310);
	}
	public static void main(String[] args) {
		TelaCadastro cadastro = new TelaCadastro();
	}

}
