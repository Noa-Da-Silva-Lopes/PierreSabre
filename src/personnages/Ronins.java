package personnages;

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
}
