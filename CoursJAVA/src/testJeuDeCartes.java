import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 * Reprenez l’exercice 1.1 du recueil d’exercices, rechargez le projet et créez, dans un sous-package tests :
1. Une classe de test JUnit pour tester la question 4 avec :
a. un cas sans exception sur la couleur,
b. un cas d’exception sur la couleur,
c. un cas sans exception sur la valeur,
d. un cas d’exception sur la valeur,
2. une classe de test JUnit pour tester la question 5 (les 4 cas de l’exemple).
 */
class testJeuDeCartes {
	CarteAJouer card; 
	
	@Test
	void sansExceptionCouleur() {
        assertDoesNotThrow(()->new CarteAJouer("PIQUE","VALET"));
    }

	@Test
	void sansExceptionValeur() {
		assertDoesNotThrow(()->new CarteAJouer("PIQUE","DAME"));
	}
	
	@Test
	void couleurAvecException() {
		Exception e = assertThrows(IllegalArgumentException.class, ()-> new CarteAJouer("piqueus","DAME"));
	}
	
	@Test
	void valeurAvecException(){
		Exception e = assertThrows(IllegalArgumentException.class, () -> new CarteAJouer("PIQUE","daokdkaop"));
	}
	
	@Test
	void valeurSansCapsSansException() {
		assertDoesNotThrow(()-> new CarteAJouer("PiQuE","ROI"));
	}
	
	@Test
	void couleurSansCapsSansException() {
		assertDoesNotThrow(()-> new CarteAJouer("PIQUE","roI"));
	}
	
	@Test
	void valeurEtCouleurSansCapsSansException() {
		assertDoesNotThrow(()-> new CarteAJouer("PiQuE","daMe"));
	}
	
	@Test
	void valeurZeroCapsSansException() {
		assertDoesNotThrow(()-> new CarteAJouer("pique","roi"));
	}
}
