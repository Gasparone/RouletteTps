package ControlServer;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

import Model.Timer;
import ViewServer.ServerInterface;

public class Server {

	public static Timer t;
	public static ServerSocket serverSocket;
	public static Socket socket;
	public static ServerInterface s;

	public void start() {
		t = new Timer(20000);
		t.start();
		boolean flag = false;
		 s=new ServerInterface();
		 s.setVisible(true);

		ServerModel.rossi.addAll(Arrays.asList(1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36));
		ServerModel.neri.addAll(Arrays.asList(2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35));

		try {
			serverSocket = new ServerSocket(6789);
			while (true) {
				System.out.println("-> Server in attesa...");
				socket = serverSocket.accept();
				if (t.isAlive()) {
					System.out.println("-> Creo un nuovo thread assegnando il socket: " + socket);
					ServerThread serverThread = new ServerThread(socket);
					serverThread.start();

					// Aggiungo il socket alla lista dei socket
					ServerModel.listaSocket.add(socket);

				} else {

					PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
					out.println("PIENO");

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	public static void main(String[] args) {
		Server tcpServer = new Server();
		tcpServer.start();
	}
}
