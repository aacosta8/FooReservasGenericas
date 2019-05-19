package fooreservasgenericas.peliculas_v10.com.eafit.reservasgenericas.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import
fooreservasgenericas.peliculas_v10.com.eafit.reservasgenericas.bd.Conexion;
import
fooreservasgenericas.peliculas_v10.com.eafit.reservasenericas.modelos.Reserva;
/*** added by dReservaDAO* modified by dAgregarReserva
 */
public class ReservaDAO {
	Statement st = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Connection conn = null;
	Conexion conexion = null;
	/*** added by dAgregarReserva
	 */
	public void agregar(Reserva reserva) {
		try {
			conn = Conexion.getConexion();
			String query =
			"INSERT INTO reserva (fechaReserva, fechaUso, cantidad, costoTotal, numeroIDCliente, idProducto) values (?,?,?,?,?,?)";
			ps = conn.prepareStatement(query);
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