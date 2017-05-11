public class Frame {
	private int firstThrow;
	private int secondThrow;
	private int scoreWithBonus;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
		this.scoreWithBonus = 0;
	}
	
	public int getFirstThrow() {
		return firstThrow;
	}

	public int getSecondThrow() {
		return secondThrow;
	}

	//returns the score of a single frame
	public int score(){
		//to be implemented
		return firstThrow + secondThrow;
	}
	
	public void addBonus(int bonus){
		scoreWithBonus = score() + bonus;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		if(firstThrow == 10){
			return true;
		}
		return false;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		//to be implemented
		if(firstThrow != 10 && firstThrow+secondThrow == 10){
			return true;
		}
		return false;
	}
}
