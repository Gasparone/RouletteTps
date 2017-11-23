package ControlClient;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ModelClient.ModelClient;
import ViewClient.FinestraClient;
import ViewClient.ViewMessaggio;


public class ControlMessaggio implements ActionListener{
	private ViewMessaggio m;
	private String messaggio;
	private FinestraClient f;
	
	public ControlMessaggio(ViewMessaggio m,String messaggio, FinestraClient f) {
		this.f = f;
		this.m = m;
		this.m.setVisible(true);
		m.setDefaultCloseOperation(m.EXIT_ON_CLOSE);
		m.getBtnOk().addActionListener(this);
		this.messaggio = messaggio;
		int index = 0;
		int index2 = 0;
		
		for(int i = 0; i < messaggio.length();i ++) {
			if(messaggio.charAt(i) == '+') {
				index = i;
			}
			if(messaggio.charAt(i) == '*') {
				index2 = i;
			}
		}
		int puntata = Integer.parseInt(messaggio.substring(0, index));
		String vincitori = messaggio.substring(index+1, index2);
		int numVincente = Integer.parseInt(messaggio.substring(index2 + 1));
		if(puntata == 0) {
			if(vincitori.equals("")){
				m.getLblPerso().setVisible(true);
				m.getLblNum().setVisible(true);
				m.getLblNum().setText("Il numero vincente era " + numVincente);
			}
			else{
				m.getLblPerso().setVisible(true);
				m.getLblNum().setVisible(true);
				m.getLblNum().setText("Il numero vincente era " + numVincente);
				m.getLblVincitori().setVisible(true);
				m.getLblIVincitoriSono().setVisible(true);
			}
		}
		else {
			if(vincitori.equals("")){
				m.getLblImg().setVisible(true);
				m.getLblVinto().setVisible(true);
				m.getLblVincita().setVisible(true);
				m.getLblVincita().setText(puntata + " Euro");
			}
			else{
				m.getLblImg().setVisible(true);
				m.getLblVinto().setVisible(true);
				m.getLblVincita().setVisible(true);
				m.getLblVincita().setText(puntata + " Euro");
				m.getLblVincitori().setVisible(true);
				m.getLblIVincitoriSono().setVisible(true);
			}
		}		
		m.getLblVincitori().setText(vincitori);
		
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		System.out.println("a");
		if(m.getBtnOk() == evt.getSource()) {
			System.out.println("mostro pulsante");
			f.getBtNewPartita().setVisible(true);
			this.m.dispose();
		}
	}
	
	
}
