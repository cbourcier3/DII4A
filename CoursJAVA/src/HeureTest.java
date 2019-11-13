import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HeureTest {

	@Test
	void testAvancementPositifSansDepassement() {
		assertDoesNotThrow(()-> new Heure(8,14).avancerMinutes(12));
		
	}
	
	@Test
	void testAvancementPositifAvecDepassement() {
		assertDoesNotThrow(()-> new Heure(8,14).avancerMinutes(51));
	}
	
	@Test
	void testAvancementPositifAvecDepassementSupHeure() {
		assertDoesNotThrow(()-> new Heure(8,14).avancerMinutes(73));
	}
	
	@Test
	void testAvancementPositifAvecDepassementSupDeuxHeures() {
		assertDoesNotThrow(()-> new Heure(8,14).avancerMinutes(125));
	}

	@Test
	void testAvancementPositifAvecDepassementJour() {
		assertDoesNotThrow(()-> new Heure(8,14).avancerMinutes(303));
	}
	
	@Test
	void testAvancementPositifAvecDepassementSupJour() {
		assertDoesNotThrow(()-> new Heure(8,14).avancerMinutes(1441));
	}
	
	@Test
	void testAvancementNegatifSansDepassement() {
		assertDoesNotThrow(()-> new Heure(8,14).avancerMinutes(-12));
	}

	@Test
	void testAvancementNegatifAvecDepassementUneHeure() {
		assertDoesNotThrow(()-> new Heure(8,14).avancerMinutes(-16));
	}
	
	@Test
	void testAvancementNegatifAvecDepassementSupUneHeure() {
		assertDoesNotThrow(()-> new Heure(8,14).avancerMinutes(-70));
	}
	
	@Test
	void testAvancementNegatifAvecDepassementSupDeuxHeures() {
		assertDoesNotThrow(()-> new Heure(8,14).avancerMinutes(-121));
	}
	
	@Test
	void testAvancementNegatifAvecDepassementJour() {
		assertDoesNotThrow(()-> new Heure(8,14).avancerMinutes(-241));
	}
	
	@Test
	void testAvancementNegatifAvecDepassementSupUnJour() {
		assertDoesNotThrow(()-> new Heure(8,14).avancerMinutes(-1441));
	}
	
}
