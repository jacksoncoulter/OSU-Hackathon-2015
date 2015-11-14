
public class Skill {
protected String name;
protected int baseValue;
protected int modifier;

public Skill(){
	
}

public Skill(String s, int base, int mod){
	name = s;
	baseValue = base;
	modifier = mod;
}

public String getName(){
	return name;
}

public int getBaseValue(){
	return baseValue;
}

public int getModifier(){
	return modifier;
}

public boolean setBaseValue(int i){
	baseValue =  i;
	return true;
}

public boolean setModifier(int i){
	modifier = i;
	return true;
}

public boolean incrementBaseValue(){
	baseValue++;
	return true;
}

public boolean incrementModifer(){
	modifier++;
	return true;
}

//returns the sum of baseValue and modifier. This is used for actual math stuff (damage dealt, health remaining, etc)
public int getValue(){
	return baseValue + modifier;
}







}
