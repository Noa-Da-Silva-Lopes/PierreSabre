package histoire;
import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronins;

public class HistoireTP4 {

	public static void main(String[] args) {
//		Humain prof=new Humain("Prof","Kombucha",54);
//		prof.direBonjour();
//		prof.acheter("une boisson", 12);
//		prof.boire();
//		prof.acheter("un jeu", 2);
//		prof.acheter("un Kimono", 50);
		
		Commercant marco=new Commercant("Marco",20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		
		Yakuza yaku=new Yakuza("Yaku Le Noir","whisky",30,"Warsong");
		yaku.direBonjour();
		yaku.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par la  ?");
		yaku.extorquer(marco);
		yaku.parler("j'ai "+yaku.getReputation()+" de reputation");
		
		Ronins roro=new Ronins("Roro","Shochu",60);
		roro.direBonjour();
		roro.donner(marco);

		
		roro.provoquer(yaku);
	}

}
