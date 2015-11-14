
public class LifeSkill extends Skill {
	private int currentValue;
	
	
	public LifeSkill(){
		this.name = "Health";
		this.baseValue = 10;
		this.modifier = 0;
		this.currentValue = 10;
	}
	
	public LifeSkill(String s, int base, int mod, int current){
		this.name = s;
		this.baseValue = base;
		this.modifier = mod;
		currentValue = current;
	}
	
	public int getCurrentvalue(){
		return currentValue;
	}
	
	public boolean setCurrentValue(int i){
		currentValue = i;
		return true;
	}

}
