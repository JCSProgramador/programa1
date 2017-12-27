package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 window = new Ventana1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnVentabauno = new JButton("Ventana UNO");
		btnVentabauno.setBounds(170, 45, 150, 23);
		frame.getContentPane().add(btnVentabauno);
		
		JButton btnVentanados = new JButton("Ventana DOS");
		btnVentanados.setBounds(170, 70, 150, 23);
		frame.getContentPane().add(btnVentanados);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.setVisible(false);
		
			}
		});
		btnSalir.setBounds(170, 189, 89, 23);
		frame.getContentPane().add(btnSalir);
		frame.setVisible(true);
	}
}
