import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MesJeuTest {
	MesJeu myGames = new MesJeu();
	@Test
	void test() {
		
		fail(myGames.addJeu(new JeuPS4()));
	}

}
