package fooreservasgenericas.reservas_v10.com.eafit.reservasgenericas.fop;

import java.util.Date;
import
fooreservasgenericas.reservas_v10.com.eafit.reservasenericas.modelos.Cliente;
import
fooreservasgenericas.reservas_v10.com.eafit.reservasenericas.modelos.Producto;
import
fooreservasgenericas.reservas_v10.com.eafit.reservasenericas.modelos.Reserva;
import
fooreservasgenericas.reservas_v10.com.eafit.reservasgenericas.dto.ReservaDAO;
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