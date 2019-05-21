package fooreservasgenericas.peliculas_v20.com.eafit.reservasgenericas.gestion;

import
fooreservasgenericas.peliculas_v20.com.eafit.reservasgenericas.modelos.Cliente;
import
fooreservasgenericas.peliculas_v20.com.eafit.reservasgenericas.dto.ClienteDAO;
/*** added by dAdminClientes* modified by dAgregarCliente* modified by
dBuscarCliente
 */
public class AdminClientes {
	ClienteDAO clienteDAO = new ClienteDAO();
	Cliente cliente = new Cliente();
	/*** added by dAgregarCliente
	 */
	public void agregar(int numeroID, String nombre, String apellidos) throws
	Exception {
		Cliente cliente = new Cliente();
		cliente.setNumeroID(numeroID);
		cliente.setNombre(nombre);
		cliente.setApellidos(apellidos);
		clienteDAO.agregar(cliente);
	}
	/*** added by dBuscarCliente
	 */
	public Cliente buscar(int numeroID) throws Exception {
		return clienteDAO.buscar(numeroID);
	}
}