package fooreservasgenericas.peliculas_v10.com.eafit.reservasgenericas.vistas;

import javax.swing.*;
import java.awt.event.*;
import java.util.List;
import java.util.Date;
import
fooreservasgenericas.peliculas_v10.com.eafit.reservasgenericas.modelos.Cliente;
import
fooreservasgenericas.peliculas_v10.com.eafit.reservasgenericas.modelos.Producto;
import
fooreservasgenericas.peliculas_v10.com.eafit.reservasgenericas.gestion.AdminProductos;
import
fooreservasgenericas.peliculas_v10.com.eafit.reservasgenericas.gestion.AdminClientes;
import
fooreservasgenericas.peliculas_v10.com.eafit.reservasgenericas.gestion.AdminReservas;
/*** added by dAgregarReservaUI
 */
@SuppressWarnings("serial")
public class AgregarReservaPeliculaGUI extends JFrame {
	private JButton btnReservar;
	private JButton btnSeleccionar;
	private JComboBox cbxPeliculas;
	private JButton btnBuscar;
	private JSeparator jSeparator1;
	private JSeparator jSeparator2;
	private JLabel lblApellidos;
	private JLabel lblCantidad;
	private JLabel lblCantidadDisponible;
	private JLabel lblCostoTotal;
	private JLabel lblDescripcion;
	private JLabel lblFechaReserva;
	private JLabel lblIdentificacion;
	private JLabel lblNombre;
	private JLabel lblPelicula;
	private JLabel lblPrecio;
	private JTextField tfApellidos;
	private JTextField tfCantidad;
	private JTextField tfCantidadDisponible;
	private JTextField tfCostoTotal;
	private JTextField tfDescripcion;
	private JTextField tfFechaReserva;
	private JTextField tfIdentificacion;
	private JTextField tfNombre;
	private JTextField tfPrecio;
	AdminProductos adminProductos = new AdminProductos();
	AdminClientes adminClientes = new AdminClientes();
	AdminReservas adminReservas = new AdminReservas();
	List<Producto> productos;
	Producto producto = new Producto();
	Cliente cliente = new Cliente();
	@SuppressWarnings("unchecked")
	public AgregarReservaPeliculaGUI() {
		initComponents();
		try {
			productos = adminProductos.listar();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		for(int i = 0;
			i < productos.size();
			i ++) {
			cbxPeliculas.addItem(productos.get(i).getIdProducto() + ":" +
				productos.get(i).getNombre());
		}
	}
	private void initComponents() {
		lblPelicula = new JLabel();
		jSeparator1 = new JSeparator();
		cbxPeliculas = new JComboBox();
		lblDescripcion = new JLabel();
		tfDescripcion = new JTextField();
		lblCantidadDisponible = new JLabel();
		tfCantidadDisponible = new JTextField();
		btnSeleccionar = new JButton();
		jSeparator2 = new JSeparator();
		lblIdentificacion = new JLabel();
		tfIdentificacion = new JTextField();
		btnBuscar = new JButton();
		lblNombre = new JLabel();
		tfNombre = new JTextField();
		lblApellidos = new JLabel();
		tfApellidos = new JTextField();
		lblFechaReserva = new JLabel();
		lblCantidad = new JLabel();
		lblPrecio = new JLabel();
		tfPrecio = new JTextField();
		lblCostoTotal = new JLabel();
		tfFechaReserva = new JTextField();
		tfCantidad = new JTextField();
		tfCostoTotal = new JTextField();
		btnReservar = new JButton();
		setTitle("Crear Reserva");
		lblPelicula.setText("Peliculas");
		cbxPeliculas.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					cbxPeliculasActionPerformed(evt);
				}
			});
		lblDescripcion.setText("Descripción");
		lblCantidadDisponible.setText("Cantidad disponible");
		btnSeleccionar.setText("Seleccionar");
		btnSeleccionar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					btnSeleccionarActionPerformed(evt);
				}
			});
		lblIdentificacion.setText("Identificación");
		btnBuscar.setText("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					btnBuscarActionPerformed(evt);
				}
			});
		lblNombre.setText("Nombre");
		lblApellidos.setText("Apellidos");
		lblFechaReserva.setText("Fecha de la reserva");
		lblCantidad.setText("Cantidad");
		lblPrecio.setText("Precio");
		lblCostoTotal.setText("Costo total");
		btnReservar.setText("Reservar");
		btnReservar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					btnReservarActionPerformed(evt);
				}
			});
		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jSeparator1).addComponent(jSeparator2,
				GroupLayout.Alignment.TRAILING).addGroup(layout.createSequentialGroup().addGap(21,
					21,
					21).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(lblFechaReserva).addComponent(lblCantidad)).addGap(18,
							18,
							18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING,
								false).addComponent(tfFechaReserva).addComponent(tfCantidad,
								GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)).addGap(18, 18,
							18).addComponent(btnReservar, GroupLayout.PREFERRED_SIZE, 90,
							GroupLayout.PREFERRED_SIZE).addContainerGap(GroupLayout.DEFAULT_SIZE,
							Short.MAX_VALUE)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING,
								false).addGroup(layout.createSequentialGroup().addComponent(lblCostoTotal).addGap(60,
									60, 60).addComponent(tfCostoTotal).addGap(106, 106,
									106)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(lblDescripcion).addComponent(lblPelicula).addComponent(lblCantidadDisponible).addComponent(lblIdentificacion).addComponent(lblNombre).addComponent(lblApellidos).addComponent(lblPrecio)).addGap(18,
									18,
									18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING,
												false).addComponent(tfNombre,
												GroupLayout.Alignment.LEADING).addComponent(tfApellidos,
												GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 90,
												Short.MAX_VALUE).addComponent(tfIdentificacion,
												GroupLayout.Alignment.LEADING)).addGap(18, 18,
											18).addComponent(btnBuscar, GroupLayout.PREFERRED_SIZE, 90,
											GroupLayout.PREFERRED_SIZE)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING,
												false).addComponent(tfPrecio,
												GroupLayout.Alignment.LEADING).addComponent(cbxPeliculas,
												GroupLayout.Alignment.LEADING, 0, 90,
												Short.MAX_VALUE).addComponent(tfCantidadDisponible,
												GroupLayout.Alignment.LEADING).addComponent(tfDescripcion,
												GroupLayout.Alignment.LEADING)).addGap(18, 18,
											18).addComponent(btnSeleccionar))))).addGap(0, 81,
							Short.MAX_VALUE)))));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblIdentificacion,
						GroupLayout.PREFERRED_SIZE, 14,
						GroupLayout.PREFERRED_SIZE).addComponent(tfIdentificacion,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE).addComponent(btnBuscar)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(tfNombre,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE).addComponent(lblNombre)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(lblApellidos).addComponent(tfApellidos,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jSeparator2,
					GroupLayout.PREFERRED_SIZE, 9,
					GroupLayout.PREFERRED_SIZE).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblPelicula).addComponent(cbxPeliculas,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE).addComponent(btnSeleccionar)).addGap(18, 18,
					18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblDescripcion).addComponent(tfDescripcion,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)).addGap(18, 18,
					18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblCantidadDisponible).addComponent(tfCantidadDisponible,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)).addGap(18, 18,
					18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblPrecio).addComponent(tfPrecio,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)).addGap(5, 5, 5).addComponent(jSeparator1,
					GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
					GroupLayout.PREFERRED_SIZE).addGap(14, 14,
					14).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblFechaReserva).addComponent(tfFechaReserva,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE).addComponent(btnReservar)).addGap(18, 18,
					18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblCantidad).addComponent(tfCantidad,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)).addGap(18, 18,
					18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblCostoTotal).addComponent(tfCostoTotal,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)).addContainerGap(13, Short.MAX_VALUE)));
		pack();
	}
	private void cbxPeliculasActionPerformed(ActionEvent evt) {
	}
	private void btnBuscarActionPerformed(ActionEvent evt) {
		try {
			cliente =
			adminClientes.buscar(Integer.valueOf(tfIdentificacion.getText()));
			tfNombre.setText(cliente.getNombre());
			tfApellidos.setText(cliente.getApellidos());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	private void btnSeleccionarActionPerformed(ActionEvent evt) {
		try {
			int id =
			Integer.valueOf(cbxPeliculas.getSelectedItem().toString().split(":")[0]);
			producto = adminProductos.buscar(id);
			tfDescripcion.setText(producto.getDescripcion());
			tfCantidadDisponible.setText(String.valueOf(producto.getCantidadDisponible()));
			tfPrecio.setText(String.valueOf(producto.getPrecio()));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	private void btnReservarActionPerformed(ActionEvent evt) {
		Date fechaReserva = new Date(System.currentTimeMillis());
		Date fechaUso = new Date(System.currentTimeMillis());
		int cantidad = Integer.valueOf(tfCantidad.getText());
		
		float costoTotal = cantidad *producto.getPrecio();
		tfPrecio.setText(String.valueOf(costoTotal));
		adminReservas.agregar(fechaReserva, fechaUso, cantidad, costoTotal, cliente,
			producto);
	}
}