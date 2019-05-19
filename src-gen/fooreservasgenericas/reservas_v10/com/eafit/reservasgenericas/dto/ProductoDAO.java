package fooreservasgenericas.reservas_v10.com.eafit.reservasgenericas.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import
fooreservasgenericas.reservas_v10.com.eafit.reservasgenericas.bd.Conexion;
import
fooreservasgenericas.reservas_v10.com.eafit.reservasenericas.modelos.Producto;
/*** added by dProductoDAO* modified by dAgregarProducto* modified by
dModificarProducto* modified by dEliminarProducto* modified by
dListarProductos
 */
public class ProductoDAO {
	Statement st = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Connection conn = null;
	Conexion conexion = null;
	/*** added by dAgregarProducto
	 */
	public void agregar(Producto producto) {
		try {
			conn = Conexion.getConexion();
			String query =
			"INSERT INTO producto (nombre, descripcion, precio, cantidadDisponible, tipo) values (?,?,?,?,?)";
			ps = conn.prepareStatement(query);
			ps.setString(1, producto.getNombre());
			ps.setString(2, producto.getDescripcion());
			ps.setFloat(3, producto.getPrecio());
			ps.setInt(4, producto.getCantidadDisponible());
			ps.setString(5, producto.getTipo());
			ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			}
			catch(Exception e) {
			}
		}
	}
	/*** added by dModificarProducto
	 */
	public void modificar(Producto producto) {
		try {
			conn = Conexion.getConexion();
			String query =
			"UPDATE producto set nombre=?, descripcion=?, precio=?, cantidadDisponible=?, tipo=?,  WHERE idProducto=?";
			ps = conn.prepareStatement(query);
			ps.setString(1, producto.getNombre());
			ps.setString(2, producto.getDescripcion());
			ps.setFloat(3, producto.getPrecio());
			ps.setInt(4, producto.getCantidadDisponible());
			ps.setString(5, producto.getTipo());
			ps.setInt(6, producto.getIdProducto());
			ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			}
			catch(Exception e) {
			}
		}
	}
	/*** added by dEliminarProducto
	 */
	public void eliminar(Producto producto) {
		try {
			conn = Conexion.getConexion();
			String query = "DELETE FROM producto WHERE idProducto=?";
			ps = conn.prepareStatement(query);
			ps.setInt(1, producto.getIdProducto());
			ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			}
			catch(Exception e) {
			}
		}
	}
	/*** added by dListarProductos
	 */
	public List<Producto> listar() {
		List<Producto> resultado = new ArrayList<Producto>();
		try {
			conn = Conexion.getConexion();
			String query = "SELECT id, nombre, descripcion FROM categoria";
			ps = conn.prepareStatement(query);
			ResultSet registros = ps.executeQuery();
			while(registros.next()) {
				Producto producto = new Producto();
				producto.setIdProducto(registros.getInt(1));
				producto.setNombre(registros.getString(2));
				producto.setDescripcion(registros.getString(3));
				producto.setPrecio(registros.getFloat(4));
				producto.setCantidadDisponible(registros.getInt(5));
				producto.setTipo(registros.getString(6));
				resultado.add(producto);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			}
			catch(Exception e) {
			}
		}
		return resultado;
	}
}