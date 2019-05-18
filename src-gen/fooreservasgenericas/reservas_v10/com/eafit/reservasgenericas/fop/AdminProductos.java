package fooreservasgenericas.reservas_v10.com.eafit.reservasgenericas.fop;

import
fooreservasgenericas.reservas_v10.com.eafit.reservasenericas.modelos.Producto;
import
fooreservasgenericas.reservas_v10.com.eafit.reservasgenericas.dto.ProductoDAO;
/*** added by dAdminProductos* modified by dAgregarProducto
 */
public class AdminProductos {
	ProductoDAO productoDAO = new ProductoDAO();
	Producto producto = new Producto();
	/*** added by dAgregarProducto
	 */
	public void agregar(String nombre, String descripcion) throws Exception {
		Producto producto = new Producto();
		producto.setNombre(nombre);
		producto.setDescripcion(descripcion);
		productoDAO.agregar(producto);
	}
}