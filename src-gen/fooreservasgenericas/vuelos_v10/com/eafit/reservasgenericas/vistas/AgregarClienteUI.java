package fooreservasgenericas.vuelos_v10.com.eafit.reservasgenericas.vistas;

import java.awt.event.*;
import javax.swing.*;
import
fooreservasgenericas.vuelos_v10.com.eafit.reservasgenericas.gestion.AdminClientes;
/*** added by dAgregarClienteUI
 */
@SuppressWarnings("serial")
public class AgregarClienteUI extends JFrame {
	private JButton btnReservar;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblIdentificacion;
	private JTextField tfNombre;
	private JTextField tfApellidos;
	private JTextField tfIdentificacion;
	public AgregarClienteUI() {
		initComponents();
	}
	private void initComponents() {
		lblNombre = new JLabel();
		lblApellidos = new JLabel();
		lblIdentificacion = new JLabel();
		btnReservar = new JButton();
		tfNombre = new JTextField();
		tfApellidos = new JTextField();
		tfIdentificacion = new JTextField();
		setTitle("Registrar Cliente");
		addWindowListener(new WindowAdapter() {
				public void windowClosed(WindowEvent evt) {
					formWindowClosed(evt);
				}
			});
		lblNombre.setText("Nombre");
		lblApellidos.setText("Apellidos");
		lblIdentificacion.setText("Identificación");
		btnReservar.setText("Guardar");
		btnReservar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					btnReservarActionPerformed(evt);
				}
			});
		tfNombre.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					tfNombreActionPerformed(evt);
				}
			});
		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(38,
					38,
					38).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(lblNombre).addComponent(lblApellidos).addComponent(lblIdentificacion)).addGap(43,
					43,
					43).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING,
						false).addComponent(tfNombre, GroupLayout.DEFAULT_SIZE, 90,
						Short.MAX_VALUE).addComponent(tfApellidos).addComponent(tfIdentificacion)).addContainerGap(GroupLayout.DEFAULT_SIZE,
					Short.MAX_VALUE)).addGroup(GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap(90,
					Short.MAX_VALUE).addComponent(btnReservar).addGap(84, 84, 84)));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(46,
					46,
					46).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(lblNombre).addComponent(tfNombre,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)).addGap(18, 18,
					18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(lblApellidos).addComponent(tfApellidos,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)).addGap(18, 18,
					18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(lblIdentificacion).addComponent(tfIdentificacion,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
					28, Short.MAX_VALUE).addComponent(btnReservar).addGap(32, 32, 32)));
		pack();
	}
	private void formWindowClosed(WindowEvent evt) {
	}
	private void tfNombreActionPerformed(ActionEvent evt) {
	}
	private void btnReservarActionPerformed(ActionEvent evt) {
		AdminClientes admin = new AdminClientes();
		int numeroID = Integer.valueOf(tfIdentificacion.getText());
		String nombre = tfNombre.getText();
		String apellidos = tfApellidos.getText();
		try {
			admin.agregar(numeroID, nombre, apellidos);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}