package personnages;

public class Commercant extends Humain {

	public Commercant(String nom,  int quantiteArgent) {
		super(nom,"th�", quantiteArgent);
		
	}
	
	public int seFaireExtorquer() {
		parler("J'ai tout perdu! Le monde est trop injuste");
		int argentPerdu=getQuantiteArgent();
		perdreArgent(argentPerdu);
		return argentPerdu;
	}
	
	public void recevoir(int argent) {
		parler(argent+" sous! Je te remercie g�n�reux donateur!");
		gagnerArgent(argent);
	}
}
