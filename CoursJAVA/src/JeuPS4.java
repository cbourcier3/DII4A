
public class JeuPS4 {
	private String titre;
	private int pegi;
	
	public JeuPS4(String t, int p)
	{
		setTitre(t);
		setPegi(p);
	}
	
	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}
	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}
	/**
	 * @return the pegi
	 */
	public int getPegi() {
		return pegi;
	}
	/**
	 * @param pegi the pegi to set
	 */
	public void setPegi(int pegi) {
		this.pegi = pegi;
	}
	
	public boolean equals(Object obj)
	{
		if (obj.hashCode() == hashCode()) return true;
		else return false;
	}
	
	public int hashCode() {
		return getTitre().toString().hashCode();
	}
}
