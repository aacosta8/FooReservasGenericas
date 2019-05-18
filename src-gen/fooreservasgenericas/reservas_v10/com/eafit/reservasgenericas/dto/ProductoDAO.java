package fooreservasgenericas.reservas_v10.com.eafit.reservasgenericas.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import
fooreservasgenericas.reservas_v10.com.eafit.reservasgenericas.bd.Conexion;
import
fooreservasgenericas.reservas_v10.com.eafit.reservasenericas.modelos.Producto;
/*** added by dProductoDAO* modified by dAgregarProducto
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
			String query = "INSERT INTO categoria (nombre, descripcion) values (?,?)";
			ps = conn.prepareStatement(query);
			ps.setString(1, producto.getNombre());
			ps.setString(2, producto.getDescripcion());
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
}