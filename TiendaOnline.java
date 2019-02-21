
public class TiendaOnline {

	private String nombre;
	private CatalogoProductos listaDeProductos;

	public TiendaOnline(String string) {
		this.nombre=string;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void agregarCatalogo(CatalogoProductos catalogo) {
		this.listaDeProductos=catalogo;
	}

}
