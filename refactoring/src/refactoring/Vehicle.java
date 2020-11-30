package refactoring;

public class Vehicle {
	
	public static final int BASIC = 1;
	public static final int GENERAL = 2;
	public static final int LUXE = 3;
	
	private String model;
	private String marca;
	private int categoria;
	
	public Vehicle (String model, String marca, int categoria) {
		this.model = model;
		this.marca = marca;
		this.categoria = categoria;
	}
	
	public String getMarca() { return marca; }
	
	public void setMarca(String marca) { this.marca = marca; }
	
	public String getModel() { return model; }
	
	public void setModel(String model) { this.model = model; }
	
	public int getCategoria() { return categoria; }
	
	public void setCategoria(int categoria) { this.categoria = categoria; }

}
