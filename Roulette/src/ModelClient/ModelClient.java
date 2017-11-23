package ModelClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ResourceBundle.Control;

import javax.swing.JOptionPane;

import ControlClient.ControlMessaggio;
import ViewClient.FinestraClient;
import ViewClient.ViewMessaggio;

public class ModelClient {
	private FinestraClient f;
	String nomeServer = "127.0.0.1";
	int portaServer = 6789;
	Socket socket;
	BufferedReader tastiera;
	PrintWriter out;
	String messaggio;

	private class ClientThread extends Thread {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
			String messaggio;
			try {
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				while (true) {
					messaggio = in.readLine();
					if (messaggio == null || messaggio.equals("PIENO")) {
						JOptionPane.showMessageDialog(null, "Tempo scaduto", "Errore", 0);
					} else {
						ViewMessaggio m = new ViewMessaggio();
						ControlMessaggio frame = new ControlMessaggio(m, messaggio, f);
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public ModelClient(FinestraClient f2) {
		f = f2;
	}

	public Socket connetti() {
		try {
			socket = new Socket(nomeServer, portaServer);
			out = new PrintWriter(socket.getOutputStream(), true);

			// Attivo un socket per la ricezione
			ClientThread ct = new ClientThread();
			ct.start();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Non riesco a connetermi", "Errore", 0);
		}

		return socket;
	}

	public void comunica(String messaggio) {
		System.out.println("Benvenuto!");

		try {
			// la spedisco al server
			out.println(messaggio);
			// System.out.println(messaggio);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}

	}
}
