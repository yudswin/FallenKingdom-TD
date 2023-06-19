package enemies;

import static helpz.Constants.Enemies.WITCH;

import managers.EnemyManager;

public class Witch extends Enemy {

	public Witch(float x, float y, int ID, EnemyManager em) {
		super(x, y, ID, WITCH,em);
		
	}

}
