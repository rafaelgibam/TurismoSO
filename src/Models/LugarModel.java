package Models;

import java.sql.Date;

public class LugarModel {
	
	private int id;
	private String nome;
	private String endereco;
	private Date dataDisponivel;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public Date getDataDisponivel() {
		return dataDisponivel;
	}
	public void setDataDisponivel(Date date) {
		this.dataDisponivel = date;
	}
	
}
