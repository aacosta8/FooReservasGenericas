package fooreservasgenericas.vuelos_v10.com.eafit.reservasgenericas.vistas;

import javax.swing.*;
import java.awt.EventQueue;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/*** added by dIndexVuelos* modified by dAgregarVueloUI* modified by
dAgregarReservaVueloUI
 */
@SuppressWarnings("serial")
public class ReservaPeliculaIndexGUI extends JFrame {
	private JButton registrarPeliculas;
	private JButton registrarClientes;
	private JButton reservarPelicula;
	public ReservaPeliculaIndexGUI() {
		initComponents();
	}
	private void initComponents() {
		registrarClientes = new JButton();
		registrarPeliculas = new JButton();
		reservarPelicula = new JButton();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Inicio");
		registrarClientes.setText("Registrar Clientes");
		registrarClientes.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					registrarClientesActionPerformed(evt);
				}
			});
		registrarPeliculas.setText("Agregar Vuelo");
		registrarPeliculas.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					registrarPeliculasActionPerformed(evt);
				}
			});
		reservarPelicula.setText("Reservar Asiento");
		reservarPelicula.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					reservarPeliculaActionPerformed(evt);
				}
			});
		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap(35,
					Short.MAX_VALUE).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING,
						false).addComponent(registrarClientes, GroupLayout.DEFAULT_SIZE, 129,
						Short.MAX_VALUE).addComponent(registrarPeliculas,
						GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE).addComponent(reservarPelicula,
						GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)).addGap(35, 35, 35)));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(35,
					35, 35).addComponent(registrarClientes).addGap(18, 18,
					18).addComponent(registrarPeliculas).addGap(18, 18,
					18).addComponent(reservarPelicula).addContainerGap(35,
					Short.MAX_VALUE)));
		pack();
	}
	public static void main(String args []) {
		try {
			for(UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
			{
				if("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		}
		catch(ClassNotFoundException ex) {
			Logger.getLogger(ReservaPeliculaIndexGUI.class.getName()).log(Level.SEVERE,
				null, ex);
		}
		catch(InstantiationException ex) {
			Logger.getLogger(ReservaPeliculaIndexGUI.class.getName()).log(Level.SEVERE,
				null, ex);
		}
		catch(IllegalAccessException ex) {
			Logger.getLogger(ReservaPeliculaIndexGUI.class.getName()).log(Level.SEVERE,
				null, ex);
		}
		catch(javax.swing.UnsupportedLookAndFeelException ex) {
			Logger.getLogger(ReservaPeliculaIndexGUI.class.getName()).log(Level.SEVERE,
				null, ex);
		}
		EventQueue.invokeLater(new Runnable() {
				public void run() {
					new ReservaPeliculaIndexGUI().setVisible(true);
				}
			});
	}
	/*** added by dAgregarVueloUI
	 */
	private void registrarPeliculasActionPerformed(ActionEvent evt) {
		AgregarPeliculaGUI agregarPeliculaGUI = new AgregarPeliculaGUI();
		agregarPeliculaGUI.setVisible(true);
	}
	/*** added by dAgregarReservaVueloUI
	 */
	private void reservarPeliculaActionPerformed(java.awt.event.ActionEvent evt)
	{
		AgregarReservaPeliculaGUI agregarReservaGUI = new
		AgregarReservaPeliculaGUI();
		agregarReservaGUI.setVisible(true);
	}
}