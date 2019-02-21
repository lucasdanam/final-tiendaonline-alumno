import java.util.HashMap;
import java.util.Map;

public class CatalogoProductos {
	
	 Map<String, Producto> productos = new HashMap<String, Producto>();

	public void agregarProducto(Producto producto) {
		productos.put(producto.getNombre(), producto);
	}

	public Producto obtenerProducto(String string) {
		return productos.get(string);
	}
}
