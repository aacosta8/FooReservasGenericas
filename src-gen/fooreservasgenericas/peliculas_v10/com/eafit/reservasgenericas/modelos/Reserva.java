package fooreservasgenericas.peliculas_v10.com.eafit.reservasgenericas.modelos;

import java.util.Date;
/*** added by dReserva
 */
public class Reserva {
	private int idReserva;
	private Date fechaReserva;
	private Date fechaUso;
	private int cantidad;
	private float costoTotal;
	private Cliente cliente;
	private Producto producto;
	public int getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}
	public Date getFechaReserva() {
		return fechaReserva;
	}
	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}
	public Date getFechaUso() {
		return fechaUso;
	}
	public void setFechaUso(Date fechaUso) {
		this.fechaUso = fechaUso;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public float getCostoTotal() {
		return costoTotal;
	}
	public void setCostoTotal(float costoTotal) {
		this.costoTotal = costoTotal;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
}