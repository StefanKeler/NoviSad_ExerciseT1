import java.io.Console;
import java.util.ArrayList;
import java.util.List;

// Before you commit and push write your student ID and finish time here.
// Finish time:
// Student ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	int s = 0;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		frames.add(frame);
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		
	}
	
	public void dodajBonuseFrejmovima(){
		
		for(int i = 0; i < frames.size(); i++){
			if(frames.get(i).isSpare() && i != frames.size() - 1){
				frames.get(i).addBonus(frames.get(i+1).getFirstThrow());
			}else if(frames.get(i).isStrike() && i != frames.size() - 1){
				frames.get(i).addBonus(frames.get(i+1).getFirstThrow() + frames.get(i+1).getSecondThrow());
			}
		}
	}
	
	// Returns the game score
	public int score(){
		//to be implemented: should return game score 
		int s = 0;
		for(Frame f : frames){
			s += f.score();
		}
		return s;
	}
	
	public int scoreWithBonus(){
		dodajBonuseFrejmovima();
		//to be implemented: should return game score 
		int s = 0;
		for(Frame f : frames){
			s += f.scoreWithBonus();
		}
		return s;
	}
}
