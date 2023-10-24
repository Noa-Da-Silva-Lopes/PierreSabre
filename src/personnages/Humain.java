package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int quantiteArgent;
	
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
	
	public int gagnerArgent(int gain) {
		quantiteArgent=quantiteArgent+gain;
		return quantiteArgent;
	}
	
	public int perdreArgent(int perte) {
		if (quantiteArgent-perte<=0) {
			quantiteArgent=0;
		} else {
			quantiteArgent=quantiteArgent-perte;
		}
		return quantiteArgent;
	}
}
