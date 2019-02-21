import java.util.HashMap;
import java.util.Map;

public class Pedido {

	Map<String, Integer> map;
	
	public Pedido() {
		map = new HashMap<String, Integer>();
	}

	public void agregarProducto(String nombre, int cantidad) {
		
		this.map.put(nombre,cantidad);
	}

	public Object getCantidad(String string) {
		return map.get(string);
	}

}
