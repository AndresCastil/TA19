import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class saludador1 extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					saludador1 frame = new saludador1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	public saludador1() {

		
		textNombre = new javax.swing.JTextField();
	

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 653, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Escribe un nombre para saludar");
		lblNewLabel.setBounds(218, 69, 207, 38);
		contentPane.add(lblNewLabel);

		textNombre = new JTextField();
		textNombre.setBounds(130, 144, 322, 38);
		contentPane.add(textNombre);
		textNombre.setColumns(10);

		JButton btnSaludar = new JButton("Saludar!");
		btnSaludar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String nombre = "" + textNombre.getText();
				JOptionPane.showMessageDialog(btnSaludar, "HOLA, " + nombre);
			}
		});
		btnSaludar.setBounds(241, 253, 126, 38);
		contentPane.add(btnSaludar);

	}

}
