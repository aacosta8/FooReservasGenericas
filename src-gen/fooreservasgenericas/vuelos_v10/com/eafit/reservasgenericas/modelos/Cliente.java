package fooreservasgenericas.vuelos_v10.com.eafit.reservasgenericas.modelos;

/*** added by dCliente
 */
public class Cliente {
	private int numeroID;
	private String nombre = "";
	private String apellidos = "";
	public int getNumeroID() {
		return numeroID;
	}
	public void setNumeroID(int numeroID) throws Exception {
		if(numeroID > 0) {
			this.numeroID = numeroID;
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
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		if(apellidos != null && apellidos.length() >= 3) {
			this.apellidos = apellidos;
		}
		else {
			throw new IllegalArgumentException();
		}
	}
}