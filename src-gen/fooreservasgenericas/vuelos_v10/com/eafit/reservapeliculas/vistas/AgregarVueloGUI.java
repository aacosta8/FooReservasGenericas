package fooreservasgenericas.vuelos_v10.com.eafit.reservapeliculas.vistas;

/*** added by dAgregarVueloUI
 */
public class AgregarVueloGUI extends javax.swing.JFrame {
	public AgregarVueloGUI() {
		initComponents();
	}
	@SuppressWarnings("unchecked")
	private void initComponents() {
		jSeparator1 = new javax.swing.JSeparator();
		lblNombre = new javax.swing.JLabel();
		lblDescripcion = new javax.swing.JLabel();
		lblGenero = new javax.swing.JLabel();
		lblCantidad = new javax.swing.JLabel();
		lblPrecio = new javax.swing.JLabel();
		tfNombre = new javax.swing.JTextField();
		tfDescripcion = new javax.swing.JTextField();
		tfGenero = new javax.swing.JTextField();
		tfCantidad = new javax.swing.JTextField();
		tfPrecio = new javax.swing.JTextField();
		btnGuardar = new javax.swing.JButton();
		setTitle("Registrar Pelicula");
		lblNombre.setText("Destino");
		lblDescripcion.setText("Descripci�n");
		lblGenero.setText("Clase");
		lblCantidad.setText("Cantidad");
		lblPrecio.setText("Precio");
		btnGuardar.setText("Guardar");
		btnGuardar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					btnGuardarActionPerformed(evt);
				}
			});
		javax.swing.GroupLayout layout = new
		javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(38,
							38,
							38).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(lblNombre).addComponent(lblDescripcion).addComponent(lblGenero).addComponent(lblCantidad).addComponent(lblPrecio)).addGap(47,
							47,
							47).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
								false).addComponent(tfNombre, javax.swing.GroupLayout.DEFAULT_SIZE,
								81,
								Short.MAX_VALUE).addComponent(tfDescripcion).addComponent(tfGenero).addComponent(tfCantidad).addComponent(tfPrecio))).addGroup(layout.createSequentialGroup().addGap(86,
							86, 86).addComponent(btnGuardar))).addContainerGap(13,
					Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(46,
					46,
					46).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblNombre).addComponent(tfNombre,
						javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18,
					18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblDescripcion).addComponent(tfDescripcion,
						javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18,
					18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblGenero).addComponent(tfGenero,
						javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18,
					18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblCantidad).addComponent(tfCantidad,
						javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18,
					18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblPrecio).addComponent(tfPrecio,
						javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18,
					18).addComponent(btnGuardar).addContainerGap(32, Short.MAX_VALUE)));
		pack();
	}
	private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {
		String nombre = tfDe.getText();
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
	private javax.swing.JButton btnGuardar;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JLabel lblCantidad;
	private javax.swing.JLabel lblDescripcion;
	private javax.swing.JLabel lblGenero;
	private javax.swing.JLabel lblNombre;
	private javax.swing.JLabel lblPrecio;
	private javax.swing.JTextField tfCantidad;
	private javax.swing.JTextField tfDescripcion;
	private javax.swing.JTextField tfGenero;
	private javax.swing.JTextField tfNombre;
	private javax.swing.JTextField tfPrecio;
}