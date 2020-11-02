import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener{

	public static void main(String[] args) {
		JFrame ventana = new JFrame();
		ventana.setSize(400,400);
		ventana.setTitle("Mi primera ventana");
		//No ajustar el tamaño de la ventana
		ventana.setResizable(true);
		
		//Hacer visible la ventana
		
		ventana.setVisible(true);
		
		//Una especie de div en la interfaz
		JPanel panel = new JPanel();
		ventana.add(panel);
		
		panel.setLayout(null);
		
		
		
		//Label es como una etiqueta de texto
		JLabel label = new JLabel("Usuario");
		//Darle un tamaño de rectangulo. Tambien seleccionar las coordenadas para ubicarlo
		//(X,Y) parte de la esquina superior izquierda despues (tamaño x, tamaño y)
		label.setBounds(10,10,60,25);
		
		//Cuadrado donde se puede poner texto
		JTextField textoUsuarioField = new JTextField();
		textoUsuarioField.setBounds(80,10,100,25);
		
		JLabel passwordLabel = new JLabel("Password: ");
		passwordLabel.setBounds(10, 40, 60, 25);
		
		JPasswordField passwordTextField = new JPasswordField();
		passwordTextField.setBounds(80, 40, 100, 25);
		
		JButton boton = new JButton("Login");
		boton.setBounds(10, 70, 170, 25);
		
		//Verifiquemos que funcione
		boton.addActionListener(new GUI());
		
		panel.add(label);
		panel.add(textoUsuarioField);
		panel.add(passwordLabel);
		panel.add(passwordTextField);
		panel.add(boton);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Click en el boton");
		
	}

}
