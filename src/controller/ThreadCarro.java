package controller;

import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class ThreadCarro extends Thread{
	
	
	private JLabel carro;
	private JButton correr;
	private int chegada;
	private JTextField vencedor;
	private JTextField perdedor;
	private static int pos =0;
	
	Random gerador = new Random();
	
	public ThreadCarro(JLabel carro, JButton correr, JTextField vencedor, JTextField perdedor) {
		this.carro=carro;
		this.correr=correr;
		this.vencedor=vencedor;
		this.perdedor=perdedor;

	}
	
	@Override
	public void run() {
		aceleraCarro();
	}

	
	public void setWinner(int pos) {
		
		String x;
		if(pos >0 && pos <2) {
			
			x = carro.getText();
			vencedor.setText(x);

		}else{
			x = carro.getText();
			perdedor.setText(x);
		}
		
	}
	

	private void aceleraCarro() {
	
		correr.setEnabled(false);
		Rectangle posicao;
		posicao = carro.getBounds();
		carro.setBounds(posicao);


		int limite = 8000;
		while (chegada <= limite ) {
			
			posicao.x=posicao.x+gerador.nextInt(50);		
			carro.setBounds(posicao);
			
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}	
		chegada=chegada+posicao.x;	
		
		}
		pos++;
		
		setWinner(pos);
	}
}
