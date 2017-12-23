package GameObjects;

public class Boomerang {
	public int[] boom_left;

	public Boomerang() {
		boom_left = new int[] { 3, 3, 3, 3 };
	}

	public int getNumLeft(int player) {
		return boom_left[player];
	}

	public boolean useBoom(int player) {
		int p = player;
		boom_left[p]--;

		if (boom_left[p] >= 0) {
			return true;
		} else {
			return false;
		}
	}
}