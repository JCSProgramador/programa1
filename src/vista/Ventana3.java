package vista;



	import java.awt.Frame;
import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JTextField;

	
	public class Ventana3 extends JFrame implements ActionListener {

	    private JLabel texto;
	    private JTextField caja; 
	    private JButton boton;
	    private JButton ventanair;

	    public Ventana3() {
	        super();                 
	        configurarVentana();       
	        inicializarComponentes();  
	    }

	    private void configurarVentana() {
	        this.setTitle("Esta Es Una Ventana");                 
	        this.setSize(310, 210);                                
	        this.setLocationRelativeTo(null);                    
	        this.setLayout(null);                                  
	        this.setResizable(false);                               
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
	    }

	    private void inicializarComponentes() {
	      
	        texto = new JLabel();
	        caja = new JTextField();
	        boton = new JButton();
	        ventanair = new JButton();
	      
	        texto.setText("Inserte Nombre");    
	        texto.setBounds(50, 50, 100, 25); 
	        
	        caja.setBounds(150, 50, 100, 25);  
	        
	        boton.setText("Mostrar Mensaje");   
	        boton.setBounds(50, 100, 200, 30);  
	        boton.addActionListener(this); 
	        
	        ventanair.setText("Ir a Ventana 1");   
	        ventanair.setBounds(50, 135, 200, 30); 
	        ventanair.addActionListener(this);
	        
	        this.add(texto);
	        this.add(caja);
	        this.add(boton);
	        this.add(ventanair);
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        
	    	if(e.getSource()==boton) {
	    		String nombre = caja.getText();                                
		        JOptionPane.showMessageDialog(this, "Hola " + nombre + "."); 
	    		
	    	}
	    	
	    	if (e.getSource()==ventanair) {
	    		
	    		JOptionPane.showMessageDialog(this, "deberia ir a ventana 1"); 
	    		Ventana1 window = new Ventana1();
				window.frame.setVisible(true);
			
			}
	    	
	    	 
	    }

	    public static void main(String[] args) {
	        Ventana3 V = new Ventana3();  
	        V.setVisible(true);           
	    }
	}

