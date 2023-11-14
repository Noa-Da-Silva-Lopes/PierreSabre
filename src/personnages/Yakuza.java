package personnages;

import personnages.Commercant;

public class Yakuza extends Humain{
	private String clan;
	private int reputation=0;
	
	
	public Yakuza(String nom,String boissonFavorite,int quantiteArgent,String clan) {
		super(nom,boissonFavorite,quantiteArgent);
		this.clan=clan;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("mon clan est celui de "+clan);
	}
	
	public void extorquer(Commercant victime) {
		parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse!");
		int argentVictime=victime.getQuantiteArgent();
		gagnerArgent(argentVictime);
		reputation++;
		victime.seFaireExtorquer();
		parler("J'ai piqué les "+argentVictime+" sous de "+victime.getNom()+", ce qui me fait "+getQuantiteArgent()+" sous dans ma poche. Hi! Hi!");
	}
	
	public int perdre() {
		int argentPerdu=0;
		argentPerdu=getQuantiteArgent();
		perdreArgent(argentPerdu);
		reputation--;
		parler("J'ai perdu mon duel et mes "+ argentPerdu+" sous, snif... J'ai déshonoré le clan de "+ clan+".");
		return argentPerdu;
	}
	
	public void gagner(int gain){
		gagnerArgent(gain);
		reputation++;
		parler("Ce ronin pensait vraiment battre "+getNom()+" du clan de "+clan+" Je l'ai dépouillé de ses "+gain+" sous.");
	}

}
