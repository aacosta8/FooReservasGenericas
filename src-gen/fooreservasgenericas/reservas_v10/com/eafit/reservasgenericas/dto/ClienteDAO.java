package fooreservasgenericas.reservas_v10.com.eafit.reservasgenericas.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import
fooreservasgenericas.reservas_v10.com.eafit.reservasgenericas.bd.Conexion;
import
fooreservasgenericas.reservas_v10.com.eafit.reservasenericas.modelos.Cliente;
/*** added by dClienteDAO* modified by dAgregarCliente
 */
public class ClienteDAO {
	Statement st = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Connection conn = null;
	Conexion conexion = null;
	/*** added by dAgregarCliente
	 */
	public void agregar(Cliente cliente) {
		try {
			conn = Conexion.getConexion();
			String query =
			"INSERT INTO reservas (numeroID, nombre, apellidos) values (?,?,?)";
			ps = conn.prepareStatement(query);
			ps.setInt(1, cliente.getNumeroID());
			ps.setString(2, cliente.getNombre());
			ps.setString(3, cliente.getApellidos());
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