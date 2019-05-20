package fooreservasgenericas.peliculas_v10.com.eafit.reservasgenericas.vistas;

import javax.swing.*;
import java.awt.event.*;
/*** added by dAgregarReservaUI
 */
public class AgregarReservaPeliculaGUI extends JFrame {
	String items [] = {
		"Hola", "Mundo"
	};
	public AgregarReservaPeliculaGUI() {
		initComponents();
		for(int i = 0;
			i < items.length;
			i ++) {
			cbxPeliculas.addItem(items[i]);
		}
	}
	@SuppressWarnings("unchecked")
	private void initComponents() {
		lblPelicula = new javax.swing.JLabel();
		jSeparator1 = new javax.swing.JSeparator();
		cbxPeliculas = new javax.swing.JComboBox();
		lblDescripcion = new javax.swing.JLabel();
		tfDescripcion = new javax.swing.JTextField();
		lblCantidadDisponible = new javax.swing.JLabel();
		tfCantidadDisponible = new javax.swing.JTextField();
		btnSeleccionar = new javax.swing.JButton();
		jSeparator2 = new javax.swing.JSeparator();
		lblIdentificacion = new javax.swing.JLabel();
		tfIdentificacion = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		lblNombre = new javax.swing.JLabel();
		tfNombre = new javax.swing.JTextField();
		lblApellidos = new javax.swing.JLabel();
		tfApellidos = new javax.swing.JTextField();
		lblFechaReserva = new javax.swing.JLabel();
		lblCantidad = new javax.swing.JLabel();
		lblPrecio = new javax.swing.JLabel();
		tfPrecio = new javax.swing.JTextField();
		lblCostoTotal = new javax.swing.JLabel();
		tfFechaReserva = new javax.swing.JTextField();
		tfCantidad = new javax.swing.JTextField();
		tfCostoTotal = new javax.swing.JTextField();
		btnReservar = new javax.swing.JButton();
		setTitle("Crear Reserva");
		lblPelicula.setText("Peliculas");
		cbxPeliculas.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					cbxPeliculasActionPerformed(evt);
				}
			});
		lblDescripcion.setText("Descripción");
		lblCantidadDisponible.setText("Cantidad disponible");
		btnSeleccionar.setText("Seleccionar");
		btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					btnSeleccionarActionPerformed(evt);
				}
			});
		lblIdentificacion.setText("Identificación");
		jButton1.setText("Buscar");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					jButton1ActionPerformed(evt);
				}
			});
		lblNombre.setText("Nombre");
		lblApellidos.setText("Apellidos");
		lblFechaReserva.setText("Fecha de la reserva");
		lblCantidad.setText("Cantidad");
		lblPrecio.setText("Precio");
		lblCostoTotal.setText("Costo total");
		btnReservar.setText("Reservar");
		btnReservar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					btnReservarActionPerformed(evt);
				}
			});
		javax.swing.GroupLayout layout = new
		javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jSeparator1).addComponent(jSeparator2,
				javax.swing.GroupLayout.Alignment.TRAILING).addGroup(layout.createSequentialGroup().addGap(21,
					21,
					21).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(lblFechaReserva).addComponent(lblCantidad)).addGap(18,
							18,
							18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
								false).addComponent(tfFechaReserva).addComponent(tfCantidad,
								javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)).addGap(18,
							18, 18).addComponent(btnReservar,
							javax.swing.GroupLayout.PREFERRED_SIZE, 90,
							javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
							Short.MAX_VALUE)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
								false).addGroup(layout.createSequentialGroup().addComponent(lblCostoTotal).addGap(60,
									60, 60).addComponent(tfCostoTotal).addGap(106, 106,
									106)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(lblDescripcion).addComponent(lblPelicula).addComponent(lblCantidadDisponible).addComponent(lblIdentificacion).addComponent(lblNombre).addComponent(lblApellidos).addComponent(lblPrecio)).addGap(18,
									18,
									18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
												false).addComponent(tfNombre,
												javax.swing.GroupLayout.Alignment.LEADING).addComponent(tfApellidos,
												javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE, 90,
												Short.MAX_VALUE).addComponent(tfIdentificacion,
												javax.swing.GroupLayout.Alignment.LEADING)).addGap(18, 18,
											18).addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE,
											90,
											javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
												false).addComponent(tfPrecio,
												javax.swing.GroupLayout.Alignment.LEADING).addComponent(cbxPeliculas,
												javax.swing.GroupLayout.Alignment.LEADING, 0, 90,
												Short.MAX_VALUE).addComponent(tfCantidadDisponible,
												javax.swing.GroupLayout.Alignment.LEADING).addComponent(tfDescripcion,
												javax.swing.GroupLayout.Alignment.LEADING)).addGap(18, 18,
											18).addComponent(btnSeleccionar))))).addGap(0, 81,
							Short.MAX_VALUE)))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblIdentificacion,
						javax.swing.GroupLayout.PREFERRED_SIZE, 14,
						javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(tfIdentificacion,
						javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jButton1)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(tfNombre,
						javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(lblNombre)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(lblApellidos).addComponent(tfApellidos,
						javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jSeparator2,
					javax.swing.GroupLayout.PREFERRED_SIZE, 9,
					javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblPelicula).addComponent(cbxPeliculas,
						javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(btnSeleccionar)).addGap(18,
					18,
					18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblDescripcion).addComponent(tfDescripcion,
						javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18,
					18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblCantidadDisponible).addComponent(tfCantidadDisponible,
						javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18,
					18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblPrecio).addComponent(tfPrecio,
						javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(5, 5,
					5).addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE,
					javax.swing.GroupLayout.DEFAULT_SIZE,
					javax.swing.GroupLayout.PREFERRED_SIZE).addGap(14, 14,
					14).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblFechaReserva).addComponent(tfFechaReserva,
						javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(btnReservar)).addGap(18,
					18,
					18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblCantidad).addComponent(tfCantidad,
						javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18,
					18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblCostoTotal).addComponent(tfCostoTotal,
						javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)).addContainerGap(13,
					Short.MAX_VALUE)));
		pack();
	}
	private void cbxPeliculasActionPerformed(java.awt.event.ActionEvent evt) {
	}
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
	}
	private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {
		System.out.println(cbxPeliculas.getSelectedItem());
	}
	private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {
	}
	private javax.swing.JButton btnReservar;
	private javax.swing.JButton btnSeleccionar;
	private javax.swing.JComboBox cbxPeliculas;
	private javax.swing.JButton jButton1;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JSeparator jSeparator2;
	private javax.swing.JLabel lblApellidos;
	private javax.swing.JLabel lblCantidad;
	private javax.swing.JLabel lblCantidadDisponible;
	private javax.swing.JLabel lblCostoTotal;
	private javax.swing.JLabel lblDescripcion;
	private javax.swing.JLabel lblFechaReserva;
	private javax.swing.JLabel lblIdentificacion;
	private javax.swing.JLabel lblNombre;
	private javax.swing.JLabel lblPelicula;
	private javax.swing.JLabel lblPrecio;
	private javax.swing.JTextField tfApellidos;
	private javax.swing.JTextField tfCantidad;
	private javax.swing.JTextField tfCantidadDisponible;
	private javax.swing.JTextField tfCostoTotal;
	private javax.swing.JTextField tfDescripcion;
	private javax.swing.JTextField tfFechaReserva;
	private javax.swing.JTextField tfIdentificacion;
	private javax.swing.JTextField tfNombre;
	private javax.swing.JTextField tfPrecio;
}