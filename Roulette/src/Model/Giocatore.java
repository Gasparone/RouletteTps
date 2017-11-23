package Model;

public class Giocatore {
private String nickname;
private int puntata;
private int id;
private String scelta;




public Giocatore(String nickname, int puntata, int id, String scelta) {
	super();
	this.nickname = nickname;
	this.puntata = puntata;
	this.id = id;
	this.scelta = scelta;
}


public String getScelta() {
	return scelta;
}


public void setScelta(String scelta) {
	this.scelta = scelta;
}


public String getNickname() {
	return nickname;
}


public void setNickname(String nickname) {
	this.nickname = nickname;
}


public int getPuntata() {
	return puntata;
}


public void setPuntata(int puntata) {
	this.puntata = puntata;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}




}
