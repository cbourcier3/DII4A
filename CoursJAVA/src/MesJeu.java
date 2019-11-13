import java.util.*;

public class MesJeu {
	HashSet<JeuPS4> owned = new HashSet<JeuPS4>();
	
	public void addJeu(JeuPS4 jeu)
	{
		owned.add(jeu);
	}
	
	public void addJeu(String titre, int pegi)
	{
		JeuPS4 jeu = new JeuPS4(titre,pegi);
		owned.add(jeu);
	}
	
	public boolean removeJeu(JeuPS4 jeu)
	{
		return owned.remove(jeu);
	}
	
	public boolean removeJeu(String titre)
	{
		return owned.removeIf(e->e.getTitre().equals(titre));
	}
	
	public int size()
	{
		return owned.size();
	}
	
	public void afficher() {
		Iterator<JeuPS4> it = owned.iterator();
		System.out.print("[");
		while (it.hasNext()) { System.out.print(it.next().getTitre() +", "); }
		System.out.println("]");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JeuPS4 gow = new JeuPS4("GoW",12);
		MesJeu m = new MesJeu();
		m.afficher();
		m.addJeu(gow);
		m.addJeu(new JeuPS4("Goat",12));
		m.afficher();
		m.addJeu(gow);
		m.afficher();
		m.addJeu(gow);
		m.afficher();
		m.addJeu("FIFA",5);
		m.afficher();
		m.removeJeu(gow);
		m.afficher();
		m.removeJeu("FIFA");
		m.afficher();
		System.out.println(m.size());
	}
}


