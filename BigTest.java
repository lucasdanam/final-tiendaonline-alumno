import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BigTest {

	 @Test
	 	public void setearNombreDeTiendaEstableceNombreCorrectamente() {
		 
		 TiendaOnline tienda = new TiendaOnline("Lo De Carlos");

	     assertEquals("Lo De Carlos", tienda.getNombre());
	    }

	
	 @Test
	    public void agregar1ProductoAlCatalogoYObtenerStockYPrecio() {
	        
	        CatalogoProductos catalogo= new CatalogoProductos();
	        
	        Producto raspberry= new Producto("Raspberry Pi 3");
	        
	        raspberry.setPrecio(3500);
	        
	        raspberry.setStock(3);
	        
	        catalogo.agregarProducto(raspberry);

	        assertEquals(catalogo.obtenerProducto("Raspberry Pi 3").getPrecio(),3500);
	        assertEquals(catalogo.obtenerProducto("Raspberry Pi 3").getStock(),3);
	        
	    }

}
