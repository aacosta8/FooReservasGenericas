package fooreservasgenericas.peliculas_v20.com.eafit.reservasgenericas.modelos;

/*** added by dProducto
 */
public class Producto {
	private int idProducto;
	private String nombre = "";
	private String descripcion = "";
	private float precio;
	private int cantidadDisponible;
	private String tipo = "";
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) throws Exception {
		if(idProducto > 0) {
			this.idProducto = idProducto;
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
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) throws Exception {
		if(precio > 0) {
			this.precio = precio;
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	public int getCantidadDisponible() {
		return cantidadDisponible;
	}
	public void setCantidadDisponible(int cantidadDisponible) throws Exception {
		this.cantidadDisponible = cantidadDisponible;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		if(tipo != null && tipo.length() >= 3) {
			this.tipo = tipo;
		}
		else {
			throw new IllegalArgumentException();
		}
	}
}