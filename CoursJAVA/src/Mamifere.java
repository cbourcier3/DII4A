
public class Mamifere extends Animal{
	private int nbMamelles ;
	
	public Mamifere(String n) {
		super(n);
	}
	
	public Mamifere(String n, Sexe s)
	{
		super(n,s);
	}

	/**
	 * @return the nbMamelles
	 */
	public int getNbMamelles() {
		return nbMamelles;
	}

	/**
	 * @param nbMamelles the nbMamelles to set
	 */
	public void setNbMamelles(int nbMamelles) {
		this.nbMamelles = nbMamelles;
	}
}
