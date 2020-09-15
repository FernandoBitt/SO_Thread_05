package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CarroController implements ActionListener{
	private JLabel carro1;
	private JLabel carro2;
	private JButton correr;
	private JTextField vencedor;
	private JTextField perdedor;
	
	
	public CarroController(JLabel carro1,JLabel carro2, JButton correr,JTextField vencedor,JTextField perdedor) {
		this.carro1=carro1;
		this.carro2=carro2;
		this.correr=correr;
		this.vencedor=vencedor;
		this.perdedor=perdedor;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		botaoInicia();
	}



	private void botaoInicia() {
		Thread t1 = new ThreadCarro(carro1, correr, vencedor, perdedor);
		Thread t2 = new ThreadCarro(carro2, correr, vencedor, perdedor);
		t1.start();
		t2.start();
		
	}
	
}
