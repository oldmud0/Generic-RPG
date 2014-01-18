public class Broadsword extends Weapon{
	public Broadsword(int quality){
		super("Broadsword", 2);
		base_dmg = 6 + quality;
	}
	//SKILL WEAPON DAMAGE BONUS 
	public OffensiveSkill getSWDB(Being b){
		return b.twoHand;
	}
}

