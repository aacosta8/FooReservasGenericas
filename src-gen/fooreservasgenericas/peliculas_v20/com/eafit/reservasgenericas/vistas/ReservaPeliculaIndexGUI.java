package fooreservasgenericas.peliculas_v20.com.eafit.reservasgenericas.vistas;

import javax.swing.*;
import java.awt.EventQueue;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/*** added by dIndexPeliculasReserva* modified by dAgregarClienteUI* modified
by dAgregarPeliculaUI* modified by dAgregarReservaUI
 */
@SuppressWarnings("serial")
public class ReservaPeliculaIndexGUI extends JFrame {
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
		reservarPelicula.setText("Reservar Pelicula");
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
						false).addComponent(reservarPelicula, GroupLayout.DEFAULT_SIZE,
						GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addGap(35, 35, 35)));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(35,
					35, 35).addComponent(reservarPelicula).addContainerGap(35,
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
	/*** added by dAgregarClienteUI
	 */
	private void registrarClientesActionPerformed(ActionEvent evt) {
		AgregarClienteUI AgregarClienteUI = new AgregarClienteUI();
		AgregarClienteUI.setVisible(true);
	}
	/*** added by dAgregarPeliculaUI
	 */
	private void registrarPeliculasActionPerformed(ActionEvent evt) {
		AgregarPeliculaGUI agregarPeliculaGUI = new AgregarPeliculaGUI();
		agregarPeliculaGUI.setVisible(true);
	}
	/*** added by dAgregarReservaUI
	 */
	private void reservarPeliculaActionPerformed(java.awt.event.ActionEvent evt)
	{
		AgregarReservaPeliculaGUI agregarReservaGUI = new
		AgregarReservaPeliculaGUI();
		agregarReservaGUI.setVisible(true);
	}
}