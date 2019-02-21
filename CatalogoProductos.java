import java.util.HashMap;
import java.util.Map;

public class CatalogoProductos {
	
	 Map<String, Producto> productos = new HashMap<String, Producto>();

	public void agregarProducto(String nombre, Producto producto) {
		productos.put(nombre, producto);
	}

	public Producto obtenerProducto(String string) {
		return productos.get(string);
	}
}
