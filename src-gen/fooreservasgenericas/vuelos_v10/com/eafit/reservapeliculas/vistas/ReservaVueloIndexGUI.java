package fooreservasgenericas.vuelos_v10.com.eafit.reservapeliculas.vistas;

/*** added by dAgregarReservaVueloUI
 */
public class ReservaVueloIndexGUI extends javax.swing.JFrame {
	public ReservaVueloIndexGUI() {
		initComponents();
	}
	private void initComponents() {
		registrarUsuarios = new javax.swing.JButton();
		registrarVuelo = new javax.swing.JButton();
		reservarVuelo = new javax.swing.JButton();
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Inicio");
		registrarUsuarios.setText("Registrar Usuarios");
		registrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					registrarUsuariosActionPerformed(evt);
				}
			});
		registrarVuelo.setText("Agregar Vuelo");
		registrarVuelo.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					registrarVueloActionPerformed(evt);
				}
			});
		reservarVuelo.setText("Reservar Vuelo");
		reservarVuelo.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					reservarVueloActionPerformed(evt);
				}
			});
		javax.swing.GroupLayout layout = new
		javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap(35,
					Short.MAX_VALUE).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
						false).addComponent(registrarUsuarios,
						javax.swing.GroupLayout.DEFAULT_SIZE, 129,
						Short.MAX_VALUE).addComponent(registrarVuelo,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE).addComponent(reservarVuelo,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addGap(35, 35,
					35)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(35,
					35, 35).addComponent(registrarUsuarios).addGap(18, 18,
					18).addComponent(registrarVuelo).addGap(18, 18,
					18).addComponent(reservarVuelo).addContainerGap(35, Short.MAX_VALUE)));
		pack();
	}
	private void registrarVueloActionPerformed(java.awt.event.ActionEvent evt) {
		AgregarVueloGUI agregarVueloGUI = new AgregarVueloGUI();
		agregarVueloGUI.setVisible(true);
	}
	private void reservarVueloActionPerformed(java.awt.event.ActionEvent evt) {
		AgregarReservaVueloGUI agregarVueloGUI = new AgregarReservaVueloGUI();
		agregarVueloGUI.setVisible(true);
	}
	private void registrarUsuariosActionPerformed(java.awt.event.ActionEvent evt)
	{
		AgregarClienteGUI agregarClienteGUI = new AgregarClienteGUI();
		agregarClienteGUI.setVisible(true);
	}
	public static void main(String args []) {
		try {
			for(javax.swing.UIManager.LookAndFeelInfo info :
				javax.swing.UIManager.getInstalledLookAndFeels()) {
				if("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		}
		catch(ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(ReservaVueloIndexGUI.class.getName()).log(java.util.logging.Level.SEVERE,
				null, ex);
		}
		catch(InstantiationException ex) {
			java.util.logging.Logger.getLogger(ReservaVueloIndexGUI.class.getName()).log(java.util.logging.Level.SEVERE,
				null, ex);
		}
		catch(IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ReservaVueloIndexGUI.class.getName()).log(java.util.logging.Level.SEVERE,
				null, ex);
		}
		catch(javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ReservaVueloIndexGUI.class.getName()).log(java.util.logging.Level.SEVERE,
				null, ex);
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
					new ReservaVueloIndexGUI().setVisible(true);
				}
			});
	}
	private javax.swing.JButton registrarUsuarios;
	private javax.swing.JButton registrarVuelo;
	private javax.swing.JButton reservarVuelo;
}