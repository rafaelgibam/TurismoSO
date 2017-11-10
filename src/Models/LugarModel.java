package Models;

import com.mysql.fabric.xmlrpc.base.Data;

public class LugarModel {
	private String nome;
	private String endereco;
	private Data dataDisponivel;
	
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
	public Data getDataDisponivel() {
		return dataDisponivel;
	}
	public void setDataDisponivel(Data dataDisponivel) {
		this.dataDisponivel = dataDisponivel;
	}
	
}
