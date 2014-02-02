package disparity.rpg.races;

import disparity.rpg.being.Being;
import disparity.rpg.items.weapons.Warhammer;

public class Dwarf extends Race{

	public Dwarf(Being b){
		name = "Dwarf";
		b.str += 2;
		b.tHP += 2;
		b.tMP -= 3;
		b.wis -= 2;
		b.wep = new Warhammer(0, 3);
	}
}