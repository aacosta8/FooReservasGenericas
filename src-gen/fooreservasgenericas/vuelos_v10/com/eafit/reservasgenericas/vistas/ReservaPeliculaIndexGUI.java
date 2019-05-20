package fooreservasgenericas.vuelos_v10.com.eafit.reservasgenericas.vistas;

import javax.swing.*;
import java.awt.EventQueue;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/*** added by dIndexVuelos
 */
public class ReservaPeliculaIndexGUI extends javax.swing.JFrame {
	public ReservaPeliculaIndexGUI() {
		initComponents();
	}
	private void initComponents() {
		registrarUsuarios = new javax.swing.JButton();
		registrarPeliculas = new javax.swing.JButton();
		reservarPelicula = new javax.swing.JButton();
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Inicio");
		registrarUsuarios.setText("Registrar Usuarios");
		registrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					registrarUsuariosActionPerformed(evt);
				}
			});
		registrarPeliculas.setText("Agregar Peliculas");
		registrarPeliculas.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					registrarPeliculasActionPerformed(evt);
				}
			});
		reservarPelicula.setText("Reservar Pelicula");
		reservarPelicula.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					reservarPeliculaActionPerformed(evt);
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
						Short.MAX_VALUE).addComponent(registrarPeliculas,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE).addComponent(reservarPelicula,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addGap(35, 35,
					35)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(35,
					35, 35).addComponent(registrarUsuarios).addGap(18, 18,
					18).addComponent(registrarPeliculas).addGap(18, 18,
					18).addComponent(reservarPelicula).addContainerGap(35,
					Short.MAX_VALUE)));
		pack();
	}
	private void registrarPeliculasActionPerformed(java.awt.event.ActionEvent
		evt) {
		AgregarPeliculaGUI agregarPeliculaGUI = new AgregarPeliculaGUI();
		agregarPeliculaGUI.setVisible(true);
	}
	private void reservarPeliculaActionPerformed(java.awt.event.ActionEvent evt)
	{
		AgregarReservaPeliculaGUI agregarReservaGUI = new
		AgregarReservaPeliculaGUI();
		agregarReservaGUI.setVisible(true);
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
			java.util.logging.Logger.getLogger(ReservaPeliculaIndexGUI.class.getName()).log(java.util.logging.Level.SEVERE,
				null, ex);
		}
		catch(InstantiationException ex) {
			java.util.logging.Logger.getLogger(ReservaPeliculaIndexGUI.class.getName()).log(java.util.logging.Level.SEVERE,
				null, ex);
		}
		catch(IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ReservaPeliculaIndexGUI.class.getName()).log(java.util.logging.Level.SEVERE,
				null, ex);
		}
		catch(javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ReservaPeliculaIndexGUI.class.getName()).log(java.util.logging.Level.SEVERE,
				null, ex);
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
					new ReservaPeliculaIndexGUI().setVisible(true);
				}
			});
	}
	private javax.swing.JButton registrarPeliculas;
	private javax.swing.JButton registrarUsuarios;
	private javax.swing.JButton reservarPelicula;
}