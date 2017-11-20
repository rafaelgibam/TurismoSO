package Models;

public class ClienteModel {
	private String nome;
	private int id;
	private GuiaModel guia;
	private LugarModel lugar;
	
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

	public GuiaModel getGuia() {
		return guia;
	}

	public void setGuia(GuiaModel guia) {
		this.guia = guia;
	}

	public LugarModel getLugar() {
		return lugar;
	}

	public void setLugar(LugarModel lugar) {
		this.lugar = lugar;
	}

}
