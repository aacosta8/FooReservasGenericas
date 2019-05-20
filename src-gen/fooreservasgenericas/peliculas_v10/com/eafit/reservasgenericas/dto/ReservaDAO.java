package fooreservasgenericas.peliculas_v10.com.eafit.reservasgenericas.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import
fooreservasgenericas.peliculas_v10.com.eafit.reservasgenericas.bd.Conexion;
import
fooreservasgenericas.peliculas_v10.com.eafit.reservasgenericas.modelos.Reserva;
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
			java.sql.Date sqlFechaReserva = new
			java.sql.Date(reserva.getFechaReserva().getTime());
			ps.setDate(1, sqlFechaReserva);
			java.sql.Date sqlFechaUso = new
			java.sql.Date(reserva.getFechaUso().getTime());
			ps.setDate(2, sqlFechaUso);
			ps.setInt(3, reserva.getCantidad());
			ps.setFloat(4, reserva.getCostoTotal());
			ps.setInt(5, reserva.getCliente().getNumeroID());
			ps.setInt(6, reserva.getProducto().getIdProducto());
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