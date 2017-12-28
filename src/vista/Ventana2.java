package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana2 {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 window = new Ventana2();
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
	public Ventana2() {
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
		
		JButton btnVentabauno = new JButton("Ventana 1");
		btnVentabauno.setBounds(170, 45, 150, 23);
		frame.getContentPane().add(btnVentabauno);
		
		
		
		JButton btnVentanatres = new JButton("Ventana 3");
		btnVentanatres.setBounds(170, 105, 150, 23);
		frame.getContentPane().add(btnVentanatres);
		
		JButton btnVentanacuatro = new JButton("Ventana 4");
		btnVentanacuatro.setBounds(170, 125, 150, 23);
		frame.getContentPane().add(btnVentanacuatro);

		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.setVisible(false);
		
			}
		});
		btnSalir.setBounds(170, 189, 150, 23);
		frame.getContentPane().add(btnSalir);
		frame.setVisible(true);
	}
}
