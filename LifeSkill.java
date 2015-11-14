
public class LifeSkill extends Skill {
	private int currentMax;
	
	
	public LifeSkill(){
		this.name = "Health";
		this.baseValue = 10;
		this.modifier = 0;
		this.currentMax = 10;
	}
	
	public LifeSkill(String s, int base, int mod, int max){
		this.name = s;
		this.baseValue = base;
		this.modifier = mod;
		currentMax = max;
	}
	
	public int getCurrentMax(){
		return currentMax;
	}
	
	public boolean setCurrentMax(int i){
		currentMax = i;
		return true;
	}

}
