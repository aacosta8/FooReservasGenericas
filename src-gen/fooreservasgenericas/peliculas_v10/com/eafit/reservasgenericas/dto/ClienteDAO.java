package fooreservasgenericas.peliculas_v10.com.eafit.reservasgenericas.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import
fooreservasgenericas.peliculas_v10.com.eafit.reservasgenericas.bd.Conexion;
import
fooreservasgenericas.peliculas_v10.com.eafit.reservasgenericas.modelos.Cliente;
/*** added by dClienteDAO* modified by dAgregarCliente* modified by
dBuscarCliente
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
			"INSERT INTO cliente (numeroID, nombre, apellidos) values (?,?,?)";
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
	/*** added by dBuscarCliente
	 */
	public Cliente buscar(int numeroID) {
		Cliente cliente = new Cliente();
		try {
			conn = Conexion.getConexion();
			String query =
			"SELECT numeroID, nombre, apellidos FROM cliente WHERE numeroID = " +
			numeroID;
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				cliente.setNumeroID(rs.getInt(1));
				cliente.setNombre(rs.getString(2));
				cliente.setApellidos(rs.getString(3));
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
		return cliente;
	}
}