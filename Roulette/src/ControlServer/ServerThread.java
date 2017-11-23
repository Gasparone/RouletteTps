package ControlServer;

import Model.Timer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Time;
import Model.Giocatore;

public class ServerThread extends Thread {
	Socket client = null;
	String stringaModificata = null;
	String messaggio = null;
	BufferedReader input;
	PrintWriter output;
	

	public ServerThread(Socket socket) {
		this.client = socket;
	}

	public void run() {
		
		int temp = 0;
		int temp1=0;
		boolean flag=true;
		try {
			input = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			while(flag) {
				messaggio = input.readLine(); // riceve il messaggio
				for(int i = 0;i < messaggio.length();i ++){
					if(messaggio.charAt(i) == '*'){
						 temp=i;
						
					}
					if(messaggio.charAt(i) == '+'){
						temp1=i;
						
					}
					
				}
				
				String nome=messaggio.substring(0,temp);
				int puntata=Integer.parseInt(messaggio.substring(temp+1,temp1));
				String scelta=messaggio.substring(temp1+1);
				Giocatore p=new Giocatore(nome,puntata,client.getPort(),scelta);
				ServerModel.tav.addGiocatore(p);
			    Server.s.getMod().addRow(new String[]{"Il Giocatore "+nome+" ha puntato "+puntata+" sul "+scelta});
			}
			
		} catch (Exception e) {
			// esce e basta
		}
	}
}
