package disparity.rpg.items.armor;

import disparity.rpg.items.Armor;
import disparity.rpg.items.Quality;
import disparity.rpg.skills.DefensiveSkill;

public class Helmet extends Armor{
	public Helmet(int quality, DefensiveSkill s){
		super("Helmet");
		base_def = 3 + quality;
		skill = s;
	}
	
	public Helmet(Quality quality) {
		super(quality);
	}
}
