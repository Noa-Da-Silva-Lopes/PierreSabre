package histoire;
import personnages.Humain;
import personnages.Commercant;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof=new Humain("Prof","Kombucha",54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un Kimono", 50);
		
		Commercant marco=new Commercant("Marco",20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
	}

}
