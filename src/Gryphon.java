public class Gryphon extends Race{
	public Gryphon(Monster m){
		name = "Gryphon";
		m.str += 2;
		m.tHP += 2;
	}
}