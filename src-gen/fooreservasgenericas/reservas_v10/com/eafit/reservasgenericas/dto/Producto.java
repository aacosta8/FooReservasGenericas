package fooreservasgenericas.reservas_v10.com.eafit.reservasgenericas.dto;

/*** added by dProducto
 */
public class Producto {
	public Integer id;
	public String nombre = "";
	public String descripcion = "";
	public int cantidadDisponible;
	public String tipo = "";
	public double costo;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) throws Exception {
		if(id != null && id > 0) {
			this.id = id;
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		if(nombre != null && nombre.length() >= 3) {
			this.nombre = nombre;
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}