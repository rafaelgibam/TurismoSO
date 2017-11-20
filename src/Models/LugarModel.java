package Models;

public class LugarModel {
	
	private int id;
	private String nome;
	private String endereco;
	private String dataDisponivel;
	private String guia;
	
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
	
	public String getDataDisponivel() {
		return dataDisponivel;
	}
	public void setDataDisponivel(String date) {
		this.dataDisponivel = date;
	}
	public String getNomeGuia() {
		return guia;
	}
	public void setNomeGuia(String guia) {
		this.guia = guia;
	}	

}
