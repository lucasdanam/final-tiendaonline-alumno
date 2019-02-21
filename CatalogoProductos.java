import java.util.HashMap;
import java.util.Map;

public class CatalogoProductos {
	
	private Map<String, Producto> productos;
	 
	public CatalogoProductos() {
		productos = new HashMap<String, Producto>();
	}

	public void agregarProducto(Producto producto) {
		productos.put(producto.getNombre(), producto);
	}

	public Producto obtenerProducto(String string) {
		return productos.get(string);
	}
}
