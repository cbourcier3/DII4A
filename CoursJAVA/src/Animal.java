
public class Animal{
	String nom;
	Sexe sexe;
	
	public Animal(String n)
	{
		this.nom = n;
		sexe = Sexe.INDETERMINE;
	}
	
	public Animal(String n, Sexe s)
	{
		this.nom = n;
		sexe = s;
	}
}
