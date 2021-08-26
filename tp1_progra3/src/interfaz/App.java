package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;

import logica.lightsOut;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;


public class App {

	JFrame frmLightsOut;
	lightsOut juego;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frmLightsOut.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		juego= new lightsOut(4);
		initialize();
	}

	public void mostrarse() {
		frmLightsOut.setVisible(true);
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLightsOut = new JFrame();
		frmLightsOut.setIconImage(Toolkit.getDefaultToolkit().getImage(App.class.getResource("/imagenes/icono_lights_out.png")));
		frmLightsOut.setTitle("Lights Out!");
		frmLightsOut.setBounds(100, 100, 800, 600);
		frmLightsOut.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLightsOut.getContentPane().setLayout(new GridLayout(0, 4, 0, 0));
		
		JButton boton11 = new JButton("");
		
		boton11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				juego.cambiarLuces(0);
				if(juego.estaPrendida(0)) 
					boton11.setIcon(new ImageIcon(App.class.getResource("/imagenes/luzPrendidaModif.png")));
				else boton11.setIcon(new ImageIcon(App.class.getResource("/imagenes/luzApagadaModif.png")));
			}
		});
		if(juego.estaPrendida(0))
			boton11.setIcon(new ImageIcon(App.class.getResource("/imagenes/luzPrendidaModif.png")));
		else {
			boton11.setIcon(new ImageIcon(App.class.getResource("/imagenes/luzApagadaModif.png")));
		}
		boton11.setMaximumSize(new Dimension(1, 1));
		boton11.setBorderPainted(false);
		frmLightsOut.getContentPane().add(boton11);
		
		JButton btnNewButton_1 = new JButton("New button");
		
		frmLightsOut.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_6 = new JButton("New button");
		frmLightsOut.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("New button");
		frmLightsOut.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_2 = new JButton("New button");
		frmLightsOut.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		frmLightsOut.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_8 = new JButton("New button");
		frmLightsOut.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_10 = new JButton("New button");
		frmLightsOut.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_4 = new JButton("New button");
		frmLightsOut.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		frmLightsOut.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_9 = new JButton("New button");
		frmLightsOut.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_11 = new JButton("New button");
		frmLightsOut.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton = new JButton("New button");
		frmLightsOut.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_12 = new JButton("New button");
		frmLightsOut.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("New button");
		frmLightsOut.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("New button");
		frmLightsOut.getContentPane().add(btnNewButton_14);
		
		
	}
}
