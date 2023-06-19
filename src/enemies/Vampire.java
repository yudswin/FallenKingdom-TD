package enemies;

import static helpz.Constants.Enemies.VAMPIRE;

import managers.EnemyManager;

public class Vampire extends Enemy {

	public Vampire(float x, float y, int ID, EnemyManager em) {
		super(x, y, ID, VAMPIRE, em);
	}

}
