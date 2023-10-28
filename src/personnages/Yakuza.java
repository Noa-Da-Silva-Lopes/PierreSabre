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
	
	public void extorquer(Commercant victime) {
		parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse!");
		int argentVictime=victime.getQuantiteArgent();
		gagnerArgent(victime.getQuantiteArgent());
		reputation=reputation+1;
		victime.seFaireExtorquer();
		parler("J'ai piqué les "+argentVictime+" sous de "+victime.getNom()+", ce qui me fait "+getQuantiteArgent()+" sous dans ma poche. Hi! Hi!");
	}

}
