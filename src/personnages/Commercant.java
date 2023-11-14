package personnages;

public class Commercant extends Humain {

	public Commercant(String nom,  int quantiteArgent) {
		super(nom,"thé", quantiteArgent);
		
	}
	
	public int seFaireExtorquer() {
		parler("J'ai tout perdu! Le monde est trop injuste");
		int argentPerdu=getQuantiteArgent();
		perdreArgent(argentPerdu);
		return argentPerdu;
	}
	
	public void recevoir(int argent) {
		parler(argent+" sous! Je te remercie généreux donateur!");
		gagnerArgent(argent);
	}
}
