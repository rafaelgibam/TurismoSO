package Models;

public class GuiaModel {
	private int id;
	private String nome;
	private double valorhora;

	
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
	public double getValorHora() {
		return valorhora;
	}
	
	public void setValorHora(double valorhora) {
		this.valorhora = valorhora;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getNome();
	}
}
