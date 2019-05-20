package fooreservasgenericas.peliculas_v10.com.eafit.reservasgenericas.gestion;

import java.util.Date;
import
fooreservasgenericas.peliculas_v10.com.eafit.reservasgenericas.modelos.Cliente;
import
fooreservasgenericas.peliculas_v10.com.eafit.reservasgenericas.modelos.Producto;
import
fooreservasgenericas.peliculas_v10.com.eafit.reservasgenericas.modelos.Reserva;
import
fooreservasgenericas.peliculas_v10.com.eafit.reservasgenericas.dto.ReservaDAO;
/*** added by dAdminReservas* modified by dAgregarReserva
 */
public class AdminReservas {
	ReservaDAO reservaDAO = new ReservaDAO();
	Reserva reserva = new Reserva();
	/*** added by dAgregarReserva
	 */
	public void agregar(Date fechaReserva, Date fechaUso, int cantidad, float
		costoTotal, Cliente cliente, Producto producto) {
		Reserva reserva = new Reserva();
		reserva.setFechaReserva(fechaReserva);
		reserva.setFechaUso(fechaUso);
		reserva.setCantidad(cantidad);
		reserva.setCostoTotal(costoTotal);
		reserva.setCliente(cliente);
		reserva.setProducto(producto);
		reservaDAO.agregar(reserva);
	}
}