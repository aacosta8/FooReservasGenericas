package fooreservasgenericas.peliculas_v10.com.eafit.reservasgenericas.gestion;

import java.util.List;
import
fooreservasgenericas.peliculas_v10.com.eafit.reservasenericas.modelos.Producto;
import
fooreservasgenericas.peliculas_v10.com.eafit.reservasgenericas.dto.ProductoDAO;
/*** added by dAdminProductos* modified by dAgregarProducto* modified by
dModificarProducto* modified by dEliminarProducto* modified by
dListarProductos
 */
public class AdminProductos {
	ProductoDAO productoDAO = new ProductoDAO();
	Producto producto = new Producto();
	/*** added by dAgregarProducto
	 */
	public void agregar(String nombre, String descripcion, float precio, int
		cantidadDisponible, String tipo) throws Exception {
		Producto producto = new Producto();
		producto.setNombre(nombre);
		producto.setDescripcion(descripcion);
		producto.setPrecio(precio);
		producto.setCantidadDisponible(cantidadDisponible);
		producto.setTipo(tipo);
		productoDAO.agregar(producto);
	}
	/*** added by dModificarProducto
	 */
	public void modificar(int idProducto, String nombre, String descripcion,
		float precio, int cantidadDisponible, String tipo) throws Exception {
		Producto producto = new Producto();
		producto.setIdProducto(idProducto);
		producto.setNombre(nombre);
		producto.setDescripcion(descripcion);
		producto.setPrecio(precio);
		producto.setCantidadDisponible(cantidadDisponible);
		producto.setTipo(tipo);
		productoDAO.modificar(producto);
	}
	/*** added by dEliminarProducto
	 */
	public void eliminar(Integer idProducto) throws Exception {
		Producto producto = new Producto();
		producto.setIdProducto(idProducto);
		productoDAO.eliminar(producto);
	}
	/*** added by dListarProductos
	 */
	public List<Producto> listar() throws Exception {
		return productoDAO.listar();
	}
}