package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int quantiteArgent;
	protected int nbConnaissance=0;
	protected Humain[] memoire=new Humain[30];
	
	
	public Humain(String nom,String boissonFavorite,int quantiteArgent) {
		this.nom=nom;
		this.boissonFavorite=boissonFavorite;
		this.quantiteArgent=quantiteArgent;
	}
	
	public String getNom() {
		return nom;
	}
	

	
	public int getQuantiteArgent() {
		return quantiteArgent;
	}
	
	public void parler(String Texte) {
		System.out.println(Texte);
	}
	
	public void direBonjour() {
		this.parler( "Bonjour! Je m'appelle "+nom+" et j'aime boire du "+ boissonFavorite+".");
	}
	
	public void boire() {
		this.parler( "Mmm, un bon verre de "+boissonFavorite+" ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (prix<=quantiteArgent) {
			this.parler("J'ai "+quantiteArgent+" sous en poche. Je vais pouvoir m'offrir "+bien+" à "+prix+" sous");
			this.perdreArgent(prix);
		} else {
			this.parler("Je n'ai plus que "+quantiteArgent+" sous en poche. Je ne peux même pas m'offrir "+bien+" à "+prix+" sous");
		}
	}
	
	public void gagnerArgent(int gain) {
		quantiteArgent+=gain;
	}
	
	public void perdreArgent(int perte) {
		if (quantiteArgent-perte<=0) {
			quantiteArgent=0;
		} else {
			quantiteArgent-=perte;
		}
	}
	
	private void memoriser(Humain humain) {
		if (nbConnaissance<memoire.length) {
			boolean verif=true;
			for (int i = 0; i < nbConnaissance; i++) {
				if (memoire[i]==humain) {
					verif=false;	
				}
			}
			if (verif==true) {
				memoire[nbConnaissance]=humain;
				nbConnaissance++;
			}
		} else {
			for (int i = 1; i < memoire.length; i++) {
				memoire[i-1]=memoire[i];
			}
		}
	}
	
	public void listerConnaissance() {
		StringBuilder chaine=new StringBuilder("Je connais beaucoup de monde dont :"+memoire[0].getNom());
		for (int i = 1; i < this.nbConnaissance; i++) {
			chaine.append(", "+memoire[i].getNom());
		}
		parler(chaine.toString());
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		this.direBonjour();
		autreHumain.direBonjour();
		this.memoriser(autreHumain);
		autreHumain.memoriser(this);
	}
}
