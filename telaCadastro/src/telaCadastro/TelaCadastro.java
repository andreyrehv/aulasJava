package telaCadastro;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

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
		
		
		//Mascaras
		JFormattedTextField Rg = null;
		JFormattedTextField Cpf = null;
		JFormattedTextField Telefone = null;
		JFormattedTextField Celular = null;
		JFormattedTextField Cep = null;
		
		MaskFormatter RG = null;
		MaskFormatter CPF = null;
		MaskFormatter telef = null;
		MaskFormatter cel = null;
		MaskFormatter CEP = null;
		
		
		model.Cadastro pessoa = new model.Cadastro();
				
		
		
	
		
		
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
		
		try { //add mascara antes de tudo!!!
			 telef= new MaskFormatter("(##)####-####"); //a mascara
			 telC = new JFormattedTextField(telef);
		} catch (Exception ex) { //exibir o erro
			ex.printStackTrace();
		}
		tel.setBounds(10, 130, 100, 25);
		paine.add(tel);
		telC.setBounds(70, 130, 200, 25);
		paine.add(telC);
		
		try { //add mascara antes de tudo!!!
			 RG= new MaskFormatter("##.###.###-#"); //a mascara
			 rgC = new JFormattedTextField(RG);
		} catch (Exception ex) { //exibir o erro
			ex.printStackTrace();
		}
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
		
		try { //add mascara antes de tudo!!!
			 CEP= new MaskFormatter("#####-###"); //a mascara
			 cepC = new JFormattedTextField(CEP);
		} catch (Exception ex) { //exibir o erro
			ex.printStackTrace();
		}
		cep.setBounds(290, 40, 50, 25);
		paine.add(cep);
		cepC.setBounds(340, 40, 150, 25);
		paine.add(cepC);
		
		estado.setBounds(290, 70, 50, 25);
		paine.add(estado);
		estadoC.setBounds(340, 70, 150, 25);
		paine.add(estadoC);
		
		try { //add mascara antes de tudo!!!
			 cel= new MaskFormatter("(##)#####-####"); //a mascara
			 celularC = new JFormattedTextField(cel);
		} catch (Exception ex) { //exibir o erro
			ex.printStackTrace();
		}
		celular.setBounds(290, 130, 50, 25);
		paine.add(celular);
		celularC.setBounds(340, 130, 150, 25);
		paine.add(celularC);
		
		try { //add mascara antes de tudo!!!
			 CPF= new MaskFormatter("###.###.###-##"); //a mascara
			 cpfC = new JFormattedTextField(CPF);
		} catch (Exception ex) { //exibir o erro
			ex.printStackTrace();
		}
		cpf.setBounds(290, 160, 50, 25);
		paine.add(cpf);
		cpfC.setBounds(340, 160, 150, 25);
		paine.add(cpfC);
		
		save.setBounds(299, 210, 90, 35);
		paine.add(save);
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pessoa.setnome(nome.getText());
				pessoa.setendereco(endereco.getText());
				pessoa.setendereco(cidade.getText());
				pessoa.setendereco(bairro.getText());
				pessoa.setendereco(tel.getText());
				pessoa.setendereco(rg.getText());
				pessoa.setendereco(cep.getText());
				pessoa.setendereco(estado.getText());
				pessoa.setendereco(celular.getText());
				pessoa.setendereco(cpf.getText());
				pessoa.setendereco(sexo.getText());
				
			}
		});
		
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
