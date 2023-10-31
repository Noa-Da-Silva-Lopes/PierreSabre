package personnages;

import personnages.Yakuza;

public class Ronins extends Humain {
	private int honneur=1;
	
	
	
	public Ronins(String nom,String boissonFavorite,int quantiteArgent) {
		super(nom,boissonFavorite,quantiteArgent);
	}
	
	public void donner(Commercant beneficiaire) {
		int argentDon=getQuantiteArgent()*10/100;
		parler(beneficiaire.getNom()+" prend ces "+argentDon+" sous.");
		perdreArgent(getQuantiteArgent()*10/100);
		beneficiaire.recevoir(argentDon);
	}
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre\r\n"
				+ "marchand!");
		int forceRonnin=honneur*2;
		if (forceRonnin>=adversaire.getReputation()) {
			parler("Je t’ai eu petit yakusa!");
			int gainDuel=adversaire.perdre();
			gagnerArgent(gainDuel);
			honneur=honneur+1;
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(getQuantiteArgent());
			perdreArgent(getQuantiteArgent());
			honneur=honneur-1;
		}
	}
}
