package fooreservasgenericas.reservas_v10.com.eafit.reservasgenericas.fop;

import java.util.ArrayList;
import java.util.List;
import
fooreservasgenericas.reservas_v10.com.eafit.reservasenericas.modelos.Cliente;
import
fooreservasgenericas.reservas_v10.com.eafit.reservasgenericas.dto.ClienteDAO;
/*** added by dAdminClientes* modified by dAgregarCliente
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
}