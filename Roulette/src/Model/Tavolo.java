package Model;

import java.util.ArrayList;

public class Tavolo {
private ArrayList<Giocatore> tav;

public Tavolo() {
	tav =  new ArrayList<Giocatore>();
}

public void addGiocatore(Giocatore g){
	
	tav.add(g);
	
}

public ArrayList<Giocatore> getTav() {
	return tav;
}

public void setTav(ArrayList<Giocatore> tav) {
	this.tav = tav;
}

}
