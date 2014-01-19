package genericRPG.beingTypes;
import genericRPG.races.Dwarf;
import genericRPG.races.Elf;
import genericRPG.races.Gnome;
import genericRPG.races.Gryphon;
import genericRPG.races.Human;
import genericRPG.races.Race;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Monster extends Being{

	private static String file;
	private static Monster m = new Monster();
	private static String rce;
	private static Scanner input;
	public static Monster get(String mName, String name){
		try{
			file = "Monsters/" + mName + ".txt";
			input = new Scanner(new File(file));
			m.name = name;
			rce = input.nextLine();
			m.lvl = input.nextInt(); input.nextLine();
			m.tHP = input.nextInt(); input.nextLine();		
			m.tMP = input.nextInt(); input.nextLine();
			m.str = input.nextInt(); input.nextLine();
			m.agi = input.nextInt(); input.nextLine();
			m.con = input.nextInt(); input.nextLine();
			m.wis = input.nextInt();
			if(rce.equals("Random")) m.race = getRandomHumanoidRace(m);
			else m.race = getMonsterRace(rce, m);
			m.mp = m.tMP;	
			m.hp = m.tHP;	
			return m;
		}catch(FileNotFoundException e){
			System.out.println("Monster "+mName+" not found...");
		}
		return m;		
	}

	private static Race getMonsterRace(String mRace, Monster m){
		switch(mRace.toUpperCase()){
			case "GRYPHON":
				return new Gryphon(m);
			default:
				throw new IllegalArgumentException(mRace + " is not a valid race...");
		}
	}

	private static Race getRandomHumanoidRace(Monster m){
		Race l[] = {new Elf(m), new Human(m), new Gnome(m), new Dwarf(m)}; 
		int i = (int)(0 + Math.random() * ((l.length - 1) + 1));
		return l[i];
	}
}