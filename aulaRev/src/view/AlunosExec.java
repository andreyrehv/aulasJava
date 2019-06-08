package view;

import java.sql.Connection;

import controller.AlunosJdbcDAO;
import controller.JdbUtil;
import model.Aluno;

public class AlunosExec {
	
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		try {
			aluno.setNome("Andrey Ramos");
			aluno.setEndereco("Avenida 1");
			aluno.setBairro("São Miguel");
			
			Connection connection = JdbUtil.getConnection();
			AlunosJdbcDAO alunosJdbcDAO = new AlunosJdbcDAO(connection);
			
			alunosJdbcDAO.salvar(aluno);
			//alunosJdbcDAO.listar();
			//alunosJdbcDAO.alterar(alunos);
			//alunosJdbcDAO.excluir(1);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
