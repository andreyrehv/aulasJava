package model;

public class Cadastro {
	private String nome, endereco, bairro, cep, cidade, estado, telefone, celular, rg, cpf;
	private char sexo;
	
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome =  nome;
	}
	
	public String getendereco() {
		return endereco;
	}
	public void setendereco(String endereco){
		this.endereco = endereco;
	}
	
	public String getcidade(){
		return cidade;
	}
	public void setcidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getbairro(){
		return bairro;
	}
	public void setbairro(String bairro){
		this.bairro = bairro;
	}
	
	public String gettelefone(){
		return telefone;
	}
	public void settelefone(String telefone){
		this.telefone = telefone;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	

}
