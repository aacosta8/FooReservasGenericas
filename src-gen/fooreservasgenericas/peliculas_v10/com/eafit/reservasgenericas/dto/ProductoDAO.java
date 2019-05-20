package fooreservasgenericas.peliculas_v10.com.eafit.reservasgenericas.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import
fooreservasgenericas.peliculas_v10.com.eafit.reservasgenericas.bd.Conexion;
import
fooreservasgenericas.peliculas_v10.com.eafit.reservasgenericas.modelos.Producto;
/*** added by dProductoDAO* modified by dAgregarProducto* modified by
dModificarProducto* modified by dEliminarProducto* modified by
dListarProductos* modified by dBuscarProducto
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
			String query =
			"SELECT idProducto, nombre, descripcion, precio, cantidadDisponible, tipo FROM producto";
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
	/*** added by dBuscarProducto
	 */
	public Producto buscar(int idProducto) {
		Producto producto = new Producto();
		try {
			conn = Conexion.getConexion();
			String query =
			"SELECT idProducto, nombre, descripcion, precio, cantidadDisponible, tipo FROM producto WHERE idProducto = ?";
			rs = ps.executeQuery(query);
			while(rs.next()) {
				producto.setIdProducto(rs.getInt(1));
				producto.setNombre(rs.getString(2));
				producto.setDescripcion(rs.getString(3));
				producto.setPrecio(rs.getFloat(4));
				producto.setCantidadDisponible(rs.getInt(5));
				producto.setTipo(rs.getString(6));
			}
			return producto;
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
		return producto;
	}
}