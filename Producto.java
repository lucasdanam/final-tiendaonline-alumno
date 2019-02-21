
public class Producto {

	private String nombre;
	private int precio;
	private int stock;

	public Producto(String string) {
		this.nombre=string;
	}

	public void setPrecio(int precio) {
		this.precio=precio;
	}
	
	public void setStock(int stock) {
		this.stock=stock;
	}

	public String getNombre() {
		return this.nombre;
	}

	public int getStock() {
		return this.stock;
	}
	
	public int getPrecio() {
		return this.precio;
	}
}
