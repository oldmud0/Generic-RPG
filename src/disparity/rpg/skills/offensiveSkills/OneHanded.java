package disparity.rpg.skills.offensiveSkills;

import disparity.rpg.being.Being;
import disparity.rpg.skills.OffensiveSkill;

public class OneHanded extends OffensiveSkill{
	public OneHanded() {
		super();
	}

	public OneHanded(Being b){
		name = "One Handed";
		lvl = 5;
		exp = 0;
		lvlXp = 20;
		desc = "Skill that is the basis of all physical One handed attacks.";
		damBonus = this.getBonus();
		addAbilities(b);
	}

	public void addAbilities(Being b){
		switch(lvl){
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			default:
				System.out.println("Does not have any skills to add...");
				break;
		}
	}
}