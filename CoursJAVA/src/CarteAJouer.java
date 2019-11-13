
public class CarteAJouer {
	private String couleur;
	private String valeur;
	static final String[] couleurValide = {"PIQUE","TREFLE","CARREAU","COEUR"};
	static final String[] valeurValide = {"AS","2","3","4","5","6","7","8","9","10","VALET","DAME","ROI"};

	public static void main(String[] args) {
		CarteAJouer card1 = new CarteAJouer("PIQUE","ROI");
		System.out.println(card1.toString());
		CarteAJouer card2 = new CarteAJouer("trefle","DAME");
		System.out.println(card2.toString());
		CarteAJouer card3 = new CarteAJouer("COEUR","7");
		System.out.println(card3.toString());
	}
	
	public CarteAJouer(String coul, String val) {
		setCouleur(coul.toUpperCase());
		setValeur(val.toUpperCase());
	}
	
	public String toString() {
		return (String)(getValeur()+" DE "+getCouleur());	
	}
	
	public boolean couleurEstValide(String coul) {

		boolean valide = false;
		for (int i =0; i<4 ; i++)
			if (coul.equalsIgnoreCase(couleurValide[i]))
				valide = true;
		return valide;
	}
	public boolean valeurEstValide(String val) {

		boolean valide = false;
		for (String valeur : valeurValide)
			if (val.equalsIgnoreCase(valeur))
				valide = true;
		return valide; 
	}
	
	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		if (couleurEstValide(couleur))
			this.couleur = couleur;
		else throw new IllegalArgumentException("Couleur ou valeur invalide");	
	}

	public String getValeur() {
		return valeur;
	}

	public void setValeur(String valeur) {
		if (valeurEstValide(valeur))
			this.valeur = valeur;
		else throw new IllegalArgumentException("Couleur ou valeur invalide");
	}

}
