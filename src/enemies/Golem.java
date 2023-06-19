package enemies;

import static helpz.Constants.Enemies.GOLEM;

import managers.EnemyManager;

public class Golem extends Enemy {

	public Golem(float x, float y, int ID, EnemyManager em) {
		super(x, y, ID, GOLEM,em);
	}

}
