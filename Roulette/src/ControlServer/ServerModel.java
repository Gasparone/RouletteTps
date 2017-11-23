package ControlServer;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

import Model.Tavolo;
import Model.Timer;

public class ServerModel {
	public static ArrayList<Socket> listaSocket = new ArrayList<Socket>();
	public static Tavolo tav = new Tavolo();
	public static ArrayList<Integer> rossi=new ArrayList<Integer>();
	public static ArrayList<Integer> neri=new ArrayList<Integer>();
	
	/**
	 * Invio un messaggio a tutti
	 * 
	 * @param message
	 *            // Il messaggio da inviare
	 * @param sender
	 *            // Chi invia il messaggio
	 */
	public static void sendMessage() {
		String message = "";
		int vy = 0;
		System.out.println("STO INVIANDO");
		for(int i1 = 0; i1 < tav.getTav().size(); i1 ++){
			if(tav.getTav().get(i1).getPuntata() != 0){
				message=message+tav.getTav().get(i1).getNickname()+"  ";
			    vy++;
			}
		}
		if(vy!=0){
			Server.s.getMod().addRow(new String[]{"I VINCITORI SONO "+message});
		}
		else Server.s.getMod().addRow(new String[]{"NON CI SONO VINCITORI"});
		for (int i = 0; i < listaSocket.size(); i++) {
			try {
				Socket temp = listaSocket.get(i);
					PrintWriter out = new PrintWriter(temp.getOutputStream(), true);
					for(int y=0;y<tav.getTav().size();y++){
					if(tav.getTav().get(y).getId()==temp.getPort())out.println(tav.getTav().get(y).getPuntata()+"+"+message+"*"+Timer.rand);
					}
			} catch (IOException e) {
				// Nel caso ci sia qualche problema salta quel socket
				e.printStackTrace();
			}
		}
	}

	/**
	 * Chiudo tutti i socket
	 */
	public static void close() {
		for (int i = 0; i < listaSocket.size(); i++) {
			try {
				listaSocket.get(i).close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

