package disparity.rpg.skills;

import disparity.rpg.being.Being;
import disparity.rpg.items.Weapon;

public class Fight{

	public static byte doesHit(Being a, Weapon w, Being b){
		int i = 0;
		double max = 100.0;
		double min = w.baseDmg + (w.getSWDB(a).damBonus);
		if(min + Math.random() * ((max - min) + 1) <= b.calcAC())	i += 1; 		//checks to see if target blocked the attack [1 = block]
		else if(min + Math.random() * ((max - min) + 1) <= b.dodge)	i += 2; //checks to see if target dodged the attack [2 = dodge]
																			//if target does not block or dodge, attack hits [default = hit]
		switch(i){
			case 1:
				return 1; 
			case 2:
				return 2;
			default:
				return 0;
		}
	}

	public static int attack(Being a, Weapon w){		
		double max = w.baseDmg + w.getSWDB(a).damBonus;
		double min = w.baseDmg;
		return (int)(min + Math.random() * ((max - min) + 1));
	}		
}