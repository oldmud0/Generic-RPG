package disparity.game.states.intro;

import java.util.PriorityQueue;
import java.util.Queue;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.Image;

import disparity.game.Resources;
import disparity.game.objects.TypewriterText;
import disparity.game.objects.TypewriterTextBox;
import disparity.game.objects.TypewriterTextType;
//import disparity.game.objects.TypewriterTextBox;
import disparity.game.states.StateID;

public class IntroScene extends BasicGameState {
	
	//Unlike a simple stack that holds TypewriterText, we can actually show a text box, 
	//then after that shows, we can do an animation, then show another text box.
	private TypewriterTextBox textBox; 
	
	private StateBasedGame game;
	Image test_img; // Public test_img initialized
	@Override
	public void init(GameContainer container, StateBasedGame game)
			throws SlickException {
		this.game = game;
		System.out.println("Now in scene "+ getID());
		Queue<TypewriterText> twStack = new PriorityQueue<TypewriterText>();
		twStack.add(new TypewriterText("Hello. asdadsadadsadsads", TypewriterTextType.NORMAL));
		textBox = new TypewriterTextBox(twStack);
		Resources.loadResources(); // Load Resources from Resources
		test_img = Resources.getResource("test_img"); // assign Image test_img from Resources to test_img
		textBox.nextText();
		
	}

	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g)
			throws SlickException {
		g.drawString("We hate unfinished code", 300, 300);
		g.setColor(Color.white);
		textBox.render(textBox.getGraphics());
		g.drawImage(textBox.getDrawBuffer(), textBox.x, textBox.y); //BUG - not drawing?
		test_img.draw(0 ,0);
	}

	@Override
	public void update(GameContainer container, StateBasedGame game, int delta)
			throws SlickException {
		textBox.tick();
		
	}

	@Override
	public int getID() {
		return StateID.INTRO_SCENE.ordinal();
	}

}
