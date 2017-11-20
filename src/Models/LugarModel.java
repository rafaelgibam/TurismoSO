package Models;

public class LugarModel {
	
	private int id;
	private String nome;;
	private String dataDisponivel;
	private String guianome;
	private GuiaModel guia;
	
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
	
	public String getDataDisponivel() {
		return dataDisponivel;
	}
	public void setDataDisponivel(String date) {
		this.dataDisponivel = date;
	}
	public String getGuiaNome() {
		return guianome;
	}
	
	public void setGuiaNome(String nome) {
		this.guianome = nome;
	}
	public GuiaModel getGuia() {
		return guia;
	}
	public void setGuia(GuiaModel guia) {
		this.guia = guia;
	}
	

}
