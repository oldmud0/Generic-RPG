package disparity.rpg.races;

import disparity.rpg.being.Being;
import disparity.rpg.items.weapons.Dagger;

public class Elf extends Race{

    public Elf(Being b) {
    	name = "Elf";
    	b.wis += 2;
    	b.tMP += 5;
    	b.tHP -= 2;
    	b.wep = new Dagger(0);
    }
    
    
}