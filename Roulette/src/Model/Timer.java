package Model;

import ControlServer.ServerModel;

import java.io.IOException;

import ControlServer.Server;

public class Timer extends Thread {
	private int sec;
	public static int rand = (int) (Math.random() * 37);

	public Timer(int x) {
		this.sec = x;
	}

	public void run() {
		try {
			sleep(sec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("tempo esaurito");
		for (int i = 0; i < ServerModel.tav.getTav().size(); i++) {
			if (ServerModel.tav.getTav().get(i).getScelta().equals("Red")) {
				if (ServerModel.rossi.contains(rand))
					ServerModel.tav.getTav().get(i).setPuntata(ServerModel.tav.getTav().get(i).getPuntata() * 2);
				else
					ServerModel.tav.getTav().get(i).setPuntata(0);

			} else {
				if (ServerModel.tav.getTav().get(i).getScelta().equals("Black")) {
					if (ServerModel.neri.contains(rand))
						ServerModel.tav.getTav().get(i).setPuntata(ServerModel.tav.getTav().get(i).getPuntata() * 2);
					else
						ServerModel.tav.getTav().get(i).setPuntata(0);

				} else {

					if (Integer.parseInt(ServerModel.tav.getTav().get(i).getScelta()) == rand)
						if (Integer.parseInt(ServerModel.tav.getTav().get(i).getScelta()) == 0)
							ServerModel.tav.getTav().get(i)
									.setPuntata(ServerModel.tav.getTav().get(i).getPuntata() * 6);
						else
							ServerModel.tav.getTav().get(i)
									.setPuntata(ServerModel.tav.getTav().get(i).getPuntata() * 4);

					else
						ServerModel.tav.getTav().get(i).setPuntata(0);

				}
			}

		}
		if (rand == 37) {
			Server.s.getMod().addRow(new String[]{"Il Numero Vincente è il 00"});
			Server.s.getLabel().setText("00");
		} else {
			Server.s.getMod().addRow(new String[]{"Il Numero Vincente è il " + rand});
			Server.s.getLabel().setText("" + rand);
		}

		ServerModel.sendMessage();
		ServerModel.tav.getTav().clear();
		rand = (int) (Math.random() * 37);

		try {
			sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Server.s.getMod().clear();
		Server.s.getLabel().setText(""); 
		Server.s.getMod().addRow(new String[]{""});
		Server.t = new Timer(20000);
		Server.t.start();

	}

}
