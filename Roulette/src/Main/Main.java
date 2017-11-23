package Main;

import ControlClient.Client;
import ViewClient.FinestraClient;
import ViewClient.Nickname;
import ViewClient.Punta;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nickname n = new Nickname();
		n.setVisible(true);
		Punta p = new Punta();
		p.setVisible(false);
		FinestraClient f= new FinestraClient();
		Client cliente = new Client(f,n,p);
		f.setVisible(false);
	}
}
