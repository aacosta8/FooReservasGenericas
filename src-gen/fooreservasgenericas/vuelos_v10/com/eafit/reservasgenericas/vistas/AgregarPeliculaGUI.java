package fooreservasgenericas.vuelos_v10.com.eafit.reservasgenericas.vistas;

import java.awt.event.*;
import javax.swing.*;
import
fooreservasgenericas.vuelos_v10.com.eafit.reservasgenericas.gestion.AdminProductos;
/*** added by dAgregarVueloUI
 */
@SuppressWarnings("serial")
public class AgregarPeliculaGUI extends JFrame {
	private JButton btnGuardar;
	private JLabel lblCantidad;
	private JLabel lblDescripcion;
	private JLabel lblGenero;
	private JLabel lblNombre;
	private JLabel lblPrecio;
	private JTextField tfCantidad;
	private JTextField tfDescripcion;
	private JTextField tfGenero;
	private JTextField tfNombre;
	private JTextField tfPrecio;
	public AgregarPeliculaGUI() {
		initComponents();
	}
	private void initComponents() {
		lblNombre = new JLabel();
		lblDescripcion = new JLabel();
		lblGenero = new JLabel();
		lblCantidad = new JLabel();
		lblPrecio = new JLabel();
		tfNombre = new JTextField();
		tfDescripcion = new JTextField();
		tfGenero = new JTextField();
		tfCantidad = new JTextField();
		tfPrecio = new JTextField();
		btnGuardar = new JButton();
		setTitle("Registrar Vuelo");
		lblNombre.setText("Nombre");
		lblDescripcion.setText("Descripción");
		lblGenero.setText("Clase");
		lblCantidad.setText("Cantidad");
		lblPrecio.setText("Precio");
		btnGuardar.setText("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					btnGuardarActionPerformed(evt);
				}
			});
		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(38,
							38,
							38).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(lblNombre).addComponent(lblDescripcion).addComponent(lblGenero).addComponent(lblCantidad).addComponent(lblPrecio)).addGap(47,
							47,
							47).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING,
								false).addComponent(tfNombre, GroupLayout.DEFAULT_SIZE, 81,
								Short.MAX_VALUE).addComponent(tfDescripcion).addComponent(tfGenero).addComponent(tfCantidad).addComponent(tfPrecio))).addGroup(layout.createSequentialGroup().addGap(86,
							86, 86).addComponent(btnGuardar))).addContainerGap(13,
					Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(46,
					46,
					46).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblNombre).addComponent(tfNombre,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)).addGap(18, 18,
					18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblDescripcion).addComponent(tfDescripcion,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)).addGap(18, 18,
					18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblGenero).addComponent(tfGenero,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)).addGap(18, 18,
					18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblCantidad).addComponent(tfCantidad,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)).addGap(18, 18,
					18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblPrecio).addComponent(tfPrecio,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)).addGap(18, 18,
					18).addComponent(btnGuardar).addContainerGap(32, Short.MAX_VALUE)));
		pack();
	}
	private void btnGuardarActionPerformed(ActionEvent evt) {
		AdminProductos adminProductos = new AdminProductos();
		String nombre = tfNombre.getText();
		String descripcion = tfDescripcion.getText();
		float precio = Float.valueOf(tfPrecio.getText());
		int cantidadDisponible = Integer.valueOf(tfCantidad.getText());
		String tipo = tfGenero.getText();
		try {
			adminProductos.agregar(nombre, descripcion, precio, cantidadDisponible,
				tipo);
		}
		catch(Exception e) {
		}
	}
}