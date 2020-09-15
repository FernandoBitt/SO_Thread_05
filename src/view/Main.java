package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.CarroController;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;

public class Main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField vencedor;
	private JTextField perdedor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Main() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 795, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel carro1 = new JLabel("Carro1");
		carro1.setBounds(28, 78, 101, 29);
		contentPane.add(carro1);
		
		JLabel carro2 = new JLabel("Carro2");
		carro2.setBounds(28, 144, 82, 20);
		contentPane.add(carro2);
		
		vencedor = new JTextField();
		vencedor.setBounds(325, 185, 146, 26);
		contentPane.add(vencedor);
		vencedor.setColumns(10);
		vencedor.setEditable(false);
		
		perdedor = new JTextField();
		perdedor.setBounds(325, 229, 146, 26);
		contentPane.add(perdedor);
		perdedor.setColumns(10);
		perdedor.setEditable(false);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(71, 123, 626, 2);
		contentPane.add(separator);
		
		JLabel textowin = new JLabel("Vencedor");
		textowin.setBounds(241, 191, 69, 20);
		contentPane.add(textowin);
		
		JLabel textoLose = new JLabel("Perdedor");
		textoLose.setBounds(241, 232, 69, 20);
		contentPane.add(textoLose);
		
		JButton botaoCorrer = new JButton("Correr");
		botaoCorrer.setBounds(28, 282, 137, 47);
		contentPane.add(botaoCorrer);
		
		CarroController carroController = new CarroController(carro1, carro2, botaoCorrer, vencedor, perdedor);
		botaoCorrer.addActionListener(carroController);
	}
}
